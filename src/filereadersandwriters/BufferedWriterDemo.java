package filereadersandwriters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		File qafox = new File("Rose.txt");
		
		FileWriter fw = new FileWriter(qafox);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("When we met that day in September..");
		bw.newLine();
		bw.write("She probably go broke tryin to invest her");
		bw.newLine();
		bw.write("Had to finish out yo' last college semester");
		
		bw.flush();
		
		bw.close();
		
		System.out.println("End of this program.");

	}

}
