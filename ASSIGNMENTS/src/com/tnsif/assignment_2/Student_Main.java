package com.tnsif.assignment_2;

public class Student_Main {
	 public static void main(String[] args) {
	        // Create Student object
	        Student s1 = new Student();  // Prints "Student object is created"

	        // Create Commission object
	        Commission c1 = new Commission();
	        c1.acceptDetails();       // Input employee details
	        c1.calculateCommission(); // Calculate & display commission
	    }

}
