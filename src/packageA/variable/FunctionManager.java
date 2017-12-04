package packageA.variable;


import java.util.ArrayList;

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
	
	public static Function searchFunction(String funcSimpleName, String funcScope) throws VariableNotFoundError{
		String toSearch = "";
		Function toEdit = null;
		
		do {
			toSearch = (new StringBuilder()).append(funcScope).append("$").append(funcSimpleName).toString();				
			toEdit = getFunction(toSearch);
			if(toEdit != null) {
				return toEdit;
			}
			funcScope = StringUtil.scopeIncrease(funcScope);
		}while(funcScope.indexOf("$") != -1); 
			
		toSearch = (new StringBuilder()).append(funcScope).append("$").append(funcSimpleName).toString();
		toEdit = getFunction(toSearch);
		if(toEdit != null) {
			return toEdit;
		}else {
			throw new VariableNotFoundError(funcSimpleName);		
		}
		
	}
	
	public static void setParam(int index, Value value, String funcSimpleName){
		Function f = getFunction(funcSimpleName);
		
		f.setFuncParameter(index, value);		
	}
	
	public static ArrayList getParam(String funcSimpleName){
		Function f = getFunction(funcSimpleName);
		return f.getFuncParameter();
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

