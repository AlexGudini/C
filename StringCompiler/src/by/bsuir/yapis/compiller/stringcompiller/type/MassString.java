package by.bsuir.yapis.compiller.stringcompiller.type;

public class MassString implements IElement {
	private final EString[] strings;
	
	public MassString(int size) {
		strings = new EString[size];
	}
	
	@Override
	public Type getType() {
		return Type.MASS_STRING;
	}
	
	public void setValue(int index, EString element) {
		strings[index] = element;
	}
	
	public EString getValue(int index) {
		return strings[index];
	}
}
