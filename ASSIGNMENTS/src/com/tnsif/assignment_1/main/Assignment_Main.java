package com.tnsif.assignment_1.main;

import com.tnsif.assignment_1.employees.Manager;
import com.tnsif.assignment_1.employees.Developer;
import com.tnsif.assignment_1.utilities.Employee_Utilities;
import com.tnsif.assignment_1.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Assignment_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager mgr = new Manager("The Rock", "MGR001", 90000.0, 8, "Engineering");
	        Developer dev = new Developer("Baby Rao", "DEV101", 70000.0, "Java", "bobrao-gh");

	        // Print initial details
	        System.out.println("Before raise:");
	        Employee_Utilities.printEmployeeDetails(mgr);
	        Employee_Utilities.printEmployeeDetails(dev);

	        // Give raises
	        Employee_Utilities.giveRaise(mgr, 10.0); // 10% raise
	        Employee_Utilities.giveRaise(dev, 7.5);  // 7.5% raise

	        // Print details after raise
	        System.out.println("\nAfter raise:");
	        Employee_Utilities.printEmployeeDetails(mgr);
	        Employee_Utilities.printEmployeeDetails(dev);

	        // Calculate average salary
	        List<Employee> team = new ArrayList<>();
	        team.add(mgr);
	        team.add(dev);
	        double avg = Employee_Utilities.averageSalary(team);
	        System.out.printf("\nAverage salary: %.2f%n", avg);

	}

}
