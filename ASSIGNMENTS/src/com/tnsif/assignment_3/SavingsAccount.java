package com.tnsif.assignment_3;

public class SavingsAccount extends Account {
	 public SavingsAccount(double balance) {
	        super(balance);
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance)
	            balance -= amount;
	        else
	            System.out.println("Insufficient Balance!");
	    }

	    public double getBalance() {
	        return balance;
	    }

}
