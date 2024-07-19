package interfacedemo;

public class HDFC implements Bank{
	
public void openHDFCFlexiAccount() {
		
		System.out.println("open HDFC Flexi Account");
		
		System.out.println(Bank.accountType1);//use the parent class name when calling the variable of interface
		System.out.println(Bank.accountType2);
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		
	}

}
