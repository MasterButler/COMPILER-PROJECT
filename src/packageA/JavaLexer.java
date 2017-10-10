// Generated from /Users/Thea/COMPILER-PROJECT/src/packageA/Java.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, IntegerLiteral=17, 
		FloatingPointLiteral=18, BooleanLiteral=19, CharacterLiteral=20, StringLiteral=21, 
		NullLiteral=22, LEFTPARENTH=23, RIGHTPARENTH=24, LEFTBRACE=25, RIGHTBRACE=26, 
		LEFTBRACKET=27, RIGHTBRACKET=28, SEMICOLON=29, COMMA=30, DOT=31, ASSIGNMENT=32, 
		GREATER=33, LESS=34, EQUAL=35, LESSEQUAL=36, GREATEREQUAL=37, NOTEQUAL=38, 
		AND=39, OR=40, INCREMENT=41, DECREMENT=42, ADDITION=43, SUBTRACT=44, MULTIPLY=45, 
		DIVISION=46, EXPONENT=47, MODULO=48, ADD_ASSIGN=49, SUB_ASSIGN=50, MUL_ASSIGN=51, 
		DIV_ASSIGN=52, BOOLEAN=53, BREAK=54, CASE=55, CHAR=56, CLASS=57, CONST=58, 
		DEFAULT=59, DOWHILE=60, ELSE=61, FLOAT=62, FOR=63, IF=64, INSTANCEOF=65, 
		INT=66, LONG=67, NEW=68, RETURN=69, SWITCH=70, THIS=71, VOID=72, WHILE=73, 
		Identifier=74, WS=75, COMMENT=76, LINE_COMMENT=77;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "IntegerLiteral", 
		"DecimalIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", "HexDigits", 
		"HexDigit", "HexDigitOrUnderscore", "OctalDigits", "OctalDigit", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
		"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", "LEFTPARENTH", 
		"RIGHTPARENTH", "LEFTBRACE", "RIGHTBRACE", "LEFTBRACKET", "RIGHTBRACKET", 
		"SEMICOLON", "COMMA", "DOT", "ASSIGNMENT", "GREATER", "LESS", "EQUAL", 
		"LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", "OR", "INCREMENT", "DECREMENT", 
		"ADDITION", "SUBTRACT", "MULTIPLY", "DIVISION", "EXPONENT", "MODULO", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "BOOLEAN", "BREAK", 
		"CASE", "CHAR", "CLASS", "CONST", "DEFAULT", "DOWHILE", "ELSE", "FLOAT", 
		"FOR", "IF", "INSTANCEOF", "INT", "LONG", "NEW", "RETURN", "SWITCH", "THIS", 
		"VOID", "WHILE", "Identifier", "Character", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'extends'", "'&'", "'static'", "'function'", "'throws'", "'?'", 
		"'super'", "'...'", "'throw'", "':'", "'output'", "'input();'", "'catch'", 
		"'|'", "'finally'", "'!'", null, null, null, null, null, "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'boolean'", "'break'", "'case'", "'char'", "'class'", "'CONST'", "'default'", 
		"'dowhile'", "'else'", "'float'", "'for'", "'if'", "'instanceof'", "'int'", 
		"'long'", "'new'", "'return'", "'switch'", "'this'", "'void'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LEFTPARENTH", "RIGHTPARENTH", "LEFTBRACE", "RIGHTBRACE", "LEFTBRACKET", 
		"RIGHTBRACKET", "SEMICOLON", "COMMA", "DOT", "ASSIGNMENT", "GREATER", 
		"LESS", "EQUAL", "LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", "AND", "OR", 
		"INCREMENT", "DECREMENT", "ADDITION", "SUBTRACT", "MULTIPLY", "DIVISION", 
		"EXPONENT", "MODULO", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONST", "DEFAULT", "DOWHILE", 
		"ELSE", "FLOAT", "FOR", "IF", "INSTANCEOF", "INT", "LONG", "NEW", "RETURN", 
		"SWITCH", "THIS", "VOID", "WHILE", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\5\23\u012f\n\23\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0136\n\25\3\25\3\25\3\25\5\25\u013b\n\25\5\25\u013d\n\25\3\26\3\26\7"+
		"\26\u0141\n\26\f\26\16\26\u0144\13\26\3\26\5\26\u0147\n\26\3\27\3\27\5"+
		"\27\u014b\n\27\3\30\3\30\3\31\3\31\5\31\u0151\n\31\3\32\6\32\u0154\n\32"+
		"\r\32\16\32\u0155\3\33\3\33\7\33\u015a\n\33\f\33\16\33\u015d\13\33\3\33"+
		"\5\33\u0160\n\33\3\34\3\34\3\35\3\35\5\35\u0166\n\35\3\36\3\36\7\36\u016a"+
		"\n\36\f\36\16\36\u016d\13\36\3\36\5\36\u0170\n\36\3\37\3\37\3 \3 \3!\3"+
		"!\3!\5!\u0179\n!\3!\5!\u017c\n!\3!\5!\u017f\n!\3!\3!\3!\5!\u0184\n!\3"+
		"!\5!\u0187\n!\3!\3!\3!\5!\u018c\n!\3!\3!\3!\5!\u0191\n!\3\"\3\"\3\"\3"+
		"#\3#\3$\5$\u0199\n$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01aa\n\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01b4\n(\3)\3)\3*\3*\5*"+
		"\u01ba\n*\3*\3*\3+\6+\u01bf\n+\r+\16+\u01c0\3,\3,\5,\u01c5\n,\3-\3-\3"+
		"-\3-\5-\u01cb\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01d8\n.\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3"+
		"E\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3"+
		"N\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3"+
		"S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3"+
		"Z\3Z\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]"+
		"\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a"+
		"\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\7e\u02af\ne"+
		"\fe\16e\u02b2\13e\3f\3f\3f\3f\5f\u02b8\nf\3g\6g\u02bb\ng\rg\16g\u02bc"+
		"\3g\3g\3h\3h\3h\3h\7h\u02c5\nh\fh\16h\u02c8\13h\3h\3h\3h\3h\3h\3i\3i\3"+
		"i\3i\7i\u02d3\ni\fi\16i\u02d6\13i\3i\3i\3\u02c6\2j\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'"+
		"\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\24A\2C\2E\2G\2I\2K\2M\25"+
		"O\26Q\2S\27U\2W\2Y\2[\2]\2_\2a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w"+
		"#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/"+
		"\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66\u009f"+
		"\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1@\u00b3"+
		"A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3I\u00c5J\u00c7"+
		"K\u00c9L\u00cb\2\u00cdM\u00cfN\u00d1O\3\2\23\4\2NNnn\3\2\63;\5\2\62;C"+
		"Hch\3\2\629\4\2GGgg\4\2--//\6\2FFHHffhh\6\2\f\f\17\17))^^\4\2$$^^\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u02e5\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"?\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\3\u00d3\3\2\2\2\5\u00db\3\2\2\2\7\u00dd\3\2\2\2\t\u00e4\3\2\2"+
		"\2\13\u00ed\3\2\2\2\r\u00f4\3\2\2\2\17\u00f6\3\2\2\2\21\u00fc\3\2\2\2"+
		"\23\u0100\3\2\2\2\25\u0106\3\2\2\2\27\u0108\3\2\2\2\31\u010f\3\2\2\2\33"+
		"\u0118\3\2\2\2\35\u011e\3\2\2\2\37\u0120\3\2\2\2!\u0128\3\2\2\2#\u012a"+
		"\3\2\2\2%\u012c\3\2\2\2\'\u0130\3\2\2\2)\u013c\3\2\2\2+\u013e\3\2\2\2"+
		"-\u014a\3\2\2\2/\u014c\3\2\2\2\61\u0150\3\2\2\2\63\u0153\3\2\2\2\65\u0157"+
		"\3\2\2\2\67\u0161\3\2\2\29\u0165\3\2\2\2;\u0167\3\2\2\2=\u0171\3\2\2\2"+
		"?\u0173\3\2\2\2A\u0190\3\2\2\2C\u0192\3\2\2\2E\u0195\3\2\2\2G\u0198\3"+
		"\2\2\2I\u019c\3\2\2\2K\u019e\3\2\2\2M\u01a9\3\2\2\2O\u01b3\3\2\2\2Q\u01b5"+
		"\3\2\2\2S\u01b7\3\2\2\2U\u01be\3\2\2\2W\u01c4\3\2\2\2Y\u01ca\3\2\2\2["+
		"\u01d7\3\2\2\2]\u01d9\3\2\2\2_\u01e0\3\2\2\2a\u01e2\3\2\2\2c\u01e7\3\2"+
		"\2\2e\u01e9\3\2\2\2g\u01eb\3\2\2\2i\u01ed\3\2\2\2k\u01ef\3\2\2\2m\u01f1"+
		"\3\2\2\2o\u01f3\3\2\2\2q\u01f5\3\2\2\2s\u01f7\3\2\2\2u\u01f9\3\2\2\2w"+
		"\u01fb\3\2\2\2y\u01fd\3\2\2\2{\u01ff\3\2\2\2}\u0202\3\2\2\2\177\u0205"+
		"\3\2\2\2\u0081\u0208\3\2\2\2\u0083\u020b\3\2\2\2\u0085\u020e\3\2\2\2\u0087"+
		"\u0211\3\2\2\2\u0089\u0214\3\2\2\2\u008b\u0217\3\2\2\2\u008d\u0219\3\2"+
		"\2\2\u008f\u021b\3\2\2\2\u0091\u021d\3\2\2\2\u0093\u021f\3\2\2\2\u0095"+
		"\u0221\3\2\2\2\u0097\u0223\3\2\2\2\u0099\u0226\3\2\2\2\u009b\u0229\3\2"+
		"\2\2\u009d\u022c\3\2\2\2\u009f\u022f\3\2\2\2\u00a1\u0237\3\2\2\2\u00a3"+
		"\u023d\3\2\2\2\u00a5\u0242\3\2\2\2\u00a7\u0247\3\2\2\2\u00a9\u024d\3\2"+
		"\2\2\u00ab\u0253\3\2\2\2\u00ad\u025b\3\2\2\2\u00af\u0263\3\2\2\2\u00b1"+
		"\u0268\3\2\2\2\u00b3\u026e\3\2\2\2\u00b5\u0272\3\2\2\2\u00b7\u0275\3\2"+
		"\2\2\u00b9\u0280\3\2\2\2\u00bb\u0284\3\2\2\2\u00bd\u0289\3\2\2\2\u00bf"+
		"\u028d\3\2\2\2\u00c1\u0294\3\2\2\2\u00c3\u029b\3\2\2\2\u00c5\u02a0\3\2"+
		"\2\2\u00c7\u02a5\3\2\2\2\u00c9\u02ab\3\2\2\2\u00cb\u02b7\3\2\2\2\u00cd"+
		"\u02ba\3\2\2\2\u00cf\u02c0\3\2\2\2\u00d1\u02ce\3\2\2\2\u00d3\u00d4\7g"+
		"\2\2\u00d4\u00d5\7z\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7p\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7u\2\2\u00da\4\3\2\2\2\u00db\u00dc"+
		"\7(\2\2\u00dc\6\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7e\2\2\u00e3"+
		"\b\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\u00ec\7p\2\2\u00ec\n\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7j"+
		"\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3"+
		"\7u\2\2\u00f3\f\3\2\2\2\u00f4\u00f5\7A\2\2\u00f5\16\3\2\2\2\u00f6\u00f7"+
		"\7u\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\u00fb\7t\2\2\u00fb\20\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7\60\2"+
		"\2\u00fe\u00ff\7\60\2\2\u00ff\22\3\2\2\2\u0100\u0101\7v\2\2\u0101\u0102"+
		"\7j\2\2\u0102\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104\u0105\7y\2\2\u0105"+
		"\24\3\2\2\2\u0106\u0107\7<\2\2\u0107\26\3\2\2\2\u0108\u0109\7q\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u010b\7v\2\2\u010b\u010c\7r\2\2\u010c\u010d\7w\2\2"+
		"\u010d\u010e\7v\2\2\u010e\30\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7"+
		"p\2\2\u0111\u0112\7r\2\2\u0112\u0113\7w\2\2\u0113\u0114\7v\2\2\u0114\u0115"+
		"\7*\2\2\u0115\u0116\7+\2\2\u0116\u0117\7=\2\2\u0117\32\3\2\2\2\u0118\u0119"+
		"\7e\2\2\u0119\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c\7e\2\2\u011c"+
		"\u011d\7j\2\2\u011d\34\3\2\2\2\u011e\u011f\7~\2\2\u011f\36\3\2\2\2\u0120"+
		"\u0121\7h\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7c\2\2"+
		"\u0124\u0125\7n\2\2\u0125\u0126\7n\2\2\u0126\u0127\7{\2\2\u0127 \3\2\2"+
		"\2\u0128\u0129\7#\2\2\u0129\"\3\2\2\2\u012a\u012b\5%\23\2\u012b$\3\2\2"+
		"\2\u012c\u012e\5)\25\2\u012d\u012f\5\'\24\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f&\3\2\2\2\u0130\u0131\t\2\2\2\u0131(\3\2\2\2\u0132"+
		"\u013d\7\62\2\2\u0133\u013a\5/\30\2\u0134\u0136\5+\26\2\u0135\u0134\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u013b\3\2\2\2\u0137\u0138\5\63\32\2\u0138"+
		"\u0139\5+\26\2\u0139\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0137\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u0132\3\2\2\2\u013c\u0133\3\2\2\2\u013d"+
		"*\3\2\2\2\u013e\u0146\5-\27\2\u013f\u0141\5\61\31\2\u0140\u013f\3\2\2"+
		"\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5-\27\2\u0146\u0142\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147,\3\2\2\2\u0148\u014b\7\62\2\2\u0149\u014b\5/\30\2"+
		"\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b.\3\2\2\2\u014c\u014d\t"+
		"\3\2\2\u014d\60\3\2\2\2\u014e\u0151\5-\27\2\u014f\u0151\7a\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u014f\3\2\2\2\u0151\62\3\2\2\2\u0152\u0154\7a\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\64\3\2\2\2\u0157\u015f\5\67\34\2\u0158\u015a\59\35\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\5\67\34\2\u015f"+
		"\u015b\3\2\2\2\u015f\u0160\3\2\2\2\u0160\66\3\2\2\2\u0161\u0162\t\4\2"+
		"\2\u01628\3\2\2\2\u0163\u0166\5\67\34\2\u0164\u0166\7a\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0164\3\2\2\2\u0166:\3\2\2\2\u0167\u016f\5=\37\2\u0168"+
		"\u016a\5=\37\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\5=\37\2\u016f\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170<\3\2\2\2"+
		"\u0171\u0172\t\5\2\2\u0172>\3\2\2\2\u0173\u0174\5A!\2\u0174@\3\2\2\2\u0175"+
		"\u0176\5+\26\2\u0176\u0178\7\60\2\2\u0177\u0179\5+\26\2\u0178\u0177\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\5C\"\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\5K"+
		"&\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0191\3\2\2\2\u0180"+
		"\u0181\7\60\2\2\u0181\u0183\5+\26\2\u0182\u0184\5C\"\2\u0183\u0182\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\5K&\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0191\3\2\2\2\u0188\u0189\5+\26\2\u0189"+
		"\u018b\5C\"\2\u018a\u018c\5K&\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2"+
		"\2\u018c\u0191\3\2\2\2\u018d\u018e\5+\26\2\u018e\u018f\5K&\2\u018f\u0191"+
		"\3\2\2\2\u0190\u0175\3\2\2\2\u0190\u0180\3\2\2\2\u0190\u0188\3\2\2\2\u0190"+
		"\u018d\3\2\2\2\u0191B\3\2\2\2\u0192\u0193\5E#\2\u0193\u0194\5G$\2\u0194"+
		"D\3\2\2\2\u0195\u0196\t\6\2\2\u0196F\3\2\2\2\u0197\u0199\5I%\2\u0198\u0197"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5+\26\2\u019b"+
		"H\3\2\2\2\u019c\u019d\t\7\2\2\u019dJ\3\2\2\2\u019e\u019f\t\b\2\2\u019f"+
		"L\3\2\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7w\2\2\u01a3"+
		"\u01aa\7g\2\2\u01a4\u01a5\7h\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7n\2\2"+
		"\u01a7\u01a8\7u\2\2\u01a8\u01aa\7g\2\2\u01a9\u01a0\3\2\2\2\u01a9\u01a4"+
		"\3\2\2\2\u01aaN\3\2\2\2\u01ab\u01ac\7)\2\2\u01ac\u01ad\5Q)\2\u01ad\u01ae"+
		"\7)\2\2\u01ae\u01b4\3\2\2\2\u01af\u01b0\7)\2\2\u01b0\u01b1\5Y-\2\u01b1"+
		"\u01b2\7)\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01af\3\2"+
		"\2\2\u01b4P\3\2\2\2\u01b5\u01b6\n\t\2\2\u01b6R\3\2\2\2\u01b7\u01b9\7$"+
		"\2\2\u01b8\u01ba\5U+\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\7$\2\2\u01bcT\3\2\2\2\u01bd\u01bf\5W,\2\u01be\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"V\3\2\2\2\u01c2\u01c5\n\n\2\2\u01c3\u01c5\5Y-\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5X\3\2\2\2\u01c6\u01c7\7^\2\2\u01c7\u01cb\t\13\2\2"+
		"\u01c8\u01cb\5[.\2\u01c9\u01cb\5]/\2\u01ca\u01c6\3\2\2\2\u01ca\u01c8\3"+
		"\2\2\2\u01ca\u01c9\3\2\2\2\u01cbZ\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01d8"+
		"\5=\37\2\u01ce\u01cf\7^\2\2\u01cf\u01d0\5=\37\2\u01d0\u01d1\5=\37\2\u01d1"+
		"\u01d8\3\2\2\2\u01d2\u01d3\7^\2\2\u01d3\u01d4\5_\60\2\u01d4\u01d5\5=\37"+
		"\2\u01d5\u01d6\5=\37\2\u01d6\u01d8\3\2\2\2\u01d7\u01cc\3\2\2\2\u01d7\u01ce"+
		"\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d8\\\3\2\2\2\u01d9\u01da\7^\2\2\u01da"+
		"\u01db\7w\2\2\u01db\u01dc\5\67\34\2\u01dc\u01dd\5\67\34\2\u01dd\u01de"+
		"\5\67\34\2\u01de\u01df\5\67\34\2\u01df^\3\2\2\2\u01e0\u01e1\t\f\2\2\u01e1"+
		"`\3\2\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e4\7w\2\2\u01e4\u01e5\7n\2\2\u01e5"+
		"\u01e6\7n\2\2\u01e6b\3\2\2\2\u01e7\u01e8\7*\2\2\u01e8d\3\2\2\2\u01e9\u01ea"+
		"\7+\2\2\u01eaf\3\2\2\2\u01eb\u01ec\7}\2\2\u01ech\3\2\2\2\u01ed\u01ee\7"+
		"\177\2\2\u01eej\3\2\2\2\u01ef\u01f0\7]\2\2\u01f0l\3\2\2\2\u01f1\u01f2"+
		"\7_\2\2\u01f2n\3\2\2\2\u01f3\u01f4\7=\2\2\u01f4p\3\2\2\2\u01f5\u01f6\7"+
		".\2\2\u01f6r\3\2\2\2\u01f7\u01f8\7\60\2\2\u01f8t\3\2\2\2\u01f9\u01fa\7"+
		"?\2\2\u01fav\3\2\2\2\u01fb\u01fc\7@\2\2\u01fcx\3\2\2\2\u01fd\u01fe\7>"+
		"\2\2\u01fez\3\2\2\2\u01ff\u0200\7?\2\2\u0200\u0201\7?\2\2\u0201|\3\2\2"+
		"\2\u0202\u0203\7>\2\2\u0203\u0204\7?\2\2\u0204~\3\2\2\2\u0205\u0206\7"+
		"@\2\2\u0206\u0207\7?\2\2\u0207\u0080\3\2\2\2\u0208\u0209\7#\2\2\u0209"+
		"\u020a\7?\2\2\u020a\u0082\3\2\2\2\u020b\u020c\7(\2\2\u020c\u020d\7(\2"+
		"\2\u020d\u0084\3\2\2\2\u020e\u020f\7~\2\2\u020f\u0210\7~\2\2\u0210\u0086"+
		"\3\2\2\2\u0211\u0212\7-\2\2\u0212\u0213\7-\2\2\u0213\u0088\3\2\2\2\u0214"+
		"\u0215\7/\2\2\u0215\u0216\7/\2\2\u0216\u008a\3\2\2\2\u0217\u0218\7-\2"+
		"\2\u0218\u008c\3\2\2\2\u0219\u021a\7/\2\2\u021a\u008e\3\2\2\2\u021b\u021c"+
		"\7,\2\2\u021c\u0090\3\2\2\2\u021d\u021e\7\61\2\2\u021e\u0092\3\2\2\2\u021f"+
		"\u0220\7`\2\2\u0220\u0094\3\2\2\2\u0221\u0222\7\'\2\2\u0222\u0096\3\2"+
		"\2\2\u0223\u0224\7-\2\2\u0224\u0225\7?\2\2\u0225\u0098\3\2\2\2\u0226\u0227"+
		"\7/\2\2\u0227\u0228\7?\2\2\u0228\u009a\3\2\2\2\u0229\u022a\7,\2\2\u022a"+
		"\u022b\7?\2\2\u022b\u009c\3\2\2\2\u022c\u022d\7\61\2\2\u022d\u022e\7?"+
		"\2\2\u022e\u009e\3\2\2\2\u022f\u0230\7d\2\2\u0230\u0231\7q\2\2\u0231\u0232"+
		"\7q\2\2\u0232\u0233\7n\2\2\u0233\u0234\7g\2\2\u0234\u0235\7c\2\2\u0235"+
		"\u0236\7p\2\2\u0236\u00a0\3\2\2\2\u0237\u0238\7d\2\2\u0238\u0239\7t\2"+
		"\2\u0239\u023a\7g\2\2\u023a\u023b\7c\2\2\u023b\u023c\7m\2\2\u023c\u00a2"+
		"\3\2\2\2\u023d\u023e\7e\2\2\u023e\u023f\7c\2\2\u023f\u0240\7u\2\2\u0240"+
		"\u0241\7g\2\2\u0241\u00a4\3\2\2\2\u0242\u0243\7e\2\2\u0243\u0244\7j\2"+
		"\2\u0244\u0245\7c\2\2\u0245\u0246\7t\2\2\u0246\u00a6\3\2\2\2\u0247\u0248"+
		"\7e\2\2\u0248\u0249\7n\2\2\u0249\u024a\7c\2\2\u024a\u024b\7u\2\2\u024b"+
		"\u024c\7u\2\2\u024c\u00a8\3\2\2\2\u024d\u024e\7E\2\2\u024e\u024f\7Q\2"+
		"\2\u024f\u0250\7P\2\2\u0250\u0251\7U\2\2\u0251\u0252\7V\2\2\u0252\u00aa"+
		"\3\2\2\2\u0253\u0254\7f\2\2\u0254\u0255\7g\2\2\u0255\u0256\7h\2\2\u0256"+
		"\u0257\7c\2\2\u0257\u0258\7w\2\2\u0258\u0259\7n\2\2\u0259\u025a\7v\2\2"+
		"\u025a\u00ac\3\2\2\2\u025b\u025c\7f\2\2\u025c\u025d\7q\2\2\u025d\u025e"+
		"\7y\2\2\u025e\u025f\7j\2\2\u025f\u0260\7k\2\2\u0260\u0261\7n\2\2\u0261"+
		"\u0262\7g\2\2\u0262\u00ae\3\2\2\2\u0263\u0264\7g\2\2\u0264\u0265\7n\2"+
		"\2\u0265\u0266\7u\2\2\u0266\u0267\7g\2\2\u0267\u00b0\3\2\2\2\u0268\u0269"+
		"\7h\2\2\u0269\u026a\7n\2\2\u026a\u026b\7q\2\2\u026b\u026c\7c\2\2\u026c"+
		"\u026d\7v\2\2\u026d\u00b2\3\2\2\2\u026e\u026f\7h\2\2\u026f\u0270\7q\2"+
		"\2\u0270\u0271\7t\2\2\u0271\u00b4\3\2\2\2\u0272\u0273\7k\2\2\u0273\u0274"+
		"\7h\2\2\u0274\u00b6\3\2\2\2\u0275\u0276\7k\2\2\u0276\u0277\7p\2\2\u0277"+
		"\u0278\7u\2\2\u0278\u0279\7v\2\2\u0279\u027a\7c\2\2\u027a\u027b\7p\2\2"+
		"\u027b\u027c\7e\2\2\u027c\u027d\7g\2\2\u027d\u027e\7q\2\2\u027e\u027f"+
		"\7h\2\2\u027f\u00b8\3\2\2\2\u0280\u0281\7k\2\2\u0281\u0282\7p\2\2\u0282"+
		"\u0283\7v\2\2\u0283\u00ba\3\2\2\2\u0284\u0285\7n\2\2\u0285\u0286\7q\2"+
		"\2\u0286\u0287\7p\2\2\u0287\u0288\7i\2\2\u0288\u00bc\3\2\2\2\u0289\u028a"+
		"\7p\2\2\u028a\u028b\7g\2\2\u028b\u028c\7y\2\2\u028c\u00be\3\2\2\2\u028d"+
		"\u028e\7t\2\2\u028e\u028f\7g\2\2\u028f\u0290\7v\2\2\u0290\u0291\7w\2\2"+
		"\u0291\u0292\7t\2\2\u0292\u0293\7p\2\2\u0293\u00c0\3\2\2\2\u0294\u0295"+
		"\7u\2\2\u0295\u0296\7y\2\2\u0296\u0297\7k\2\2\u0297\u0298\7v\2\2\u0298"+
		"\u0299\7e\2\2\u0299\u029a\7j\2\2\u029a\u00c2\3\2\2\2\u029b\u029c\7v\2"+
		"\2\u029c\u029d\7j\2\2\u029d\u029e\7k\2\2\u029e\u029f\7u\2\2\u029f\u00c4"+
		"\3\2\2\2\u02a0\u02a1\7x\2\2\u02a1\u02a2\7q\2\2\u02a2\u02a3\7k\2\2\u02a3"+
		"\u02a4\7f\2\2\u02a4\u00c6\3\2\2\2\u02a5\u02a6\7y\2\2\u02a6\u02a7\7j\2"+
		"\2\u02a7\u02a8\7k\2\2\u02a8\u02a9\7n\2\2\u02a9\u02aa\7g\2\2\u02aa\u00c8"+
		"\3\2\2\2\u02ab\u02b0\5\u00cbf\2\u02ac\u02af\5\u00cbf\2\u02ad\u02af\5-"+
		"\27\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u00ca\3\2\2\2\u02b2\u02b0\3\2"+
		"\2\2\u02b3\u02b8\t\r\2\2\u02b4\u02b8\n\16\2\2\u02b5\u02b6\t\17\2\2\u02b6"+
		"\u02b8\t\20\2\2\u02b7\u02b3\3\2\2\2\u02b7\u02b4\3\2\2\2\u02b7\u02b5\3"+
		"\2\2\2\u02b8\u00cc\3\2\2\2\u02b9\u02bb\t\21\2\2\u02ba\u02b9\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\u02bf\bg\2\2\u02bf\u00ce\3\2\2\2\u02c0\u02c1\7\61\2\2\u02c1"+
		"\u02c2\7,\2\2\u02c2\u02c6\3\2\2\2\u02c3\u02c5\13\2\2\2\u02c4\u02c3\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7,\2\2\u02ca\u02cb\7\61"+
		"\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\bh\3\2\u02cd\u00d0\3\2\2\2\u02ce"+
		"\u02cf\7\61\2\2\u02cf\u02d0\7\61\2\2\u02d0\u02d4\3\2\2\2\u02d1\u02d3\n"+
		"\22\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\bi"+
		"\3\2\u02d8\u00d2\3\2\2\2&\2\u012e\u0135\u013a\u013c\u0142\u0146\u014a"+
		"\u0150\u0155\u015b\u015f\u0165\u016b\u016f\u0178\u017b\u017e\u0183\u0186"+
		"\u018b\u0190\u0198\u01a9\u01b3\u01b9\u01c0\u01c4\u01ca\u01d7\u02ae\u02b0"+
		"\u02b7\u02bc\u02c6\u02d4\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}