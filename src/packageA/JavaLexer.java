// Generated from C:\Users\rafe0\OneDrive\Documents\COMPILER-PROJECT\src\packageA\Java.g4 by ANTLR 4.7
package packageA;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOOLEAN=18, BREAK=19, CASE=20, CHAR=21, CONST=22, DEFAULT=23, DOWHILE=24, 
		ELSE=25, FLOAT=26, FOR=27, IF=28, INSTANCEOF=29, INT=30, LONG=31, NEW=32, 
		RETURN=33, SWITCH=34, THIS=35, VOID=36, WHILE=37, IntegerLiteral=38, FloatingPointLiteral=39, 
		BooleanLiteral=40, CharacterLiteral=41, StringLiteral=42, NullLiteral=43, 
		LEFTPARENTH=44, RIGHTPARENTH=45, LEFTBRACE=46, RIGHTBRACE=47, LEFTBRACKET=48, 
		RIGHTBRACKET=49, SEMICOLON=50, COMMA=51, DOT=52, ASSIGNMENT=53, GREATER=54, 
		LESS=55, EQUAL=56, LESSEQUAL=57, GREATEREQUAL=58, NOTEQUAL=59, AND=60, 
		OR=61, INCREMENT=62, DECREMENT=63, ADDITION=64, SUBTRACT=65, MULTIPLY=66, 
		DIVISION=67, EXPONENT=68, MODULO=69, ADD_ASSIGN=70, SUB_ASSIGN=71, MUL_ASSIGN=72, 
		DIV_ASSIGN=73, Identifier=74, WS=75, COMMENT=76, LINE_COMMENT=77;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"BOOLEAN", "BREAK", "CASE", "CHAR", "CONST", "DEFAULT", "DOWHILE", "ELSE", 
		"FLOAT", "FOR", "IF", "INSTANCEOF", "INT", "LONG", "NEW", "RETURN", "SWITCH", 
		"THIS", "VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"Underscores", "HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalDigits", 
		"OctalDigit", "FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"NullLiteral", "LEFTPARENTH", "RIGHTPARENTH", "LEFTBRACE", "RIGHTBRACE", 
		"LEFTBRACKET", "RIGHTBRACKET", "SEMICOLON", "COMMA", "DOT", "ASSIGNMENT", 
		"GREATER", "LESS", "EQUAL", "LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", 
		"OR", "INCREMENT", "DECREMENT", "ADDITION", "SUBTRACT", "MULTIPLY", "DIVISION", 
		"EXPONENT", "MODULO", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"Identifier", "Character", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'extends'", "'&'", "'static'", "'function'", "'throws'", 
		"'?'", "'super'", "'...'", "'throw'", "':'", "'output'", "'input();'", 
		"'catch'", "'|'", "'finally'", "'!'", "'boolean'", "'break'", "'case'", 
		"'char'", "'CONST'", "'default'", "'dowhile'", "'else'", "'float'", "'for'", 
		"'if'", "'instanceof'", "'int'", "'long'", "'new'", "'return'", "'switch'", 
		"'this'", "'void'", "'while'", null, null, null, null, null, "'null'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
		"'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BOOLEAN", "BREAK", "CASE", "CHAR", 
		"CONST", "DEFAULT", "DOWHILE", "ELSE", "FLOAT", "FOR", "IF", "INSTANCEOF", 
		"INT", "LONG", "NEW", "RETURN", "SWITCH", "THIS", "VOID", "WHILE", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"NullLiteral", "LEFTPARENTH", "RIGHTPARENTH", "LEFTBRACE", "RIGHTBRACE", 
		"LEFTBRACKET", "RIGHTBRACKET", "SEMICOLON", "COMMA", "DOT", "ASSIGNMENT", 
		"GREATER", "LESS", "EQUAL", "LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", 
		"OR", "INCREMENT", "DECREMENT", "ADDITION", "SUBTRACT", "MULTIPLY", "DIVISION", 
		"EXPONENT", "MODULO", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"Identifier", "WS", "COMMENT", "LINE_COMMENT"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u02d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3(\3(\5(\u01ab\n(\3)\3)\3*\3*\3*\5*\u01b2\n*\3*\3*\3*\5"+
		"*\u01b7\n*\5*\u01b9\n*\3+\3+\7+\u01bd\n+\f+\16+\u01c0\13+\3+\5+\u01c3"+
		"\n+\3,\3,\5,\u01c7\n,\3-\3-\3.\3.\5.\u01cd\n.\3/\6/\u01d0\n/\r/\16/\u01d1"+
		"\3\60\3\60\7\60\u01d6\n\60\f\60\16\60\u01d9\13\60\3\60\5\60\u01dc\n\60"+
		"\3\61\3\61\3\62\3\62\5\62\u01e2\n\62\3\63\3\63\7\63\u01e6\n\63\f\63\16"+
		"\63\u01e9\13\63\3\63\5\63\u01ec\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\5\66\u01f5\n\66\3\66\5\66\u01f8\n\66\3\66\5\66\u01fb\n\66\3\66\3\66\3"+
		"\66\5\66\u0200\n\66\3\66\5\66\u0203\n\66\3\66\3\66\3\66\5\66\u0208\n\66"+
		"\3\66\3\66\3\66\5\66\u020d\n\66\3\67\3\67\3\67\38\38\39\59\u0215\n9\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0226\n<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u0230\n=\3>\3>\3?\3?\5?\u0236\n?\3?\3?\3@\6@\u023b\n@\r"+
		"@\16@\u023c\3A\3A\5A\u0241\nA\3B\3B\3B\3B\5B\u0247\nB\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\5C\u0254\nC\3D\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c"+
		"\3c\3d\3d\3d\3e\3e\3e\7e\u02af\ne\fe\16e\u02b2\13e\3f\3f\3f\3f\5f\u02b8"+
		"\nf\3g\6g\u02bb\ng\rg\16g\u02bc\3g\3g\3h\3h\3h\3h\7h\u02c5\nh\fh\16h\u02c8"+
		"\13h\3h\3h\3h\3h\3h\3i\3i\3i\3i\7i\u02d3\ni\fi\16i\u02d6\13i\3i\3i\3\u02c6"+
		"\2j\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i)k\2m"+
		"\2o\2q\2s\2u\2w*y+{\2},\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2"+
		"\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b"+
		"\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad"+
		">\u00af?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1"+
		"H\u00c3I\u00c5J\u00c7K\u00c9L\u00cb\2\u00cdM\u00cfN\u00d1O\3\2\23\4\2"+
		"NNnn\3\2\63;\5\2\62;CHch\3\2\629\4\2GGgg\4\2--//\6\2FFHHffhh\6\2\f\f\17"+
		"\17))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\5\2\13\f\16\17\"\"\4\2\f"+
		"\f\17\17\2\u02e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2i\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2}\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2"+
		"\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2"+
		"\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\3\u00d3\3\2\2\2\5\u00d9\3\2\2\2\7\u00e1\3\2\2\2\t\u00e3"+
		"\3\2\2\2\13\u00ea\3\2\2\2\r\u00f3\3\2\2\2\17\u00fa\3\2\2\2\21\u00fc\3"+
		"\2\2\2\23\u0102\3\2\2\2\25\u0106\3\2\2\2\27\u010c\3\2\2\2\31\u010e\3\2"+
		"\2\2\33\u0115\3\2\2\2\35\u011e\3\2\2\2\37\u0124\3\2\2\2!\u0126\3\2\2\2"+
		"#\u012e\3\2\2\2%\u0130\3\2\2\2\'\u0138\3\2\2\2)\u013e\3\2\2\2+\u0143\3"+
		"\2\2\2-\u0148\3\2\2\2/\u014e\3\2\2\2\61\u0156\3\2\2\2\63\u015e\3\2\2\2"+
		"\65\u0163\3\2\2\2\67\u0169\3\2\2\29\u016d\3\2\2\2;\u0170\3\2\2\2=\u017b"+
		"\3\2\2\2?\u017f\3\2\2\2A\u0184\3\2\2\2C\u0188\3\2\2\2E\u018f\3\2\2\2G"+
		"\u0196\3\2\2\2I\u019b\3\2\2\2K\u01a0\3\2\2\2M\u01a6\3\2\2\2O\u01a8\3\2"+
		"\2\2Q\u01ac\3\2\2\2S\u01b8\3\2\2\2U\u01ba\3\2\2\2W\u01c6\3\2\2\2Y\u01c8"+
		"\3\2\2\2[\u01cc\3\2\2\2]\u01cf\3\2\2\2_\u01d3\3\2\2\2a\u01dd\3\2\2\2c"+
		"\u01e1\3\2\2\2e\u01e3\3\2\2\2g\u01ed\3\2\2\2i\u01ef\3\2\2\2k\u020c\3\2"+
		"\2\2m\u020e\3\2\2\2o\u0211\3\2\2\2q\u0214\3\2\2\2s\u0218\3\2\2\2u\u021a"+
		"\3\2\2\2w\u0225\3\2\2\2y\u022f\3\2\2\2{\u0231\3\2\2\2}\u0233\3\2\2\2\177"+
		"\u023a\3\2\2\2\u0081\u0240\3\2\2\2\u0083\u0246\3\2\2\2\u0085\u0253\3\2"+
		"\2\2\u0087\u0255\3\2\2\2\u0089\u025c\3\2\2\2\u008b\u025e\3\2\2\2\u008d"+
		"\u0263\3\2\2\2\u008f\u0265\3\2\2\2\u0091\u0267\3\2\2\2\u0093\u0269\3\2"+
		"\2\2\u0095\u026b\3\2\2\2\u0097\u026d\3\2\2\2\u0099\u026f\3\2\2\2\u009b"+
		"\u0271\3\2\2\2\u009d\u0273\3\2\2\2\u009f\u0275\3\2\2\2\u00a1\u0277\3\2"+
		"\2\2\u00a3\u0279\3\2\2\2\u00a5\u027b\3\2\2\2\u00a7\u027e\3\2\2\2\u00a9"+
		"\u0281\3\2\2\2\u00ab\u0284\3\2\2\2\u00ad\u0287\3\2\2\2\u00af\u028a\3\2"+
		"\2\2\u00b1\u028d\3\2\2\2\u00b3\u0290\3\2\2\2\u00b5\u0293\3\2\2\2\u00b7"+
		"\u0295\3\2\2\2\u00b9\u0297\3\2\2\2\u00bb\u0299\3\2\2\2\u00bd\u029b\3\2"+
		"\2\2\u00bf\u029d\3\2\2\2\u00c1\u029f\3\2\2\2\u00c3\u02a2\3\2\2\2\u00c5"+
		"\u02a5\3\2\2\2\u00c7\u02a8\3\2\2\2\u00c9\u02ab\3\2\2\2\u00cb\u02b7\3\2"+
		"\2\2\u00cd\u02ba\3\2\2\2\u00cf\u02c0\3\2\2\2\u00d1\u02ce\3\2\2\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7u\2\2"+
		"\u00d7\u00d8\7u\2\2\u00d8\4\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7z"+
		"\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df"+
		"\7f\2\2\u00df\u00e0\7u\2\2\u00e0\6\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\b"+
		"\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7e\2\2\u00e9\n\3\2\2\2\u00ea"+
		"\u00eb\7h\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7e\2\2"+
		"\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2"+
		"\7p\2\2\u00f2\f\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7y\2\2\u00f8\u00f9\7u\2\2\u00f9"+
		"\16\3\2\2\2\u00fa\u00fb\7A\2\2\u00fb\20\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd"+
		"\u00fe\7w\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7t\2\2"+
		"\u0101\22\3\2\2\2\u0102\u0103\7\60\2\2\u0103\u0104\7\60\2\2\u0104\u0105"+
		"\7\60\2\2\u0105\24\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108\7j\2\2\u0108"+
		"\u0109\7t\2\2\u0109\u010a\7q\2\2\u010a\u010b\7y\2\2\u010b\26\3\2\2\2\u010c"+
		"\u010d\7<\2\2\u010d\30\3\2\2\2\u010e\u010f\7q\2\2\u010f\u0110\7w\2\2\u0110"+
		"\u0111\7v\2\2\u0111\u0112\7r\2\2\u0112\u0113\7w\2\2\u0113\u0114\7v\2\2"+
		"\u0114\32\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7"+
		"r\2\2\u0118\u0119\7w\2\2\u0119\u011a\7v\2\2\u011a\u011b\7*\2\2\u011b\u011c"+
		"\7+\2\2\u011c\u011d\7=\2\2\u011d\34\3\2\2\2\u011e\u011f\7e\2\2\u011f\u0120"+
		"\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122\7e\2\2\u0122\u0123\7j\2\2\u0123"+
		"\36\3\2\2\2\u0124\u0125\7~\2\2\u0125 \3\2\2\2\u0126\u0127\7h\2\2\u0127"+
		"\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129\u012a\7c\2\2\u012a\u012b\7n\2\2"+
		"\u012b\u012c\7n\2\2\u012c\u012d\7{\2\2\u012d\"\3\2\2\2\u012e\u012f\7#"+
		"\2\2\u012f$\3\2\2\2\u0130\u0131\7d\2\2\u0131\u0132\7q\2\2\u0132\u0133"+
		"\7q\2\2\u0133\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135\u0136\7c\2\2\u0136"+
		"\u0137\7p\2\2\u0137&\3\2\2\2\u0138\u0139\7d\2\2\u0139\u013a\7t\2\2\u013a"+
		"\u013b\7g\2\2\u013b\u013c\7c\2\2\u013c\u013d\7m\2\2\u013d(\3\2\2\2\u013e"+
		"\u013f\7e\2\2\u013f\u0140\7c\2\2\u0140\u0141\7u\2\2\u0141\u0142\7g\2\2"+
		"\u0142*\3\2\2\2\u0143\u0144\7e\2\2\u0144\u0145\7j\2\2\u0145\u0146\7c\2"+
		"\2\u0146\u0147\7t\2\2\u0147,\3\2\2\2\u0148\u0149\7E\2\2\u0149\u014a\7"+
		"Q\2\2\u014a\u014b\7P\2\2\u014b\u014c\7U\2\2\u014c\u014d\7V\2\2\u014d."+
		"\3\2\2\2\u014e\u014f\7f\2\2\u014f\u0150\7g\2\2\u0150\u0151\7h\2\2\u0151"+
		"\u0152\7c\2\2\u0152\u0153\7w\2\2\u0153\u0154\7n\2\2\u0154\u0155\7v\2\2"+
		"\u0155\60\3\2\2\2\u0156\u0157\7f\2\2\u0157\u0158\7q\2\2\u0158\u0159\7"+
		"y\2\2\u0159\u015a\7j\2\2\u015a\u015b\7k\2\2\u015b\u015c\7n\2\2\u015c\u015d"+
		"\7g\2\2\u015d\62\3\2\2\2\u015e\u015f\7g\2\2\u015f\u0160\7n\2\2\u0160\u0161"+
		"\7u\2\2\u0161\u0162\7g\2\2\u0162\64\3\2\2\2\u0163\u0164\7h\2\2\u0164\u0165"+
		"\7n\2\2\u0165\u0166\7q\2\2\u0166\u0167\7c\2\2\u0167\u0168\7v\2\2\u0168"+
		"\66\3\2\2\2\u0169\u016a\7h\2\2\u016a\u016b\7q\2\2\u016b\u016c\7t\2\2\u016c"+
		"8\3\2\2\2\u016d\u016e\7k\2\2\u016e\u016f\7h\2\2\u016f:\3\2\2\2\u0170\u0171"+
		"\7k\2\2\u0171\u0172\7p\2\2\u0172\u0173\7u\2\2\u0173\u0174\7v\2\2\u0174"+
		"\u0175\7c\2\2\u0175\u0176\7p\2\2\u0176\u0177\7e\2\2\u0177\u0178\7g\2\2"+
		"\u0178\u0179\7q\2\2\u0179\u017a\7h\2\2\u017a<\3\2\2\2\u017b\u017c\7k\2"+
		"\2\u017c\u017d\7p\2\2\u017d\u017e\7v\2\2\u017e>\3\2\2\2\u017f\u0180\7"+
		"n\2\2\u0180\u0181\7q\2\2\u0181\u0182\7p\2\2\u0182\u0183\7i\2\2\u0183@"+
		"\3\2\2\2\u0184\u0185\7p\2\2\u0185\u0186\7g\2\2\u0186\u0187\7y\2\2\u0187"+
		"B\3\2\2\2\u0188\u0189\7t\2\2\u0189\u018a\7g\2\2\u018a\u018b\7v\2\2\u018b"+
		"\u018c\7w\2\2\u018c\u018d\7t\2\2\u018d\u018e\7p\2\2\u018eD\3\2\2\2\u018f"+
		"\u0190\7u\2\2\u0190\u0191\7y\2\2\u0191\u0192\7k\2\2\u0192\u0193\7v\2\2"+
		"\u0193\u0194\7e\2\2\u0194\u0195\7j\2\2\u0195F\3\2\2\2\u0196\u0197\7v\2"+
		"\2\u0197\u0198\7j\2\2\u0198\u0199\7k\2\2\u0199\u019a\7u\2\2\u019aH\3\2"+
		"\2\2\u019b\u019c\7x\2\2\u019c\u019d\7q\2\2\u019d\u019e\7k\2\2\u019e\u019f"+
		"\7f\2\2\u019fJ\3\2\2\2\u01a0\u01a1\7y\2\2\u01a1\u01a2\7j\2\2\u01a2\u01a3"+
		"\7k\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7g\2\2\u01a5L\3\2\2\2\u01a6\u01a7"+
		"\5O(\2\u01a7N\3\2\2\2\u01a8\u01aa\5S*\2\u01a9\u01ab\5Q)\2\u01aa\u01a9"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abP\3\2\2\2\u01ac\u01ad\t\2\2\2\u01ad"+
		"R\3\2\2\2\u01ae\u01b9\7\62\2\2\u01af\u01b6\5Y-\2\u01b0\u01b2\5U+\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b7\3\2\2\2\u01b3\u01b4\5]"+
		"/\2\u01b4\u01b5\5U+\2\u01b5\u01b7\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b3"+
		"\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01af\3\2\2\2\u01b9"+
		"T\3\2\2\2\u01ba\u01c2\5W,\2\u01bb\u01bd\5[.\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c3\5W,\2\u01c2\u01be\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3V\3\2\2\2\u01c4\u01c7\7\62\2\2\u01c5\u01c7\5Y-\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7X\3\2\2\2\u01c8\u01c9\t\3\2\2\u01c9"+
		"Z\3\2\2\2\u01ca\u01cd\5W,\2\u01cb\u01cd\7a\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cb\3\2\2\2\u01cd\\\3\2\2\2\u01ce\u01d0\7a\2\2\u01cf\u01ce\3\2\2\2"+
		"\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2^\3"+
		"\2\2\2\u01d3\u01db\5a\61\2\u01d4\u01d6\5c\62\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\5a\61\2\u01db\u01d7\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc`\3\2\2\2\u01dd\u01de\t\4\2\2\u01deb\3\2\2\2\u01df"+
		"\u01e2\5a\61\2\u01e0\u01e2\7a\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2"+
		"\2\2\u01e2d\3\2\2\2\u01e3\u01eb\5g\64\2\u01e4\u01e6\5g\64\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\5g\64\2\u01eb\u01e7\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ecf\3\2\2\2\u01ed\u01ee\t\5\2\2\u01eeh\3\2"+
		"\2\2\u01ef\u01f0\5k\66\2\u01f0j\3\2\2\2\u01f1\u01f2\5U+\2\u01f2\u01f4"+
		"\7\60\2\2\u01f3\u01f5\5U+\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01f8\5m\67\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\5u;\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u020d\3\2\2\2\u01fc\u01fd\7\60\2\2\u01fd\u01ff\5U+\2\u01fe"+
		"\u0200\5m\67\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u0203\5u;\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u020d"+
		"\3\2\2\2\u0204\u0205\5U+\2\u0205\u0207\5m\67\2\u0206\u0208\5u;\2\u0207"+
		"\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020d\3\2\2\2\u0209\u020a\5U"+
		"+\2\u020a\u020b\5u;\2\u020b\u020d\3\2\2\2\u020c\u01f1\3\2\2\2\u020c\u01fc"+
		"\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0209\3\2\2\2\u020dl\3\2\2\2\u020e"+
		"\u020f\5o8\2\u020f\u0210\5q9\2\u0210n\3\2\2\2\u0211\u0212\t\6\2\2\u0212"+
		"p\3\2\2\2\u0213\u0215\5s:\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\5U+\2\u0217r\3\2\2\2\u0218\u0219\t\7\2\2\u0219"+
		"t\3\2\2\2\u021a\u021b\t\b\2\2\u021bv\3\2\2\2\u021c\u021d\7v\2\2\u021d"+
		"\u021e\7t\2\2\u021e\u021f\7w\2\2\u021f\u0226\7g\2\2\u0220\u0221\7h\2\2"+
		"\u0221\u0222\7c\2\2\u0222\u0223\7n\2\2\u0223\u0224\7u\2\2\u0224\u0226"+
		"\7g\2\2\u0225\u021c\3\2\2\2\u0225\u0220\3\2\2\2\u0226x\3\2\2\2\u0227\u0228"+
		"\7)\2\2\u0228\u0229\5{>\2\u0229\u022a\7)\2\2\u022a\u0230\3\2\2\2\u022b"+
		"\u022c\7)\2\2\u022c\u022d\5\u0083B\2\u022d\u022e\7)\2\2\u022e\u0230\3"+
		"\2\2\2\u022f\u0227\3\2\2\2\u022f\u022b\3\2\2\2\u0230z\3\2\2\2\u0231\u0232"+
		"\n\t\2\2\u0232|\3\2\2\2\u0233\u0235\7$\2\2\u0234\u0236\5\177@\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7$"+
		"\2\2\u0238~\3\2\2\2\u0239\u023b\5\u0081A\2\u023a\u0239\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0080\3\2\2\2\u023e"+
		"\u0241\n\n\2\2\u023f\u0241\5\u0083B\2\u0240\u023e\3\2\2\2\u0240\u023f"+
		"\3\2\2\2\u0241\u0082\3\2\2\2\u0242\u0243\7^\2\2\u0243\u0247\t\13\2\2\u0244"+
		"\u0247\5\u0085C\2\u0245\u0247\5\u0087D\2\u0246\u0242\3\2\2\2\u0246\u0244"+
		"\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u0084\3\2\2\2\u0248\u0249\7^\2\2\u0249"+
		"\u0254\5g\64\2\u024a\u024b\7^\2\2\u024b\u024c\5g\64\2\u024c\u024d\5g\64"+
		"\2\u024d\u0254\3\2\2\2\u024e\u024f\7^\2\2\u024f\u0250\5\u0089E\2\u0250"+
		"\u0251\5g\64\2\u0251\u0252\5g\64\2\u0252\u0254\3\2\2\2\u0253\u0248\3\2"+
		"\2\2\u0253\u024a\3\2\2\2\u0253\u024e\3\2\2\2\u0254\u0086\3\2\2\2\u0255"+
		"\u0256\7^\2\2\u0256\u0257\7w\2\2\u0257\u0258\5a\61\2\u0258\u0259\5a\61"+
		"\2\u0259\u025a\5a\61\2\u025a\u025b\5a\61\2\u025b\u0088\3\2\2\2\u025c\u025d"+
		"\t\f\2\2\u025d\u008a\3\2\2\2\u025e\u025f\7p\2\2\u025f\u0260\7w\2\2\u0260"+
		"\u0261\7n\2\2\u0261\u0262\7n\2\2\u0262\u008c\3\2\2\2\u0263\u0264\7*\2"+
		"\2\u0264\u008e\3\2\2\2\u0265\u0266\7+\2\2\u0266\u0090\3\2\2\2\u0267\u0268"+
		"\7}\2\2\u0268\u0092\3\2\2\2\u0269\u026a\7\177\2\2\u026a\u0094\3\2\2\2"+
		"\u026b\u026c\7]\2\2\u026c\u0096\3\2\2\2\u026d\u026e\7_\2\2\u026e\u0098"+
		"\3\2\2\2\u026f\u0270\7=\2\2\u0270\u009a\3\2\2\2\u0271\u0272\7.\2\2\u0272"+
		"\u009c\3\2\2\2\u0273\u0274\7\60\2\2\u0274\u009e\3\2\2\2\u0275\u0276\7"+
		"?\2\2\u0276\u00a0\3\2\2\2\u0277\u0278\7@\2\2\u0278\u00a2\3\2\2\2\u0279"+
		"\u027a\7>\2\2\u027a\u00a4\3\2\2\2\u027b\u027c\7?\2\2\u027c\u027d\7?\2"+
		"\2\u027d\u00a6\3\2\2\2\u027e\u027f\7>\2\2\u027f\u0280\7?\2\2\u0280\u00a8"+
		"\3\2\2\2\u0281\u0282\7@\2\2\u0282\u0283\7?\2\2\u0283\u00aa\3\2\2\2\u0284"+
		"\u0285\7#\2\2\u0285\u0286\7?\2\2\u0286\u00ac\3\2\2\2\u0287\u0288\7(\2"+
		"\2\u0288\u0289\7(\2\2\u0289\u00ae\3\2\2\2\u028a\u028b\7~\2\2\u028b\u028c"+
		"\7~\2\2\u028c\u00b0\3\2\2\2\u028d\u028e\7-\2\2\u028e\u028f\7-\2\2\u028f"+
		"\u00b2\3\2\2\2\u0290\u0291\7/\2\2\u0291\u0292\7/\2\2\u0292\u00b4\3\2\2"+
		"\2\u0293\u0294\7-\2\2\u0294\u00b6\3\2\2\2\u0295\u0296\7/\2\2\u0296\u00b8"+
		"\3\2\2\2\u0297\u0298\7,\2\2\u0298\u00ba\3\2\2\2\u0299\u029a\7\61\2\2\u029a"+
		"\u00bc\3\2\2\2\u029b\u029c\7`\2\2\u029c\u00be\3\2\2\2\u029d\u029e\7\'"+
		"\2\2\u029e\u00c0\3\2\2\2\u029f\u02a0\7-\2\2\u02a0\u02a1\7?\2\2\u02a1\u00c2"+
		"\3\2\2\2\u02a2\u02a3\7/\2\2\u02a3\u02a4\7?\2\2\u02a4\u00c4\3\2\2\2\u02a5"+
		"\u02a6\7,\2\2\u02a6\u02a7\7?\2\2\u02a7\u00c6\3\2\2\2\u02a8\u02a9\7\61"+
		"\2\2\u02a9\u02aa\7?\2\2\u02aa\u00c8\3\2\2\2\u02ab\u02b0\5\u00cbf\2\u02ac"+
		"\u02af\5\u00cbf\2\u02ad\u02af\5W,\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3"+
		"\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u00ca\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b8\t\r\2\2\u02b4\u02b8\n\16"+
		"\2\2\u02b5\u02b6\t\17\2\2\u02b6\u02b8\t\20\2\2\u02b7\u02b3\3\2\2\2\u02b7"+
		"\u02b4\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u00cc\3\2\2\2\u02b9\u02bb\t\21"+
		"\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\bg\2\2\u02bf\u00ce\3\2"+
		"\2\2\u02c0\u02c1\7\61\2\2\u02c1\u02c2\7,\2\2\u02c2\u02c6\3\2\2\2\u02c3"+
		"\u02c5\13\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c7\3"+
		"\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9"+
		"\u02ca\7,\2\2\u02ca\u02cb\7\61\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\bh"+
		"\3\2\u02cd\u00d0\3\2\2\2\u02ce\u02cf\7\61\2\2\u02cf\u02d0\7\61\2\2\u02d0"+
		"\u02d4\3\2\2\2\u02d1\u02d3\n\22\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3"+
		"\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d7\u02d8\bi\3\2\u02d8\u00d2\3\2\2\2&\2\u01aa\u01b1\u01b6"+
		"\u01b8\u01be\u01c2\u01c6\u01cc\u01d1\u01d7\u01db\u01e1\u01e7\u01eb\u01f4"+
		"\u01f7\u01fa\u01ff\u0202\u0207\u020c\u0214\u0225\u022f\u0235\u023c\u0240"+
		"\u0246\u0253\u02ae\u02b0\u02b7\u02bc\u02c6\u02d4\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}