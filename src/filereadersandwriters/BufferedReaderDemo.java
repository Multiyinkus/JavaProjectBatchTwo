package filereadersandwriters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		File api = new File("Rose.txt");
		
		FileReader fr = new FileReader(api);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			line = br.readLine();
			
		}
		
		//Day 40 video batch one
	
	}

}
