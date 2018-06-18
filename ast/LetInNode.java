package ast;


import Type.IType;
import exceptions.TypeException;
import util.Semantic.SymbolTable;
import util.Semantic.SymbolTableEntry;
import util.VM.FunctionCode;


import java.util.ArrayList;
import java.util.HashMap;

public class LetInNode implements INode {
    // TODO gestire exp e stms
    private INode let;
    private INode in;

    public LetInNode(INode let, INode in) {
        this.let = let;
        this.in = in;
    }

    @Override
    public ArrayList<String> checkSemantics(SymbolTable env) {
        System.out.println("LetInNode: checkSemantics -> \t");

        ArrayList<String> res = new ArrayList<String>();

        HashMap<String, SymbolTableEntry> hashMap = new HashMap<>();

        //entro in un nuovo livello di scope
        env.pushHashMap(hashMap);

        //parte Let
        res.addAll(let.checkSemantics(env));

        //Parte In
        res.addAll(in.checkSemantics(env));

        //lascio il vecchio scope
        env.popHashMap();

        return res;
    }

    @Override
    public String toPrint(String indent) {
        return indent + "LetIn:\n" +
                let.toPrint(indent + " ") +
                in.toPrint(indent + " ");
    }


    @Override
    public IType typeCheck() throws TypeException {
        //parte let
        let.typeCheck();
        //parte in
        in.typeCheck();
        // TODO return new VoidType();
        return null;
    }

    @Override
    public String codeGeneration() {
        return "push 0\n" +
                let.codeGeneration() +
                in.codeGeneration() + "halt\n" +
                FunctionCode.getFunctionsCode();
    }

}
