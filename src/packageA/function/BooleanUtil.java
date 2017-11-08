package packageA.function;

public class BooleanUtil {
	
	public static boolean solve(int left, String op, int right) {
		switch (op) {
	        
			case ">": return left > right;
		
	        case ">=": return left >= right;
	        
	        case "<": return left < right;
	        
	        case "<=": return left <= right;
	        
	        case "==": return left == right;
	        
	        case "!=": return left != right;
	        
	        case "&&": return (left > 0 ? true: false) && (right > 0 ? true : false);
			
			case "||": return (left > 0 ? true: false) || (right > 0 ? true : false);
			 
	        default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
	
	public static boolean solve(boolean left, String op, boolean right) {
		switch (op) {
		
			case "&&": return left && right;
			
			case "||": return left || right;
			
		default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
}
