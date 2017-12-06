package packageA.error;


public class IncompatibleReturnTypeError extends Exception{
	private String varName;
	
	public IncompatibleReturnTypeError(String varName) {
		super("Type " + varName + " not compatible.");
		this.varName = varName; 
	}
	
	public String getErrorMessage() {
		return "Type " + varName + " not compatible.";
	}
}
