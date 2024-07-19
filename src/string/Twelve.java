package string;

public class Twelve {

	public static void main(String[] args) {

		String str = "My name is Arun Motoori";

		int indexPosition = str.indexOf("Arun");

		System.out.println(indexPosition);

		int iPosition = str.indexOf("Varun");

		System.out.println(iPosition);
		
		String pda = "sensational weytin i do for you";
		
		int pdaIndex = pda.indexOf("weytin");
		
		System.out.println(pdaIndex);//12
		
		int pdaIndex2 = pda.indexOf("do");
		
		System.out.println(pdaIndex2);//21

	}

}
