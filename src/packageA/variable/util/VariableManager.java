package packageA.variable.util;

import packageA.collector.OutputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.ConstantEditError;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.error.MultipleVariableDeclarationError;
import packageA.error.ReferencingError;
import packageA.error.VariableNotFoundError;
import packageA.function.StringUtil;
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
	
	public static void removeVariable(String variableName) {
		Storage.getInstance().removeVariable(variableName);
	}
	
	public static boolean storeValueToVariableArray(Variable variable, int varIndex, Value value) throws ReferencingError {
		if(variable.getValue().getType().contains("[]")) {
			String type = variable.getValue().getType().substring(0, variable.getValue().getType().length()-2);
			System.out.println("TYPE OF ARR: " + type.trim());
			System.out.println("TYPE OF INP: " + value.getType());
			if(type.trim().equals(value.getType())) {
				variable.setValueArrayNoChecking(value, varIndex);
			}
		}else {
			throw new ReferencingError(variable.getVarSimpleName());
		}
		return false;
	}
	
	public static boolean storeValueToVariable(Variable variable, Value value) throws IncompatibleVariableDataTypeError, ConstantEditError {
		if(variable.setValue(value)) {
			System.out.println(variable.getVarName() + "'s value changed to " + value.getValue());
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

	public static Variable searchVariable(String varSimpleName, String varScope) throws VariableNotFoundError{
		String toSearch = "";
		Variable toEdit = null;
		
		do {
			toSearch = (new StringBuilder()).append(varScope).append("$").append(varSimpleName).toString();				
			toEdit = getVariable(toSearch);
			if(toEdit != null) {
				return toEdit;
			}
			varScope = StringUtil.scopeIncrease(varScope);
		}while(varScope.indexOf("$") != -1); 
			
		toSearch = (new StringBuilder()).append(varScope).append("$").append(varSimpleName).toString();
		toEdit = getVariable(toSearch);
		if(toEdit != null) {
			return toEdit;
		}else {
			throw new VariableNotFoundError(varSimpleName);
		}
		
	}
}
