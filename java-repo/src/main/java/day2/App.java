package day2;

// Object-oriented programming

public class App {
	public static void main ( String[] args ) {
		// Creating objects from separate class
		Vehicle bike = new Vehicle("Yamaha R15", 2, 55);
		Vehicle car = new Vehicle("NSX-R", 4, 20);
		// Example of method overloading
		bike.owner();
		car.owner("Ahmed");
		separator();
		
		// Another example
		Yamaha street = new Yamaha("MT15", 2, 45);
		Yamaha race = new Yamaha("R1", 2, 27);
		street.owner();
		race.owner("Vidhur");
		
	}
	
	static void separator() {
		System.out.println("-".repeat(50));
	}
}
