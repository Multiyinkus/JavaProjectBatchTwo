package filehandling;

import java.io.File;

public class CheckingExistanceOfFolders {

	public static void main(String[] args) {

		File folder = new File("Yinka");

		if (folder.exists()) {

			System.out.println("Folder exists, hence not created");

		} else {

			folder.mkdir();
			System.out.println("Folder does not exist, therefore folder is created");
		}

		System.out.println("End of the program");
		
		File folder2 = new File("Emily");
		
		if(folder2.exists()) {
			
			System.out.println("Folder2 existed, hence not created");
			
		}else {
			
			folder2.mkdir();
			System.out.println("Folder2 does not existed, hence folder created");
			
		}
		
		System.out.println("End of program 2");

	}

}
