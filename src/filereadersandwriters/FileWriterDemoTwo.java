package filereadersandwriters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemoTwo {

	public static void main(String[] args) throws IOException {
		
		File api = new File("Api.txt");
		api.createNewFile();

		FileWriter fw = new FileWriter(api);

		fw.write("When we met that day in September. \n ");
		fw.write("But, you've been gone since November\r\n" + "");
		fw.write("Had to finish out yo' last college semester");

		fw.flush();
		fw.close();

	}

}
