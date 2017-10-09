package packageA;

import java.io.FileInputStream;
import java.io.IOException;

import packageA.JavaParser.MethodDeclarationContext;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MyVisitor extends JavaBaseVisitor<Void> {

    /**
     * Main Method
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("C:\\\\Users\\\\Winfred Villaluna\\\\Documents\\\\SE Workspace\\\\ANTLR JAVA Project\\\\src\\\\packageA\\\\MyVisitor.java")); // we'll
                                                                                                                                                    // parse
                                                                                                                                                    // this
                                                                                                                                                    // file
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // see the grammar ->
                                                    // starting point for
                                                    // parsing a java file



        MyVisitor visitor = new MyVisitor(); // extends JavaBaseVisitor<Void>
                                                // and overrides the methods
                                                // you're interested
        visitor.visit(tree);
    }

    /**
     * some attribute comment
     */
    private String  someAttribute;

    @Override
    public Void visitMethodDeclaration(MethodDeclarationContext ctx) {
        System.out.println("Method name:" + ctx.getText());
        return super.visitMethodDeclaration(ctx);
    }

}