package packageA.function;

public class PatternDictionary {
	public static String FLOAT_PATTERN = "(-?[0-9]+)\\.[0-9]+";
	public static String INTEGER_PATTERN = "(-?[0-9]+)";
	
	public static String CHAR_PATTERN = "\'.\'"; 
	public static String STRING_PATTERN = "\"(.)+\"";
	
	public static String BOOLEAN_PATTERN = "(true)|(false)";

	public static String ARRAY_PATTERN = "\\[(.\\,)*.\\]";
}
