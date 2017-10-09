package packageA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import packageA.JavaParser.StatementContext;

public class MyVisitor extends JavaBaseVisitor<Void> {

    public String visit(String userInput) {
    	ANTLRInputStream input = new ANTLRInputStream(userInput);
    	
        StringBuilder sb = new StringBuilder("");
        
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            sb.append(token.getText())
            	.append(" | ")
            	.append(JavaLexer.VOCABULARY.getSymbolicName(token.getType()))
            	.append(System.getProperty("line.separator"));
        }
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // see the grammar ->
                                                    // starting point for
                                                    // parsing a java file



        MyVisitor visitor = new MyVisitor(); // extends JavaBaseVisitor<Void>
                                                // and overrides the methods
                                                // you're interested
        visitor.visit(tree);
        
        return sb.toString();
    }

    /**
     * some attribute comment
     */
    private String  someAttribute;
    
    @Override
    public Void visitStatement(StatementContext ctx) {
    	
//    	int x=ctx.getChildCount();
//    	for(int i = 0;i < x; i++) {
//    		printChildren(ctx.getChild(i), ctx.getRuleContext().getChild(i));
//    	}
//    	
    	return super.visitStatement(ctx);
    }
    
    public void printChildren(ParseTree pt, ParseTree rt) {
    	for(int i = 0; i < pt.getChildCount(); i++) {
    		printChildren(pt.getChild(i), rt.getChild(i));
    		if(pt.getChild(i).getChildCount() == 0) {
    			System.out.println(pt.getChild(i).getText() + " --> ");
    		}
    	}
    }
}