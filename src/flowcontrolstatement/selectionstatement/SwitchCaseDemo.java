package flowcontrolstatement.selectionstatement;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		/*
		 * switch,case,break and default are the java pre-definded words needed here the
		 * purpose of the break statement will come out of the switch case once a
		 * particular case is satisfied. Different btw switch case and if else if is switch case is matching 
		 * an item while if else is a true or false scenario
		 */

		// String Fooditem = "noodles";
		String Fooditem = "pizza";

		switch (Fooditem) {

		case "pizza":
			System.out.println("Here is your pizza");
			break;
		case "noodles":
			System.out.println("Here is your noodles");
			break;
		case "pasta":
			System.out.println("Here is your pasta");
			break;
		case "sandwitch":
			System.out.println("Here is your sandwitch");
			break;
		default:
			System.out.println("we only server pizza,noodles,pasta and sandwich");

		}//// if(foodItem.equals("pizza")) {
////	System.out.println("Here is your pizza");
////}else if(foodItem.equals("noodles")) {
////	System.out.println("Here are your noodles");
////}else if(foodItem.equals("pasta")) {
////	System.out.println("Here is your pasta");
////}else if(foodItem.equals("sandwitch")) {
////	System.out.println("Here is your sandwitch");
////}else {
////	System.out.println("We only server pizza/pasta/noodles/sandwitch");
//}

		
		System.out.println("End of the program");

	}

}
