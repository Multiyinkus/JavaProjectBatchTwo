package classobjectdemo;

public class DemoFour {

	public static void main(String[] args) {
		CarFour bmwX3 = new CarFour("X3", "BMW", "Blue", 12.3, 5500000);
		
		bmwX3.startCar();
		bmwX3.stopCar();
		bmwX3.getCarDetails();
		
		CarFour hod = new CarFour("Odessy","Honda","White",14.23,15600000);
		
		hod.startCar();
		hod.stopCar();
		hod.getCarDetails();
		
		CarFour msvdi = new CarFour("SwiftVDI","Maruti","Red",23.12,800000);

		msvdi.startCar();
		msvdi.stopCar();
		msvdi.getCarDetails();
		
		CarFour hyi20 = new CarFour("i20", "Hyundai", "Grey", 16.82,1200000);
	
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.getCarDetails();

	}

}
