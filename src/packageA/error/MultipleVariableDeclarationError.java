package packageA.error;

public class MultipleVariableDeclarationError extends Exception {
	private String varName;
	
	public MultipleVariableDeclarationError(String varName) {
		super("Another variable " + varName + " has already been declared in the same scope");
		this.varName = varName; 
	}
	
	public String getErrorMessage() {
		return "Another variable " + varName + " has already been declared in the same scope";
	}
}
