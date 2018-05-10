package by.bsuir.yapis.compiller.stringcompiller.type;

public class Char implements IElement {
	private Character character;

	public Char() {
		this.character = null;
	}

	public Char(Character character) {
		this.character = character;
	}

	@Override
	public Type getType() {
		return Type.CHAR;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
	
	@Override
	public String toString() {
		return character.toString();	
	}
}
