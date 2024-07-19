package filereadersandwriters;

import java.io.File;
import java.io.IOException;

public class ExerciseOne {

	public static void main(String[] args) throws IOException {

		File file = new File("Bob.txt");
		
		
		if(file.exists()) {
			
			System.out.println("file existed so not created");
		}else {
			
			file.createNewFile();
			System.out.println("File have been created");
		}
		
		if(file.exists()) {
			
			boolean a = file.delete();
			System.out.println(a);
			System.out.println("File have been deleted");
		}
		
		
		
		
		

	}

}
