// Generated from Java.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		IntegerLiteral=17, FloatingPointLiteral=18, BooleanLiteral=19, CharacterLiteral=20, 
		StringLiteral=21, NullLiteral=22, LEFTPARENTH=23, RIGHTPARENTH=24, LEFTBRACE=25, 
		RIGHTBRACE=26, LEFTBRACKET=27, RIGHTBRACKET=28, SEMICOLON=29, COMMA=30, 
		DOT=31, ASSIGNMENT=32, GREATER=33, LESS=34, EQUAL=35, LESSEQUAL=36, GREATEREQUAL=37, 
		NOTEQUAL=38, AND=39, OR=40, INCREMENT=41, DECREMENT=42, ADDITION=43, SUBTRACT=44, 
		MULTIPLY=45, DIVISION=46, EXPONENT=47, MODULO=48, ADD_ASSIGN=49, SUB_ASSIGN=50, 
		MUL_ASSIGN=51, DIV_ASSIGN=52, BOOLEAN=53, BREAK=54, CASE=55, CHAR=56, 
		CLASS=57, CONST=58, DEFAULT=59, DOWHILE=60, ELSE=61, FLOAT=62, FOR=63, 
		IF=64, INSTANCEOF=65, INT=66, LONG=67, NEW=68, RETURN=69, SWITCH=70, THIS=71, 
		VOID=72, WHILE=73, Identifier=74, WS=75, COMMENT=76, LINE_COMMENT=77;
	public static final String[] tokenNames = {
		"<INVALID>", "'finally'", "'output'", "'throws'", "'static'", "'input();'", 
		"'function'", "'catch'", "'extends'", "'?'", "'&'", "'throw'", "'...'", 
		"':'", "'|'", "'!'", "'super'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'boolean'", "'break'", "'case'", "'char'", "'class'", "'CONST'", "'default'", 
		"'dowhile'", "'else'", "'float'", "'for'", "'if'", "'instanceof'", "'int'", 
		"'long'", "'new'", "'return'", "'switch'", "'this'", "'void'", "'while'", 
		"Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
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

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << LESS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << FLOAT))) != 0) || _la==INT || _la==Identifier) {
				{
				{
				setState(158); baseDeclaration();
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); classDeclaration();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(SEMICOLON);
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
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(CONST);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(CLASS);
			setState(171); match(Identifier);
			setState(173);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(172); typeParameters();
				}
			}

			setState(175); classBody();
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
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(LESS);
			setState(178); typeParameter();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179); match(COMMA);
				setState(180); typeParameter();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186); match(GREATER);
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
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(Identifier);
			setState(191);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(189); match(T__8);
				setState(190); typeBound();
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
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); typeType();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(194); match(T__6);
				setState(195); typeType();
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
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); typeType();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202); match(COMMA);
				setState(203); typeType();
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(LEFTBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__10) | (1L << LEFTBRACE) | (1L << SEMICOLON) | (1L << LESS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << FLOAT))) != 0) || _la==INT || _la==Identifier) {
				{
				{
				setState(210); classBodyDeclaration();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216); match(RIGHTBRACE);
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
		public BaseDeclarationContext baseDeclaration() {
			return getRuleContext(BaseDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(218); match(SEMICOLON);
				}
				break;
			case T__12:
			case LEFTBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(219); match(T__12);
					}
				}

				setState(222); block();
				}
				break;
			case T__10:
			case LESS:
			case BOOLEAN:
			case CHAR:
			case CLASS:
			case FLOAT:
			case INT:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(223); baseDeclaration();
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
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
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
	}

	public final BaseDeclarationContext baseDeclaration() throws RecognitionException {
		BaseDeclarationContext _localctx = new BaseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_baseDeclaration);
		try {
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229); constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231); classDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(T__10);
			setState(237);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				{
				setState(235); typeType();
				}
				break;
			case VOID:
				{
				setState(236); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239); match(Identifier);
			setState(240); formalParameters();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(241); match(LEFTBRACKET);
				setState(242); match(RIGHTBRACKET);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(248); match(T__13);
				setState(249); qualifiedNameList();
				}
			}

			setState(254);
			switch (_input.LA(1)) {
			case LEFTBRACE:
				{
				setState(252); methodBody();
				}
				break;
			case SEMICOLON:
				{
				setState(253); match(SEMICOLON);
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
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
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); typeParameters();
			setState(257); methodDeclaration();
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
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(Identifier);
			setState(260); formalParameters();
			setState(263);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(261); match(T__13);
				setState(262); qualifiedNameList();
				}
			}

			setState(265); constructorBody();
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
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); typeParameters();
			setState(268); constructorDeclaration();
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
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); typeType();
			setState(272);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(271); pointerModifier();
				}
			}

			setState(274); variableDeclarators();
			setState(275); match(SEMICOLON);
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
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public PointerModifierContext pointerModifier() {
			return getRuleContext(PointerModifierContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
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
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(277); constantModifier();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283); typeType();
			setState(285);
			_la = _input.LA(1);
			if (_la==MULTIPLY) {
				{
				setState(284); pointerModifier();
				}
			}

			setState(287); constantDeclarator();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288); match(COMMA);
				setState(289); constantDeclarator();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295); match(SEMICOLON);
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
	}

	public final PointerModifierContext pointerModifier() throws RecognitionException {
		PointerModifierContext _localctx = new PointerModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pointerModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(MULTIPLY);
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
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(Identifier);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(300); match(LEFTBRACKET);
				setState(301); match(RIGHTBRACKET);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307); match(ASSIGNMENT);
			setState(308); variableInitializer();
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
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); variableDeclarator();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311); match(COMMA);
				setState(312); variableDeclarator();
				}
				}
				setState(317);
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
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
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
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); variableDeclaratorId();
			setState(321);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(319); match(ASSIGNMENT);
				setState(320); variableInitializer();
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
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(Identifier);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(324); match(LEFTBRACKET);
				setState(325); match(RIGHTBRACKET);
				}
				}
				setState(330);
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableInitializer);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case LEFTBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); arrayInitializer();
				}
				break;
			case T__1:
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
				setState(332); expression(0);
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
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(LEFTBRACE);
			setState(347);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LEFTBRACE - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
				{
				setState(336); variableInitializer();
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337); match(COMMA);
						setState(338); variableInitializer();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(345);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(344); match(COMMA);
					}
				}

				}
			}

			setState(349); match(RIGHTBRACE);
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
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(Identifier);
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
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeType);
		try {
			int _alt;
			setState(369);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); classType();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354); match(LEFTBRACKET);
						setState(355); match(RIGHTBRACKET);
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); dataType();
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362); match(LEFTBRACKET);
						setState(363); match(RIGHTBRACKET);
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
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
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(Identifier);
			setState(373);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(372); typeArguments();
				}
				break;
			}
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375); match(DOT);
					setState(376); match(Identifier);
					setState(378);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(377); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (BOOLEAN - 53)) | (1L << (CHAR - 53)) | (1L << (FLOAT - 53)) | (1L << (INT - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(LESS);
			setState(388); typeArgument();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389); match(COMMA);
				setState(390); typeArgument();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396); match(GREATER);
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
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeArgument);
		int _la;
		try {
			setState(404);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); typeType();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); match(T__7);
				setState(402);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__0) {
					{
					setState(400);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(401); typeType();
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
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); qualifiedName();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(407); match(COMMA);
				setState(408); qualifiedName();
				}
				}
				setState(413);
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
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(LEFTPARENTH);
			setState(416);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (BOOLEAN - 53)) | (1L << (CHAR - 53)) | (1L << (FLOAT - 53)) | (1L << (INT - 53)) | (1L << (Identifier - 53)))) != 0)) {
				{
				setState(415); formalParameterList();
				}
			}

			setState(418); match(RIGHTPARENTH);
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
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420); formalParameter();
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421); match(COMMA);
						setState(422); formalParameter();
						}
						} 
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(430);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(428); match(COMMA);
					setState(429); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); lastFormalParameter();
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); typeType();
			setState(436); variableDeclaratorId();
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
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); typeType();
			setState(439); match(T__4);
			setState(440); variableDeclaratorId();
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); block();
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
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444); block();
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
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(Identifier);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(447); match(DOT);
				setState(448); match(Identifier);
				}
				}
				setState(453);
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
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
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
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); elementValuePair();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457); match(COMMA);
				setState(458); elementValuePair();
				}
				}
				setState(463);
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
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(Identifier);
			setState(465); match(ASSIGNMENT);
			setState(466); elementValue();
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
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elementValue);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case T__1:
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
				setState(468); expression(0);
				}
				break;
			case LEFTBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(469); elementValueArrayInitializer();
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
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
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
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(LEFTBRACE);
			setState(481);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LEFTBRACE - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
				{
				setState(473); elementValue();
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(474); match(COMMA);
						setState(475); elementValue();
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
			}

			setState(484);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(483); match(COMMA);
				}
			}

			setState(486); match(RIGHTBRACE);
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
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(DEFAULT);
			setState(489); elementValue();
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); match(LEFTBRACE);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__11) | (1L << T__10) | (1L << T__5) | (1L << T__1) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LEFTPARENTH) | (1L << LEFTBRACE) | (1L << SEMICOLON) | (1L << LESS) | (1L << ADDITION) | (1L << SUBTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DOWHILE) | (1L << FLOAT) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (INT - 64)) | (1L << (NEW - 64)) | (1L << (RETURN - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(492); blockStatement();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498); match(RIGHTBRACE);
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
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blockStatement);
		try {
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502); typeDeclaration();
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
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); localVariableDeclaration();
			setState(506); match(SEMICOLON);
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
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(508); constantModifier();
				}
			}

			setState(511); typeType();
			setState(512); variableDeclarators();
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
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(581);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515); match(IF);
				setState(516); parExpression();
				setState(517); statement();
				setState(520);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(518); match(ELSE);
					setState(519); statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522); match(FOR);
				setState(523); match(LEFTPARENTH);
				setState(524); forControl();
				setState(525); match(RIGHTPARENTH);
				setState(526); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528); match(WHILE);
				setState(529); parExpression();
				setState(530); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(532); match(DOWHILE);
				setState(533); parExpression();
				setState(534); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(536); match(SWITCH);
				setState(537); parExpression();
				setState(538); match(LEFTBRACE);
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539); switchBlockStatementGroup();
						}
						} 
					}
					setState(544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(545); switchLabel();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551); match(RIGHTBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(553); match(RETURN);
				setState(555);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
					{
					setState(554); expression(0);
					}
				}

				setState(557); match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(558); match(T__5);
				setState(559); expression(0);
				setState(560); match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(562); match(BREAK);
				setState(564);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(563); match(Identifier);
					}
				}

				setState(566); match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(567); match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(568); statementExpression();
				setState(569); match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(571); match(Identifier);
				setState(572); match(T__3);
				setState(573); statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(574); constDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(575); match(T__14);
				setState(576); parExpression();
				setState(577); match(SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(579); match(T__11);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(580); methodDeclaration();
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(T__9);
			setState(584); match(LEFTPARENTH);
			setState(585); catchType();
			setState(586); match(Identifier);
			setState(587); match(RIGHTPARENTH);
			setState(588); block();
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
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); qualifiedName();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(591); match(T__2);
				setState(592); qualifiedName();
				}
				}
				setState(597);
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
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); match(T__15);
			setState(599); block();
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
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(LEFTPARENTH);
			setState(602); resources();
			setState(604);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(603); match(SEMICOLON);
				}
			}

			setState(606); match(RIGHTPARENTH);
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
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
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
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608); resource();
			setState(613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(609); match(SEMICOLON);
					setState(610); resource();
					}
					} 
				}
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
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
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(616); constantModifier();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622); classType();
			setState(623); variableDeclaratorId();
			setState(624); match(ASSIGNMENT);
			setState(625); expression(0);
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(627); switchLabel();
				}
				}
				setState(630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(633); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(632); blockStatement();
				}
				}
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__11) | (1L << T__10) | (1L << T__5) | (1L << T__1) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LEFTPARENTH) | (1L << LEFTBRACE) | (1L << SEMICOLON) | (1L << LESS) | (1L << ADDITION) | (1L << SUBTRACT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DOWHILE) | (1L << FLOAT) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (INT - 64)) | (1L << (NEW - 64)) | (1L << (RETURN - 64)) | (1L << (SWITCH - 64)) | (1L << (WHILE - 64)) | (1L << (Identifier - 64)))) != 0) );
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
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_switchLabel);
		try {
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637); match(CASE);
				setState(638); constantExpression();
				setState(639); match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); match(CASE);
				setState(642); enumConstantName();
				setState(643); match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645); match(DEFAULT);
				setState(646); match(T__3);
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
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forControl);
		int _la;
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (BOOLEAN - 15)) | (1L << (CHAR - 15)) | (1L << (CONST - 15)) | (1L << (FLOAT - 15)) | (1L << (INT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
					{
					setState(650); forInit();
					}
				}

				setState(653); match(SEMICOLON);
				setState(655);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
					{
					setState(654); expression(0);
					}
				}

				setState(657); match(SEMICOLON);
				setState(659);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
					{
					setState(658); forUpdate();
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forInit);
		try {
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664); expressionList();
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
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(667); constantModifier();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673); typeType();
			setState(674); variableDeclaratorId();
			setState(675); match(T__3);
			setState(676); expression(0);
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
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); expressionList();
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
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(LEFTPARENTH);
			setState(681); expression(0);
			setState(682); match(RIGHTPARENTH);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); expression(0);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(685); match(COMMA);
				setState(686); expression(0);
				}
				}
				setState(691);
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
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); expression(0);
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
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); expression(0);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
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
			setState(702);
			switch (_input.LA(1)) {
			case T__1:
			case ADDITION:
			case SUBTRACT:
				{
				setState(697);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADDITION) | (1L << SUBTRACT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(698); expression(11);
				}
				break;
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
				setState(699); primary();
				}
				break;
			case NEW:
				{
				setState(700); match(NEW);
				setState(701); creator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(759);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(705);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(706); expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(708);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(709); expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(711);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(712); expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(714);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(715); expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(717); match(EXPONENT);
						setState(718); expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(720); match(AND);
						setState(721); expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(723); match(OR);
						setState(724); expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(725);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(726); match(T__7);
						setState(727); expression(0);
						setState(728); match(T__3);
						setState(729); expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(731);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(732);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(733); expression(1);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(735); match(DOT);
						setState(736); match(Identifier);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(737);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(738); match(DOT);
						setState(739); match(THIS);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(740);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(741); match(DOT);
						setState(742); explicitGenericInvocation();
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(744); match(LEFTBRACKET);
						setState(745); expression(0);
						setState(746); match(RIGHTBRACKET);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(749); match(LEFTPARENTH);
						setState(751);
						_la = _input.LA(1);
						if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
							{
							setState(750); expressionList();
							}
						}

						setState(753); match(RIGHTPARENTH);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(755);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(757); match(INSTANCEOF);
						setState(758); typeType();
						}
						break;
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_primary);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case LEFTPARENTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(764); match(LEFTPARENTH);
				setState(765); expression(0);
				setState(766); match(RIGHTPARENTH);
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
				setState(768); literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(769); match(Identifier);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(770); nonWildcardTypeArguments();
				setState(774);
				switch (_input.LA(1)) {
				case T__0:
				case Identifier:
					{
					setState(771); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(772); match(THIS);
					setState(773); arguments();
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
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
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
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_creator);
		try {
			setState(787);
			switch (_input.LA(1)) {
			case LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(778); nonWildcardTypeArguments();
				setState(779); createdName();
				setState(780); classCreatorRest();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(782); createdName();
				setState(785);
				switch (_input.LA(1)) {
				case LEFTBRACKET:
					{
					setState(783); arrayCreatorRest();
					}
					break;
				case LEFTPARENTH:
					{
					setState(784); classCreatorRest();
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
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_createdName);
		int _la;
		try {
			setState(804);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(789); match(Identifier);
				setState(791);
				_la = _input.LA(1);
				if (_la==LESS) {
					{
					setState(790); typeArgumentsOrDiamond();
					}
				}

				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(793); match(DOT);
					setState(794); match(Identifier);
					setState(796);
					_la = _input.LA(1);
					if (_la==LESS) {
						{
						setState(795); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(802);
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
				setState(803); dataType();
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
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); match(Identifier);
			setState(808);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(807); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(810); classCreatorRest();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(812); match(LEFTBRACKET);
			setState(840);
			switch (_input.LA(1)) {
			case RIGHTBRACKET:
				{
				setState(813); match(RIGHTBRACKET);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFTBRACKET) {
					{
					{
					setState(814); match(LEFTBRACKET);
					setState(815); match(RIGHTBRACKET);
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821); arrayInitializer();
				}
				break;
			case T__1:
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
				setState(822); expression(0);
				setState(823); match(RIGHTBRACKET);
				setState(830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(824); match(LEFTBRACKET);
						setState(825); expression(0);
						setState(826); match(RIGHTBRACKET);
						}
						} 
					}
					setState(832);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(833); match(LEFTBRACKET);
						setState(834); match(RIGHTBRACKET);
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); arguments();
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(843); classBody();
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
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); nonWildcardTypeArguments();
			setState(847); explicitGenericInvocationSuffix();
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
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849); match(LESS);
			setState(850); typeList();
			setState(851); match(GREATER);
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
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeArgumentsOrDiamond);
		try {
			setState(856);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853); match(LESS);
				setState(854); match(GREATER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855); typeArguments();
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
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(861);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858); match(LESS);
				setState(859); match(GREATER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860); nonWildcardTypeArguments();
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_superSuffix);
		try {
			setState(869);
			switch (_input.LA(1)) {
			case LEFTPARENTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(863); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(864); match(DOT);
				setState(865); match(Identifier);
				setState(867);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(866); arguments();
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
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
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_explicitGenericInvocationSuffix);
		try {
			setState(875);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(871); match(T__0);
				setState(872); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(873); match(Identifier);
				setState(874); arguments();
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); match(LEFTPARENTH);
			setState(879);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__1 - 15)) | (1L << (IntegerLiteral - 15)) | (1L << (FloatingPointLiteral - 15)) | (1L << (BooleanLiteral - 15)) | (1L << (CharacterLiteral - 15)) | (1L << (StringLiteral - 15)) | (1L << (NullLiteral - 15)) | (1L << (LEFTPARENTH - 15)) | (1L << (LESS - 15)) | (1L << (ADDITION - 15)) | (1L << (SUBTRACT - 15)) | (1L << (NEW - 15)) | (1L << (Identifier - 15)))) != 0)) {
				{
				setState(878); expressionList();
				}
			}

			setState(881); match(RIGHTPARENTH);
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
		case 65: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 8);
		case 3: return precpred(_ctx, 6);
		case 4: return precpred(_ctx, 5);
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		case 8: return precpred(_ctx, 1);
		case 9: return precpred(_ctx, 18);
		case 10: return precpred(_ctx, 17);
		case 11: return precpred(_ctx, 16);
		case 12: return precpred(_ctx, 15);
		case 13: return precpred(_ctx, 14);
		case 14: return precpred(_ctx, 12);
		case 15: return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3O\u0376\4\2\t\2\4"+
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
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f\3\r\3\r\3\r\5\r\u00f0\n\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\3\r\5\r\u00fd\n"+
		"\r\3\r\3\r\5\r\u0101\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u010a"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u0113\n\21\3\21\3\21\3\21"+
		"\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13\22\3\22\3\22\5\22\u0120\n\22"+
		"\3\22\3\22\3\22\7\22\u0125\n\22\f\22\16\22\u0128\13\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u0131\n\24\f\24\16\24\u0134\13\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\7\25\u013c\n\25\f\25\16\25\u013f\13\25\3\26\3\26"+
		"\3\26\5\26\u0144\n\26\3\27\3\27\3\27\7\27\u0149\n\27\f\27\16\27\u014c"+
		"\13\27\3\30\3\30\5\30\u0150\n\30\3\31\3\31\3\31\3\31\7\31\u0156\n\31\f"+
		"\31\16\31\u0159\13\31\3\31\5\31\u015c\n\31\5\31\u015e\n\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\7\33\u0167\n\33\f\33\16\33\u016a\13\33\3\33\3"+
		"\33\3\33\7\33\u016f\n\33\f\33\16\33\u0172\13\33\5\33\u0174\n\33\3\34\3"+
		"\34\5\34\u0178\n\34\3\34\3\34\3\34\5\34\u017d\n\34\7\34\u017f\n\34\f\34"+
		"\16\34\u0182\13\34\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u018a\n\36\f\36"+
		"\16\36\u018d\13\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0195\n\37\5\37"+
		"\u0197\n\37\3 \3 \3 \7 \u019c\n \f \16 \u019f\13 \3!\3!\5!\u01a3\n!\3"+
		"!\3!\3\"\3\"\3\"\7\"\u01aa\n\"\f\"\16\"\u01ad\13\"\3\"\3\"\5\"\u01b1\n"+
		"\"\3\"\5\"\u01b4\n\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\7\'"+
		"\u01c4\n\'\f\'\16\'\u01c7\13\'\3(\3(\3)\3)\3)\7)\u01ce\n)\f)\16)\u01d1"+
		"\13)\3*\3*\3*\3*\3+\3+\5+\u01d9\n+\3,\3,\3,\3,\7,\u01df\n,\f,\16,\u01e2"+
		"\13,\5,\u01e4\n,\3,\5,\u01e7\n,\3,\3,\3-\3-\3-\3.\3.\7.\u01f0\n.\f.\16"+
		".\u01f3\13.\3.\3.\3/\3/\3/\5/\u01fa\n/\3\60\3\60\3\60\3\61\5\61\u0200"+
		"\n\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u020b\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\7\62\u021f\n\62\f\62\16\62\u0222\13\62\3\62\7\62\u0225"+
		"\n\62\f\62\16\62\u0228\13\62\3\62\3\62\3\62\3\62\5\62\u022e\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0237\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0248\n\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u0254\n\64\f\64\16"+
		"\64\u0257\13\64\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u025f\n\66\3\66\3\66"+
		"\3\67\3\67\3\67\7\67\u0266\n\67\f\67\16\67\u0269\13\67\38\78\u026c\n8"+
		"\f8\168\u026f\138\38\38\38\38\38\39\69\u0277\n9\r9\169\u0278\39\69\u027c"+
		"\n9\r9\169\u027d\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u028a\n:\3;\3;\5;\u028e"+
		"\n;\3;\3;\5;\u0292\n;\3;\3;\5;\u0296\n;\5;\u0298\n;\3<\3<\5<\u029c\n<"+
		"\3=\7=\u029f\n=\f=\16=\u02a2\13=\3=\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3@\3"+
		"@\3@\7@\u02b2\n@\f@\16@\u02b5\13@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\5C\u02c1"+
		"\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\5C\u02f2\nC\3C\3C\3C\3C\3C\3C\7C\u02fa\nC\fC\16C\u02fd\13C\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0309\nD\5D\u030b\nD\3E\3E\3E\3E\3E\3E\3"+
		"E\5E\u0314\nE\5E\u0316\nE\3F\3F\5F\u031a\nF\3F\3F\3F\5F\u031f\nF\7F\u0321"+
		"\nF\fF\16F\u0324\13F\3F\5F\u0327\nF\3G\3G\5G\u032b\nG\3G\3G\3H\3H\3H\3"+
		"H\7H\u0333\nH\fH\16H\u0336\13H\3H\3H\3H\3H\3H\3H\3H\7H\u033f\nH\fH\16"+
		"H\u0342\13H\3H\3H\7H\u0346\nH\fH\16H\u0349\13H\5H\u034b\nH\3I\3I\5I\u034f"+
		"\nI\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\5L\u035b\nL\3M\3M\3M\5M\u0360\nM\3N"+
		"\3N\3N\3N\5N\u0366\nN\5N\u0368\nN\3O\3O\3O\3O\5O\u036e\nO\3P\3P\5P\u0372"+
		"\nP\3P\3P\3P\2\3\u0084Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\2\f\6\2\67\67::@@DD\4\2\n\n\22\22\3\2\23\30\4\2\21\21-.\4\2/\60"+
		"\62\62\3\2-.\4\2#$&\'\4\2%%((\4\2\"\"\63\66\3\2+,\u03ab\2\u00a3\3\2\2"+
		"\2\4\u00a8\3\2\2\2\6\u00aa\3\2\2\2\b\u00ac\3\2\2\2\n\u00b3\3\2\2\2\f\u00be"+
		"\3\2\2\2\16\u00c3\3\2\2\2\20\u00cb\3\2\2\2\22\u00d3\3\2\2\2\24\u00e2\3"+
		"\2\2\2\26\u00ea\3\2\2\2\30\u00ec\3\2\2\2\32\u0102\3\2\2\2\34\u0105\3\2"+
		"\2\2\36\u010d\3\2\2\2 \u0110\3\2\2\2\"\u011a\3\2\2\2$\u012b\3\2\2\2&\u012d"+
		"\3\2\2\2(\u0138\3\2\2\2*\u0140\3\2\2\2,\u0145\3\2\2\2.\u014f\3\2\2\2\60"+
		"\u0151\3\2\2\2\62\u0161\3\2\2\2\64\u0173\3\2\2\2\66\u0175\3\2\2\28\u0183"+
		"\3\2\2\2:\u0185\3\2\2\2<\u0196\3\2\2\2>\u0198\3\2\2\2@\u01a0\3\2\2\2B"+
		"\u01b3\3\2\2\2D\u01b5\3\2\2\2F\u01b8\3\2\2\2H\u01bc\3\2\2\2J\u01be\3\2"+
		"\2\2L\u01c0\3\2\2\2N\u01c8\3\2\2\2P\u01ca\3\2\2\2R\u01d2\3\2\2\2T\u01d8"+
		"\3\2\2\2V\u01da\3\2\2\2X\u01ea\3\2\2\2Z\u01ed\3\2\2\2\\\u01f9\3\2\2\2"+
		"^\u01fb\3\2\2\2`\u01ff\3\2\2\2b\u0247\3\2\2\2d\u0249\3\2\2\2f\u0250\3"+
		"\2\2\2h\u0258\3\2\2\2j\u025b\3\2\2\2l\u0262\3\2\2\2n\u026d\3\2\2\2p\u0276"+
		"\3\2\2\2r\u0289\3\2\2\2t\u0297\3\2\2\2v\u029b\3\2\2\2x\u02a0\3\2\2\2z"+
		"\u02a8\3\2\2\2|\u02aa\3\2\2\2~\u02ae\3\2\2\2\u0080\u02b6\3\2\2\2\u0082"+
		"\u02b8\3\2\2\2\u0084\u02c0\3\2\2\2\u0086\u030a\3\2\2\2\u0088\u0315\3\2"+
		"\2\2\u008a\u0326\3\2\2\2\u008c\u0328\3\2\2\2\u008e\u032e\3\2\2\2\u0090"+
		"\u034c\3\2\2\2\u0092\u0350\3\2\2\2\u0094\u0353\3\2\2\2\u0096\u035a\3\2"+
		"\2\2\u0098\u035f\3\2\2\2\u009a\u0367\3\2\2\2\u009c\u036d\3\2\2\2\u009e"+
		"\u036f\3\2\2\2\u00a0\u00a2\5\26\f\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\3\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a9\5\b\5\2\u00a7\u00a9\7\37\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\5\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\7\3\2\2"+
		"\2\u00ac\u00ad\7;\2\2\u00ad\u00af\7L\2\2\u00ae\u00b0\5\n\6\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\22\n\2"+
		"\u00b2\t\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4\u00b9\5\f\7\2\u00b5\u00b6\7"+
		" \2\2\u00b6\u00b8\5\f\7\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7#\2\2\u00bd\13\3\2\2\2\u00be\u00c1\7L\2\2\u00bf\u00c0"+
		"\7\n\2\2\u00c0\u00c2\5\16\b\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\r\3\2\2\2\u00c3\u00c8\5\64\33\2\u00c4\u00c5\7\f\2\2\u00c5\u00c7"+
		"\5\64\33\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\17\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d0"+
		"\5\64\33\2\u00cc\u00cd\7 \2\2\u00cd\u00cf\5\64\33\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\7\33\2\2\u00d4\u00d6\5\24\13"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\34\2\2"+
		"\u00db\23\3\2\2\2\u00dc\u00e3\7\37\2\2\u00dd\u00df\7\6\2\2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\5Z.\2\u00e1"+
		"\u00e3\5\26\f\2\u00e2\u00dc\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\25\3\2\2\2\u00e4\u00eb\5\30\r\2\u00e5\u00eb\5\32\16\2\u00e6"+
		"\u00eb\5 \21\2\u00e7\u00eb\5\34\17\2\u00e8\u00eb\5\36\20\2\u00e9\u00eb"+
		"\5\b\5\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\27\3\2\2"+
		"\2\u00ec\u00ef\7\b\2\2\u00ed\u00f0\5\64\33\2\u00ee\u00f0\7J\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7L"+
		"\2\2\u00f2\u00f7\5@!\2\u00f3\u00f4\7\35\2\2\u00f4\u00f6\7\36\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\5\2\2\u00fb"+
		"\u00fd\5> \2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2"+
		"\2\u00fe\u0101\5H%\2\u00ff\u0101\7\37\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\31\3\2\2\2\u0102\u0103\5\n\6\2\u0103\u0104\5\30\r\2\u0104"+
		"\33\3\2\2\2\u0105\u0106\7L\2\2\u0106\u0109\5@!\2\u0107\u0108\7\5\2\2\u0108"+
		"\u010a\5> \2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u010c\5J&\2\u010c\35\3\2\2\2\u010d\u010e\5\n\6\2\u010e\u010f"+
		"\5\34\17\2\u010f\37\3\2\2\2\u0110\u0112\5\64\33\2\u0111\u0113\5$\23\2"+
		"\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\5(\25\2\u0115\u0116\7\37\2\2\u0116!\3\2\2\2\u0117\u0119\5\6\4\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\5\64\33\2\u011e"+
		"\u0120\5$\23\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0126\5&\24\2\u0122\u0123\7 \2\2\u0123\u0125\5&\24\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\37\2\2\u012a"+
		"#\3\2\2\2\u012b\u012c\7/\2\2\u012c%\3\2\2\2\u012d\u0132\7L\2\2\u012e\u012f"+
		"\7\35\2\2\u012f\u0131\7\36\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\7\"\2\2\u0136\u0137\5.\30\2\u0137\'\3\2\2\2\u0138"+
		"\u013d\5*\26\2\u0139\u013a\7 \2\2\u013a\u013c\5*\26\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		")\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0143\5,\27\2\u0141\u0142\7\"\2\2"+
		"\u0142\u0144\5.\30\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144+\3"+
		"\2\2\2\u0145\u014a\7L\2\2\u0146\u0147\7\35\2\2\u0147\u0149\7\36\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b-\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0150\5\60\31\2\u014e\u0150"+
		"\5\u0084C\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150/\3\2\2\2\u0151"+
		"\u015d\7\33\2\2\u0152\u0157\5.\30\2\u0153\u0154\7 \2\2\u0154\u0156\5."+
		"\30\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7 "+
		"\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u0152\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\34"+
		"\2\2\u0160\61\3\2\2\2\u0161\u0162\7L\2\2\u0162\63\3\2\2\2\u0163\u0168"+
		"\5\66\34\2\u0164\u0165\7\35\2\2\u0165\u0167\7\36\2\2\u0166\u0164\3\2\2"+
		"\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0174"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0170\58\35\2\u016c\u016d\7\35\2\2"+
		"\u016d\u016f\7\36\2\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0163\3\2\2\2\u0173\u016b\3\2\2\2\u0174\65\3\2\2\2\u0175\u0177\7L\2\2"+
		"\u0176\u0178\5:\36\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0180"+
		"\3\2\2\2\u0179\u017a\7!\2\2\u017a\u017c\7L\2\2\u017b\u017d\5:\36\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\67\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\t\2\2\2\u01849\3\2\2\2\u0185"+
		"\u0186\7$\2\2\u0186\u018b\5<\37\2\u0187\u0188\7 \2\2\u0188\u018a\5<\37"+
		"\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7#\2\2\u018f"+
		";\3\2\2\2\u0190\u0197\5\64\33\2\u0191\u0194\7\13\2\2\u0192\u0193\t\3\2"+
		"\2\u0193\u0195\5\64\33\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0197=\3\2\2\2"+
		"\u0198\u019d\5L\'\2\u0199\u019a\7 \2\2\u019a\u019c\5L\'\2\u019b\u0199"+
		"\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"?\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\7\31\2\2\u01a1\u01a3\5B\"\2"+
		"\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\7\32\2\2\u01a5A\3\2\2\2\u01a6\u01ab\5D#\2\u01a7\u01a8\7 \2\2\u01a8\u01aa"+
		"\5D#\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01b0\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7 "+
		"\2\2\u01af\u01b1\5F$\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b4\5F$\2\u01b3\u01a6\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"C\3\2\2\2\u01b5\u01b6\5\64\33\2\u01b6\u01b7\5,\27\2\u01b7E\3\2\2\2\u01b8"+
		"\u01b9\5\64\33\2\u01b9\u01ba\7\16\2\2\u01ba\u01bb\5,\27\2\u01bbG\3\2\2"+
		"\2\u01bc\u01bd\5Z.\2\u01bdI\3\2\2\2\u01be\u01bf\5Z.\2\u01bfK\3\2\2\2\u01c0"+
		"\u01c5\7L\2\2\u01c1\u01c2\7!\2\2\u01c2\u01c4\7L\2\2\u01c3\u01c1\3\2\2"+
		"\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6M"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\t\4\2\2\u01c9O\3\2\2\2\u01ca"+
		"\u01cf\5R*\2\u01cb\u01cc\7 \2\2\u01cc\u01ce\5R*\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0Q\3"+
		"\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7L\2\2\u01d3\u01d4\7\"\2\2\u01d4"+
		"\u01d5\5T+\2\u01d5S\3\2\2\2\u01d6\u01d9\5\u0084C\2\u01d7\u01d9\5V,\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9U\3\2\2\2\u01da\u01e3\7\33\2\2"+
		"\u01db\u01e0\5T+\2\u01dc\u01dd\7 \2\2\u01dd\u01df\5T+\2\u01de\u01dc\3"+
		"\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\7 \2\2\u01e6\u01e5\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\34\2\2\u01e9W\3\2\2\2"+
		"\u01ea\u01eb\7=\2\2\u01eb\u01ec\5T+\2\u01ecY\3\2\2\2\u01ed\u01f1\7\33"+
		"\2\2\u01ee\u01f0\5\\/\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f4\u01f5\7\34\2\2\u01f5[\3\2\2\2\u01f6\u01fa\5^\60\2\u01f7\u01fa"+
		"\5b\62\2\u01f8\u01fa\5\4\3\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa]\3\2\2\2\u01fb\u01fc\5`\61\2\u01fc\u01fd\7\37\2\2"+
		"\u01fd_\3\2\2\2\u01fe\u0200\5\6\4\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3"+
		"\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5\64\33\2\u0202\u0203\5(\25\2\u0203"+
		"a\3\2\2\2\u0204\u0248\5Z.\2\u0205\u0206\7B\2\2\u0206\u0207\5|?\2\u0207"+
		"\u020a\5b\62\2\u0208\u0209\7?\2\2\u0209\u020b\5b\62\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u0248\3\2\2\2\u020c\u020d\7A\2\2\u020d"+
		"\u020e\7\31\2\2\u020e\u020f\5t;\2\u020f\u0210\7\32\2\2\u0210\u0211\5b"+
		"\62\2\u0211\u0248\3\2\2\2\u0212\u0213\7K\2\2\u0213\u0214\5|?\2\u0214\u0215"+
		"\5b\62\2\u0215\u0248\3\2\2\2\u0216\u0217\7>\2\2\u0217\u0218\5|?\2\u0218"+
		"\u0219\5b\62\2\u0219\u0248\3\2\2\2\u021a\u021b\7H\2\2\u021b\u021c\5|?"+
		"\2\u021c\u0220\7\33\2\2\u021d\u021f\5p9\2\u021e\u021d\3\2\2\2\u021f\u0222"+
		"\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0226\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0225\5r:\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2"+
		"\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0229\u022a\7\34\2\2\u022a\u0248\3\2\2\2\u022b\u022d\7G\2\2\u022c"+
		"\u022e\5\u0084C\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f"+
		"\3\2\2\2\u022f\u0248\7\37\2\2\u0230\u0231\7\r\2\2\u0231\u0232\5\u0084"+
		"C\2\u0232\u0233\7\37\2\2\u0233\u0248\3\2\2\2\u0234\u0236\78\2\2\u0235"+
		"\u0237\7L\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u0248\7\37\2\2\u0239\u0248\7\37\2\2\u023a\u023b\5\u0080A\2"+
		"\u023b\u023c\7\37\2\2\u023c\u0248\3\2\2\2\u023d\u023e\7L\2\2\u023e\u023f"+
		"\7\17\2\2\u023f\u0248\5b\62\2\u0240\u0248\5\"\22\2\u0241\u0242\7\4\2\2"+
		"\u0242\u0243\5|?\2\u0243\u0244\7\37\2\2\u0244\u0248\3\2\2\2\u0245\u0248"+
		"\7\7\2\2\u0246\u0248\5\30\r\2\u0247\u0204\3\2\2\2\u0247\u0205\3\2\2\2"+
		"\u0247\u020c\3\2\2\2\u0247\u0212\3\2\2\2\u0247\u0216\3\2\2\2\u0247\u021a"+
		"\3\2\2\2\u0247\u022b\3\2\2\2\u0247\u0230\3\2\2\2\u0247\u0234\3\2\2\2\u0247"+
		"\u0239\3\2\2\2\u0247\u023a\3\2\2\2\u0247\u023d\3\2\2\2\u0247\u0240\3\2"+
		"\2\2\u0247\u0241\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0246\3\2\2\2\u0248"+
		"c\3\2\2\2\u0249\u024a\7\t\2\2\u024a\u024b\7\31\2\2\u024b\u024c\5f\64\2"+
		"\u024c\u024d\7L\2\2\u024d\u024e\7\32\2\2\u024e\u024f\5Z.\2\u024fe\3\2"+
		"\2\2\u0250\u0255\5L\'\2\u0251\u0252\7\20\2\2\u0252\u0254\5L\'\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256g\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7\3\2\2\u0259\u025a"+
		"\5Z.\2\u025ai\3\2\2\2\u025b\u025c\7\31\2\2\u025c\u025e\5l\67\2\u025d\u025f"+
		"\7\37\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2"+
		"\u0260\u0261\7\32\2\2\u0261k\3\2\2\2\u0262\u0267\5n8\2\u0263\u0264\7\37"+
		"\2\2\u0264\u0266\5n8\2\u0265\u0263\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268m\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026c\5\6\4\2\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270"+
		"\u0271\5\66\34\2\u0271\u0272\5,\27\2\u0272\u0273\7\"\2\2\u0273\u0274\5"+
		"\u0084C\2\u0274o\3\2\2\2\u0275\u0277\5r:\2\u0276\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a"+
		"\u027c\5\\/\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027eq\3\2\2\2\u027f\u0280\79\2\2\u0280\u0281"+
		"\5\u0082B\2\u0281\u0282\7\17\2\2\u0282\u028a\3\2\2\2\u0283\u0284\79\2"+
		"\2\u0284\u0285\5\62\32\2\u0285\u0286\7\17\2\2\u0286\u028a\3\2\2\2\u0287"+
		"\u0288\7=\2\2\u0288\u028a\7\17\2\2\u0289\u027f\3\2\2\2\u0289\u0283\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u028as\3\2\2\2\u028b\u0298\5x=\2\u028c\u028e"+
		"\5v<\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\7\37\2\2\u0290\u0292\5\u0084C\2\u0291\u0290\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\7\37\2\2\u0294\u0296\5z>\2\u0295"+
		"\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u028b\3\2"+
		"\2\2\u0297\u028d\3\2\2\2\u0298u\3\2\2\2\u0299\u029c\5`\61\2\u029a\u029c"+
		"\5~@\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029cw\3\2\2\2\u029d\u029f"+
		"\5\6\4\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\5\64"+
		"\33\2\u02a4\u02a5\5,\27\2\u02a5\u02a6\7\17\2\2\u02a6\u02a7\5\u0084C\2"+
		"\u02a7y\3\2\2\2\u02a8\u02a9\5~@\2\u02a9{\3\2\2\2\u02aa\u02ab\7\31\2\2"+
		"\u02ab\u02ac\5\u0084C\2\u02ac\u02ad\7\32\2\2\u02ad}\3\2\2\2\u02ae\u02b3"+
		"\5\u0084C\2\u02af\u02b0\7 \2\2\u02b0\u02b2\5\u0084C\2\u02b1\u02af\3\2"+
		"\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\177\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\5\u0084C\2\u02b7\u0081\3"+
		"\2\2\2\u02b8\u02b9\5\u0084C\2\u02b9\u0083\3\2\2\2\u02ba\u02bb\bC\1\2\u02bb"+
		"\u02bc\t\5\2\2\u02bc\u02c1\5\u0084C\r\u02bd\u02c1\5\u0086D\2\u02be\u02bf"+
		"\7F\2\2\u02bf\u02c1\5\u0088E\2\u02c0\u02ba\3\2\2\2\u02c0\u02bd\3\2\2\2"+
		"\u02c0\u02be\3\2\2\2\u02c1\u02fb\3\2\2\2\u02c2\u02c3\f\f\2\2\u02c3\u02c4"+
		"\t\6\2\2\u02c4\u02fa\5\u0084C\r\u02c5\u02c6\f\13\2\2\u02c6\u02c7\t\7\2"+
		"\2\u02c7\u02fa\5\u0084C\f\u02c8\u02c9\f\n\2\2\u02c9\u02ca\t\b\2\2\u02ca"+
		"\u02fa\5\u0084C\13\u02cb\u02cc\f\b\2\2\u02cc\u02cd\t\t\2\2\u02cd\u02fa"+
		"\5\u0084C\t\u02ce\u02cf\f\7\2\2\u02cf\u02d0\7\61\2\2\u02d0\u02fa\5\u0084"+
		"C\b\u02d1\u02d2\f\6\2\2\u02d2\u02d3\7)\2\2\u02d3\u02fa\5\u0084C\7\u02d4"+
		"\u02d5\f\5\2\2\u02d5\u02d6\7*\2\2\u02d6\u02fa\5\u0084C\6\u02d7\u02d8\f"+
		"\4\2\2\u02d8\u02d9\7\13\2\2\u02d9\u02da\5\u0084C\2\u02da\u02db\7\17\2"+
		"\2\u02db\u02dc\5\u0084C\5\u02dc\u02fa\3\2\2\2\u02dd\u02de\f\3\2\2\u02de"+
		"\u02df\t\n\2\2\u02df\u02fa\5\u0084C\3\u02e0\u02e1\f\24\2\2\u02e1\u02e2"+
		"\7!\2\2\u02e2\u02fa\7L\2\2\u02e3\u02e4\f\23\2\2\u02e4\u02e5\7!\2\2\u02e5"+
		"\u02fa\7I\2\2\u02e6\u02e7\f\22\2\2\u02e7\u02e8\7!\2\2\u02e8\u02fa\5\u0092"+
		"J\2\u02e9\u02ea\f\21\2\2\u02ea\u02eb\7\35\2\2\u02eb\u02ec\5\u0084C\2\u02ec"+
		"\u02ed\7\36\2\2\u02ed\u02fa\3\2\2\2\u02ee\u02ef\f\20\2\2\u02ef\u02f1\7"+
		"\31\2\2\u02f0\u02f2\5~@\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02fa\7\32\2\2\u02f4\u02f5\f\16\2\2\u02f5\u02fa\t"+
		"\13\2\2\u02f6\u02f7\f\t\2\2\u02f7\u02f8\7C\2\2\u02f8\u02fa\5\64\33\2\u02f9"+
		"\u02c2\3\2\2\2\u02f9\u02c5\3\2\2\2\u02f9\u02c8\3\2\2\2\u02f9\u02cb\3\2"+
		"\2\2\u02f9\u02ce\3\2\2\2\u02f9\u02d1\3\2\2\2\u02f9\u02d4\3\2\2\2\u02f9"+
		"\u02d7\3\2\2\2\u02f9\u02dd\3\2\2\2\u02f9\u02e0\3\2\2\2\u02f9\u02e3\3\2"+
		"\2\2\u02f9\u02e6\3\2\2\2\u02f9\u02e9\3\2\2\2\u02f9\u02ee\3\2\2\2\u02f9"+
		"\u02f4\3\2\2\2\u02f9\u02f6\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0085\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe"+
		"\u02ff\7\31\2\2\u02ff\u0300\5\u0084C\2\u0300\u0301\7\32\2\2\u0301\u030b"+
		"\3\2\2\2\u0302\u030b\5N(\2\u0303\u030b\7L\2\2\u0304\u0308\5\u0094K\2\u0305"+
		"\u0309\5\u009cO\2\u0306\u0307\7I\2\2\u0307\u0309\5\u009eP\2\u0308\u0305"+
		"\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u02fe\3\2\2\2\u030a"+
		"\u0302\3\2\2\2\u030a\u0303\3\2\2\2\u030a\u0304\3\2\2\2\u030b\u0087\3\2"+
		"\2\2\u030c\u030d\5\u0094K\2\u030d\u030e\5\u008aF\2\u030e\u030f\5\u0090"+
		"I\2\u030f\u0316\3\2\2\2\u0310\u0313\5\u008aF\2\u0311\u0314\5\u008eH\2"+
		"\u0312\u0314\5\u0090I\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314"+
		"\u0316\3\2\2\2\u0315\u030c\3\2\2\2\u0315\u0310\3\2\2\2\u0316\u0089\3\2"+
		"\2\2\u0317\u0319\7L\2\2\u0318\u031a\5\u0096L\2\u0319\u0318\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u0322\3\2\2\2\u031b\u031c\7!\2\2\u031c\u031e\7L\2"+
		"\2\u031d\u031f\5\u0096L\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u031b\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0327\3\2\2\2\u0324\u0322\3\2\2\2\u0325"+
		"\u0327\58\35\2\u0326\u0317\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u008b\3\2"+
		"\2\2\u0328\u032a\7L\2\2\u0329\u032b\5\u0098M\2\u032a\u0329\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\5\u0090I\2\u032d\u008d"+
		"\3\2\2\2\u032e\u034a\7\35\2\2\u032f\u0334\7\36\2\2\u0330\u0331\7\35\2"+
		"\2\u0331\u0333\7\36\2\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0337\u034b\5\60\31\2\u0338\u0339\5\u0084C\2\u0339\u0340\7\36\2\2"+
		"\u033a\u033b\7\35\2\2\u033b\u033c\5\u0084C\2\u033c\u033d\7\36\2\2\u033d"+
		"\u033f\3\2\2\2\u033e\u033a\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0347\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"\u0344\7\35\2\2\u0344\u0346\7\36\2\2\u0345\u0343\3\2\2\2\u0346\u0349\3"+
		"\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034b\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u034a\u032f\3\2\2\2\u034a\u0338\3\2\2\2\u034b\u008f\3\2"+
		"\2\2\u034c\u034e\5\u009eP\2\u034d\u034f\5\22\n\2\u034e\u034d\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0091\3\2\2\2\u0350\u0351\5\u0094K\2\u0351\u0352"+
		"\5\u009cO\2\u0352\u0093\3\2\2\2\u0353\u0354\7$\2\2\u0354\u0355\5\20\t"+
		"\2\u0355\u0356\7#\2\2\u0356\u0095\3\2\2\2\u0357\u0358\7$\2\2\u0358\u035b"+
		"\7#\2\2\u0359\u035b\5:\36\2\u035a\u0357\3\2\2\2\u035a\u0359\3\2\2\2\u035b"+
		"\u0097\3\2\2\2\u035c\u035d\7$\2\2\u035d\u0360\7#\2\2\u035e\u0360\5\u0094"+
		"K\2\u035f\u035c\3\2\2\2\u035f\u035e\3\2\2\2\u0360\u0099\3\2\2\2\u0361"+
		"\u0368\5\u009eP\2\u0362\u0363\7!\2\2\u0363\u0365\7L\2\2\u0364\u0366\5"+
		"\u009eP\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2"+
		"\u0367\u0361\3\2\2\2\u0367\u0362\3\2\2\2\u0368\u009b\3\2\2\2\u0369\u036a"+
		"\7\22\2\2\u036a\u036e\5\u009aN\2\u036b\u036c\7L\2\2\u036c\u036e\5\u009e"+
		"P\2\u036d\u0369\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u009d\3\2\2\2\u036f"+
		"\u0371\7\31\2\2\u0370\u0372\5~@\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0374\7\32\2\2\u0374\u009f\3\2\2\2a\u00a3"+
		"\u00a8\u00af\u00b9\u00c1\u00c8\u00d0\u00d7\u00de\u00e2\u00ea\u00ef\u00f7"+
		"\u00fc\u0100\u0109\u0112\u011a\u011f\u0126\u0132\u013d\u0143\u014a\u014f"+
		"\u0157\u015b\u015d\u0168\u0170\u0173\u0177\u017c\u0180\u018b\u0194\u0196"+
		"\u019d\u01a2\u01ab\u01b0\u01b3\u01c5\u01cf\u01d8\u01e0\u01e3\u01e6\u01f1"+
		"\u01f9\u01ff\u020a\u0220\u0226\u022d\u0236\u0247\u0255\u025e\u0267\u026d"+
		"\u0278\u027d\u0289\u028d\u0291\u0295\u0297\u029b\u02a0\u02b3\u02c0\u02f1"+
		"\u02f9\u02fb\u0308\u030a\u0313\u0315\u0319\u031e\u0322\u0326\u032a\u0334"+
		"\u0340\u0347\u034a\u034e\u035a\u035f\u0365\u0367\u036d\u0371";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}