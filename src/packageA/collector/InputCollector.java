package packageA.collector;

import packageA.variable.Variable;
import packageA.variable.util.VariableManager;

public class InputCollector {
	private static InputCollector instance;
	
	public static InputCollector getInstance() {
		if(instance == null) {
			instance = new InputCollector();
		}
		return instance;
	}
	
	private InputCollector() {
		reset();
	}
	
	public void reset() {
		
	}
	
	public boolean store(String variableName, Object value) {
		Variable edit = VariableManager.getVariable(variableName);
		if(edit != null) {
			if(true) {
				return true;
			}
		}
		return false;
	}
}
