package by.bsuir.yapis.compiller.stringcompiller.type;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class NamesTable {
	private final Map<String, Name> names = new HashMap<String, Name>();

	public boolean isExist(String name) {
		boolean rv = names.containsKey(name);
		if (!rv && name.indexOf('.') != -1)
			rv = names.containsKey(name.substring(name.indexOf('.')));
		System.out.println("rv --- " + rv);
		return rv;
	}

	public void add(Name n) {
		names.put(n.getIdtf(), n);
		System.out.println("add --- " + n);
	}

	public Name get(String n) {
		Name _n = names.get(n);
		if (_n == null) {
			try {
				_n = names.get(n.substring(n.indexOf('.')));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("ex --- _n: " + _n);
				return null;
			}
		}
		System.out.println("_n --- " + _n);
		return _n;
	}

	public int getSize() {
		System.out.println("size --- " + names.size());
		return names.size();
	}

	public void print(PrintStream out) {
		for (String idtf : names.keySet()) {
			Name n = names.get(idtf);
			out.println(n);
		}
		System.out.println("print --- ");
	}
}
