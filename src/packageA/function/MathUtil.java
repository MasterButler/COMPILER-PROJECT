package packageA.function;

public class MathUtil {
	
	public static Object solve(int left, char op, int right) {
		switch (op) {
	        case '*': return left * right;
	        case '/': return left / right;
	        case '+': return left + right;
	        case '-': return left - right;
	        default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
}
