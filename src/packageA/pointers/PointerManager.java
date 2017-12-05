package packageA.pointers;

import packageA.storage.Storage;
import packageA.variable.Variable;

public class PointerManager {
	
	public static Variable getVariableAtAddress(int address) {
		return Storage.getInstance().getVariableAtAddress(address);
	}
	
	public static void setAddress(int address, Variable variable) {
		Storage.getInstance().setAddressVariable(address, variable);
	}
	
	public static void clearAddress(int address) {
		Storage.getInstance().setAddressVariable(address, null);
	}
}
