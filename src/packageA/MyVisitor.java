package packageA;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import packageA.JavaParser.StatementContext;

public class MyVisitor extends JavaBaseVisitor<Void> {

    public String visit(String userInput) {
    	StringBuilder sb = new StringBuilder("");
    	
    	ANTLRInputStream input = new ANTLRInputStream(userInput);
        JavaLexer lexer = new JavaLexer(input);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        JavaBaseErrorListener javaErrorListener = new JavaBaseErrorListener();
        SyntaxErrorCollector.getInstance().reset();
        
        JavaParser parser = new JavaParser(tokens);
        parser.addErrorListener(javaErrorListener);
        
        ParseTree tree = parser.code();
        
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            sb.append(token.getText())
            	.append(" | ")
            	.append(JavaLexer.VOCABULARY.getSymbolicName(token.getType()))
            	.append(System.getProperty("line.separator"));
        }
        
        MyVisitor visitor = new MyVisitor(); 
        visitor.visit(tree);
        	
        return sb.toString();
    }
    

/*  
            @Override
            public void recover(Parser recognizer, RecognitionException e) {
                for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
                    context.exception = e;
                }

                throw new ParseCancellationException(e);
            }


            @Override
            public Token recoverInline(Parser recognizer)
                throws RecognitionException
            {
                InputMismatchException e = new InputMismatchException(recognizer);
                for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
                    context.exception = e;
                }

                throw new ParseCancellationException(e);
            }
        });
*/
    

    /**
     * some attribute comment
     */
    private String  someAttribute;
    
    @Override
    public Void visitStatement(StatementContext ctx) {
    	return super.visitStatement(ctx);
    }
}