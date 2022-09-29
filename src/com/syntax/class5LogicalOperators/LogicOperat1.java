package com.syntax.class5LogicalOperators;

import java.util.Scanner;

public class LogicOperat1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day");
		int day = scan.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");

		}
	}

}
