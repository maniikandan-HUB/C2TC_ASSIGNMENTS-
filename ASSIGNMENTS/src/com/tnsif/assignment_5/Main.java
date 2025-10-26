package com.tnsif.assignment_5;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading stageEvent, customer, and noOfSeats (CSV format)
        String[] input = sc.nextLine().split(",");
        String stageEvent = input[0];
        String customer = input[1];
        int noOfSeats = Integer.parseInt(input[2]);

        // Create TicketBooking object
        TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                double amount1 = sc.nextDouble();
                tb.makePayment(amount1);
                break;

            case 2:
                double amount2 = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                tb.makePayment(amount2, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double amount3 = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                tb.makePayment(holderName, amount3, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
	

}
