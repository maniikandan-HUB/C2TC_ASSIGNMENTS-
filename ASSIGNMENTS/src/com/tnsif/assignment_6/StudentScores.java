package com.tnsif.assignment_6;

import java.util.*;

public class StudentScores {
	 private int[] scores;                  // Array to store test scores
	 private ArrayList<Integer> scoreList;  // ArrayList for displaying scores

	 // Constructor to initialize the array
	 public StudentScores(int n) {
	     scores = new int[n];
	     scoreList = new ArrayList<>();
	 }

	 // Method to input scores
	 public void inputScores(Scanner sc) {
	     System.out.println("Enter the test scores:");
	     for (int i = 0; i < scores.length; i++) {
	         scores[i] = sc.nextInt();
	     }
	 }

	 // Method to convert array to ArrayList
	 public void convertToArrayList() {
	     for (int score : scores) {
	         scoreList.add(score);
	     }
	 }

	 // Method to display elements in ArrayList
	 public void displayScores() {
	     System.out.println("Elements in the ArrayList:");
	     for (int score : scoreList) {
	         System.out.println(score);
	     }
	 }

}
