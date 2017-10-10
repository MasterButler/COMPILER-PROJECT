// Generated from /Users/Thea/COMPILER-PROJECT/src/packageA/Java.g4 by ANTLR 4.7
package packageA;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
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
	public static final int
		RULE_code = 0, RULE_typeDeclaration = 1, RULE_constantModifier = 2, RULE_classDeclaration = 3, 
		RULE_typeParameters = 4, RULE_typeParameter = 5, RULE_typeBound = 6, RULE_typeList = 7, 
		RULE_classBody = 8, RULE_classBodyDeclaration = 9, RULE_baseDeclaration = 10, 
		RULE_methodDeclaration = 11, RULE_genericMethodDeclaration = 12, RULE_constructorDeclaration = 13, 
		RULE_genericConstructorDeclaration = 14, RULE_fieldDeclaration = 15, RULE_constDeclaration = 16, 
		RULE_pointerModifier = 17, RULE_constantDeclarator = 18, RULE_variableDeclarators = 19, 
		RULE_variableDeclarator = 20, RULE_variableDeclaratorId = 21, RULE_variableInitializer = 22, 
		RULE_arrayInitializer = 23, RULE_enumConstantName = 24, RULE_typeType = 25, 
		RULE_classType = 26, RULE_dataType = 27, RULE_typeArguments = 28, RULE_typeArgument = 29, 
		RULE_qualifiedNameList = 30, RULE_formalParameters = 31, RULE_formalParameterList = 32, 
		RULE_formalParameter = 33, RULE_lastFormalParameter = 34, RULE_methodBody = 35, 
		RULE_constructorBody = 36, RULE_qualifiedName = 37, RULE_literal = 38, 
		RULE_elementValuePairs = 39, RULE_elementValuePair = 40, RULE_elementValue = 41, 
		RULE_elementValueArrayInitializer = 42, RULE_defaultValue = 43, RULE_block = 44, 
		RULE_blockStatement = 45, RULE_localVariableDeclarationStatement = 46, 
		RULE_localVariableDeclaration = 47, RULE_statement = 48, RULE_catchClause = 49, 
		RULE_catchType = 50, RULE_finallyBlock = 51, RULE_resourceSpecification = 52, 
		RULE_resources = 53, RULE_resource = 54, RULE_switchBlockStatementGroup = 55, 
		RULE_switchLabel = 56, RULE_forControl = 57, RULE_forInit = 58, RULE_enhancedForControl = 59, 
		RULE_forUpdate = 60, RULE_parExpression = 61, RULE_expressionList = 62, 
		RULE_statementExpression = 63, RULE_constantExpression = 64, RULE_expression = 65, 
		RULE_primary = 66, RULE_creator = 67, RULE_createdName = 68, RULE_innerCreator = 69, 
		RULE_arrayCreatorRest = 70, RULE_classCreatorRest = 71, RULE_explicitGenericInvocation = 72, 
		RULE_nonWildcardTypeArguments = 73, RULE_typeArgumentsOrDiamond = 74, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 75, RULE_superSuffix = 76, RULE_explicitGenericInvocationSuffix = 77, 
		RULE_arguments = 78;
	public static final String[] ruleNames = {
		"code", "typeDeclaration", "constantModifier", "classDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "typeList", "classBody", "classBodyDeclaration", 
		"baseDeclaration", "methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "constDeclaration", 
		"pointerModifier", "constantDeclarator", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "enumConstantName", 
		"typeType", "classType", "dataType", "typeArguments", "typeArgument", 
		"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
		"lastFormalParameter", "methodBody", "constructorBody", "qualifiedName", 
		"literal", "elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "arguments"
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

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public List<BaseDeclarationContext> baseDeclaration() {
			return getRuleContexts(BaseDeclarationContext.class);
		}
		public BaseDeclarationContext baseDeclaration(int i) {
			return getRuleContext(BaseDeclarationContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(158);
				baseDeclaration();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				classDeclaration();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CLASS);
			setState(171);
			match(Identifier);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(172);
				typeParameters();
				}
			}

			setState(175);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LESS);
			setState(178);
			typeParameter();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				typeParameter();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Identifier);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(189);
				match(T__0);
				setState(190);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			typeType();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(194);
				match(T__1);
				setState(195);
				typeType();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			typeType();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				typeType();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LEFTBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << LEFTBRACE) | (1L << SEMICOLON))) != 0)) {
				{
				{
				setState(210);
				classBodyDeclaration();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BaseDeclarationContext baseDeclaration() {
			return getRuleContext(BaseDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(SEMICOLON);
				}
				break;
			case T__2:
			case LEFTBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(219);
					match(T__2);
					}
				}

				setState(222);
				block();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				baseDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public BaseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBaseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBaseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBaseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseDeclarationContext baseDeclaration() throws RecognitionException {
		BaseDeclarationContext _localctx = new BaseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_baseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__3);
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				{
				setState(229);
				typeType();
				}
				break;
			case VOID:
				{
				setState(230);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			match(Identifier);
			setState(234);
			formalParameters();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(235);
				match(LEFTBRACKET);
				setState(236);
				match(RIGHTBRACKET);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(242);
				match(T__4);
				setState(243);
				qualifiedNameList();
				}
			}

			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACE:
				{
				setState(246);
				methodBody();
				}
				break;
			case SEMICOLON:
				{
				setState(247);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			typeParameters();
			setState(251);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Identifier);
			setState(254);
			formalParameters();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(255);
				match(T__4);
				setState(256);
				qualifiedNameList();
				}
			}

			setState(259);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			typeParameters();
			setState(262);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public PointerModifierContext pointerModifier() {
			return getRuleContext(PointerModifierContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			typeType();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(265);
				pointerModifier();
				}
			}

			setState(268);
			variableDeclarators();
			setState(269);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public PointerModifierContext pointerModifier() {
			return getRuleContext(PointerModifierContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(271);
				constantModifier();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			typeType();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(278);
				pointerModifier();
				}
			}

			setState(281);
			constantDeclarator();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				constantDeclarator();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerModifierContext extends ParserRuleContext {
		public PointerModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPointerModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPointerModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPointerModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerModifierContext pointerModifier() throws RecognitionException {
		PointerModifierContext _localctx = new PointerModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pointerModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(MULTIPLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Identifier);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(294);
				match(LEFTBRACKET);
				setState(295);
				match(RIGHTBRACKET);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(ASSIGNMENT);
			setState(302);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			variableDeclarator();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				variableDeclarator();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			variableDeclaratorId();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(313);
				match(ASSIGNMENT);
				setState(314);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Identifier);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(318);
				match(LEFTBRACKET);
				setState(319);
				match(RIGHTBRACKET);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableInitializer);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				arrayInitializer();
				}
				break;
			case T__15:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LEFTPARENTH:
			case LESS:
			case ADDITION:
			case SUBTRACT:
			case NEW:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(LEFTBRACE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LEFTBRACE - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
				{
				setState(330);
				variableInitializer();
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(331);
						match(COMMA);
						setState(332);
						variableInitializer();
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(338);
					match(COMMA);
					}
				}

				}
			}

			setState(343);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeType);
		try {
			int _alt;
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				classType();
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						match(LEFTBRACKET);
						setState(349);
						match(RIGHTBRACKET);
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				dataType();
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(356);
						match(LEFTBRACKET);
						setState(357);
						match(RIGHTBRACKET);
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(Identifier);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(366);
				typeArguments();
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					match(DOT);
					setState(370);
					match(Identifier);
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(371);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (BOOLEAN - 53)) | (1L << (CHAR - 53)) | (1L << (FLOAT - 53)) | (1L << (INT - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LESS);
			setState(382);
			typeArgument();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(383);
				match(COMMA);
				setState(384);
				typeArgument();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeArgument);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				typeType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(T__5);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__6) {
					{
					setState(394);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(395);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			qualifiedName();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				qualifiedName();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LEFTPARENTH);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (BOOLEAN - 53)) | (1L << (CHAR - 53)) | (1L << (FLOAT - 53)) | (1L << (INT - 53)) | (1L << (Identifier - 53)))) != 0)) {
				{
				setState(409);
				formalParameterList();
				}
			}

			setState(412);
			match(RIGHTPARENTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				formalParameter();
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(COMMA);
						setState(416);
						formalParameter();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(422);
					match(COMMA);
					setState(423);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			typeType();
			setState(430);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			typeType();
			setState(433);
			match(T__7);
			setState(434);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Identifier);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(441);
				match(DOT);
				setState(442);
				match(Identifier);
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			elementValuePair();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(451);
				match(COMMA);
				setState(452);
				elementValuePair();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(Identifier);
			setState(459);
			match(ASSIGNMENT);
			setState(460);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elementValue);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LEFTPARENTH:
			case LESS:
			case ADDITION:
			case SUBTRACT:
			case NEW:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				expression(0);
				}
				break;
			case LEFTBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(LEFTBRACE);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LEFTBRACE - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
				{
				setState(467);
				elementValue();
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(468);
						match(COMMA);
						setState(469);
						elementValue();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(477);
				match(COMMA);
				}
			}

			setState(480);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(DEFAULT);
			setState(483);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LEFTBRACE);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LEFTPARENTH) | (1L << LEFTBRACE) | (1L << SEMICOLON) | (1L << LESS) | (1L << ADDITION) | (1L << SUBTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DOWHILE) | (1L << FLOAT) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (INT - 64)) | (1L << (NEW - 64)) | (1L << (RETURN - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(486);
				blockStatement();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blockStatement);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			localVariableDeclaration();
			setState(500);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ConstantModifierContext constantModifier() {
			return getRuleContext(ConstantModifierContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(502);
				constantModifier();
				}
			}

			setState(505);
			typeType();
			setState(506);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(IF);
				setState(510);
				parExpression();
				setState(511);
				statement();
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(512);
					match(ELSE);
					setState(513);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(FOR);
				setState(517);
				match(LEFTPARENTH);
				setState(518);
				forControl();
				setState(519);
				match(RIGHTPARENTH);
				setState(520);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(WHILE);
				setState(523);
				parExpression();
				setState(524);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				match(DOWHILE);
				setState(527);
				parExpression();
				setState(528);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				match(SWITCH);
				setState(531);
				parExpression();
				setState(532);
				match(LEFTBRACE);
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(539);
					switchLabel();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				match(RIGHTBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(547);
				match(RETURN);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
					{
					setState(548);
					expression(0);
					}
				}

				setState(551);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(552);
				match(T__8);
				setState(553);
				expression(0);
				setState(554);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(556);
				match(BREAK);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(557);
					match(Identifier);
					}
				}

				setState(560);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(561);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(562);
				statementExpression();
				setState(563);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(565);
				match(Identifier);
				setState(566);
				match(T__9);
				setState(567);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(568);
				constDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(569);
				match(T__10);
				setState(570);
				parExpression();
				setState(571);
				match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(573);
				match(T__11);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(574);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__12);
			setState(578);
			match(LEFTPARENTH);
			setState(579);
			catchType();
			setState(580);
			match(Identifier);
			setState(581);
			match(RIGHTPARENTH);
			setState(582);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			qualifiedName();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(585);
				match(T__13);
				setState(586);
				qualifiedName();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__14);
			setState(593);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(LEFTPARENTH);
			setState(596);
			resources();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(597);
				match(SEMICOLON);
				}
			}

			setState(600);
			match(RIGHTPARENTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			resource();
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					match(SEMICOLON);
					setState(604);
					resource();
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(610);
				constantModifier();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			classType();
			setState(617);
			variableDeclaratorId();
			setState(618);
			match(ASSIGNMENT);
			setState(619);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(621);
				switchLabel();
				}
				}
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(627); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(626);
				blockStatement();
				}
				}
				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LEFTPARENTH) | (1L << LEFTBRACE) | (1L << SEMICOLON) | (1L << LESS) | (1L << ADDITION) | (1L << SUBTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DOWHILE) | (1L << FLOAT) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (INT - 64)) | (1L << (NEW - 64)) | (1L << (RETURN - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_switchLabel);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(CASE);
				setState(632);
				constantExpression();
				setState(633);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(CASE);
				setState(636);
				enumConstantName();
				setState(637);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				match(DEFAULT);
				setState(640);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forControl);
		int _la;
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (BOOLEAN - 16)) | (1L << (CHAR - 16)) | (1L << (CONST - 16)) | (1L << (FLOAT - 16)) | (1L << (INT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
					{
					setState(644);
					forInit();
					}
				}

				setState(647);
				match(SEMICOLON);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
					{
					setState(648);
					expression(0);
					}
				}

				setState(651);
				match(SEMICOLON);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
					{
					setState(652);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forInit);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(661);
				constantModifier();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(667);
			typeType();
			setState(668);
			variableDeclaratorId();
			setState(669);
			match(T__9);
			setState(670);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(LEFTPARENTH);
			setState(675);
			expression(0);
			setState(676);
			match(RIGHTPARENTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			expression(0);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679);
				match(COMMA);
				setState(680);
				expression(0);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LEFTPARENTH:
			case LESS:
			case Identifier:
				{
				setState(691);
				primary();
				}
				break;
			case NEW:
				{
				setState(692);
				match(NEW);
				setState(693);
				creator();
				}
				break;
			case T__15:
			case ADDITION:
			case SUBTRACT:
				{
				setState(694);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << ADDITION) | (1L << SUBTRACT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				expression(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(753);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(699);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(700);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(702);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(703);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(705);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(706);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(708);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(709);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(711);
						match(EXPONENT);
						setState(712);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(714);
						match(AND);
						setState(715);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(717);
						match(OR);
						setState(718);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(720);
						match(T__5);
						setState(721);
						expression(0);
						setState(722);
						match(T__9);
						setState(723);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(726);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(727);
						expression(1);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(728);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(729);
						match(DOT);
						setState(730);
						match(Identifier);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(732);
						match(DOT);
						setState(733);
						match(THIS);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(735);
						match(DOT);
						setState(736);
						explicitGenericInvocation();
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(737);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(738);
						match(LEFTBRACKET);
						setState(739);
						expression(0);
						setState(740);
						match(RIGHTBRACKET);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(743);
						match(LEFTPARENTH);
						setState(745);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
							{
							setState(744);
							expressionList();
							}
						}

						setState(747);
						match(RIGHTPARENTH);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(749);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(751);
						match(INSTANCEOF);
						setState(752);
						typeType();
						}
						break;
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_primary);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(LEFTPARENTH);
				setState(759);
				expression(0);
				setState(760);
				match(RIGHTPARENTH);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				match(Identifier);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				nonWildcardTypeArguments();
				setState(768);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case Identifier:
					{
					setState(765);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(766);
					match(THIS);
					setState(767);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_creator);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				nonWildcardTypeArguments();
				setState(773);
				createdName();
				setState(774);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				createdName();
				setState(779);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFTBRACKET:
					{
					setState(777);
					arrayCreatorRest();
					}
					break;
				case LEFTPARENTH:
					{
					setState(778);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_createdName);
		int _la;
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(Identifier);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS) {
					{
					setState(784);
					typeArgumentsOrDiamond();
					}
				}

				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(787);
					match(DOT);
					setState(788);
					match(Identifier);
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LESS) {
						{
						setState(789);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				dataType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(Identifier);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(801);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(804);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(LEFTBRACKET);
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHTBRACKET:
				{
				setState(807);
				match(RIGHTBRACKET);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFTBRACKET) {
					{
					{
					setState(808);
					match(LEFTBRACKET);
					setState(809);
					match(RIGHTBRACKET);
					}
					}
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(815);
				arrayInitializer();
				}
				break;
			case T__15:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LEFTPARENTH:
			case LESS:
			case ADDITION:
			case SUBTRACT:
			case NEW:
			case Identifier:
				{
				setState(816);
				expression(0);
				setState(817);
				match(RIGHTBRACKET);
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(818);
						match(LEFTBRACKET);
						setState(819);
						expression(0);
						setState(820);
						match(RIGHTBRACKET);
						}
						} 
					}
					setState(826);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(827);
						match(LEFTBRACKET);
						setState(828);
						match(RIGHTBRACKET);
						}
						} 
					}
					setState(833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			arguments();
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(837);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			nonWildcardTypeArguments();
			setState(841);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(LESS);
			setState(844);
			typeList();
			setState(845);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeArgumentsOrDiamond);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(LESS);
				setState(848);
				match(GREATER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(LESS);
				setState(853);
				match(GREATER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_superSuffix);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(DOT);
				setState(859);
				match(Identifier);
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(860);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_explicitGenericInvocationSuffix);
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(T__6);
				setState(866);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				match(Identifier);
				setState(868);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(LEFTPARENTH);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (IntegerLiteral - 16)) | (1L << (FloatingPointLiteral - 16)) | (1L << (BooleanLiteral - 16)) | (1L << (CharacterLiteral - 16)) | (1L << (StringLiteral - 16)) | (1L << (NullLiteral - 16)) | (1L << (LEFTPARENTH - 16)) | (1L << (LESS - 16)) | (1L << (ADDITION - 16)) | (1L << (SUBTRACT - 16)) | (1L << (NEW - 16)) | (1L << (Identifier - 16)))) != 0)) {
				{
				setState(872);
				expressionList();
				}
			}

			setState(875);
			match(RIGHTPARENTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 65:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 18);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0370\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\7\2\u00a2\n\2\f\2\16"+
		"\2\u00a5\13\2\3\3\3\3\5\3\u00a9\n\3\3\4\3\4\3\5\3\5\3\5\5\5\u00b0\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00b8\n\6\f\6\16\6\u00bb\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\7\u00c2\n\7\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3"+
		"\t\3\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2\13\t\3\n\3\n\7\n\u00d6\n\n\f\n"+
		"\16\n\u00d9\13\n\3\n\3\n\3\13\3\13\5\13\u00df\n\13\3\13\3\13\5\13\u00e3"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00ea\n\r\3\r\3\r\3\r\3\r\7\r\u00f0\n\r"+
		"\f\r\16\r\u00f3\13\r\3\r\3\r\5\r\u00f7\n\r\3\r\3\r\5\r\u00fb\n\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\5\21\u010d\n\21\3\21\3\21\3\21\3\22\7\22\u0113\n\22\f\22\16"+
		"\22\u0116\13\22\3\22\3\22\5\22\u011a\n\22\3\22\3\22\3\22\7\22\u011f\n"+
		"\22\f\22\16\22\u0122\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u012b"+
		"\n\24\f\24\16\24\u012e\13\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u0136"+
		"\n\25\f\25\16\25\u0139\13\25\3\26\3\26\3\26\5\26\u013e\n\26\3\27\3\27"+
		"\3\27\7\27\u0143\n\27\f\27\16\27\u0146\13\27\3\30\3\30\5\30\u014a\n\30"+
		"\3\31\3\31\3\31\3\31\7\31\u0150\n\31\f\31\16\31\u0153\13\31\3\31\5\31"+
		"\u0156\n\31\5\31\u0158\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u0161"+
		"\n\33\f\33\16\33\u0164\13\33\3\33\3\33\3\33\7\33\u0169\n\33\f\33\16\33"+
		"\u016c\13\33\5\33\u016e\n\33\3\34\3\34\5\34\u0172\n\34\3\34\3\34\3\34"+
		"\5\34\u0177\n\34\7\34\u0179\n\34\f\34\16\34\u017c\13\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\7\36\u0184\n\36\f\36\16\36\u0187\13\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u018f\n\37\5\37\u0191\n\37\3 \3 \3 \7 \u0196\n \f"+
		" \16 \u0199\13 \3!\3!\5!\u019d\n!\3!\3!\3\"\3\"\3\"\7\"\u01a4\n\"\f\""+
		"\16\"\u01a7\13\"\3\"\3\"\5\"\u01ab\n\"\3\"\5\"\u01ae\n\"\3#\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\7\'\u01be\n\'\f\'\16\'\u01c1\13\'\3(\3"+
		"(\3)\3)\3)\7)\u01c8\n)\f)\16)\u01cb\13)\3*\3*\3*\3*\3+\3+\5+\u01d3\n+"+
		"\3,\3,\3,\3,\7,\u01d9\n,\f,\16,\u01dc\13,\5,\u01de\n,\3,\5,\u01e1\n,\3"+
		",\3,\3-\3-\3-\3.\3.\7.\u01ea\n.\f.\16.\u01ed\13.\3.\3.\3/\3/\3/\5/\u01f4"+
		"\n/\3\60\3\60\3\60\3\61\5\61\u01fa\n\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0205\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0219\n\62\f\62"+
		"\16\62\u021c\13\62\3\62\7\62\u021f\n\62\f\62\16\62\u0222\13\62\3\62\3"+
		"\62\3\62\3\62\5\62\u0228\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0231\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0242\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\7\64\u024e\n\64\f\64\16\64\u0251\13\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\5\66\u0259\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u0260\n\67\f"+
		"\67\16\67\u0263\13\67\38\78\u0266\n8\f8\168\u0269\138\38\38\38\38\38\3"+
		"9\69\u0271\n9\r9\169\u0272\39\69\u0276\n9\r9\169\u0277\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\5:\u0284\n:\3;\3;\5;\u0288\n;\3;\3;\5;\u028c\n;\3;\3;"+
		"\5;\u0290\n;\5;\u0292\n;\3<\3<\5<\u0296\n<\3=\7=\u0299\n=\f=\16=\u029c"+
		"\13=\3=\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3@\7@\u02ac\n@\f@\16@\u02af"+
		"\13@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\5C\u02bb\nC\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u02ec\nC\3C\3C\3"+
		"C\3C\3C\3C\7C\u02f4\nC\fC\16C\u02f7\13C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u0303\nD\5D\u0305\nD\3E\3E\3E\3E\3E\3E\3E\5E\u030e\nE\5E\u0310\nE"+
		"\3F\3F\5F\u0314\nF\3F\3F\3F\5F\u0319\nF\7F\u031b\nF\fF\16F\u031e\13F\3"+
		"F\5F\u0321\nF\3G\3G\5G\u0325\nG\3G\3G\3H\3H\3H\3H\7H\u032d\nH\fH\16H\u0330"+
		"\13H\3H\3H\3H\3H\3H\3H\3H\7H\u0339\nH\fH\16H\u033c\13H\3H\3H\7H\u0340"+
		"\nH\fH\16H\u0343\13H\5H\u0345\nH\3I\3I\5I\u0349\nI\3J\3J\3J\3K\3K\3K\3"+
		"K\3L\3L\3L\5L\u0355\nL\3M\3M\3M\5M\u035a\nM\3N\3N\3N\3N\5N\u0360\nN\5"+
		"N\u0362\nN\3O\3O\3O\3O\5O\u0368\nO\3P\3P\5P\u036c\nP\3P\3P\3P\2\3\u0084"+
		"Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\f\6\2\67\67:"+
		":@@DD\4\2\3\3\t\t\3\2\23\30\4\2\22\22-.\4\2/\60\62\62\3\2-.\4\2#$&\'\4"+
		"\2%%((\4\2\"\"\63\66\3\2+,\2\u03a0\2\u00a3\3\2\2\2\4\u00a8\3\2\2\2\6\u00aa"+
		"\3\2\2\2\b\u00ac\3\2\2\2\n\u00b3\3\2\2\2\f\u00be\3\2\2\2\16\u00c3\3\2"+
		"\2\2\20\u00cb\3\2\2\2\22\u00d3\3\2\2\2\24\u00e2\3\2\2\2\26\u00e4\3\2\2"+
		"\2\30\u00e6\3\2\2\2\32\u00fc\3\2\2\2\34\u00ff\3\2\2\2\36\u0107\3\2\2\2"+
		" \u010a\3\2\2\2\"\u0114\3\2\2\2$\u0125\3\2\2\2&\u0127\3\2\2\2(\u0132\3"+
		"\2\2\2*\u013a\3\2\2\2,\u013f\3\2\2\2.\u0149\3\2\2\2\60\u014b\3\2\2\2\62"+
		"\u015b\3\2\2\2\64\u016d\3\2\2\2\66\u016f\3\2\2\28\u017d\3\2\2\2:\u017f"+
		"\3\2\2\2<\u0190\3\2\2\2>\u0192\3\2\2\2@\u019a\3\2\2\2B\u01ad\3\2\2\2D"+
		"\u01af\3\2\2\2F\u01b2\3\2\2\2H\u01b6\3\2\2\2J\u01b8\3\2\2\2L\u01ba\3\2"+
		"\2\2N\u01c2\3\2\2\2P\u01c4\3\2\2\2R\u01cc\3\2\2\2T\u01d2\3\2\2\2V\u01d4"+
		"\3\2\2\2X\u01e4\3\2\2\2Z\u01e7\3\2\2\2\\\u01f3\3\2\2\2^\u01f5\3\2\2\2"+
		"`\u01f9\3\2\2\2b\u0241\3\2\2\2d\u0243\3\2\2\2f\u024a\3\2\2\2h\u0252\3"+
		"\2\2\2j\u0255\3\2\2\2l\u025c\3\2\2\2n\u0267\3\2\2\2p\u0270\3\2\2\2r\u0283"+
		"\3\2\2\2t\u0291\3\2\2\2v\u0295\3\2\2\2x\u029a\3\2\2\2z\u02a2\3\2\2\2|"+
		"\u02a4\3\2\2\2~\u02a8\3\2\2\2\u0080\u02b0\3\2\2\2\u0082\u02b2\3\2\2\2"+
		"\u0084\u02ba\3\2\2\2\u0086\u0304\3\2\2\2\u0088\u030f\3\2\2\2\u008a\u0320"+
		"\3\2\2\2\u008c\u0322\3\2\2\2\u008e\u0328\3\2\2\2\u0090\u0346\3\2\2\2\u0092"+
		"\u034a\3\2\2\2\u0094\u034d\3\2\2\2\u0096\u0354\3\2\2\2\u0098\u0359\3\2"+
		"\2\2\u009a\u0361\3\2\2\2\u009c\u0367\3\2\2\2\u009e\u0369\3\2\2\2\u00a0"+
		"\u00a2\5\26\f\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\3\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9"+
		"\5\b\5\2\u00a7\u00a9\7\37\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\5\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\7\3\2\2\2\u00ac\u00ad\7;\2\2"+
		"\u00ad\u00af\7L\2\2\u00ae\u00b0\5\n\6\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\22\n\2\u00b2\t\3\2\2\2\u00b3"+
		"\u00b4\7$\2\2\u00b4\u00b9\5\f\7\2\u00b5\u00b6\7 \2\2\u00b6\u00b8\5\f\7"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd"+
		"\13\3\2\2\2\u00be\u00c1\7L\2\2\u00bf\u00c0\7\3\2\2\u00c0\u00c2\5\16\b"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\r\3\2\2\2\u00c3\u00c8"+
		"\5\64\33\2\u00c4\u00c5\7\4\2\2\u00c5\u00c7\5\64\33\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\17"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d0\5\64\33\2\u00cc\u00cd\7 \2\2"+
		"\u00cd\u00cf\5\64\33\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d7\7\33\2\2\u00d4\u00d6\5\24\13\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7\34\2\2\u00db\23\3\2\2\2\u00dc\u00e3\7\37"+
		"\2\2\u00dd\u00df\7\5\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e3\5Z.\2\u00e1\u00e3\5\26\f\2\u00e2\u00dc\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\25\3\2\2\2\u00e4\u00e5"+
		"\5\30\r\2\u00e5\27\3\2\2\2\u00e6\u00e9\7\6\2\2\u00e7\u00ea\5\64\33\2\u00e8"+
		"\u00ea\7J\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\7L\2\2\u00ec\u00f1\5@!\2\u00ed\u00ee\7\35\2\2\u00ee\u00f0"+
		"\7\36\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5"+
		"\7\7\2\2\u00f5\u00f7\5> \2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00fb\5H%\2\u00f9\u00fb\7\37\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\5\n\6\2\u00fd\u00fe"+
		"\5\30\r\2\u00fe\33\3\2\2\2\u00ff\u0100\7L\2\2\u0100\u0103\5@!\2\u0101"+
		"\u0102\7\7\2\2\u0102\u0104\5> \2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2"+
		"\2\u0104\u0105\3\2\2\2\u0105\u0106\5J&\2\u0106\35\3\2\2\2\u0107\u0108"+
		"\5\n\6\2\u0108\u0109\5\34\17\2\u0109\37\3\2\2\2\u010a\u010c\5\64\33\2"+
		"\u010b\u010d\5$\23\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\5(\25\2\u010f\u0110\7\37\2\2\u0110!\3\2\2\2\u0111"+
		"\u0113\5\6\4\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0119\5\64\33\2\u0118\u011a\5$\23\2\u0119\u0118\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u0120\5&\24\2\u011c\u011d\7 \2\2\u011d"+
		"\u011f\5&\24\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\37\2\2\u0124#\3\2\2\2\u0125\u0126\7/\2\2\u0126%\3\2\2\2\u0127"+
		"\u012c\7L\2\2\u0128\u0129\7\35\2\2\u0129\u012b\7\36\2\2\u012a\u0128\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\"\2\2\u0130\u0131\5."+
		"\30\2\u0131\'\3\2\2\2\u0132\u0137\5*\26\2\u0133\u0134\7 \2\2\u0134\u0136"+
		"\5*\26\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138)\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013d\5,\27\2"+
		"\u013b\u013c\7\"\2\2\u013c\u013e\5.\30\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e+\3\2\2\2\u013f\u0144\7L\2\2\u0140\u0141\7\35\2\2\u0141"+
		"\u0143\7\36\2\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145-\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014a"+
		"\5\60\31\2\u0148\u014a\5\u0084C\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2"+
		"\2\2\u014a/\3\2\2\2\u014b\u0157\7\33\2\2\u014c\u0151\5.\30\2\u014d\u014e"+
		"\7 \2\2\u014e\u0150\5.\30\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0156\7 \2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u014c\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\7\34\2\2\u015a\61\3\2\2\2\u015b\u015c\7L\2\2\u015c\63"+
		"\3\2\2\2\u015d\u0162\5\66\34\2\u015e\u015f\7\35\2\2\u015f\u0161\7\36\2"+
		"\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u016e\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016a\58\35\2\u0166"+
		"\u0167\7\35\2\2\u0167\u0169\7\36\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3"+
		"\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u015d\3\2\2\2\u016d\u0165\3\2\2\2\u016e\65\3\2\2"+
		"\2\u016f\u0171\7L\2\2\u0170\u0172\5:\36\2\u0171\u0170\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u017a\3\2\2\2\u0173\u0174\7!\2\2\u0174\u0176\7L\2\2\u0175"+
		"\u0177\5:\36\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2"+
		"\2\2\u0178\u0173\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\67\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\t\2\2"+
		"\2\u017e9\3\2\2\2\u017f\u0180\7$\2\2\u0180\u0185\5<\37\2\u0181\u0182\7"+
		" \2\2\u0182\u0184\5<\37\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0188\u0189\7#\2\2\u0189;\3\2\2\2\u018a\u0191\5\64\33\2\u018b\u018e"+
		"\7\b\2\2\u018c\u018d\t\3\2\2\u018d\u018f\5\64\33\2\u018e\u018c\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018a\3\2\2\2\u0190\u018b"+
		"\3\2\2\2\u0191=\3\2\2\2\u0192\u0197\5L\'\2\u0193\u0194\7 \2\2\u0194\u0196"+
		"\5L\'\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198?\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\7\31\2\2"+
		"\u019b\u019d\5B\"\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u019f\7\32\2\2\u019fA\3\2\2\2\u01a0\u01a5\5D#\2\u01a1\u01a2"+
		"\7 \2\2\u01a2\u01a4\5D#\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a8\u01a9\7 \2\2\u01a9\u01ab\5F$\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\5F$\2\u01ad\u01a0\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01aeC\3\2\2\2\u01af\u01b0\5\64\33\2\u01b0\u01b1\5,\27"+
		"\2\u01b1E\3\2\2\2\u01b2\u01b3\5\64\33\2\u01b3\u01b4\7\n\2\2\u01b4\u01b5"+
		"\5,\27\2\u01b5G\3\2\2\2\u01b6\u01b7\5Z.\2\u01b7I\3\2\2\2\u01b8\u01b9\5"+
		"Z.\2\u01b9K\3\2\2\2\u01ba\u01bf\7L\2\2\u01bb\u01bc\7!\2\2\u01bc\u01be"+
		"\7L\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0M\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\t\4\2\2"+
		"\u01c3O\3\2\2\2\u01c4\u01c9\5R*\2\u01c5\u01c6\7 \2\2\u01c6\u01c8\5R*\2"+
		"\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01caQ\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7L\2\2\u01cd\u01ce"+
		"\7\"\2\2\u01ce\u01cf\5T+\2\u01cfS\3\2\2\2\u01d0\u01d3\5\u0084C\2\u01d1"+
		"\u01d3\5V,\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3U\3\2\2\2\u01d4"+
		"\u01dd\7\33\2\2\u01d5\u01da\5T+\2\u01d6\u01d7\7 \2\2\u01d7\u01d9\5T+\2"+
		"\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\7 \2\2\u01e0\u01df\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7\34\2\2\u01e3"+
		"W\3\2\2\2\u01e4\u01e5\7=\2\2\u01e5\u01e6\5T+\2\u01e6Y\3\2\2\2\u01e7\u01eb"+
		"\7\33\2\2\u01e8\u01ea\5\\/\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ee\u01ef\7\34\2\2\u01ef[\3\2\2\2\u01f0\u01f4\5^\60\2\u01f1\u01f4"+
		"\5b\62\2\u01f2\u01f4\5\4\3\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4]\3\2\2\2\u01f5\u01f6\5`\61\2\u01f6\u01f7\7\37\2\2"+
		"\u01f7_\3\2\2\2\u01f8\u01fa\5\6\4\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3"+
		"\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5\64\33\2\u01fc\u01fd\5(\25\2\u01fd"+
		"a\3\2\2\2\u01fe\u0242\5Z.\2\u01ff\u0200\7B\2\2\u0200\u0201\5|?\2\u0201"+
		"\u0204\5b\62\2\u0202\u0203\7?\2\2\u0203\u0205\5b\62\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0242\3\2\2\2\u0206\u0207\7A\2\2\u0207"+
		"\u0208\7\31\2\2\u0208\u0209\5t;\2\u0209\u020a\7\32\2\2\u020a\u020b\5b"+
		"\62\2\u020b\u0242\3\2\2\2\u020c\u020d\7K\2\2\u020d\u020e\5|?\2\u020e\u020f"+
		"\5b\62\2\u020f\u0242\3\2\2\2\u0210\u0211\7>\2\2\u0211\u0212\5|?\2\u0212"+
		"\u0213\5b\62\2\u0213\u0242\3\2\2\2\u0214\u0215\7H\2\2\u0215\u0216\5|?"+
		"\2\u0216\u021a\7\33\2\2\u0217\u0219\5p9\2\u0218\u0217\3\2\2\2\u0219\u021c"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0220\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021f\5r:\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2"+
		"\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220"+
		"\3\2\2\2\u0223\u0224\7\34\2\2\u0224\u0242\3\2\2\2\u0225\u0227\7G\2\2\u0226"+
		"\u0228\5\u0084C\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u0242\7\37\2\2\u022a\u022b\7\13\2\2\u022b\u022c\5\u0084"+
		"C\2\u022c\u022d\7\37\2\2\u022d\u0242\3\2\2\2\u022e\u0230\78\2\2\u022f"+
		"\u0231\7L\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0242\7\37\2\2\u0233\u0242\7\37\2\2\u0234\u0235\5\u0080A\2"+
		"\u0235\u0236\7\37\2\2\u0236\u0242\3\2\2\2\u0237\u0238\7L\2\2\u0238\u0239"+
		"\7\f\2\2\u0239\u0242\5b\62\2\u023a\u0242\5\"\22\2\u023b\u023c\7\r\2\2"+
		"\u023c\u023d\5|?\2\u023d\u023e\7\37\2\2\u023e\u0242\3\2\2\2\u023f\u0242"+
		"\7\16\2\2\u0240\u0242\5\30\r\2\u0241\u01fe\3\2\2\2\u0241\u01ff\3\2\2\2"+
		"\u0241\u0206\3\2\2\2\u0241\u020c\3\2\2\2\u0241\u0210\3\2\2\2\u0241\u0214"+
		"\3\2\2\2\u0241\u0225\3\2\2\2\u0241\u022a\3\2\2\2\u0241\u022e\3\2\2\2\u0241"+
		"\u0233\3\2\2\2\u0241\u0234\3\2\2\2\u0241\u0237\3\2\2\2\u0241\u023a\3\2"+
		"\2\2\u0241\u023b\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242"+
		"c\3\2\2\2\u0243\u0244\7\17\2\2\u0244\u0245\7\31\2\2\u0245\u0246\5f\64"+
		"\2\u0246\u0247\7L\2\2\u0247\u0248\7\32\2\2\u0248\u0249\5Z.\2\u0249e\3"+
		"\2\2\2\u024a\u024f\5L\'\2\u024b\u024c\7\20\2\2\u024c\u024e\5L\'\2\u024d"+
		"\u024b\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250g\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\7\21\2\2\u0253\u0254"+
		"\5Z.\2\u0254i\3\2\2\2\u0255\u0256\7\31\2\2\u0256\u0258\5l\67\2\u0257\u0259"+
		"\7\37\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2"+
		"\u025a\u025b\7\32\2\2\u025bk\3\2\2\2\u025c\u0261\5n8\2\u025d\u025e\7\37"+
		"\2\2\u025e\u0260\5n8\2\u025f\u025d\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262m\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0266\5\6\4\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026b\5\66\34\2\u026b\u026c\5,\27\2\u026c\u026d\7\"\2\2\u026d\u026e\5"+
		"\u0084C\2\u026eo\3\2\2\2\u026f\u0271\5r:\2\u0270\u026f\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u0276\5\\/\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278q\3\2\2\2\u0279\u027a\79\2\2\u027a\u027b"+
		"\5\u0082B\2\u027b\u027c\7\f\2\2\u027c\u0284\3\2\2\2\u027d\u027e\79\2\2"+
		"\u027e\u027f\5\62\32\2\u027f\u0280\7\f\2\2\u0280\u0284\3\2\2\2\u0281\u0282"+
		"\7=\2\2\u0282\u0284\7\f\2\2\u0283\u0279\3\2\2\2\u0283\u027d\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0284s\3\2\2\2\u0285\u0292\5x=\2\u0286\u0288\5v<\2\u0287"+
		"\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\7\37"+
		"\2\2\u028a\u028c\5\u0084C\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028f\7\37\2\2\u028e\u0290\5z>\2\u028f\u028e\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u0285\3\2\2\2\u0291"+
		"\u0287\3\2\2\2\u0292u\3\2\2\2\u0293\u0296\5`\61\2\u0294\u0296\5~@\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296w\3\2\2\2\u0297\u0299\5\6\4\2"+
		"\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\5\64\33\2"+
		"\u029e\u029f\5,\27\2\u029f\u02a0\7\f\2\2\u02a0\u02a1\5\u0084C\2\u02a1"+
		"y\3\2\2\2\u02a2\u02a3\5~@\2\u02a3{\3\2\2\2\u02a4\u02a5\7\31\2\2\u02a5"+
		"\u02a6\5\u0084C\2\u02a6\u02a7\7\32\2\2\u02a7}\3\2\2\2\u02a8\u02ad\5\u0084"+
		"C\2\u02a9\u02aa\7 \2\2\u02aa\u02ac\5\u0084C\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\177\3\2\2"+
		"\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\5\u0084C\2\u02b1\u0081\3\2\2\2\u02b2"+
		"\u02b3\5\u0084C\2\u02b3\u0083\3\2\2\2\u02b4\u02b5\bC\1\2\u02b5\u02bb\5"+
		"\u0086D\2\u02b6\u02b7\7F\2\2\u02b7\u02bb\5\u0088E\2\u02b8\u02b9\t\5\2"+
		"\2\u02b9\u02bb\5\u0084C\r\u02ba\u02b4\3\2\2\2\u02ba\u02b6\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02bb\u02f5\3\2\2\2\u02bc\u02bd\f\f\2\2\u02bd\u02be\t\6"+
		"\2\2\u02be\u02f4\5\u0084C\r\u02bf\u02c0\f\13\2\2\u02c0\u02c1\t\7\2\2\u02c1"+
		"\u02f4\5\u0084C\f\u02c2\u02c3\f\n\2\2\u02c3\u02c4\t\b\2\2\u02c4\u02f4"+
		"\5\u0084C\13\u02c5\u02c6\f\b\2\2\u02c6\u02c7\t\t\2\2\u02c7\u02f4\5\u0084"+
		"C\t\u02c8\u02c9\f\7\2\2\u02c9\u02ca\7\61\2\2\u02ca\u02f4\5\u0084C\b\u02cb"+
		"\u02cc\f\6\2\2\u02cc\u02cd\7)\2\2\u02cd\u02f4\5\u0084C\7\u02ce\u02cf\f"+
		"\5\2\2\u02cf\u02d0\7*\2\2\u02d0\u02f4\5\u0084C\6\u02d1\u02d2\f\4\2\2\u02d2"+
		"\u02d3\7\b\2\2\u02d3\u02d4\5\u0084C\2\u02d4\u02d5\7\f\2\2\u02d5\u02d6"+
		"\5\u0084C\5\u02d6\u02f4\3\2\2\2\u02d7\u02d8\f\3\2\2\u02d8\u02d9\t\n\2"+
		"\2\u02d9\u02f4\5\u0084C\3\u02da\u02db\f\24\2\2\u02db\u02dc\7!\2\2\u02dc"+
		"\u02f4\7L\2\2\u02dd\u02de\f\23\2\2\u02de\u02df\7!\2\2\u02df\u02f4\7I\2"+
		"\2\u02e0\u02e1\f\22\2\2\u02e1\u02e2\7!\2\2\u02e2\u02f4\5\u0092J\2\u02e3"+
		"\u02e4\f\21\2\2\u02e4\u02e5\7\35\2\2\u02e5\u02e6\5\u0084C\2\u02e6\u02e7"+
		"\7\36\2\2\u02e7\u02f4\3\2\2\2\u02e8\u02e9\f\20\2\2\u02e9\u02eb\7\31\2"+
		"\2\u02ea\u02ec\5~@\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed"+
		"\3\2\2\2\u02ed\u02f4\7\32\2\2\u02ee\u02ef\f\16\2\2\u02ef\u02f4\t\13\2"+
		"\2\u02f0\u02f1\f\t\2\2\u02f1\u02f2\7C\2\2\u02f2\u02f4\5\64\33\2\u02f3"+
		"\u02bc\3\2\2\2\u02f3\u02bf\3\2\2\2\u02f3\u02c2\3\2\2\2\u02f3\u02c5\3\2"+
		"\2\2\u02f3\u02c8\3\2\2\2\u02f3\u02cb\3\2\2\2\u02f3\u02ce\3\2\2\2\u02f3"+
		"\u02d1\3\2\2\2\u02f3\u02d7\3\2\2\2\u02f3\u02da\3\2\2\2\u02f3\u02dd\3\2"+
		"\2\2\u02f3\u02e0\3\2\2\2\u02f3\u02e3\3\2\2\2\u02f3\u02e8\3\2\2\2\u02f3"+
		"\u02ee\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u0085\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8"+
		"\u02f9\7\31\2\2\u02f9\u02fa\5\u0084C\2\u02fa\u02fb\7\32\2\2\u02fb\u0305"+
		"\3\2\2\2\u02fc\u0305\5N(\2\u02fd\u0305\7L\2\2\u02fe\u0302\5\u0094K\2\u02ff"+
		"\u0303\5\u009cO\2\u0300\u0301\7I\2\2\u0301\u0303\5\u009eP\2\u0302\u02ff"+
		"\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u02f8\3\2\2\2\u0304"+
		"\u02fc\3\2\2\2\u0304\u02fd\3\2\2\2\u0304\u02fe\3\2\2\2\u0305\u0087\3\2"+
		"\2\2\u0306\u0307\5\u0094K\2\u0307\u0308\5\u008aF\2\u0308\u0309\5\u0090"+
		"I\2\u0309\u0310\3\2\2\2\u030a\u030d\5\u008aF\2\u030b\u030e\5\u008eH\2"+
		"\u030c\u030e\5\u0090I\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030e"+
		"\u0310\3\2\2\2\u030f\u0306\3\2\2\2\u030f\u030a\3\2\2\2\u0310\u0089\3\2"+
		"\2\2\u0311\u0313\7L\2\2\u0312\u0314\5\u0096L\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u031c\3\2\2\2\u0315\u0316\7!\2\2\u0316\u0318\7L\2"+
		"\2\u0317\u0319\5\u0096L\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\3\2\2\2\u031a\u0315\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u0321\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0321\58\35\2\u0320\u0311\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u008b\3\2"+
		"\2\2\u0322\u0324\7L\2\2\u0323\u0325\5\u0098M\2\u0324\u0323\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\5\u0090I\2\u0327\u008d"+
		"\3\2\2\2\u0328\u0344\7\35\2\2\u0329\u032e\7\36\2\2\u032a\u032b\7\35\2"+
		"\2\u032b\u032d\7\36\2\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u032e\3\2"+
		"\2\2\u0331\u0345\5\60\31\2\u0332\u0333\5\u0084C\2\u0333\u033a\7\36\2\2"+
		"\u0334\u0335\7\35\2\2\u0335\u0336\5\u0084C\2\u0336\u0337\7\36\2\2\u0337"+
		"\u0339\3\2\2\2\u0338\u0334\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033a\u033b\3\2\2\2\u033b\u0341\3\2\2\2\u033c\u033a\3\2\2\2\u033d"+
		"\u033e\7\35\2\2\u033e\u0340\7\36\2\2\u033f\u033d\3\2\2\2\u0340\u0343\3"+
		"\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0345\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0344\u0329\3\2\2\2\u0344\u0332\3\2\2\2\u0345\u008f\3\2"+
		"\2\2\u0346\u0348\5\u009eP\2\u0347\u0349\5\22\n\2\u0348\u0347\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u0091\3\2\2\2\u034a\u034b\5\u0094K\2\u034b\u034c"+
		"\5\u009cO\2\u034c\u0093\3\2\2\2\u034d\u034e\7$\2\2\u034e\u034f\5\20\t"+
		"\2\u034f\u0350\7#\2\2\u0350\u0095\3\2\2\2\u0351\u0352\7$\2\2\u0352\u0355"+
		"\7#\2\2\u0353\u0355\5:\36\2\u0354\u0351\3\2\2\2\u0354\u0353\3\2\2\2\u0355"+
		"\u0097\3\2\2\2\u0356\u0357\7$\2\2\u0357\u035a\7#\2\2\u0358\u035a\5\u0094"+
		"K\2\u0359\u0356\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u0099\3\2\2\2\u035b"+
		"\u0362\5\u009eP\2\u035c\u035d\7!\2\2\u035d\u035f\7L\2\2\u035e\u0360\5"+
		"\u009eP\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2"+
		"\u0361\u035b\3\2\2\2\u0361\u035c\3\2\2\2\u0362\u009b\3\2\2\2\u0363\u0364"+
		"\7\t\2\2\u0364\u0368\5\u009aN\2\u0365\u0366\7L\2\2\u0366\u0368\5\u009e"+
		"P\2\u0367\u0363\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u009d\3\2\2\2\u0369"+
		"\u036b\7\31\2\2\u036a\u036c\5~@\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7\32\2\2\u036e\u009f\3\2\2\2`\u00a3"+
		"\u00a8\u00af\u00b9\u00c1\u00c8\u00d0\u00d7\u00de\u00e2\u00e9\u00f1\u00f6"+
		"\u00fa\u0103\u010c\u0114\u0119\u0120\u012c\u0137\u013d\u0144\u0149\u0151"+
		"\u0155\u0157\u0162\u016a\u016d\u0171\u0176\u017a\u0185\u018e\u0190\u0197"+
		"\u019c\u01a5\u01aa\u01ad\u01bf\u01c9\u01d2\u01da\u01dd\u01e0\u01eb\u01f3"+
		"\u01f9\u0204\u021a\u0220\u0227\u0230\u0241\u024f\u0258\u0261\u0267\u0272"+
		"\u0277\u0283\u0287\u028b\u028f\u0291\u0295\u029a\u02ad\u02ba\u02eb\u02f3"+
		"\u02f5\u0302\u0304\u030d\u030f\u0313\u0318\u031c\u0320\u0324\u032e\u033a"+
		"\u0341\u0344\u0348\u0354\u0359\u035f\u0361\u0367\u036b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}