package day3;

public class Vehicle {
	private String name;
	private String owner;
	private int wheels;
	private int mileage;
	
	public Vehicle(String n, int w, int m) {
		this.owner = null;
		this.name = n;
		this.wheels = w;
		this.mileage = m;
	}
	
	// Compile-time polymorphism or method overloading
	public void owner() {
		System.out.println(this.name+" has no owner.");
	}
	
	public void owner(String owner) {
		System.out.println(this.name+" is now owned by "+owner+".");
		this.owner = owner;
	}

}
