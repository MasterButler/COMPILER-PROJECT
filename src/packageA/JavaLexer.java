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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IntegerLiteral=16, 
		FloatingPointLiteral=17, BooleanLiteral=18, CharacterLiteral=19, StringLiteral=20, 
		NullLiteral=21, LEFTPARENTH=22, RIGHTPARENTH=23, LEFTBRACE=24, RIGHTBRACE=25, 
		LEFTBRACKET=26, RIGHTBRACKET=27, SEMICOLON=28, COMMA=29, DOT=30, ASSIGNMENT=31, 
		GREATER=32, LESS=33, EQUAL=34, LESSEQUAL=35, GREATEREQUAL=36, NOTEQUAL=37, 
		AND=38, OR=39, INCREMENT=40, DECREMENT=41, ADDITION=42, SUBTRACT=43, MULTIPLY=44, 
		DIVISION=45, EXPONENT=46, MODULO=47, ADD_ASSIGN=48, SUB_ASSIGN=49, MUL_ASSIGN=50, 
		DIV_ASSIGN=51, BOOLEAN=52, BREAK=53, CASE=54, CHAR=55, CLASS=56, CONST=57, 
		DEFAULT=58, DOWHILE=59, ELSE=60, FLOAT=61, FOR=62, IF=63, INSTANCEOF=64, 
		INT=65, LONG=66, NEW=67, RETURN=68, SWITCH=69, THIS=70, VOID=71, WHILE=72, 
		Identifier=73, WS=74, COMMENT=75, LINE_COMMENT=76;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "IntegerLiteral", 
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
		"'super'", "'...'", "'throw'", "':'", "'output'", "'catch'", "'|'", "'finally'", 
		"'!'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'boolean'", "'break'", 
		"'case'", "'char'", "'class'", "'CONST'", "'default'", "'dowhile'", "'else'", 
		"'float'", "'for'", "'if'", "'instanceof'", "'int'", "'long'", "'new'", 
		"'return'", "'switch'", "'this'", "'void'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LEFTPARENTH", "RIGHTPARENTH", 
		"LEFTBRACE", "RIGHTBRACE", "LEFTBRACKET", "RIGHTBRACKET", "SEMICOLON", 
		"COMMA", "DOT", "ASSIGNMENT", "GREATER", "LESS", "EQUAL", "LESSEQUAL", 
		"GREATEREQUAL", "NOTEQUAL", "AND", "OR", "INCREMENT", "DECREMENT", "ADDITION", 
		"SUBTRACT", "MULTIPLY", "DIVISION", "EXPONENT", "MODULO", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "BOOLEAN", "BREAK", "CASE", 
		"CHAR", "CLASS", "CONST", "DEFAULT", "DOWHILE", "ELSE", "FLOAT", "FOR", 
		"IF", "INSTANCEOF", "INT", "LONG", "NEW", "RETURN", "SWITCH", "THIS", 
		"VOID", "WHILE", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u02ce\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0124\n\22\3\23"+
		"\3\23\3\24\3\24\3\24\5\24\u012b\n\24\3\24\3\24\3\24\5\24\u0130\n\24\5"+
		"\24\u0132\n\24\3\25\3\25\7\25\u0136\n\25\f\25\16\25\u0139\13\25\3\25\5"+
		"\25\u013c\n\25\3\26\3\26\5\26\u0140\n\26\3\27\3\27\3\30\3\30\5\30\u0146"+
		"\n\30\3\31\6\31\u0149\n\31\r\31\16\31\u014a\3\32\3\32\7\32\u014f\n\32"+
		"\f\32\16\32\u0152\13\32\3\32\5\32\u0155\n\32\3\33\3\33\3\34\3\34\5\34"+
		"\u015b\n\34\3\35\3\35\7\35\u015f\n\35\f\35\16\35\u0162\13\35\3\35\5\35"+
		"\u0165\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \5 \u016e\n \3 \5 \u0171\n \3"+
		" \5 \u0174\n \3 \3 \3 \5 \u0179\n \3 \5 \u017c\n \3 \3 \3 \5 \u0181\n"+
		" \3 \3 \3 \5 \u0186\n \3!\3!\3!\3\"\3\"\3#\5#\u018e\n#\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u019f\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01a9\n\'\3(\3(\3)\3)\5)\u01af\n)\3)\3)\3*\6*\u01b4\n*\r*\16"+
		"*\u01b5\3+\3+\5+\u01ba\n+\3,\3,\3,\3,\5,\u01c0\n,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u01cd\n-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3"+
		"@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3"+
		"I\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3"+
		"T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3"+
		"W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\3_\3_\3_\3"+
		"_\3_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\3c\3"+
		"c\3c\3d\3d\3d\7d\u02a4\nd\fd\16d\u02a7\13d\3e\3e\3e\3e\5e\u02ad\ne\3f"+
		"\6f\u02b0\nf\rf\16f\u02b1\3f\3f\3g\3g\3g\3g\7g\u02ba\ng\fg\16g\u02bd\13"+
		"g\3g\3g\3g\3g\3g\3h\3h\3h\3h\7h\u02c8\nh\fh\16h\u02cb\13h\3h\3h\3\u02bb"+
		"\2i\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\23?\2A"+
		"\2C\2E\2G\2I\2K\24M\25O\2Q\26S\2U\2W\2Y\2[\2]\2_\27a\30c\31e\32g\33i\34"+
		"k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65"+
		"\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af"+
		"?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3"+
		"I\u00c5J\u00c7K\u00c9\2\u00cbL\u00cdM\u00cfN\3\2\23\4\2NNnn\3\2\63;\5"+
		"\2\62;CHch\3\2\629\4\2GGgg\4\2--//\6\2FFHHffhh\6\2\f\f\17\17))^^\4\2$"+
		"$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u02da"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2=\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\3\u00d1"+
		"\3\2\2\2\5\u00d9\3\2\2\2\7\u00db\3\2\2\2\t\u00e2\3\2\2\2\13\u00eb\3\2"+
		"\2\2\r\u00f2\3\2\2\2\17\u00f4\3\2\2\2\21\u00fa\3\2\2\2\23\u00fe\3\2\2"+
		"\2\25\u0104\3\2\2\2\27\u0106\3\2\2\2\31\u010d\3\2\2\2\33\u0113\3\2\2\2"+
		"\35\u0115\3\2\2\2\37\u011d\3\2\2\2!\u011f\3\2\2\2#\u0121\3\2\2\2%\u0125"+
		"\3\2\2\2\'\u0131\3\2\2\2)\u0133\3\2\2\2+\u013f\3\2\2\2-\u0141\3\2\2\2"+
		"/\u0145\3\2\2\2\61\u0148\3\2\2\2\63\u014c\3\2\2\2\65\u0156\3\2\2\2\67"+
		"\u015a\3\2\2\29\u015c\3\2\2\2;\u0166\3\2\2\2=\u0168\3\2\2\2?\u0185\3\2"+
		"\2\2A\u0187\3\2\2\2C\u018a\3\2\2\2E\u018d\3\2\2\2G\u0191\3\2\2\2I\u0193"+
		"\3\2\2\2K\u019e\3\2\2\2M\u01a8\3\2\2\2O\u01aa\3\2\2\2Q\u01ac\3\2\2\2S"+
		"\u01b3\3\2\2\2U\u01b9\3\2\2\2W\u01bf\3\2\2\2Y\u01cc\3\2\2\2[\u01ce\3\2"+
		"\2\2]\u01d5\3\2\2\2_\u01d7\3\2\2\2a\u01dc\3\2\2\2c\u01de\3\2\2\2e\u01e0"+
		"\3\2\2\2g\u01e2\3\2\2\2i\u01e4\3\2\2\2k\u01e6\3\2\2\2m\u01e8\3\2\2\2o"+
		"\u01ea\3\2\2\2q\u01ec\3\2\2\2s\u01ee\3\2\2\2u\u01f0\3\2\2\2w\u01f2\3\2"+
		"\2\2y\u01f4\3\2\2\2{\u01f7\3\2\2\2}\u01fa\3\2\2\2\177\u01fd\3\2\2\2\u0081"+
		"\u0200\3\2\2\2\u0083\u0203\3\2\2\2\u0085\u0206\3\2\2\2\u0087\u0209\3\2"+
		"\2\2\u0089\u020c\3\2\2\2\u008b\u020e\3\2\2\2\u008d\u0210\3\2\2\2\u008f"+
		"\u0212\3\2\2\2\u0091\u0214\3\2\2\2\u0093\u0216\3\2\2\2\u0095\u0218\3\2"+
		"\2\2\u0097\u021b\3\2\2\2\u0099\u021e\3\2\2\2\u009b\u0221\3\2\2\2\u009d"+
		"\u0224\3\2\2\2\u009f\u022c\3\2\2\2\u00a1\u0232\3\2\2\2\u00a3\u0237\3\2"+
		"\2\2\u00a5\u023c\3\2\2\2\u00a7\u0242\3\2\2\2\u00a9\u0248\3\2\2\2\u00ab"+
		"\u0250\3\2\2\2\u00ad\u0258\3\2\2\2\u00af\u025d\3\2\2\2\u00b1\u0263\3\2"+
		"\2\2\u00b3\u0267\3\2\2\2\u00b5\u026a\3\2\2\2\u00b7\u0275\3\2\2\2\u00b9"+
		"\u0279\3\2\2\2\u00bb\u027e\3\2\2\2\u00bd\u0282\3\2\2\2\u00bf\u0289\3\2"+
		"\2\2\u00c1\u0290\3\2\2\2\u00c3\u0295\3\2\2\2\u00c5\u029a\3\2\2\2\u00c7"+
		"\u02a0\3\2\2\2\u00c9\u02ac\3\2\2\2\u00cb\u02af\3\2\2\2\u00cd\u02b5\3\2"+
		"\2\2\u00cf\u02c3\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7z\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7f\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\4\3\2\2\2\u00d9\u00da\7(\2\2\u00da\6\3\2\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7v\2\2"+
		"\u00df\u00e0\7k\2\2\u00e0\u00e1\7e\2\2\u00e1\b\3\2\2\2\u00e2\u00e3\7h"+
		"\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\n\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7t\2\2\u00ee"+
		"\u00ef\7q\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7u\2\2\u00f1\f\3\2\2\2\u00f2"+
		"\u00f3\7A\2\2\u00f3\16\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7w\2\2\u00f6"+
		"\u00f7\7r\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9\20\3\2\2\2\u00fa"+
		"\u00fb\7\60\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd\7\60\2\2\u00fd\22\3\2"+
		"\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7j\2\2\u0100\u0101\7t\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u0103\7y\2\2\u0103\24\3\2\2\2\u0104\u0105\7<\2\2\u0105\26"+
		"\3\2\2\2\u0106\u0107\7q\2\2\u0107\u0108\7w\2\2\u0108\u0109\7v\2\2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7w\2\2\u010b\u010c\7v\2\2\u010c\30\3\2\2\2\u010d"+
		"\u010e\7e\2\2\u010e\u010f\7c\2\2\u010f\u0110\7v\2\2\u0110\u0111\7e\2\2"+
		"\u0111\u0112\7j\2\2\u0112\32\3\2\2\2\u0113\u0114\7~\2\2\u0114\34\3\2\2"+
		"\2\u0115\u0116\7h\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7n\2\2\u011a\u011b\7n\2\2\u011b\u011c\7{\2\2\u011c"+
		"\36\3\2\2\2\u011d\u011e\7#\2\2\u011e \3\2\2\2\u011f\u0120\5#\22\2\u0120"+
		"\"\3\2\2\2\u0121\u0123\5\'\24\2\u0122\u0124\5%\23\2\u0123\u0122\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124$\3\2\2\2\u0125\u0126\t\2\2\2\u0126&\3\2\2"+
		"\2\u0127\u0132\7\62\2\2\u0128\u012f\5-\27\2\u0129\u012b\5)\25\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2\u012c\u012d\5\61"+
		"\31\2\u012d\u012e\5)\25\2\u012e\u0130\3\2\2\2\u012f\u012a\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0127\3\2\2\2\u0131\u0128\3\2"+
		"\2\2\u0132(\3\2\2\2\u0133\u013b\5+\26\2\u0134\u0136\5/\30\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\5+\26\2\u013b\u0137\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c*\3\2\2\2\u013d\u0140\7\62\2\2\u013e\u0140"+
		"\5-\27\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140,\3\2\2\2\u0141"+
		"\u0142\t\3\2\2\u0142.\3\2\2\2\u0143\u0146\5+\26\2\u0144\u0146\7a\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\60\3\2\2\2\u0147\u0149\7a\2\2"+
		"\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\62\3\2\2\2\u014c\u0154\5\65\33\2\u014d\u014f\5\67\34\2"+
		"\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\5\65\33\2"+
		"\u0154\u0150\3\2\2\2\u0154\u0155\3\2\2\2\u0155\64\3\2\2\2\u0156\u0157"+
		"\t\4\2\2\u0157\66\3\2\2\2\u0158\u015b\5\65\33\2\u0159\u015b\7a\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b8\3\2\2\2\u015c\u0164\5;\36\2"+
		"\u015d\u015f\5;\36\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\5;\36\2\u0164\u0160\3\2\2\2\u0164\u0165\3\2\2\2\u0165:\3\2\2\2"+
		"\u0166\u0167\t\5\2\2\u0167<\3\2\2\2\u0168\u0169\5? \2\u0169>\3\2\2\2\u016a"+
		"\u016b\5)\25\2\u016b\u016d\7\60\2\2\u016c\u016e\5)\25\2\u016d\u016c\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\5A!\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\5I"+
		"%\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0186\3\2\2\2\u0175"+
		"\u0176\7\60\2\2\u0176\u0178\5)\25\2\u0177\u0179\5A!\2\u0178\u0177\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\5I%\2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0186\3\2\2\2\u017d\u017e\5)\25\2\u017e"+
		"\u0180\5A!\2\u017f\u0181\5I%\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2"+
		"\u0181\u0186\3\2\2\2\u0182\u0183\5)\25\2\u0183\u0184\5I%\2\u0184\u0186"+
		"\3\2\2\2\u0185\u016a\3\2\2\2\u0185\u0175\3\2\2\2\u0185\u017d\3\2\2\2\u0185"+
		"\u0182\3\2\2\2\u0186@\3\2\2\2\u0187\u0188\5C\"\2\u0188\u0189\5E#\2\u0189"+
		"B\3\2\2\2\u018a\u018b\t\6\2\2\u018bD\3\2\2\2\u018c\u018e\5G$\2\u018d\u018c"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5)\25\2\u0190"+
		"F\3\2\2\2\u0191\u0192\t\7\2\2\u0192H\3\2\2\2\u0193\u0194\t\b\2\2\u0194"+
		"J\3\2\2\2\u0195\u0196\7v\2\2\u0196\u0197\7t\2\2\u0197\u0198\7w\2\2\u0198"+
		"\u019f\7g\2\2\u0199\u019a\7h\2\2\u019a\u019b\7c\2\2\u019b\u019c\7n\2\2"+
		"\u019c\u019d\7u\2\2\u019d\u019f\7g\2\2\u019e\u0195\3\2\2\2\u019e\u0199"+
		"\3\2\2\2\u019fL\3\2\2\2\u01a0\u01a1\7)\2\2\u01a1\u01a2\5O(\2\u01a2\u01a3"+
		"\7)\2\2\u01a3\u01a9\3\2\2\2\u01a4\u01a5\7)\2\2\u01a5\u01a6\5W,\2\u01a6"+
		"\u01a7\7)\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8\u01a4\3\2"+
		"\2\2\u01a9N\3\2\2\2\u01aa\u01ab\n\t\2\2\u01abP\3\2\2\2\u01ac\u01ae\7$"+
		"\2\2\u01ad\u01af\5S*\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\7$\2\2\u01b1R\3\2\2\2\u01b2\u01b4\5U+\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"T\3\2\2\2\u01b7\u01ba\n\n\2\2\u01b8\u01ba\5W,\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01baV\3\2\2\2\u01bb\u01bc\7^\2\2\u01bc\u01c0\t\13\2\2"+
		"\u01bd\u01c0\5Y-\2\u01be\u01c0\5[.\2\u01bf\u01bb\3\2\2\2\u01bf\u01bd\3"+
		"\2\2\2\u01bf\u01be\3\2\2\2\u01c0X\3\2\2\2\u01c1\u01c2\7^\2\2\u01c2\u01cd"+
		"\5;\36\2\u01c3\u01c4\7^\2\2\u01c4\u01c5\5;\36\2\u01c5\u01c6\5;\36\2\u01c6"+
		"\u01cd\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8\u01c9\5]/\2\u01c9\u01ca\5;\36"+
		"\2\u01ca\u01cb\5;\36\2\u01cb\u01cd\3\2\2\2\u01cc\u01c1\3\2\2\2\u01cc\u01c3"+
		"\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cdZ\3\2\2\2\u01ce\u01cf\7^\2\2\u01cf\u01d0"+
		"\7w\2\2\u01d0\u01d1\5\65\33\2\u01d1\u01d2\5\65\33\2\u01d2\u01d3\5\65\33"+
		"\2\u01d3\u01d4\5\65\33\2\u01d4\\\3\2\2\2\u01d5\u01d6\t\f\2\2\u01d6^\3"+
		"\2\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7w\2\2\u01d9\u01da\7n\2\2\u01da"+
		"\u01db\7n\2\2\u01db`\3\2\2\2\u01dc\u01dd\7*\2\2\u01ddb\3\2\2\2\u01de\u01df"+
		"\7+\2\2\u01dfd\3\2\2\2\u01e0\u01e1\7}\2\2\u01e1f\3\2\2\2\u01e2\u01e3\7"+
		"\177\2\2\u01e3h\3\2\2\2\u01e4\u01e5\7]\2\2\u01e5j\3\2\2\2\u01e6\u01e7"+
		"\7_\2\2\u01e7l\3\2\2\2\u01e8\u01e9\7=\2\2\u01e9n\3\2\2\2\u01ea\u01eb\7"+
		".\2\2\u01ebp\3\2\2\2\u01ec\u01ed\7\60\2\2\u01edr\3\2\2\2\u01ee\u01ef\7"+
		"?\2\2\u01eft\3\2\2\2\u01f0\u01f1\7@\2\2\u01f1v\3\2\2\2\u01f2\u01f3\7>"+
		"\2\2\u01f3x\3\2\2\2\u01f4\u01f5\7?\2\2\u01f5\u01f6\7?\2\2\u01f6z\3\2\2"+
		"\2\u01f7\u01f8\7>\2\2\u01f8\u01f9\7?\2\2\u01f9|\3\2\2\2\u01fa\u01fb\7"+
		"@\2\2\u01fb\u01fc\7?\2\2\u01fc~\3\2\2\2\u01fd\u01fe\7#\2\2\u01fe\u01ff"+
		"\7?\2\2\u01ff\u0080\3\2\2\2\u0200\u0201\7(\2\2\u0201\u0202\7(\2\2\u0202"+
		"\u0082\3\2\2\2\u0203\u0204\7~\2\2\u0204\u0205\7~\2\2\u0205\u0084\3\2\2"+
		"\2\u0206\u0207\7-\2\2\u0207\u0208\7-\2\2\u0208\u0086\3\2\2\2\u0209\u020a"+
		"\7/\2\2\u020a\u020b\7/\2\2\u020b\u0088\3\2\2\2\u020c\u020d\7-\2\2\u020d"+
		"\u008a\3\2\2\2\u020e\u020f\7/\2\2\u020f\u008c\3\2\2\2\u0210\u0211\7,\2"+
		"\2\u0211\u008e\3\2\2\2\u0212\u0213\7\61\2\2\u0213\u0090\3\2\2\2\u0214"+
		"\u0215\7`\2\2\u0215\u0092\3\2\2\2\u0216\u0217\7\'\2\2\u0217\u0094\3\2"+
		"\2\2\u0218\u0219\7-\2\2\u0219\u021a\7?\2\2\u021a\u0096\3\2\2\2\u021b\u021c"+
		"\7/\2\2\u021c\u021d\7?\2\2\u021d\u0098\3\2\2\2\u021e\u021f\7,\2\2\u021f"+
		"\u0220\7?\2\2\u0220\u009a\3\2\2\2\u0221\u0222\7\61\2\2\u0222\u0223\7?"+
		"\2\2\u0223\u009c\3\2\2\2\u0224\u0225\7d\2\2\u0225\u0226\7q\2\2\u0226\u0227"+
		"\7q\2\2\u0227\u0228\7n\2\2\u0228\u0229\7g\2\2\u0229\u022a\7c\2\2\u022a"+
		"\u022b\7p\2\2\u022b\u009e\3\2\2\2\u022c\u022d\7d\2\2\u022d\u022e\7t\2"+
		"\2\u022e\u022f\7g\2\2\u022f\u0230\7c\2\2\u0230\u0231\7m\2\2\u0231\u00a0"+
		"\3\2\2\2\u0232\u0233\7e\2\2\u0233\u0234\7c\2\2\u0234\u0235\7u\2\2\u0235"+
		"\u0236\7g\2\2\u0236\u00a2\3\2\2\2\u0237\u0238\7e\2\2\u0238\u0239\7j\2"+
		"\2\u0239\u023a\7c\2\2\u023a\u023b\7t\2\2\u023b\u00a4\3\2\2\2\u023c\u023d"+
		"\7e\2\2\u023d\u023e\7n\2\2\u023e\u023f\7c\2\2\u023f\u0240\7u\2\2\u0240"+
		"\u0241\7u\2\2\u0241\u00a6\3\2\2\2\u0242\u0243\7E\2\2\u0243\u0244\7Q\2"+
		"\2\u0244\u0245\7P\2\2\u0245\u0246\7U\2\2\u0246\u0247\7V\2\2\u0247\u00a8"+
		"\3\2\2\2\u0248\u0249\7f\2\2\u0249\u024a\7g\2\2\u024a\u024b\7h\2\2\u024b"+
		"\u024c\7c\2\2\u024c\u024d\7w\2\2\u024d\u024e\7n\2\2\u024e\u024f\7v\2\2"+
		"\u024f\u00aa\3\2\2\2\u0250\u0251\7f\2\2\u0251\u0252\7q\2\2\u0252\u0253"+
		"\7y\2\2\u0253\u0254\7j\2\2\u0254\u0255\7k\2\2\u0255\u0256\7n\2\2\u0256"+
		"\u0257\7g\2\2\u0257\u00ac\3\2\2\2\u0258\u0259\7g\2\2\u0259\u025a\7n\2"+
		"\2\u025a\u025b\7u\2\2\u025b\u025c\7g\2\2\u025c\u00ae\3\2\2\2\u025d\u025e"+
		"\7h\2\2\u025e\u025f\7n\2\2\u025f\u0260\7q\2\2\u0260\u0261\7c\2\2\u0261"+
		"\u0262\7v\2\2\u0262\u00b0\3\2\2\2\u0263\u0264\7h\2\2\u0264\u0265\7q\2"+
		"\2\u0265\u0266\7t\2\2\u0266\u00b2\3\2\2\2\u0267\u0268\7k\2\2\u0268\u0269"+
		"\7h\2\2\u0269\u00b4\3\2\2\2\u026a\u026b\7k\2\2\u026b\u026c\7p\2\2\u026c"+
		"\u026d\7u\2\2\u026d\u026e\7v\2\2\u026e\u026f\7c\2\2\u026f\u0270\7p\2\2"+
		"\u0270\u0271\7e\2\2\u0271\u0272\7g\2\2\u0272\u0273\7q\2\2\u0273\u0274"+
		"\7h\2\2\u0274\u00b6\3\2\2\2\u0275\u0276\7k\2\2\u0276\u0277\7p\2\2\u0277"+
		"\u0278\7v\2\2\u0278\u00b8\3\2\2\2\u0279\u027a\7n\2\2\u027a\u027b\7q\2"+
		"\2\u027b\u027c\7p\2\2\u027c\u027d\7i\2\2\u027d\u00ba\3\2\2\2\u027e\u027f"+
		"\7p\2\2\u027f\u0280\7g\2\2\u0280\u0281\7y\2\2\u0281\u00bc\3\2\2\2\u0282"+
		"\u0283\7t\2\2\u0283\u0284\7g\2\2\u0284\u0285\7v\2\2\u0285\u0286\7w\2\2"+
		"\u0286\u0287\7t\2\2\u0287\u0288\7p\2\2\u0288\u00be\3\2\2\2\u0289\u028a"+
		"\7u\2\2\u028a\u028b\7y\2\2\u028b\u028c\7k\2\2\u028c\u028d\7v\2\2\u028d"+
		"\u028e\7e\2\2\u028e\u028f\7j\2\2\u028f\u00c0\3\2\2\2\u0290\u0291\7v\2"+
		"\2\u0291\u0292\7j\2\2\u0292\u0293\7k\2\2\u0293\u0294\7u\2\2\u0294\u00c2"+
		"\3\2\2\2\u0295\u0296\7x\2\2\u0296\u0297\7q\2\2\u0297\u0298\7k\2\2\u0298"+
		"\u0299\7f\2\2\u0299\u00c4\3\2\2\2\u029a\u029b\7y\2\2\u029b\u029c\7j\2"+
		"\2\u029c\u029d\7k\2\2\u029d\u029e\7n\2\2\u029e\u029f\7g\2\2\u029f\u00c6"+
		"\3\2\2\2\u02a0\u02a5\5\u00c9e\2\u02a1\u02a4\5\u00c9e\2\u02a2\u02a4\5+"+
		"\26\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u00c8\3\2\2\2\u02a7\u02a5\3\2"+
		"\2\2\u02a8\u02ad\t\r\2\2\u02a9\u02ad\n\16\2\2\u02aa\u02ab\t\17\2\2\u02ab"+
		"\u02ad\t\20\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa\3"+
		"\2\2\2\u02ad\u00ca\3\2\2\2\u02ae\u02b0\t\21\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2"+
		"\2\2\u02b3\u02b4\bf\2\2\u02b4\u00cc\3\2\2\2\u02b5\u02b6\7\61\2\2\u02b6"+
		"\u02b7\7,\2\2\u02b7\u02bb\3\2\2\2\u02b8\u02ba\13\2\2\2\u02b9\u02b8\3\2"+
		"\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc"+
		"\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7,\2\2\u02bf\u02c0\7\61"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\bg\3\2\u02c2\u00ce\3\2\2\2\u02c3"+
		"\u02c4\7\61\2\2\u02c4\u02c5\7\61\2\2\u02c5\u02c9\3\2\2\2\u02c6\u02c8\n"+
		"\22\2\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\bh"+
		"\3\2\u02cd\u00d0\3\2\2\2&\2\u0123\u012a\u012f\u0131\u0137\u013b\u013f"+
		"\u0145\u014a\u0150\u0154\u015a\u0160\u0164\u016d\u0170\u0173\u0178\u017b"+
		"\u0180\u0185\u018d\u019e\u01a8\u01ae\u01b5\u01b9\u01bf\u01cc\u02a3\u02a5"+
		"\u02ac\u02b1\u02bb\u02c9\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}