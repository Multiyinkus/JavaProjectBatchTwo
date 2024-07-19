package operatorpack;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		
		int a = 5, b = 2;
		
		System.out.println(a+b); // 7
		System.out.println(a-b); // 3
		System.out.println(a*b); //10
		System.out.println(a/b); //2
		System.out.println(a%b); //1
		
		int c = 6, d = 9;
		
		System.out.println(c++); //6 while the ++ is coming post increment operator
		System.out.println(c); //7
		System.out.println(c++); //7
		System.out.println(c++); //8
		System.out.println(++c); //10
		System.out.println(d++);  //9
		System.out.println(++d); //11
		System.out.println(c); //10
		System.out.println(d++); //11
		System.out.println(c++); //10
		
	

	}

}
