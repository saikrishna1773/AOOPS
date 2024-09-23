package com.student;
import java.util.*;

public class StudentComparator {
	  // Comparator for sorting by GPA
    public static Comparator<Student> byGpa() {
        return Comparator.comparingDouble(Student::getGpa);
    }

    // Comparator for sorting by Name
    public static Comparator<Student> byName() {
        return Comparator.comparing(Student::getName);
    }
}
