package overloadingpack.method;

public class Demo {

	public static void main(String[] args) {

		Calculation calc = new Calculation();// new is used for object creation while calc is the object reference

		// calc.add();
		// calc.add(5);
		// calc.add(5.5);
		// calc.add(5,4);
		// calc.add(5,5.5);
		// calc.add(5.5,5.5);
		calc.add(5.5, 4);

		String str = "Arun Motoori";
//		
//		String res1 = str.substring(1);
//		System.out.println(res1); run Motoori|
//		
//		String res2 = str.substring(1,4);
//		System.out.println(res2);//run
		
		String res3= str.substring(5, 12);
		System.out.println(res3);//Motoori

	}

}
