package by.bsuir.yapis.compiller.stringcompiller.type;

import java.util.ArrayList;

public class Name {
	private String idtf;
	private String type;
	private int lineDeclaration;
	private ArrayList<Integer> linesUses = new ArrayList<Integer>();

	public Name(String idtf, String type, int line) {
		this.idtf = idtf;
		this.type = type;
		this.lineDeclaration = line;
		System.out.println("idtf : " + idtf + " : type : " + type + " : line : " + line);
	}

	public void addLineUses(int line) {
		linesUses.add(new Integer(line));
		System.out.println("addLineUses : " + line);
	}

	public String getIdtf() {
		System.out.println("getIdtf : " + idtf);
		return idtf;
	}

	public void setIdtf(String idtf) {
		this.idtf = idtf;
		System.out.println("setIdtf : " + idtf);
	}

	public String toString() {
		return idtf + ", " + type + ", " + lineDeclaration + ", "
				+ (((linesUses.isEmpty()) ? "not uses" : linesUses));
	}

	public String getType() {
		return type;
	}
}
