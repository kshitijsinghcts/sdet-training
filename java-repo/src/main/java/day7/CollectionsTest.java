package day7;

import java.util.*;

public class CollectionsTest {
	public static void main(String[] args) {
		// ArrayList class implements List interface
		List<Integer> intLst = new ArrayList<>();
		intLst.add(1);
		intLst.add(2);
		System.out.print("Elements in ArrayList<Integer>:");
		intLst.forEach(element -> System.out.print(" "+element+","));
		System.out.println("...");
		// HashMap class implements Map interface
		Map<String, Integer> strKeyIntVal = new HashMap<>();
		strKeyIntVal.put("one", 1);
		strKeyIntVal.put("two", 2);
		System.out.print("Elements in HashMap<String, Integer>:");
		strKeyIntVal.forEach((key, val) -> System.out.print(" "+key+" : "+val+","));
		System.out.println("...");
		// List of Employees
		System.out.println("-".repeat(80));
		List<Employee> empLst= new ArrayList<>();
		Employee emp1 = new Employee(102, "Max", 31);
		Employee emp2 = new Employee(101, "Franz", 32);
		empLst.add(emp1);
		empLst.add(emp2);
		System.out.println("Employee List before sorting:");
		System.out.println(empLst);
		Collections.sort(empLst);
		System.out.println("Employee List after sorting on id:");
		System.out.println(empLst);
		EmployeeAgeComparator ageCompare = new EmployeeAgeComparator();
		Collections.sort(empLst, ageCompare);
		System.out.println("Employee List after sorting on age:");
		System.out.println(empLst);
	}
}
