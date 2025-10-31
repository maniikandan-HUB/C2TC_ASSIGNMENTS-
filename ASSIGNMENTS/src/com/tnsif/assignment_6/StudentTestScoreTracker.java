package com.tnsif.assignment_6;

import java.util.*;

public class StudentTestScoreTracker {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of scores
        System.out.print("Enter the number of test scores: ");
        int n = sc.nextInt();

        // Create object for StudentScores class
        StudentScores student = new StudentScores(n);

        // Call methods
        student.inputScores(sc);
        student.convertToArrayList();
        student.displayScores();

        sc.close();
    }

}
