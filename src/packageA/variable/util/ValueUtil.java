package packageA.variable.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import packageA.JavaParser.TypeTypeContext;
import packageA.function.PatternDictionary;

public class ValueUtil {
	public static String getDataType(TypeTypeContext typeType) {
		if(typeType.dataType() != null) {
			return typeType.dataType().type.getText();
		}else if(typeType.classType() != null) {
			return "";
		}
		return null;
	}
	
	public static String inferVarType(String value) {
		System.out.println("INFERRING " + value);
		
		if(isMatch(value, PatternDictionary.INTEGER_PATTERN)) {
			System.out.println(value + " is int");
			return "int";
		}else if(isMatch(value, PatternDictionary.CHAR_PATTERN)) {
			System.out.println(value + " is char");
			return "char";
		}else if(isMatch(value,PatternDictionary.FLOAT_PATTERN)) {
			System.out.println(value + " is float");
			return "float";
		}else if(isMatch(value,PatternDictionary.BOOLEAN_PATTERN)) {
			System.out.println(value + " is boolean");
			return "boolean";
		}else if(Pattern.matches(PatternDictionary.ARRAY_PATTERN, value)) {
			System.out.println(value + " is array");
			return "array";
		}else if(isMatch(value, PatternDictionary.STRING_PATTERN)) {
			System.out.println(value + " is string");
			return "string";
		}
		return "unknown";
	}
	
	public static boolean isMatch(String value, String pattern) {
		Pattern toFollow = Pattern.compile(pattern);
		Matcher matcher = toFollow.matcher(value);
		
		return matcher.matches();
	}
}
