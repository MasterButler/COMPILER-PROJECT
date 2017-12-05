package packageA;

import java.util.regex.Pattern;

import packageA.function.PatternDictionary;
import packageA.function.StringUtil;

public class Driver {
	public static void main(String[] args) {
		String text ="Hello\\tWorld";
		String a = StringUtil.constructEscapedString(text, 1);
		System.out.println(a);
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		System.out.println(sb.toString());
		System.out.println(text.contains("\\t"));
		System.out.println(text.split("\\\\t")[0]);
		
		System.out.println();
		System.out.println(StringUtil.constructEscapedString("HelloWorld\t", 1));
		System.out.println(StringUtil.constructEscapedString("\tHelloWorld", 1));
		
		//System.out.println(PatternDictionary.ARRAY_PATTERN);
		System.out.println(Pattern.matches(PatternDictionary.ARRAY_PATTERN, "[a,b,c]"));
	}
}
