package packageA.collector;

import java.util.ArrayList;

public class StandardInputCollector {
	private static StandardInputCollector instance;
	private ArrayList<ArrayList<String>> stdinList;
	
	public static StandardInputCollector getInstance() {
		if(instance == null) {
			instance = new  StandardInputCollector();
		}
		return instance;
	}
	
	private StandardInputCollector(){
		reset();
	}
	
	public void reset() {
		stdinList = new ArrayList<ArrayList<String>>();
	}
	
	public boolean recordInput(ArrayList<ArrayList<String>> in) {
		return stdinList.addAll(in);
	}
	
	public String getNext() {
		while(stdinList.get(0).get(0).trim().equals("")) {
			stdinList.get(0).remove(0);
		}
		System.out.println(stdinList.get(0));
		return stdinList.get(0).remove(0);
	}
	
	public String getNextLine() {
		ArrayList<String> toInput = stdinList.remove(0);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < toInput.size(); i++) {
			sb.append(toInput.get(i) + " ");
		}
		return sb.toString().trim();
	}
}
