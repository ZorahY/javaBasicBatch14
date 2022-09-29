package com.Homework.Scanner;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int x = num.nextInt();
		System.out.println("Please enter your second number");
		int y = num.nextInt();
		if (x * y > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
	}

}
