package packageA;
import org.antlr.runtime.*;

public class ANTLRDemo {
    public static void main(String[] args) throws Exception {
    	String[] arg0 = { "-visitor", "C:\\Users\\rafe0\\OneDrive\\Documents\\COMPILER-PROJECT\\src\\packageA\\Java.g4", "-package", "packageA" };
        org.antlr.v4.Tool.main(arg0);
    }
}