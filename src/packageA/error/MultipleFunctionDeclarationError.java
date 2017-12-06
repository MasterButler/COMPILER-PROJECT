package packageA.error;

import packageA.collector.OutputCollector;

public class MultipleFunctionDeclarationError extends Exception {
	private String varName;
	
	public MultipleFunctionDeclarationError(String varName) {
		super("Function " + varName + " has already been declared");
		this.varName = varName; 
		
		
	}
	
	public String getErrorMessage() {
		return("Function " + varName + " has already been declared");
	}
}
