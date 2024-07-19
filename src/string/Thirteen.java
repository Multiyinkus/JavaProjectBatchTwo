package string;

public class Thirteen {

	public static void main(String[] args) {

		String str = "I love Java programming.";

		String searchstr = "Python";

		if (str.indexOf(searchstr) == -1) {

			System.out.println(searchstr + " is not found");

		} else {

			System.out.println(searchstr + " is found");

		}
		
		String pda = "sensational weytin i do for you";
		
		String pdaResult = "do";
		
		if(pda.indexOf(pdaResult)== 21) {
			
			System.out.println("Do is found within the sentences ");			
			
		}else {
			
			System.out.println("Do is not found within the sentences ");
		}

	}

}
