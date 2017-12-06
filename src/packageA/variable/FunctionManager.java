package packageA.variable;


import java.util.ArrayList;

import packageA.collector.OutputCollector;
import packageA.collector.SyntaxErrorCollector;
import packageA.error.FunctionNotFoundError;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.error.MultipleFunctionDeclarationError;
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
	
	public static Function addFunction(Function function) throws MultipleFunctionDeclarationError {
		if(isExisting(function.getFuncSimpleName())) {
			throw new MultipleFunctionDeclarationError(function.getFuncSimpleName());
		}
		return Storage.getInstance().addFunction(function);
	}
	
	public static Function searchFunction(String funcSimpleName, String funcScope) throws FunctionNotFoundError{
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
			throw new FunctionNotFoundError(funcSimpleName);		
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
}

