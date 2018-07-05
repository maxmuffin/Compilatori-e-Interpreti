// Generated from D:/Coding/Intellij/Compilatori-e-Interpreti/grammar\SVM.g4 by ANTLR 4.7
package parser;

import java.util.HashMap;
import java.util.ArrayList;
import virtualMachine.ExecuteVM;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUSH=1, POP=2, ADD=3, SUB=4, TIMES=5, DIV=6, STOREW=7, LOADW=8, BRANCH=9, 
		BRANCHEQ=10, BRANCHLESS=11, BRANCHLESSEQ=12, BRANCHGREATHER=13, BRANCHGREATHEREQ=14, 
		JS=15, LOADRA=16, STORERA=17, LOADRV=18, STORERV=19, LOADFP=20, STOREFP=21, 
		COPYFP=22, LOADHP=23, STOREHP=24, PRINT=25, HALT=26, NEW=27, COPY=28, 
		HEAPOFFSET=29, COL=30, LABEL=31, NUMBER=32, WHITESP=33, ERR=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PUSH", "POP", "ADD", "SUB", "TIMES", "DIV", "STOREW", "LOADW", "BRANCH", 
		"BRANCHEQ", "BRANCHLESS", "BRANCHLESSEQ", "BRANCHGREATHER", "BRANCHGREATHEREQ", 
		"JS", "LOADRA", "STORERA", "LOADRV", "STORERV", "LOADFP", "STOREFP", "COPYFP", 
		"LOADHP", "STOREHP", "PRINT", "HALT", "NEW", "COPY", "HEAPOFFSET", "COL", 
		"LABEL", "NUMBER", "WHITESP", "ERR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'push'", "'pop'", "'add'", "'sub'", "'times'", "'div'", "'sw'", 
		"'lw'", "'b'", "'beq'", "'blt'", "'ble'", "'bgt'", "'bge'", "'js'", "'lra'", 
		"'sra'", "'lrv'", "'srv'", "'lfp'", "'sfp'", "'cfp'", "'lhp'", "'shp'", 
		"'print'", "'halt'", "'new'", "'copy'", "'heapoffset'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PUSH", "POP", "ADD", "SUB", "TIMES", "DIV", "STOREW", "LOADW", 
		"BRANCH", "BRANCHEQ", "BRANCHLESS", "BRANCHLESSEQ", "BRANCHGREATHER", 
		"BRANCHGREATHEREQ", "JS", "LOADRA", "STORERA", "LOADRV", "STORERV", "LOADFP", 
		"STOREFP", "COPYFP", "LOADHP", "STOREHP", "PRINT", "HALT", "NEW", "COPY", 
		"HEAPOFFSET", "COL", "LABEL", "NUMBER", "WHITESP", "ERR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    public ArrayList<String> errors = new ArrayList<>();


	public SVMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SVM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 33:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 errors.add("Invalid char: " + getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \7 \u00c9\n \f"+
		" \16 \u00cc\13 \3!\3!\5!\u00d0\n!\3!\3!\7!\u00d4\n!\f!\16!\u00d7\13!\5"+
		"!\u00d9\n!\3\"\6\"\u00dc\n\"\r\"\16\"\u00dd\3\"\3\"\3#\3#\3#\3#\3#\2\2"+
		"$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$\3\2\5\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00ea\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5"+
		"L\3\2\2\2\7P\3\2\2\2\tT\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17b\3\2\2\2\21"+
		"e\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27n\3\2\2\2\31r\3\2\2\2\33v\3\2\2\2"+
		"\35z\3\2\2\2\37~\3\2\2\2!\u0081\3\2\2\2#\u0085\3\2\2\2%\u0089\3\2\2\2"+
		"\'\u008d\3\2\2\2)\u0091\3\2\2\2+\u0095\3\2\2\2-\u0099\3\2\2\2/\u009d\3"+
		"\2\2\2\61\u00a1\3\2\2\2\63\u00a5\3\2\2\2\65\u00ab\3\2\2\2\67\u00b0\3\2"+
		"\2\29\u00b4\3\2\2\2;\u00b9\3\2\2\2=\u00c4\3\2\2\2?\u00c6\3\2\2\2A\u00d8"+
		"\3\2\2\2C\u00db\3\2\2\2E\u00e1\3\2\2\2GH\7r\2\2HI\7w\2\2IJ\7u\2\2JK\7"+
		"j\2\2K\4\3\2\2\2LM\7r\2\2MN\7q\2\2NO\7r\2\2O\6\3\2\2\2PQ\7c\2\2QR\7f\2"+
		"\2RS\7f\2\2S\b\3\2\2\2TU\7u\2\2UV\7w\2\2VW\7d\2\2W\n\3\2\2\2XY\7v\2\2"+
		"YZ\7k\2\2Z[\7o\2\2[\\\7g\2\2\\]\7u\2\2]\f\3\2\2\2^_\7f\2\2_`\7k\2\2`a"+
		"\7x\2\2a\16\3\2\2\2bc\7u\2\2cd\7y\2\2d\20\3\2\2\2ef\7n\2\2fg\7y\2\2g\22"+
		"\3\2\2\2hi\7d\2\2i\24\3\2\2\2jk\7d\2\2kl\7g\2\2lm\7s\2\2m\26\3\2\2\2n"+
		"o\7d\2\2op\7n\2\2pq\7v\2\2q\30\3\2\2\2rs\7d\2\2st\7n\2\2tu\7g\2\2u\32"+
		"\3\2\2\2vw\7d\2\2wx\7i\2\2xy\7v\2\2y\34\3\2\2\2z{\7d\2\2{|\7i\2\2|}\7"+
		"g\2\2}\36\3\2\2\2~\177\7l\2\2\177\u0080\7u\2\2\u0080 \3\2\2\2\u0081\u0082"+
		"\7n\2\2\u0082\u0083\7t\2\2\u0083\u0084\7c\2\2\u0084\"\3\2\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7t\2\2\u0087\u0088\7c\2\2\u0088$\3\2\2\2\u0089\u008a"+
		"\7n\2\2\u008a\u008b\7t\2\2\u008b\u008c\7x\2\2\u008c&\3\2\2\2\u008d\u008e"+
		"\7u\2\2\u008e\u008f\7t\2\2\u008f\u0090\7x\2\2\u0090(\3\2\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7h\2\2\u0093\u0094\7r\2\2\u0094*\3\2\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7h\2\2\u0097\u0098\7r\2\2\u0098,\3\2\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7h\2\2\u009b\u009c\7r\2\2\u009c.\3\2\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7r\2\2\u00a0\60\3\2\2\2\u00a1\u00a2"+
		"\7u\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7r\2\2\u00a4\62\3\2\2\2\u00a5\u00a6"+
		"\7r\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7v\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7p\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7y\2\2\u00b38\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7{\2\2\u00b8:\3\2\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7r\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7v\2\2\u00c3<\3\2\2\2\u00c4\u00c5"+
		"\7<\2\2\u00c5>\3\2\2\2\u00c6\u00ca\t\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d9\7\62\2\2\u00ce\u00d0\7/\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5"+
		"\4\63;\2\u00d2\u00d4\4\62;\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d9B\3\2\2\2\u00da\u00dc"+
		"\t\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\"\2\2\u00e0D\3\2\2\2"+
		"\u00e1\u00e2\13\2\2\2\u00e2\u00e3\b#\3\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\b#\2\2\u00e5F\3\2\2\2\b\2\u00ca\u00cf\u00d5\u00d8\u00dd\4\2\3\2\3#\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}