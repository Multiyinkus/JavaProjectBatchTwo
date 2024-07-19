package abstractmodifierdemo;

public abstract class Sample {
	
	public void methodOne() {
		
		System.out.println("inside method one");
	}
	 
	public abstract void methodTwo();// Abstract means the method wont contain any body and to clear the error
	                                // one need to declare abstract within the class as well. Abstract is only applicable to class and method.
}                                   //Abstract only hold definition of a method and not the implementation of the body
