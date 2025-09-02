package day5;

import java.util.*;

public class ObjectTest {
	public static void main(String[] args) {
		String name1 = "Tom";
		String name2 = "Tom";
		String name3 = new String("Tom");
		
		Student	s1 = new Student(1, "Hero");
		Student	s2 = new Student(1, "Hero");
		Student	s3 = new Student(3, "Heroine");
		
		System.out.println(s1.equals(s2));
		System.out.println(s3);
	}
	
}

class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Student s) {
		if (this == s) return true;
		if (s == null || getClass() != s.getClass()) return false;
		
		Student newStudent = (Student) s;
		return id == newStudent.id;
	}
	
	// return name on print
	public String toString() {
		return name;
	}
}
