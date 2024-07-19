package filereadersandwriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File adeFile = new File("Ade.txt");
		
		PrintWriter pw = new PrintWriter(adeFile);
		
		pw.println("My name is Adeyinka Adewale");
		pw.println("I Love Java Program");
		pw.println("I believe am getiing to love Selenium as well");
		
		pw.flush();
		
		pw.close();
		
		System.out.println("End of the program");

	}

}
