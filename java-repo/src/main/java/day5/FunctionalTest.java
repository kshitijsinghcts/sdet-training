package day5;

import java.util.*;

public class FunctionalTest {

	public static void main(String[] args) {
		Report tc = new TestCase();
		provideReport(tc);
		
		provideReport((type) -> System.out.println("TestCase type: " + type));
		
		// streams - ternary operators
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		
		numbers.stream()
			.filter(num->num%2==0)
			.map(num->num*num)
			.forEach(System.out::println);
	}

	static void provideReport(Report rep) {
		rep.report("Normal");
	}
}
