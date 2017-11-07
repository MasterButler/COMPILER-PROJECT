package packageA.function;

public class OperationUtil {
	public static final String INTEGER_FORMAT = "INTEGER";
	public static final String STRING_FORMAT = "STRING";
	public static final String FLOAT_FORMAT = "";
	public static final String DOUBLE_FORMAT = "";
	
	public static Object solve(int left, char op, int right) {
		switch (op) {
	        case '*': return left * right;
	        case '/': return left / right;
	        case '+': return left + right;
	        case '-': return left - right;
	        default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
	
	
	public static String identifyLiteralType(Object obj) {
		
		try {
			Integer.valueOf(obj.toString());
			return "Integer";
		}catch(NumberFormatException e){
			
		}
		return "unidentified";
	}
}
