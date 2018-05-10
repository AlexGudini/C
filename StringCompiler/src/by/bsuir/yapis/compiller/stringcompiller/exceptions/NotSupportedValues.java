package by.bsuir.yapis.compiller.stringcompiller.exceptions;

import antlr.RecognitionException;

public class NotSupportedValues extends RecognitionException {
	private static final long serialVersionUID = -1853836644813326503L;

	public String info() {
		return "Those values are not supported for this operation";
	}
}
