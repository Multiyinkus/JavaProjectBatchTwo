package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesDemo {

	public static void main(String[] args) throws IOException {

		//File file = new File("Yinka.txt");
		//file.createNewFile();
		
		//Dynamically getting the path of the project
		 String projectLocator = System.getProperty("user.dir");
		 System.out.println(projectLocator);

	}

}
