package day6;

// this is a generic class
public class MyTypeClass<T> {
	private T value;
	
	public MyTypeClass(T value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println(value);
	}
}
