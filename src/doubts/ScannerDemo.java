package doubts;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		
		System.out.println("Enter any decimal number:");
		double decnum = scanner.nextDouble();
		
		System.out.println("Enter your name:");
		scanner.nextLine();
		
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.println(str);
		System.out.println(decnum);
		System.out.println(num); */
		
		//Day 39 video for batch 1
		
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String str2 = scanner2.nextLine();
		
		System.out.println("Enter any number:");
		int num2 = scanner2.nextInt();
		
		System.out.println("Enter any decimal number:");
		double decnum2 = scanner2.nextDouble();
		
				
		scanner2.close();
		
		System.out.println(str2);
		System.out.println(decnum2);
		System.out.println(num2);
		
		//When int or double comes before string an extra space of scanner2.nextLine(); is needed

	}

}
