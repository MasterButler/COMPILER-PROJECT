package packageA.error;

public class ConstantEditError extends Exception{
	private String varName;
	
	public ConstantEditError(String varName) {
		super("Variable " + varName + " is constant and cannot be modified");
		this.varName = varName; 
	}
	
	public ConstantEditError() {
		// TODO Auto-generated constructor stub
	}

	public String getErrorMessage() {
		return "Variable " + varName + " is constant and cannot be modified";
	}
}
