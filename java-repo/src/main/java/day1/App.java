package day1;

public class App 
{
    public static void main( String[] args )
    {
        // data types
    	// primitive data type example
    	int num = 123;
    	// non primitive data type
    	Car spyder = new Car(2018, "Porsche");
    	
    	System.out.println("This is from a primitive data type: "+num);
    	System.out.println("This is from a non-primitive data type: "+spyder);
    	// separator
    	System.out.println("-".repeat(80));
    	// static method call
    	printSomething();
    	// non static method call
    	App object = new App();
    	object.printSomethingElse();
    }
    
    // static method
    static void printSomething() {
    	System.out.println("This is from a static method.");
    }
    // non static method
    void printSomethingElse() {
    	System.out.println("This is from a non static method.");
    }
}

class Car {
	int make;
	String manufacturer;
	
	public Car(int make, String manufacturer) {
		this.make = make;
		this.manufacturer = manufacturer;
	}
	
}
