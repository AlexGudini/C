package by.bsuir.yapis.compiller.stringcompiller.type;

public class EInteger implements IElement {
	private int value;

	@Override
	public Type getType() {
		return Type.INT;
	}

	public EInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
