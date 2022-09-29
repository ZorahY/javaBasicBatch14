package com.ExtraPracticeZEE;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		/***
		 * For you to do:** Ask the user to enter any number from 1-7. Based on the
		 * number define the day of the week Invalid
		 **/
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number from 1-3");
		int number = in.nextInt();
		String day = null;

		switch (number) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		default:
			day = "Unknown";
			System.out.println("Please enter valid number");
			break;

		}
           System.out.println("Today is a "+day);
   
	}

}
