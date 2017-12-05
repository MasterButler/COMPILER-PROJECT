package packageA.variable;

import packageA.error.ConstantEditError;
import packageA.error.IncompatibleVariableDataTypeError;

public class Variable {
	
	//Determines the scope, or where the value is present when viewed by the interpreter
	private String varScope;
	//Determines the simple variable name when typed in the IDE
	private String varSimpleName;
	//Determines the value stored in the variable
	private Value value;
	
	
	public Variable(String varScope, String varSimpleName, Value value) throws IncompatibleVariableDataTypeError, ConstantEditError {
		this.varScope = varScope;
		this.varSimpleName = varSimpleName;
		setValue(value);
	}
	
	public Variable(String varName, Value value) throws IncompatibleVariableDataTypeError, ConstantEditError {
		int lastIndex = varName.lastIndexOf("$");
		if(lastIndex == -1) {
			this.varScope = "";
			this.varSimpleName = varName;
		}else {
			this.varScope = varName.substring(0, lastIndex);
			this.varSimpleName = varName.substring(lastIndex+1);
		}
		setValue(value);
	}
	
	//TODO some type of checking to see if datatype entered matches. If not, throw error.
	public boolean setValue(Value value) throws IncompatibleVariableDataTypeError, ConstantEditError {
		if(this.value == null) {
			this.value = value;
		}else {
			if(this.value.getType().equals("float") && value.getType().equals("int")) {
				this.value.setValue(value.getValue());
			}
			else if(this.value.getType().equals("int") && value.getType().equals("float")) {
				this.value.setValue(value.getValue());
			}
			else if(this.value.getType().equals(value.getType())) {
				this.value.setValue(value.getValue());
				return true;
			}else {
				throw new IncompatibleVariableDataTypeError(this.value.getType(), value.getType());
			}
		}
		return false;
	}
	
	/**
	 * Returns the variable type
	 * @return
	 */
	public String getVarType() {
		return value.getType();
	}
	
	public Value getValue() {
		return value;
	}
	
	/**
	 * This returns the scope concatenated with the name of the variable. Mostly used for checking if an instance
	 * of the variable has been declared elsewhere 
	 * (e.g. main$stmt4$x --> main$stmt is the scope, while x is the variable)
	 * @return varScope + "$" + varSimpleName
	 */
	public String getVarName() {
		return (new StringBuilder()).append(varScope).append("$").append(varSimpleName).toString();
	}
	
	/**
	 * Returns the simple name (e.g. String)
	 * @return
	 */
	public String getVarSimpleName() {
		return varSimpleName;
	}
	
}
