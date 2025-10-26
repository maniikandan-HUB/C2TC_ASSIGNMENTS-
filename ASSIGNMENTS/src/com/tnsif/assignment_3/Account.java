package com.tnsif.assignment_3;

public abstract class Account {
	 protected double balance;

	    public Account(double balance) {
	        this.balance = balance;
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    public void displayBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

}
