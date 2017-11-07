package packageA.variable.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import packageA.JavaParser.TypeTypeContext;
import packageA.function.PatternDictionary;

public class ValueUtil {
	public static String getDataType(TypeTypeContext typeType) {
		System.out.println("CHECK");
		if(typeType.dataType() != null) {
			System.out.println("DATATYPE");
			return typeType.dataType().type.getText();
		}else if(typeType.classType() != null) {
			System.out.println("CLASSTYPE");
			return "";
		}
		return null;
	}
	
	public static String inferVarType(String value) {
		System.out.println("inferring for " + value);
		if(isMatch(value, PatternDictionary.CHAR_PATTERN)) {
			return "char";
		}else if(isMatch(value, PatternDictionary.INTEGER_PATTERN)) {
			return "int";
		}else if(isMatch(value,PatternDictionary.FLOAT_PATTERN)) {
			return "float";
		}else if(isMatch(value,PatternDictionary.BOOLEAN_PATTERN)) {
			return "boolean";
		}else if(isMatch(value, PatternDictionary.STRING_PATTERN)) {
			return "string";
		}		
		return "unknown";
	}
	
	public static boolean isMatch(String value, String pattern) {
		Pattern toFollow = Pattern.compile(pattern);
		Matcher matcher = toFollow.matcher(value);
		
		System.out.println("CHECKING " + value + " VIA " + pattern);
		
		return matcher.matches();
	}
}
