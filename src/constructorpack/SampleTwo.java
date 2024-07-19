package constructorpack;

public class SampleTwo {

	public SampleTwo(String name) {
		
		System.out.println("Welcome "+name);
		
	}

	public static void main(String[] args) {

		new SampleTwo("Adeyinka Adewale"); //new is used for object creation
		new SampleTwo(8765438,6.1);
		new SampleTwo(5, 5);
	}

	public SampleTwo(int a,double b) {
		
		//double c = (a+b);
		//System.out.println(c);
		System.out.println(a+b);
	}
	
	public SampleTwo(int a,int b) {
		
		System.out.println(a+b);
	}
}
