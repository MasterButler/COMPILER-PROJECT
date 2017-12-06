package packageA.function;

import packageA.error.DivisionByZeroError;

public class MathUtil {
	
	public static Object solve(float left, char op, float right) throws DivisionByZeroError {
		switch (op) {
			case '%': return left % right;
	        case '*': return left * right;
	        case '/':
	        	if(right != 0) {
	        		return left / right;	        		
	        	}else {
	        		throw new DivisionByZeroError();
	        	}
	        		
	        case '+': return left + right;
	        case '-': return left - right;
	        default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
}
