package by.bsuir.yapis.compiller.stringcompiller.operations;

import by.bsuir.yapis.compiller.stringcompiller.exceptions.NotComparableTypes;
import by.bsuir.yapis.compiller.stringcompiller.type.CompareType;
import by.bsuir.yapis.compiller.stringcompiller.type.EInteger;
import by.bsuir.yapis.compiller.stringcompiller.type.EString;
import by.bsuir.yapis.compiller.stringcompiller.type.IElement;
import by.bsuir.yapis.compiller.stringcompiller.type.Type;

public class Operation {
	public static IElement plus(IElement e1, IElement e2) {
		if (e1.getType() == Type.STRING && e2.getType() == Type.STRING)
			return new EString(e1.toString() + e2.toString());
		else if (e1.getType() == Type.CHAR && e2.getType() == Type.CHAR)
			return new EString(e1.toString() + e2.toString());
		else
			return null;
	}

	public static IElement minus(IElement e1, IElement e2) {
		if (e1.getType() == Type.STRING && e2.getType() == Type.STRING)
			return new EString(minusString(e1.toString(), e2.toString()));
		return null;
	}

	private static String minusString(String strA, String strB) {
		if (strA.length() < strB.length())
			return new String(strA.toCharArray());
		else {
			char[] a = strA.toCharArray();
			char[] b = strB.toCharArray();
			int i = a.length - 1;
			int j = b.length - 1;
			if (j == -1)
				return new String(strA.toCharArray());
			else {
				while (j > 0)
					if ((a[--i] != b[--j]))
						return new String(a);
				return new String(a, 0, i);
			}
		}
	}

	public static IElement concat(IElement e, IElement e1) {
		if (e.getType() == Type.STRING)
			if (e1.getType() == Type.STRING) {
				EString d1 = (EString) e;
				EString d2 = (EString) e1;
				return d1.concat(d2);
			}
		return null;
	}

	public static IElement length(IElement e) {
		if (e.getType() == Type.STRING)
			return new EInteger(e.toString().length());
		return null;
	}

	public static boolean compare(IElement e1, IElement e2, CompareType t)
			throws NotComparableTypes {
		if (e1.getType() == Type.INT && e2.getType() == Type.INT) {
			EInteger d1 = (EInteger) e1;
			EInteger d2 = (EInteger) e2;
			switch (t) {
			case LESS:
				return d1.getValue() < d2.getValue();
			case GR:
				return d1.getValue() > d2.getValue();
			case EQ:
				return d1.getValue() == d2.getValue();
			case NOT_EQ:
				return d1.getValue() != d2.getValue();
			}
		} else
			new NotComparableTypes();
		return false;
	}

	public static void print(IElement e) {
		System.out.println(e.toString());
	}
	
	public static boolean isEmpty(IElement e) {
		if (e.getType() == Type.STRING && e.getType() == Type.STRING)
			return e.toString().isEmpty();
		return false;
	}
}
