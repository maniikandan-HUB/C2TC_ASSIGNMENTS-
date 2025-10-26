package com.tnsif.assignment_4;

public class AirIndia implements Airfare {
	 private Integer hours;
	    private Double costPerHour;

	    public AirIndia() {}

	    public AirIndia(Integer hours, Double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    public Double calculateAmount() {
	        return hours * costPerHour;
	    }

	    public void display() {
	        System.out.printf("%.2f\n", calculateAmount());
	    }

}
