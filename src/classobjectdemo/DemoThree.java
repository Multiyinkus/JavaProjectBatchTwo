package classobjectdemo;

public class DemoThree {

	public static void main(String[] args) {
		
		CarTwo bmwX3= new CarTwo();
		
		
		
		bmwX3.initVar("X3", "BMW", "Blue", 12.3, 5500000, 4);
		
		bmwX3.startCar();
		bmwX3.stopCar();
		bmwX3.getCarDetails();
		
		CarTwo hod = new CarTwo();
		
		hod.initVar("Odessy","Honda","White",14.23,15600000,4);
				
		hod.startCar();
		hod.stopCar();
		hod.getCarDetails();
		
		CarTwo msvdi = new CarTwo();
		
		msvdi.initVar("SwiftVDI","Maruti","Red",23.12,800000,4);
		
		msvdi.startCar();
		msvdi.stopCar();
		msvdi.getCarDetails();
		
		CarTwo hyi20 = new CarTwo();
		
		hyi20.initVar("i20", "Hyundai", "Grey", 16.82,1200000,4);
	
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.getCarDetails();
	}

}
