package by.bsuir.yapis.compiller.stringcompiller.type;

public class EString implements IElement {
	private String string;
	
	@Override
	public Type getType() {
		return Type.STRING;
	}

	public EString() {
		this.string = new String();
	}
	
	public EString(String string) {
		this.string = string;
	}
	
	public int length() {
		return string.length();
	}
	
	public EString concat(EString str) {
		return new EString(string.concat(str.toString()));
	}

	public void setString(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return string;
	}
}
