package packageA.variable;

public class Variable {
	
	//Determines the scope, or where the value is present when viewed by the interpreter
	private String varScope;
	//Determines the simple variable name when typed in the IDE
	private String varSimpleName;
	//Determines the class of the variable
	private String varClass;
	//Determines the value stored in the variable
	private Object value;
	
	public Variable (String varClass, String varScope, String varSimpleName, Object value) {
		this(varClass, varScope, varSimpleName);
		setValue(value);
	}
	
	public Variable(String varClass, String varScope, String varSimpleName) {
		this.varScope = varScope;
		this.varSimpleName = varSimpleName;
	}
	
	public Variable(String varClass, String varName, Object value) {
		this(varClass, varName);
		setValue(value);
	}
	
	public Variable(String varClass, String varName) {
		int lastIndex = varName.lastIndexOf("$");
		this.varClass = varClass;
		if(lastIndex == -1) {
			this.varScope = "";
			this.varSimpleName = varName;
		}else {
			this.varScope = varName.substring(0, lastIndex);
			this.varSimpleName = varName.substring(lastIndex+1);
		}
	}
	
	//TODO some type of checking to see if datatype entered matches. If not, throw error.
	public void setValue(Object value) {
		this.value = value;
	}
	
	/**
	 * Returns the variable class
	 * @return
	 */
	public String getVarClass() {
		return varClass;
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
