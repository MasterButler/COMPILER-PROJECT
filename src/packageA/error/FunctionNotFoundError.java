package packageA.error;

public class FunctionNotFoundError extends Exception{
	private String varName;
	
	public FunctionNotFoundError(String varName) {
		super("Function " + varName + " not declared.");
		this.varName = varName; 
	}
	
	public String getErrorMessage() {
		return "Function " + varName + " not declared.";
	}
}
