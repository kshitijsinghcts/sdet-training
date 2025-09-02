package day6;

public class MyNumberClass<T extends Number> {
	private T value;
	
	public MyNumberClass(T value) {
		this.value = value;
	}
	
	public double squared() {
		return this.value.doubleValue() * this.value.doubleValue();
	}
}
