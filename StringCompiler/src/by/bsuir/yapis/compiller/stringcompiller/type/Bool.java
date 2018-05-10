package by.bsuir.yapis.compiller.stringcompiller.type;

public class Bool implements IElement {
	private final Boolean bool;

	public Bool(boolean b) {
		bool = new Boolean(b);
	}
	
	public Bool(String value) {
		if ("true".equals(value))
			bool = Boolean.TRUE;
		else if ("false".equals(value))
			bool = Boolean.FALSE;
		else
			bool = null;
	}

	@Override
	public Type getType() {
		return Type.BOOL;
	}

	@Override
	public String toString() {
		return bool.toString();
	}
}
