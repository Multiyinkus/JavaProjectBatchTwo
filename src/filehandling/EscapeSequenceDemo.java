package filehandling;

public class EscapeSequenceDemo {

	public static void main(String[] args) {

		String str1 = "arun\\motoori"; //arun\motoori ie \\ within a string comes out as just one \
		String str2 = "I love \"Java\" programming"; // I love "java" programming ie \" \" stands for " " within a string
		String str3 = "My name is Arun Motoori.\nI love Java programming."; //\n means to go to next page
		String str4 = "My name is Arun Motoori.\n\t\t\tI love Java programming."; 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		/*\n - Newline Character
		 * \t - Tab Character
		 * \\ -Backlash Character
		 * \" - Double quote character
		 * \' - Single quote character
		 * \b - Backspace character
		 * \r - Carriage return character
		 * \f - Form feed character
		 * */

	}

}
