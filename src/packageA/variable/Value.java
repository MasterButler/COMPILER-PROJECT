package packageA.variable;

import packageA.error.IncompatibleVariableDataTypeError;
import packageA.variable.util.ValueUtil;

public class Value {
	private String type;
	private Object value;
	
	public Value(String type, Object value) throws IncompatibleVariableDataTypeError {
		super();
		this.type = type;
		setValue(value);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) throws IncompatibleVariableDataTypeError {
		String inferredType = ValueUtil.inferVarType(value.toString());
		if(this.type.equals(inferredType)){
			this.value = value;
		}else {
			throw new IncompatibleVariableDataTypeError(this.type, inferredType);
		}
	}
	
	
}
