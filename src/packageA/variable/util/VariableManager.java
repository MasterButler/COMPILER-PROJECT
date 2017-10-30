package packageA.variable.util;

import packageA.collector.OutputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.MultipleVariableDeclarationError;
import packageA.storage.Storage;
import packageA.variable.Variable;

public class VariableManager {
	
	public static boolean isExisting(String variableName) {
		return (getVariable(variableName) != null) ? true : false;
	}
	
	public static Variable getVariable(String variableName) {
		return Storage.getInstance().getVariable(variableName);
	}
	
	/**
	 * The proper way of adding a variable. Checks if the variable is already existing within the scope at which the variable is placed 
	 * @param variable
	 * @return variable if adding was successful, otherwise, null 
	 */
	public static Variable addVariable(Variable variable) {
		if(!isExisting(variable.getVarName())) {
			return Storage.getInstance().addVariable(variable);
		}else {
			SyntaxErrorCollector.getInstance().recordError(-1, -1, "Another instance of the " + variable.getVarSimpleName() + " has been declared its respective scope.");
		}
		return null;
	}
}
