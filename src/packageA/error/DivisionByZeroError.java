package packageA.error;

public class DivisionByZeroError extends Exception{
	private String varName;
	
	public DivisionByZeroError(String varName) {
		super("Division by zero detected.");
		this.varName = varName; 
	}
	
	public DivisionByZeroError() {
		// TODO Auto-generated constructor stub
	}

	public String getErrorMessage() {
		return "Division by zero detected.";
	}
}
