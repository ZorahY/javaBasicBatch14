package com.syntax.class8;

import java.util.Scanner;

public class buyPriceMyWay {

	public static void main(String[] args) {
		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the
		 * price of that item. Every time user enters money, accumulate the amount and
		 * tell the user how much is left to pay off. If user give more money program
		 * should return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!"
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Enter item you want to buy");
		String item = in.nextLine();
		System.out.println("How much is it?");
		double price = in.nextDouble();
		double money;
		double more;
		double change;
		System.out.println("Pay for the item");
		do {
			
			money = in.nextInt();
			if (money > price) {
				change = money - price;
				System.out.println("Please take your change " + change);
			} else if (money < price) {
				 more = price - money;
				System.out.println("Please pay more " + more);
			}

		} while (price != money);
		System.out.println("Thank you for shopping with us");

	}

}
