package packageA;

import packageA.variable.util.*;
import packageA.variable.*;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import packageA.JavaParser.BaseDeclarationContext;
import packageA.JavaParser.DataTypeContext;
import packageA.JavaParser.ExpressionContext;
import packageA.JavaParser.ExpressionListContext;
import packageA.JavaParser.FieldDeclarationContext;
import packageA.JavaParser.LocalVariableDeclarationContext;
import packageA.JavaParser.LocalVariableDeclarationStatementContext;
import packageA.JavaParser.MethodBodyContext;
import packageA.JavaParser.MethodDeclarationContext;
import packageA.JavaParser.SetStatementContext;
import packageA.JavaParser.StatementContext;
import packageA.JavaParser.TypeTypeContext;
import packageA.JavaParser.VariableDeclaratorContext;
import packageA.JavaParser.VariableDeclaratorIdContext;
import packageA.JavaParser.VariableInitializerContext;
import packageA.collector.OutputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.error.MultipleVariableDeclarationError;
import packageA.function.FunctionDictionary;
import packageA.function.StringUtil;

public class MyVisitor extends JavaBaseVisitor<Void> {

	public static final String REFERENCE_STATEMENT_CONTEXT = "stmt";
	public static final String REFERENCE_SET_STATEMENT_CONTEXT = "set_stmt";
	
	private JavaLexer lexer;
	private CommonTokenStream tokens;
	private JavaBaseErrorListener javaErrorListener;
	private ANTLRErrorStrategy defaultStrat;
	private JavaParser parser;
	private ParseTree tree;
	
	String tempType = "";
	
	ArrayList <MethodDeclarationContext> methodList = new ArrayList<MethodDeclarationContext> ();
	
    public String visit(String userInput) {
    	StringBuilder sb = new StringBuilder("");
    	
    	lexer = new JavaLexer(CharStreams.fromString(userInput));
        
        tokens = new CommonTokenStream(lexer);
        
        javaErrorListener = new JavaBaseErrorListener();
        SyntaxErrorCollector.getInstance().reset();
        
        defaultStrat = new DefaultErrorStrategy();
        
        parser = new JavaParser(tokens);
        parser.addErrorListener(javaErrorListener);
        parser.setErrorHandler(defaultStrat);
        
        tree = parser.code();
        
        System.out.println("IN CONSOLE");
        System.out.println(tree.toString());
        
        Token curr = lexer.getToken();
        sb.append(curr.getText())
    	.append(" | ")
    	.append(JavaLexer.VOCABULARY.getSymbolicName(curr.getType()))
    	.append(System.getProperty("line.separator"));
        
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
        	System.out.println("COUNT");
            sb.append(token.getText())
            	.append(" | ")
            	.append(JavaLexer.VOCABULARY.getSymbolicName(token.getType()))
            	.append(System.getProperty("line.separator"));
        }
        
        MyVisitor visitor = new MyVisitor();
        
        System.out.println("START\n");
        
        visitor.visit(tree);
        
        System.out.println("\nEND");
        	    
