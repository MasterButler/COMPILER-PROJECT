package packageA.storage;

import java.util.HashMap;
import java.util.Iterator;

import packageA.error.ConstantEditError;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.variable.Function;
import packageA.variable.Variable;

public class Storage {
	private static Storage instance; 
	private HashMap<String, Variable> varList;
	private HashMap<String, Function> funcList;
	private Variable[] pointerList;
	
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
		this.pointerList = new Variable[1000];
		for(int i = 0 ; i < 1000; i++) {
			pointerList[i] = null;
		}
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
	
	public void removeVariable(String variableName) {
		varList.remove(variableName);
	}
	
	

	public Function addFunction(Function function) {
		System.out.println("ADDING THE ONE NAMED " + function.getFuncSimpleName());
		
		return funcList.put(function.getFuncSimpleName(), function);
	}
	
	public Function getFunction(String functionName) {
		return funcList.get(functionName);
	}
	
	
	
	public Variable getVariableAtAddress(int address) {
		if(pointerList[address] != null) {
			System.out.println(pointerList[address].getVarName() + " EXISTING!");
			
		}else {
			System.out.println("NEW FILE");
		}
		return pointerList[address];
	}
	
	public void setAddressVariable(int address, Variable variable) {
		try {
			if(variable == null) {
				pointerList[address] = null;
			}else {
				pointerList[address] = new Variable(variable.getScope(), variable.getVarSimpleName(), variable.getValue());
				System.out.println("SUCCESSFULLY SET ADDRESS " + address + " WITH VARIABLE " + variable.getVarName());
			}
		} catch (IncompatibleVariableDataTypeError | ConstantEditError e) {
			e.printStackTrace();
		}
	}
	
	public void releaseAddress(int address) {
		pointerList[address] = null;
	}
	
	
	public void transferVarList(HashMap<String, Variable> varList2){
		System.out.println("\t\t\t\t PUTANGINA2");
		Iterator it = varList2.entrySet().iterator();
	    while (it.hasNext()) {
	        HashMap.Entry pair = (HashMap.Entry)it.next();
	        addVariable((Variable) pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	
	public void removeVarList(HashMap<String, Variable> varList2){
		System.out.println("\t\t\t\t PUTANGINA3");
		Iterator it = varList2.entrySet().iterator();
	    while (it.hasNext()) {
	        HashMap.Entry pair = (HashMap.Entry)it.next();
	        Variable v = (Variable) pair.getValue();
	        removeVariable(v.getVarName());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
	
}
