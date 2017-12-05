package packageA.variable;

import packageA.error.ConstantEditError;
import packageA.error.IncompatibleVariableDataTypeError;
import packageA.variable.util.ValueUtil;

public class Value {
	private String type;
	private Object value;
	private boolean isConstant;
	
	public Value(String type, Object value, boolean isConstant) throws IncompatibleVariableDataTypeError, ConstantEditError {
		super();
		this.type = type;
		if(value != null)
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
	
	public void setValue(Object value) throws IncompatibleVariableDataTypeError, ConstantEditError {
		String valueString = value.toString().replaceAll(" ", "");
		
		if(this.isConstant == false) {
			if(value != null) {
				String inferredType = ValueUtil.inferVarType(valueString);
				if(this.type.equals(inferredType)){
					this.value = valueString;
				}
				else if (this.type.equals("float") && inferredType.equals("int")){
					this.value = Float.parseFloat((String)valueString);
				}
				else if (this.type.equals("int") && inferredType.equals("float")) {
					this.value = Math.round(Float.parseFloat((String)valueString));
				}
				else if (this.type.contains("[]") && inferredType.equals("array")) {
					System.out.println("ARRAY IS LIEK THIS: " + valueString);
					valueString = valueString.substring(1, valueString.length()-1);
					System.out.println("RESULTING IS " + valueString);
					this.value = valueString;
				}
				else {
					System.out.println("CAN'T UNDERSTAND " + valueString.toString());
					throw new IncompatibleVariableDataTypeError(this.type, inferredType);
				}
			}
		}else {
			throw new ConstantEditError();
		}
	}
	
	public void setValueArrayBypassChecking(Object value) {
		this.value = value;
	}
}
