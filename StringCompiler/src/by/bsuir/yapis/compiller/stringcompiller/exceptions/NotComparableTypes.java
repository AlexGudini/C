package by.bsuir.yapis.compiller.stringcompiller.exceptions;

import org.antlr.runtime.RecognitionException;

public class NotComparableTypes extends RecognitionException {
	public static final long serialVersionUID = -6890920101197688057L;

	public NotComparableTypes() {
		super();
	}

	public NotComparableTypes(String message) {
		System.err.println("Error " + message + " undefined type");
	}
}
