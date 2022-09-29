package com.syntax.class5LogicalOperators;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*
		 * we need to ask a user where he/she is from. Based on the country define
		 * favorite food
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Where are you from?");
		String country = scanner.nextLine();
		String food;
		switch (country) {
		case "USA":
			food = "burgers abd fries";
			break;
		case "Kazakhstan":
			food = "beshpasrmak";
			break;
		case "Turkey":
			food = "adana kebab";
			break;
		case "Venezuela":
			food = "Arepa";
			break;
		case "India":
			food = "chicken curry";
			break;
		case "Yemen":
			food = "Mandi";
			break;
			default:
				food="unknown";
				break;
		}
		System.out.println("You are from " + country + " and your favourinte food is " +food);

	}

}
