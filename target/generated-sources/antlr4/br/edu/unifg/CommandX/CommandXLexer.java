// Generated from br\edu\u005Cunifg\CommandX\CommandX.g4 by ANTLR 4.5.1
package br.edu.unifg.CommandX;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CHAR=3, BOOLEAN=4, STRING=5, POINTER_INT=6, POINTER_FLOAT=7, 
		POINTER_CHAR=8, POINTER_BOOLEAN=9, POINTER_STRING=10, POINTER_VAR=11, 
		PROGRAM=12, VAR=13, READ=14, PRINT=15, FUNC=16, PROC=17, VOID=18, RETURN=19, 
		IF=20, ELSE=21, ELIF=22, FOR=23, WHILE=24, ADDITIVE_OPERATOR=25, MULTIPLICATIVE_OPERATOR=26, 
		MOD=27, INCREMENT_OPERATOR=28, AND=29, OR=30, NOT=31, PLUS_PLUS=32, MINUS_MINUS=33, 
		RELATIONAL_OPERATOR=34, EQUALITY_OPERATOR=35, ASSIGN=36, PAR_OPEN=37, 
		PAR_CLOSE=38, BRACES_OPEN=39, BRACES_CLOSE=40, BRACKET_OPEN=41, BRACKET_CLOSE=42, 
		SEMICOL=43, COMMA=44, INTEGER_LITERAL=45, BOOLEAN_LITERAL=46, CHAR_LITERAL=47, 
		STRING_LITERAL=48, FLOAT_LITERAL=49, ID=50, LINE_COMMENT=51, BLOCK_COMMENT=52, 
		WS=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "CHAR", "BOOLEAN", "STRING", "POINTER_INT", "POINTER_FLOAT", 
		"POINTER_CHAR", "POINTER_BOOLEAN", "POINTER_STRING", "POINTER_VAR", "PROGRAM", 
		"VAR", "READ", "PRINT", "FUNC", "PROC", "VOID", "RETURN", "IF", "ELSE", 
		"ELIF", "FOR", "WHILE", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", 
		"MOD", "INCREMENT_OPERATOR", "AND", "OR", "NOT", "PLUS_PLUS", "MINUS_MINUS", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", 
		"BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "SEMICOL", 
		"COMMA", "INTEGER_LITERAL", "BOOLEAN_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"FLOAT_LITERAL", "ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'char'", "'boolean'", "'string'", "'int*'", 
		"'float*'", "'char*'", "'boolean*'", "'string*'", "'var*'", "'program'", 
		"'var'", "'read'", "'print'", "'func'", "'proc'", "'void'", "'return'", 
		"'if'", "'else'", "'elif'", "'for'", "'while'", null, null, "'%'", null, 
		"'&&'", "'||'", "'!'", "'++'", "'--'", null, null, "'='", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "CHAR", "BOOLEAN", "STRING", "POINTER_INT", "POINTER_FLOAT", 
		"POINTER_CHAR", "POINTER_BOOLEAN", "POINTER_STRING", "POINTER_VAR", "PROGRAM", 
		"VAR", "READ", "PRINT", "FUNC", "PROC", "VOID", "RETURN", "IF", "ELSE", 
		"ELIF", "FOR", "WHILE", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", 
		"MOD", "INCREMENT_OPERATOR", "AND", "OR", "NOT", "PLUS_PLUS", "MINUS_MINUS", 
		"RELATIONAL_OPERATOR", "EQUALITY_OPERATOR", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", 
		"BRACES_OPEN", "BRACES_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "SEMICOL", 
		"COMMA", "INTEGER_LITERAL", "BOOLEAN_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"FLOAT_LITERAL", "ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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


	public CommandXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommandX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u018a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5"+
		"\35\u0102\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\5#\u0117\n#\3$\3$\3$\3$\5$\u011d\n$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\5.\u0132\n.\3.\6.\u0135\n"+
		".\r.\16.\u0136\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0142\n/\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\7\61\u014a\n\61\f\61\16\61\u014d\13\61\3\61\3\61\3\62\5"+
		"\62\u0152\n\62\3\62\6\62\u0155\n\62\r\62\16\62\u0156\3\62\3\62\6\62\u015b"+
		"\n\62\r\62\16\62\u015c\3\63\3\63\7\63\u0161\n\63\f\63\16\63\u0164\13\63"+
		"\3\64\3\64\3\64\3\64\7\64\u016a\n\64\f\64\16\64\u016d\13\64\3\64\5\64"+
		"\u0170\n\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u017a\n\65\f"+
		"\65\16\65\u017d\13\65\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u0185\n\66\r"+
		"\66\16\66\u0186\3\66\3\66\3\u017b\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67\3\2\f\4\2--//\4\2,,\61\61\4\2>>@@\3"+
		"\2\62;\6\2\f\f\17\17$$))\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"\f\f\17\17\5\2\13\f\17\17\"\"\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5q\3\2\2\2\7w\3\2\2\2\t|\3\2\2\2"+
		"\13\u0084\3\2\2\2\r\u008b\3\2\2\2\17\u0090\3\2\2\2\21\u0097\3\2\2\2\23"+
		"\u009d\3\2\2\2\25\u00a6\3\2\2\2\27\u00ae\3\2\2\2\31\u00b3\3\2\2\2\33\u00bb"+
		"\3\2\2\2\35\u00bf\3\2\2\2\37\u00c4\3\2\2\2!\u00ca\3\2\2\2#\u00cf\3\2\2"+
		"\2%\u00d4\3\2\2\2\'\u00d9\3\2\2\2)\u00e0\3\2\2\2+\u00e3\3\2\2\2-\u00e8"+
		"\3\2\2\2/\u00ed\3\2\2\2\61\u00f1\3\2\2\2\63\u00f7\3\2\2\2\65\u00f9\3\2"+
		"\2\2\67\u00fb\3\2\2\29\u0101\3\2\2\2;\u0103\3\2\2\2=\u0106\3\2\2\2?\u0109"+
		"\3\2\2\2A\u010b\3\2\2\2C\u010e\3\2\2\2E\u0116\3\2\2\2G\u011c\3\2\2\2I"+
		"\u011e\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2\2\2O\u0124\3\2\2\2Q\u0126\3\2"+
		"\2\2S\u0128\3\2\2\2U\u012a\3\2\2\2W\u012c\3\2\2\2Y\u012e\3\2\2\2[\u0131"+
		"\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a\u0147\3\2\2\2c\u0151\3\2\2\2e"+
		"\u015e\3\2\2\2g\u0165\3\2\2\2i\u0175\3\2\2\2k\u0184\3\2\2\2mn\7k\2\2n"+
		"o\7p\2\2op\7v\2\2p\4\3\2\2\2qr\7h\2\2rs\7n\2\2st\7q\2\2tu\7c\2\2uv\7v"+
		"\2\2v\6\3\2\2\2wx\7e\2\2xy\7j\2\2yz\7c\2\2z{\7t\2\2{\b\3\2\2\2|}\7d\2"+
		"\2}~\7q\2\2~\177\7q\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7c\2\2\u0082\u0083\7p\2\2\u0083\n\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7i\2\2\u008a\f\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7,\2\2\u008f\16\3\2\2\2\u0090\u0091\7h\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7q\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7,\2\2\u0096\20\3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7"+
		"j\2\2\u0099\u009a\7c\2\2\u009a\u009b\7t\2\2\u009b\u009c\7,\2\2\u009c\22"+
		"\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\u00a5\7,\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7"+
		"v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac"+
		"\7i\2\2\u00ac\u00ad\7,\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0"+
		"\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7,\2\2\u00b2\30\3\2\2\2\u00b3\u00b4"+
		"\7r\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7i\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7o\2\2\u00ba\32\3\2\2\2\u00bb"+
		"\u00bc\7x\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2\u00be\34\3\2\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7f\2\2"+
		"\u00c3\36\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7"+
		"k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9 \3\2\2\2\u00ca\u00cb"+
		"\7h\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\"\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7x\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7f\2\2\u00d8&\3\2\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7t\2\2"+
		"\u00de\u00df\7p\2\2\u00df(\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7h\2"+
		"\2\u00e2*\3\2\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7"+
		"u\2\2\u00e6\u00e7\7g\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7n\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7h\2\2\u00ec.\3\2\2\2\u00ed\u00ee"+
		"\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0\60\3\2\2\2\u00f1\u00f2"+
		"\7y\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\t\2\2\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\t\3\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fc8\3\2\2\2\u00fd"+
		"\u00fe\7-\2\2\u00fe\u0102\7-\2\2\u00ff\u0100\7/\2\2\u0100\u0102\7/\2\2"+
		"\u0101\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102:\3\2\2\2\u0103\u0104\7"+
		"(\2\2\u0104\u0105\7(\2\2\u0105<\3\2\2\2\u0106\u0107\7~\2\2\u0107\u0108"+
		"\7~\2\2\u0108>\3\2\2\2\u0109\u010a\7#\2\2\u010a@\3\2\2\2\u010b\u010c\7"+
		"-\2\2\u010c\u010d\7-\2\2\u010dB\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110"+
		"\7/\2\2\u0110D\3\2\2\2\u0111\u0117\t\4\2\2\u0112\u0113\7@\2\2\u0113\u0117"+
		"\7?\2\2\u0114\u0115\7>\2\2\u0115\u0117\7?\2\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0112\3\2\2\2\u0116\u0114\3\2\2\2\u0117F\3\2\2\2\u0118\u0119\7?\2\2\u0119"+
		"\u011d\7?\2\2\u011a\u011b\7#\2\2\u011b\u011d\7?\2\2\u011c\u0118\3\2\2"+
		"\2\u011c\u011a\3\2\2\2\u011dH\3\2\2\2\u011e\u011f\7?\2\2\u011fJ\3\2\2"+
		"\2\u0120\u0121\7*\2\2\u0121L\3\2\2\2\u0122\u0123\7+\2\2\u0123N\3\2\2\2"+
		"\u0124\u0125\7}\2\2\u0125P\3\2\2\2\u0126\u0127\7\177\2\2\u0127R\3\2\2"+
		"\2\u0128\u0129\7]\2\2\u0129T\3\2\2\2\u012a\u012b\7_\2\2\u012bV\3\2\2\2"+
		"\u012c\u012d\7=\2\2\u012dX\3\2\2\2\u012e\u012f\7.\2\2\u012fZ\3\2\2\2\u0130"+
		"\u0132\7/\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0135\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\\\3\2\2\2\u0138\u0139\7v\2\2"+
		"\u0139\u013a\7t\2\2\u013a\u013b\7w\2\2\u013b\u0142\7g\2\2\u013c\u013d"+
		"\7h\2\2\u013d\u013e\7c\2\2\u013e\u013f\7n\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0142\7g\2\2\u0141\u0138\3\2\2\2\u0141\u013c\3\2\2\2\u0142^\3\2\2\2\u0143"+
		"\u0144\7)\2\2\u0144\u0145\n\6\2\2\u0145\u0146\7)\2\2\u0146`\3\2\2\2\u0147"+
		"\u014b\7$\2\2\u0148\u014a\n\7\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014fb\3\2\2\2\u0150\u0152\7/\2\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\t\5"+
		"\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\7\60\2\2\u0159\u015b\t"+
		"\5\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015dd\3\2\2\2\u015e\u0162\t\b\2\2\u015f\u0161\t\t\2\2"+
		"\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163f\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\61\2\2\u0166"+
		"\u0167\7\61\2\2\u0167\u016b\3\2\2\2\u0168\u016a\n\n\2\2\u0169\u0168\3"+
		"\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7\17\2\2\u016f\u016e\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\f\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\b\64\2\2\u0174h\3\2\2\2\u0175\u0176\7\61\2"+
		"\2\u0176\u0177\7,\2\2\u0177\u017b\3\2\2\2\u0178\u017a\13\2\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7,\2\2\u017f\u0180\7\61"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b\65\2\2\u0182j\3\2\2\2\u0183\u0185"+
		"\t\13\2\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b\66\2\2\u0189l\3"+
		"\2\2\2\22\2\u0101\u0116\u011c\u0131\u0136\u0141\u014b\u0151\u0156\u015c"+
		"\u0162\u016b\u016f\u017b\u0186\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}