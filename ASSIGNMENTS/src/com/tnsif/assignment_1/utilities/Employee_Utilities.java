package com.tnsif.assignment_1.utilities;

import com.tnsif.assignment_1.employees.Employee;
import java.util.List;

public class Employee_Utilities {
	 public static void giveRaise(Employee e, double percent) {
	        if (e == null) return;
	        double current = e.getSalary();
	        double updated = current + (current * percent / 100.0);
	        e.setSalary(updated); // correct usage of public setter
	    }

	    public static void printEmployeeDetails(Employee e) {
	        if (e == null) {
	            System.out.println("Employee is null");
	            return;
	        }
	        System.out.println(e.getBasicInfo());
	    }

	    public static double averageSalary(List<Employee> employees) {
	        if (employees == null || employees.isEmpty()) return 0.0;
	        double sum = 0.0;
	        for (Employee e : employees) {
	            sum += e.getSalary();
	        }
	        return sum / employees.size();
	    }

}
