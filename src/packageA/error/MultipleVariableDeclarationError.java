package packageA.error;

public class MultipleVariableDeclarationError extends Exception {
	public MultipleVariableDeclarationError() {
		super("Another variable of the same name has already been declared in the same scope");
	}
}
