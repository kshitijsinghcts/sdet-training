package day4;

public class ExceptionTest {
	public static void main ( String[] args )
	{
		String name = null;
		try 
		{
			System.out.println(name.toLowerCase());
		} catch ( NullPointerException npe )
		{
			System.out.println("Handled null value exception.");
		}
		System.out.println("Program worked as usual.");
	}
}
