package packageA.storage;

import java.util.HashMap;

import packageA.variable.Function;
import packageA.variable.Variable;

public class Storage {
	private static Storage instance; 
	private HashMap<String, Variable> varList;
	private HashMap<String, Function> funcList;
	
	public static Storage getInstance() {
		if(instance == null) {
			instance = new Storage();
		}
		return instance;
	}
	
	private Storage() {
		reset();
	}
	
	public void reset() {
		this.varList = new HashMap<String, Variable>();
		this.funcList = new HashMap<String, Function>();
	}
	
	/**
	 * Do NOT access unless you are coming from VariableManager.java
	 * @param variable 
	 * @return variable placed in the hashmap
	 */
	public Variable addVariable(Variable variable) {
		System.out.println("ADDING THE ONE NAMED " + variable.getVarName());
		
		return varList.put(variable.getVarName(), variable);
	}
	
	public Variable getVariable(String variableName) {
		return varList.get(variableName);
	}

	public Function addFunction(Function function) {
		System.out.println("ADDING THE ONE NAMED " + function.getFuncSimpleName());
		
		return funcList.put(function.getFuncSimpleName(), function);
	}
	
	public Function getFunction(String functionName) {
		return funcList.get(functionName);
	}
}
