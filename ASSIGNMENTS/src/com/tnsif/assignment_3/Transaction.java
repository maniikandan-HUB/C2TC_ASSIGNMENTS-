package com.tnsif.assignment_3;

public class Transaction {
	private final double transactionFee = 10.0;

    public final void performTransaction(Account acc, double amount, String type) {
        if (type.equalsIgnoreCase("deposit")) {
            acc.deposit(amount - transactionFee);
        } else if (type.equalsIgnoreCase("withdraw")) {
            acc.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid transaction type!");
            return;
        }
        System.out.println("Transaction fee applied: " + transactionFee);
    }


}
