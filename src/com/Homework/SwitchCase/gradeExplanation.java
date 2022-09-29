package com.Homework.SwitchCase;

import java.util.Scanner;

public class gradeExplanation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your grade A,B,or C etc");
		String grade = in.nextLine();
		String explanation;
		switch (grade) {
		case "A":
			explanation = "Excellent";
			break;
		case "B":
			explanation = "Good";
			break;
		case "C":
			explanation = "Average";
			break;
		case "F":
			explanation = "Fair";
			break;
		default:
			explanation = "Unknown";
			break;
		}

		System.out.println("Your grade is " + grade + "-" + explanation);

	}

}
