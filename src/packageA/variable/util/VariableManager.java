package packageA.variable.util;

import packageA.collector.OutputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.error.MultipleVariableDeclarationError;
import packageA.storage.Storage;
import packageA.variable.Value;
import packageA.variable.Variable;

public class VariableManager {
	
	public static boolean isExisting(String variableName) {
		return (getVariable(variableName) != null) ? true : false;
	}
	
	public static Variable getVariable(String variableName) {
		return Storage.getInstance().getVariable(variableName);
	}
	
	public static boolean storeValueToVariable(Variable variable, Value value) throws IncompatibleVariableDataTypeError {
		if(variable.setValue(value)) {
			return true;
		}
		return false;
	}
	
	/**
	 * The proper way of adding a variable. Checks if the variable is already existing within the scope at which the variable is placed 
	 * @param variable
	 * @return variable if adding was successful, otherwise, null 
	 * @throws MultipleVariableDeclarationError 
	 */
	public static Variable addVariable(Variable variable) throws MultipleVariableDeclarationError {
		if(isExisting(variable.getVarName())) {
			throw new MultipleVariableDeclarationError(variable.getVarSimpleName());
		}
		return Storage.getInstance().addVariable(variable);
	}
}
