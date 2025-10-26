package com.tnsif.assignment_3;

public class Main {
	public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());

        Account acc1 = new SavingsAccount(1000);
        Transaction t = new Transaction();

        t.performTransaction(acc1, 500, "deposit");
        acc1.displayBalance();

        t.performTransaction(acc1, 200, "withdraw");
        acc1.displayBalance();
    }

}
