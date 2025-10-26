package com.tnsif.assignment_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double cost = sc.nextDouble();

        Airfare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, cost);
                break;
            case 2:
                airfare = new KingFisher(hours, cost);
                break;
            case 3:
                airfare = new Indigo(hours, cost);
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        airfare.display();
        sc.close();
    }

}
