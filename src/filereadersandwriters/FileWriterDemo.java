package filereadersandwriters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("Yinka.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("My name is Arun Motoori.\n");
		fw.write("I love Java programming.\n");
		fw.write("I love creating content on Software Testing and Tools.");
		
		fw.flush();
		
		fw.close();
		
		System.out.println("End of Program");
		
		
		File file2 = new File("sample\\xyz.txt");
		FileWriter fw2 = new FileWriter(file2);
		
		fw2.write("My name is Arun Motoori.\n");
		fw2.write("I love Java programming.\n");
		fw2.write("I love creating content on Software Testing and Tools.");
		
		fw2.flush();
		
		fw2.close();
		

	}

}

