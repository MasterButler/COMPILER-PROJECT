package packageA.error;

public class IncompatibleVariableDataTypeError extends Exception {
	private String givenDataType;
	private String varDataType;
	
	public IncompatibleVariableDataTypeError(String varDataType, String givenDataType) {
		super("Type " + givenDataType + " cannot be casted to type " + varDataType + ".");
		this.givenDataType = givenDataType;
		this.varDataType = varDataType;
	}
	
	public String getErrorMessage() {
		return "Type " + givenDataType + " cannot be casted to type " + varDataType + ".";
	}
	
}
	