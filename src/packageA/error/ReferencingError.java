package packageA.error;

public class ReferencingError extends Exception{
	private String varName;
	
	public ReferencingError(String varName) {
		super("Variable " + varName + " cannot be referenced as an array.");
		this.varName = varName; 
	}
	
	public String getErrorMessage() {
		return "Variable " + varName + " cannot be referenced as an array.";
	}
}