        System.out.println(sb);
        return sb.toString();
    }

    public JavaLexer getLexer() {
		return lexer;
	}

	public void setLexer(JavaLexer lexer) {
		this.lexer = lexer;
	}

	public CommonTokenStream getTokens() {
		return tokens;
	}

	public void setTokens(CommonTokenStream tokens) {
		this.tokens = tokens;
	}

	public JavaBaseErrorListener getJavaErrorListener() {
		return javaErrorListener;
	}

	public void setJavaErrorListener(JavaBaseErrorListener javaErrorListener) {
		this.javaErrorListener = javaErrorListener;
	}

	public ANTLRErrorStrategy getDefaultStrat() {
		return defaultStrat;
	}

	public void setDefaultStrat(ANTLRErrorStrategy defaultStrat) {
		this.defaultStrat = defaultStrat;
	}

	public JavaParser getParser() {
		return parser;
	}

	public void setParser(JavaParser parser) {
		this.parser = parser;
	}

	public ParseTree getTree() {
		return tree;
	}

	public void setTree(ParseTree tree) {
		this.tree = tree;
	}

	@Override
    public Void visitStatement(StatementContext ctx) {
    	return super.visitStatement(ctx);
    }
	
	public static String getDataType(TypeTypeContext typeType) {
		return null;
	}
	
	@Override
	public Void visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		int total = ctx.getChildCount();
		
		String varType = ValueUtil.getDataType(ctx.typeType()); 
		String varSimpleName = ctx.variableDeclarator().varName.getText();
		String varValue = null;
		String varValueType = null;
		if(ctx.variableDeclarator().varValue != null) {
			varValue = ctx.variableDeclarator().varValue.getText();
		}
		
		Variable toStore = null;
		try {
			toStore = new Variable(constructVariableScope(ctx), varSimpleName, new Value(varType, varValue));
			VariableManager.addVariable(toStore);
		} catch (MultipleVariableDeclarationError e) {
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new MultipleVariableDeclarationError(toStore.getVarSimpleName()).getErrorMessage());
			e.printStackTrace();
		} catch( IncompatibleVariableDataTypeError e) {
			System.out.println("HEH");
			SyntaxErrorCollector.getInstance().recordError(ctx.start.getLine(), ctx.start.getCharPositionInLine(), new IncompatibleVariableDataTypeError(varType, ValueUtil.inferVarType(ctx.variableDeclarator().varValue.getText())).getErrorMessage());
			e.printStackTrace();
		}
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println(varType);
//		System.out.println(varSimpleName);
//		System.out.println(varValue);
//		System.out.println(constructVariableScope(ctx));
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		for(int i = 0; i < total; i++) {
//			System.out.println(i + ": " + ctx.getChild(i).getText());
//		}
//		System.out.println();
//		System.out.println();
		
		return super.visitLocalVariableDeclaration(ctx);
	}

	@Override
	public Void visitVariableInitializer(VariableInitializerContext ctx) {
//		System.out.println("here at variable initializer");
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableInitializer(ctx);
	}
	
	
	
	@Override
	public Void visitVariableDeclarator(VariableDeclaratorContext ctx) {
//		System.out.println("here at variable declarator with context" + ctx.getText());
//		
//		if(ctx.getChildCount() >=2)
//			VariableManager.addVariable(new Variable(tempType, "idk", ctx.getChild(0).getText(), ctx.getChild(2).getText()));
//		else
//			VariableManager.addVariable(new Variable(tempType, "idk", ctx.getChild(0).getText()));
//		
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableDeclarator(ctx);
	}
	
	
	
	@Override
	public Void visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		System.out.println("here at variable id");
		
		
