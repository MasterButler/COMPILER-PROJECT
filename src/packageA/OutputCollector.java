package packageA;

public class OutputCollector {
	private static OutputCollector instance = null;
	
	private StringBuilder sb;
	
	public static OutputCollector getInstance() {
		if(instance == null) {
			instance = new OutputCollector();
		}
		return instance;
	}
	
	private OutputCollector() {
		reset();
	}
	
	public void reset() {
		sb = new StringBuilder();
	}
	
	public void append(String msg) {
		sb.append(msg);
	}
	
	public String getOutput() {
		return sb.toString();
	}
}
