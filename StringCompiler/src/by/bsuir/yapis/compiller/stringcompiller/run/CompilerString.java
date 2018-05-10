package by.bsuir.yapis.compiller.stringcompiller.run;

import static by.bsuir.yapis.compiller.stringcompiller.model.Path.ENCODING;
import static by.bsuir.yapis.compiller.stringcompiller.model.Path.FILE_OUTPUT;
import static by.bsuir.yapis.compiller.stringcompiller.model.Path.TEMPLATE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import by.bsuir.yapis.compiller.stringcompiller.grammar.StringLexer;
import by.bsuir.yapis.compiller.stringcompiller.grammar.StringParser;

public class CompilerString {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String st = in.next();
		String SOURCE = "./exampleProgram/source"
				+ (("".equals(st)) ? "0" : st) + ".txt";
		FileReader gf = new FileReader(TEMPLATE);
		StringTemplateGroup stg = new StringTemplateGroup(gf);
		gf.close();
		File file = new File(SOURCE);
		try {
			InputStream fis = new FileInputStream(file);
			ANTLRInputStream input = new ANTLRInputStream(fis);
			StringLexer lexer = new StringLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			StringParser parser = new StringParser(tokens);
			parser.setTemplateLib(stg);
			StringParser.program_return r;
			r = parser.program();
			StringTemplate output = (StringTemplate) r.getTemplate();
			System.out.println("Compilation ended");
			PrintWriter printer = new PrintWriter(FILE_OUTPUT, ENCODING);
			printer.print(output.toString());
			printer.close();
		} catch (FileNotFoundException | RecognitionException e) {
			System.err.println(e.getMessage());
		}
	}
}