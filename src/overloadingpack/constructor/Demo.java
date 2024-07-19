package overloadingpack.constructor;

public class Demo {

	public static void main(String[] args) {
		
		
		new Calc(); // new is for object creation
		new Calc(5);
		new Calc(5.5);
		new Calc(5,4);
		new Calc(5,5.5);
		new Calc(5.5,5);
		new Calc(5.5,5.5);
		
//		File file = new File("abc.txt");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
		

	}

}
