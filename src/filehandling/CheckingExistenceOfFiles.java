package filehandling;

import java.io.File;
import java.io.IOException;

public class CheckingExistenceOfFiles {

	public static void main(String[] args) throws IOException {

		File file = new File("Ade.txt");

		if (file.exists()) {

			System.out.println("File already existed, Hence not created");

		} else {

			file.createNewFile();
			System.out.println("File does not exist, Hence file have been created");

		}

		File file2 = new File("Wale.txt");

		if (file2.exists()) {

			System.out.println("File2 already existed, Hence not created");
		} else {

			file2.createNewFile();
			System.out.println("File2 does not existed, Hence new file created");

		}

	}

}
