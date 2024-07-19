package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesAtFolderLocation {

	public static void main(String[] args) throws IOException {

		File folder = new File("Emily");
		
		File file = new File(folder,"Grace.txt");
		
		file.createNewFile();
		
		
		File file2 = new File("Emily","Apple.txt");
		
		file2.createNewFile();
		
		

	}

}
