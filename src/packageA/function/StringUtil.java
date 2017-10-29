package packageA.function;

public class StringUtil {

	private static final String[] DETECT = {"\\\\n", "\\\\t"};
	private static final String[] APPEND = {System.getProperty("line.separator"), "\t"};
	
	public static String constructStringFromPrintStatement(String s) {
		String[] toPrint = s.split("\\+");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < toPrint.length; i++) {
			String toEnter = toPrint[i];
			
			if(toEnter.startsWith("\"") && toEnter.endsWith("\"")) {
				toEnter = toEnter.substring(1, toEnter.length()-1);
			}
		
			for(int j = 0; j < DETECT.length; j++) {
				 toEnter = constructEscapedString(toEnter, j);
			}
			
			sb.append(toEnter);
		}
		return sb.toString();
	}

	public static String constructEscapedString(String s, int formatNo) {
		return s.replaceAll(DETECT[formatNo], APPEND[formatNo]);
	}
}
