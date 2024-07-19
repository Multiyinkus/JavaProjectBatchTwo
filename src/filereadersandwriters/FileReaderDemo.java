package filereadersandwriters;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("Yinka.txt");
		FileReader fr = new FileReader(file);
		
		int a = fr.read();
		
		while(a!=-1){
			
			char c = (char)a;
			System.out.print(c);
			a = fr.read();
		}
		
		fr.close();
		

	}

}
