package com.tnsif.assignment_1.employees;

public class Manager extends Employee {
	 private int teamSize;
	    private String department;

	    public Manager(String name, String employeeId, double salary, int teamSize, String department) {
	        super(name, employeeId, salary);
	        this.teamSize = teamSize;
	        this.department = department;
	    }

	    public int getTeamSize() { return teamSize; }
	    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

	    public String getDepartment() { return department; }
	    public void setDepartment(String department) { this.department = department; }

	    @Override
	    public String getBasicInfo() {
	        return super.getBasicInfo() + String.format(" | Role: Manager | Dept: %s | Team Size: %d",
	                department, teamSize);
	    }

}
