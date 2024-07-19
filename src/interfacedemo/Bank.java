package interfacedemo;

public interface Bank {
	
	String accountType1 = "Savings"; // static and final type by default
	String accountType2 = "Current"; // static and final type by default
	
	public void openAccount();  // abstract type by default
	
	public void withdrawMoney(); // abstract type
	
	public void transferMoney(); // abstract type
	
	public void closeAccount(); // abstract type
	
	default void moneyDeclined() {
		System.out.println("Money is declined"); 
		
	}
	public static void fraudMoney() {
		System.out.println("Frauster have taken your money");
	}
//both default and static method are the only object that can be defined and implement within an interface
}
