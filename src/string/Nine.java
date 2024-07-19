package string;

public class Nine {

	public static void main(String[] args) {
		String str = "Arun Motoori";

		String substr = str.substring(5, 9);

		System.out.println(substr);

		// Try another variation of substring(int beginIndex) as an assignment
		
		String name = "Adeyinka";
		String subname = name.substring(3);
		System.out.println(subname);
		
		String first = "Adewale";
		String subFirst = first.substring(4);
		System.out.println(subFirst);

	}

}
