package filereadersandwriters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File xyzFile = new File("Ade.txt");

		FileInputStream fis = new FileInputStream(xyzFile);

		int num = fis.read();

		while (num != -1) {

			char c = (char) num;
				
			System.out.print(c);
			num = fis.read();

		}

		fis.close();
		//Day 41 video batch 1

	}

}
