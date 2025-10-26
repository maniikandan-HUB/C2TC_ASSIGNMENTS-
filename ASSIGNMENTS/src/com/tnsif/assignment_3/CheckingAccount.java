package com.tnsif.assignment_3;

public class CheckingAccount extends Account {
	 public CheckingAccount(double balance) {
	        super(balance);
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance)
	            balance -= amount;
	        else
	            System.out.println("Overdraft not allowed!");
	    }

	    public double getBalance() {
	        return balance;
	    }


}
