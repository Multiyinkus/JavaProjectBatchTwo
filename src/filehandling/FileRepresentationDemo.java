package filehandling;

import java.io.File;

public class FileRepresentationDemo {

	public static void main(String[] args) {

		File file1 = new File("C:\\Users\\arunm\\Downloads\\QAFox.txt");
		File file2 = new File("C:/Users/arunm/Downloads/QAFox.txt");

		File file3 = new File("Ade.txt");
		File file4 = new File("sample\\xyz.txt");//  folder\\filename

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		File file5 = new File(projectPath + "\\Ade.txt");

		File file6 = new File("C:\\QAFox\\BatchOne\\FirstJavaProject\\abc.txt");

	}

}
