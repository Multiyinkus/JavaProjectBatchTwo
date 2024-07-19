package abstractmodifierdemo;

public abstract class ClassC extends Sample {
	
	
	public void methodTwo() {
		
		System.out.println("Inside methodTwo");
		
	}
	//only abstract child class can inherit abstract parent class

}
/*variables cannot be specified with 'abstract' non-access modifier -
 * On specifying a method with abstract modifier, we can just declare the method
without implementing it 
 * Classes having at-least one abstract specified method must be specified as
abstract
 * Sub-Class (child) inheriting the Super-Class(parent) needs to implement the abstract
specified methods in Super-Class
 * 
 
 */