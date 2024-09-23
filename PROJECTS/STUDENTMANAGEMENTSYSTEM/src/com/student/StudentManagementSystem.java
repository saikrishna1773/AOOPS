package com.student;
import java.util.*;
public class StudentManagementSystem {
	 private Map<Integer, Student> studentMap = new HashMap<>();

	    public void addStudent(Student student) {
	        studentMap.put(student.getId(), student);
	    }

	    public void displaySorted(Comparator<Student> comparator) {
	        studentMap.values().stream()
	                .sorted(comparator)
	                .forEach(System.out::println);
	    }

	    public void displayFiltered(StudentFilter filter) {
	        studentMap.values().stream()
	                .filter(filter::filter)
	                .forEach(System.out::println);
	    }
	    public static void main(String[] args) {
	        StudentManagementSystem system = new StudentManagementSystem();

	        system.addStudent(new Student(1, "Sai", 9.6));
	        system.addStudent(new Student(2, "Achyut", 9.8));
	        system.addStudent(new Student(3, "Sunny", 9.7));
	        system.addStudent(new Student(4, "Tej", 9.5));
	        system.addStudent(new Student(5, "Vijay", 9.3));
	        system.addStudent(new Student(6, "Nishith", 9.2));
	        system.addStudent(new Student(7, "derhu", 3.5));
	        system.addStudent(new Student(8, "vedanth", 2.3));
	        system.addStudent(new Student(9, "nikki", 2.2));

	        System.out.println("Students sorted by GPA:");
	        system.displaySorted(StudentComparator.byGpa());

	        System.out.println("\nStudents sorted by Name:");
	        system.displaySorted(StudentComparator.byName());

	        System.out.println("\nStudents with GPA > 3.0:");
	        system.displayFiltered(student -> student.getGpa() > 3.0);
	        
	        System.out.println("\nStudents with GPA < 3.0:");
	        system.displayFiltered(student -> student.getGpa() < 3.0);
	    }
}
