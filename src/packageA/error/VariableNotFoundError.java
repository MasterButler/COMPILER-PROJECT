package packageA.error;

public class VariableNotFoundError extends Exception{
	private String varName;
	
	public VariableNotFoundError(String varName) {
		super("Variable " + varName + " not declared within this scope.");
		this.varName = varName; 
	}
	
	public String getErrorMessage() {
		return "Variable " + varName + " not declared within this scope.";
	}
}
