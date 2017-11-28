package packageA.variable;


import packageA.collector.OutputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.error.MultipleVariableDeclarationError;
import packageA.error.VariableNotFoundError;
import packageA.function.StringUtil;
import packageA.storage.Storage;
import packageA.variable.Value;
import packageA.variable.Variable;

public class FunctionManager {
	
	public static boolean isExisting(String funcName) {
		return (getFunction(funcName) != null) ? true : false;
	}
	
	public static Function getFunction(String funcName) {
		return Storage.getInstance().getFunction(funcName);
	}
	
	public static Function addFunction(Function function) throws MultipleVariableDeclarationError {
		if(isExisting(function.getFuncSimpleName())) {
			throw new MultipleVariableDeclarationError(function.getFuncSimpleName());
		}
		return Storage.getInstance().addFunction(function);
	}
	
	/*
	
	
	
	
	public static boolean storeValueToVariable(Variable variable, Value value) throws IncompatibleVariableDataTypeError {
		if(variable.setValue(value)) {
			System.out.println(variable.getVarName() + "'s value changed to " + value.getValue());
			return true;
		}
		return false;
	}
	
	
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
	
	*/
}

