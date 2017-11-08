package packageA.variable;

import packageA.error.IncompatibleVariableDataTypeError;
import packageA.variable.util.ValueUtil;

public class Value {
	private String type;
	private Object value;
	private boolean isConstant;
	
	public Value(String type, Object value, boolean isConstant) throws IncompatibleVariableDataTypeError {
		super();
		this.type = type;
		setValue(value);
		this.isConstant = isConstant; 
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
		if(this.isConstant == false) {
			if(value != null) {
				String inferredType = ValueUtil.inferVarType(value.toString());
				if(this.type.equals(inferredType)){
					this.value = value;
				}else {
					System.out.println("CAN'T UNDERSTAND " + value.toString());
					throw new IncompatibleVariableDataTypeError(this.type, inferredType);
				}
			}
		}else {
			System.out.println("CANNOT CHANGE!");
		}
	}
	
	
}
