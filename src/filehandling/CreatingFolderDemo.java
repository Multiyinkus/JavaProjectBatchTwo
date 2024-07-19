package filehandling;

import java.io.File;

public class CreatingFolderDemo {

	public static void main(String[] args) {

		File file = new File("Yinka");
		file.mkdir();
		
				/*Represent the folder
				File folder1 = new File(System.getProperty("user.dir")+"\\ArunMotoori");
				
				Creates the folder
				folder1.mkdir();*/

	}

}
