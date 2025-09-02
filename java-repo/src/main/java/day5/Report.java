package day5;

@FunctionalInterface
public interface Report {
	public void report(String reportType);
	default void anotherReport() {
		System.out.println("Hello from Report!");
	}
}