//	
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitVariableDeclaratorId(ctx);
	}
	
	@Override
	public Void visitDataType(DataTypeContext ctx) {
//		System.out.println("here at variable datatype");
//		tempType = ctx.getChild(0).getText();
//		
//		for(int j=0; j<ctx.getChildCount() ;j++)
//    		System.out.println(j + " : " + ctx.getChild(j).getText());
		return super.visitDataType(ctx);
	}
	
	
	@Override
	public Void visitFieldDeclaration(FieldDeclarationContext ctx) {
		int total = ctx.getChildCount();
		
		for(int i = 0; i < total; i++) {
			System.out.println(ctx.getChild(i).getText());
		}
		System.out.println();
		System.out.println();
		
//		System.out.println("\n\n");
//		if(! ctx.getChild(2).getText().equals("main")){
//			System.out.println("return: " + ctx.getChild(1).getText());
//			System.out.println("name: " + ctx.getChild(2).getText());
//			System.out.println("param: " + ctx.getChild(3).getText());
//			System.out.println("content: " + ctx.getChild(4).getText());
//			
////			methodList.add(ctx);
//		}
//		
//		for(int i=0; i<methodList.size(); i++)
//			System.out.println("name: " + methodList.get(i).getChild(2).getText());
		
		
		return super.visitFieldDeclaration(ctx);
	}
	
	@Override
	public Void visitMethodDeclaration(MethodDeclarationContext ctx) {
		return super.visitMethodDeclaration(ctx);
	}
	
	
	
	
	
	@Override
	public Void visitExpression(ExpressionContext ctx) {
		
		
//		System.out.println();
//		System.out.println("EXPRESSION START");
//		System.out.println();
		
		int total = ctx.getChildCount();
		for(int i = 0; i < total; i++) {
			
			switch(ctx.getChild(i).getText()) {
				case FunctionDictionary.FUNCTION_PRINT:
					if(i+2 < ctx.getChildCount()) {
						//System.out.println("ADDING " + ctx.getChild(i+2).getText());
						OutputCollector.getInstance().append((StringUtil.constructStringFromPrintStatement(ctx.getChild(i+2).getText())));	
					}
					break;
                case FunctionDictionary.FUNCTION_SCAN:
                	System.out.println("SCANNING");
                	if(i + 2 < ctx.getChildCount() && ctx.getChild(i+2).getClass().getSimpleName().equals(ExpressionListContext.class.getSimpleName())){
                		
                		String varScope = constructVariableScope(ctx);
                		String varName = varScope + "$" + ctx.getChild(i+2).getChild(0).getText();
                		System.out.println("SCAN SAYS: Scope of given variable is at " + varScope);
                		System.out.println("SCAN SAYS: Entering value entered at variable " + varName);
//                		InputCollector.getInstance().store(, ctx.getChild(i+2).getChild(2).getText());
                	}
                    break;
//                case FunctionDictionary.FUNCTION_FOR_LOOP:
//                	System.out.println();
//                	for(int j=0; j<ctx.getChildCount() ;j++)
//                		System.out.println(j + " : " + ctx.getChild(j));
//                		
//                	break;
                default: System.out.println("DEFAULT " + i + " : " + ctx.getChild(i).getText() + " \t|\t " + ctx.getChild(i).getClass().getSimpleName()); 
			}
		}
		
//		System.out.println();
//		System.out.println("EXPRESSION END");
//		System.out.println();
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}
	
	
	public String constructVariableScope(ParserRuleContext ctx) {
		System.out.println("here at var scope");
		ParserRuleContext parentFinder;
		StringBuilder varName = new StringBuilder();
		parentFinder = ctx.getParent();
		do {
			parentFinder = parentFinder.getParent();
			if(parentFinder.getClass().getSimpleName().equals(MethodDeclarationContext.class.getSimpleName())) {
				varName.append(new StringBuffer(parentFinder.getChild(2).getText()).reverse().toString()).append('$');
//			}else if(parentFinder.getClass().getSimpleName().equals(SetStatementContext.class.getSimpleName())) {
//				varName.append(new StringBuffer(REFERENCE_SET_STATEMENT_CONTEXT+parentFinder.getParent().children.indexOf(parentFinder)).reverse().toString()).append('$');
			}else if(parentFinder.getClass().getSimpleName().equals(StatementContext.class.getSimpleName())) {
				varName.append(new StringBuffer(REFERENCE_STATEMENT_CONTEXT+parentFinder.getParent().children.indexOf(parentFinder)).reverse().toString()).append('$');
			}
		}while(!parentFinder.getClass().getSimpleName().equals(BaseDeclarationContext.class.getSimpleName()));
		
		return new StringBuffer(varName.toString()).reverse().toString().substring(1, varName.length());
	}
	
	public String constructVariableName(ParserRuleContext ctx, String simpleName) {
		return (new StringBuilder()).append(constructVariableScope(ctx)).append("$").append(simpleName).toString();
	}
}