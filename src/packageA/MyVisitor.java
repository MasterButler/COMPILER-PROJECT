package packageA;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.gui.TreeViewer.DefaultTreeTextProvider;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;

import packageA.JavaParser.ExpressionContext;
import packageA.JavaParser.MethodDeclarationContext;
import packageA.JavaParser.StatementContext;
import packageA.function.FunctionDictionary;
import packageA.function.StringUtil;

public class MyVisitor extends JavaBaseVisitor<Void> {

	private JavaLexer lexer;
	private CommonTokenStream tokens;
	private JavaBaseErrorListener javaErrorListener;
	private ANTLRErrorStrategy defaultStrat;
	private JavaParser parser;
	private ParseTree tree;
	
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
	
	@Override
	public Void visitMethodDeclaration(MethodDeclarationContext ctx) {
		int total = ctx.getChildCount();
		for(int i = 0; i < total; i++) {
			
			System.out.println("ADDING i: " + i + " : " + ctx.getChild(i).getText());
			
		}
		return super.visitMethodDeclaration(ctx);
	}
	
	
	@Override
	public Void visitExpression(ExpressionContext ctx) {
		
		
//		System.out.println();
//		System.out.println("EXPRESSION START");
//		System.out.println();
		
		int total = ctx.getChildCount();
		for(int i = 0; i < total; i++) {
			
			System.out.println("ADDING i: " + i + " : " + ctx.getChild(i).getText());
			switch(ctx.getChild(i).getText()) {
				case FunctionDictionary.FUNCTION_PRINT:
					if(i+2 < ctx.getChildCount()) {
						//System.out.println("ADDING " + ctx.getChild(i+2).getText());
						OutputCollector.getInstance().append((StringUtil.constructStringFromPrintStatement(ctx.getChild(i+2).getText())));	
					}
				break;
				
				default: 
			}
		}
		
//		System.out.println();
//		System.out.println("EXPRESSION END");
//		System.out.println();
		// TODO Auto-generated method stub
		return super.visitExpression(ctx);
	}
}