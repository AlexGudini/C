package by.bsuir.yapis.compiller.stringcompiller.exceptions;

import org.antlr.runtime.RecognitionException;

public class NotDefinedVariable extends RecognitionException {
	public static final long serialVersionUID = -4425557796263459733L;
	private final String variableId;
	private final int line;

	public NotDefinedVariable(String id, int line) {
		this.variableId = id;
		this.line = line;
	}

	public String info() {
		return "Variable " + variableId + " at line " + line
				+ " is not defined";
	}
}
