package overriding.one;

public class Demo {

	public static void main(String[] args) {


		Dog dog = new Dog();
		dog.eat(); // Dog is eating (Overriding)
		dog.sleep(); //Animal is sleeping (Inheritance)
		
		Cat cat = new Cat();
		cat.eat();  //Cat is eating (Override)
		cat.sleep(); //Animal is sleeping (Inheritance)

	}

}
