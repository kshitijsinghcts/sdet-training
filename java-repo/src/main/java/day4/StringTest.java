package day4;

public class StringTest {
	public static void main ( String[] args ) {
		String firstString = "Turbocharger";
		// creating object like this new variable is mapped to pre-existing string in the pool
		String secondString = "Turbocharger";
		System.out.println(firstString == secondString);
		// creating object like this is creating a new object mapping variable to it
		String thirdString = new String("Turbocharger");
		System.out.println(firstString == thirdString);
	}
}
