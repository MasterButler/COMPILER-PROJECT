package packageA.variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import packageA.JavaParser.MethodBodyContext;
import packageA.JavaParser.StatementContext;
import packageA.error.ConstantEditError;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.storage.Storage;

public class Function {
	
	//Determines the scope, or where the value is present when viewed by the interpreter
	private String funcScope;
	//Determines the simple function name when typed in the IDE
	private String funcSimpleName;
	//Determines return type
	private String funcReturnType;
	//List of parameters
	private ArrayList<Variable> funcParameter = new ArrayList<Variable>();
	private HashMap<String, Variable> varList;
	private MethodBodyContext sc;
	
	
	
	//Determines the value stored in the variable
//	private Value value;
	
	public Function(String funcScope, String funcSimpleName, String funcReturnType, ArrayList <Variable> funcParameter, MethodBodyContext sc) throws IncompatibleVariableDataTypeError {
		this.funcScope = funcScope;
		this.funcSimpleName = funcSimpleName;
		this.funcReturnType = funcReturnType;
		this.funcParameter = funcParameter;
		this.sc = sc;
		this.varList = new HashMap<String, Variable>();
		
	}

	public String getFuncScope() {
		return funcScope;
	}

	public void setFuncScope(String funcScope) {
		this.funcScope = funcScope;
	}

	public String getFuncSimpleName() {
		return funcSimpleName;
	}

	public void setFuncSimpleName(String funcSimpleName) {
		this.funcSimpleName = funcSimpleName;
	}

	public String getFuncReturnType() {
		return funcReturnType;
	}

	public void setFuncReturnType(String funcReturnType) {
		this.funcReturnType = funcReturnType;
	}

	public ArrayList<Variable> getFuncParameter() {
		return funcParameter;
	}

	public void setFuncParameter(ArrayList<Variable> funcParameter) {
		this.funcParameter = funcParameter;
	}

	public MethodBodyContext getSc() {
		return sc;
	}

	public void setSc(MethodBodyContext sc) {
		this.sc = sc;
	}
	
	public int getParamIndex(String s){
		for(int i=0; i<funcParameter.size(); i++){
			if(s.equals(funcParameter.get(i).getVarSimpleName()))
				return i;
		}
		return -1;
		
	}
	
	public void setFuncParameter(int index, Object value) {
		try {
			funcParameter.get(index).getValue().setValue(value);
		} catch (IncompatibleVariableDataTypeError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConstantEditError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Variable getParam(int index){
		if(funcParameter.size() > index)
			return funcParameter.get(index);
		return null;
		
		
	}
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
	
	public void destroyVariables(){
		varList.clear();
	}
	
	public void printVariables(){
		System.out.println("\t\t\t\t PUTANGINA");
		Iterator it = varList.entrySet().iterator();
	    while (it.hasNext()) {
	        HashMap.Entry pair = (HashMap.Entry)it.next();
	        Variable v = (Variable) pair.getValue();
	        System.out.println(pair.getKey());
	        System.out.println("v: " + v.getValue().getValue().toString());
	    }
	}

	public HashMap<String, Variable> getVarList() {
		return varList;
	}

	public void setVarList(HashMap<String, Variable> varList) {
		this.varList = varList;
	}
	
	public void addValuesToStorage(){
		Storage.getInstance().transferVarList(varList);
		System.out.println("Done transfer");
		printVariables();
	}
	
	
}
