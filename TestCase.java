import codegen.ExecuteVM;
import codegen.VM.DispatchTable;
import exceptions.LexerException;
import exceptions.ParserException;
import exceptions.SemanticException;
import exceptions.TypeException;
import nodes.INode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.FOOLLexer;
import parser.FOOLParser;
import parser.SVMLexer;
import parser.SVMParser;
import symboltable.SymbolTable;
import type.IType;
import visit.FoolVisitorImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestCase {
    public static void main(String[] args) {
        try {
            System.out.println("Rilevazione Input...\n");
            String fileNameFool = "";
            String fileName;
            String packageName = "test/testCaseOK/";
            //String packageName = "test/testCaseFail/";

            final File folder = new File(packageName);

            //int rand = ThreadLocalRandom.current().nextInt(1, folder.listFiles().length);
            //fileName = listFilesForFolder(folder, String.valueOf(rand));

            fileName = listFilesForFolder(folder, "20_");

            System.out.println("File: " + fileName + "\n");

            fileNameFool = packageName + fileName;

            CharStream input = CharStreams.fromFileName(fileNameFool);
            printPhase("INPUT");
            System.out.println(input + "\n");

            printPhase("LEXICAL ANALYSIS");
            FOOLLexer lexer = new FOOLLexer(input);

            // determino i token in base all'input
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            System.out.println("Numero Tokens: " + tokens.getTokens().size() + "\n");

            // verifico la presenza di errori lessicali
            if (lexer.lexicalErrors.size() > 0) {
                System.out.println("L'input non è stato scritto in modo corretto.");
                throw new LexerException(lexer.lexicalErrors);
            }

            printPhase("SYNTACTIC ANALYSIS");
            FOOLParser parser = new FOOLParser(tokens);
            FOOLParser.ProgContext progContext = parser.prog(); //parser.prog riutilizzato

            // verifico la presenza di errori sintattici
            if (parser.getNumberOfSyntaxErrors() > 0) {
                throw new ParserException("Errori Sintattici rilevati: " + parser.getNumberOfSyntaxErrors() + "\n");
            }

            ParseTree tree = progContext;
            //  show AST in console
            System.out.println("------- Visualizing AST -------");
            System.out.println(tree.toStringTree(parser) + "\n");

            printPhase("SEMANTIC ANALYSIS");

            // tramite visit determino i nodi presenti nell'AST
            FoolVisitorImpl visitor = new FoolVisitorImpl();
            INode nodes = visitor.visit(progContext);

            // l'ambiente
            SymbolTable env = new SymbolTable();
            ArrayList<String> stringArrayListErr = nodes.checkSemantics(env);

            // verifico la presenza di errori Semantici
            if (stringArrayListErr.size() > 0) {
                throw new SemanticException(stringArrayListErr);
            }

            printPhase("TYPE CHECKING");
            IType type = nodes.typeCheck(); //type-checking bottom-up
            System.out.println("\ttype checking ok! Il tipo del programma è: " + type.toPrint());

            // CODE GENERATION
            printPhase("CODE GENERATION");
            String code = nodes.codeGeneration();

            code += DispatchTable.generaCodiceDispatchTable();

            String asmFileName = "test/asm/" + fileName.substring(0, fileName.length() - 5) + ".asm";
            BufferedWriter out = new BufferedWriter(new FileWriter(asmFileName));
            out.write(code);
            out.close();

            System.out.println("Codice SVM generato: (" + code.split("\n").length + " linee). Output visibile in codice.svm.");

            //Scommenta se vuoi vedere l'output del codice a console
            //System.out.println(code);

            printPhase("CODE GENERATION EXECUTION");

            CharStream inputASM = CharStreams.fromFileName(asmFileName);
            SVMLexer lexerASM = new SVMLexer(inputASM);
            CommonTokenStream tokensASM = new CommonTokenStream(lexerASM);
            SVMParser parserASM = new SVMParser(tokensASM);

            parserASM.assembly();

            if (lexerASM.errors.size() > 0) {
                throw new LexerException(lexerASM.errors);
            }
            if (parserASM.getNumberOfSyntaxErrors() > 0) {
                throw new ParserException("Errore di parsing in SVM");
            }
            int[] bytecode = parserASM.getBytecode();
            ExecuteVM vm = new ExecuteVM(bytecode);
            String risultato = "No output";
            ArrayList<String> output = vm.cpu();
            vm.getMemoryFinalMap();
            vm.print();
            if (output.size() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : output) {
                    stringBuilder.append(s + "\n");
                }
                risultato = String.valueOf(stringBuilder);
            }
            printRisultato("Risultato: " + risultato + "\n");
        } catch (LexerException | IOException | SemanticException | TypeException | ParserException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void printPhase(String fase) {
        System.out.println("------- \033[32;1;2m" + fase + " \033[0m ------");
    }

    private static void printRisultato(String risultato) {
        System.out.println("\033[32;1;2m " + risultato + " \033[0m ");
    }

    private static String listFilesForFolder(final File folder, String fileNumber) {
        String fileName = "";
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.getName().contains(fileNumber)) {
                fileName = fileEntry.getName();
            }
        }
        return fileName;
    }
}
