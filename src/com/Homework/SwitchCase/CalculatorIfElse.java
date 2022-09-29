package com.Homework.SwitchCase;

import java.util.Scanner;

public class CalculatorIfElse {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your first number");
			int num1 = scanner.nextInt();
			System.out.println("Enter your second number");
			int num2 = scanner.nextInt();
			System.out.println("What operator you would like to use +,-,*,/ ?");
			char operator = scanner.next().charAt(0);
			int num3;

			if (operator == '+') {
				num3 = num1 + num2;
				System.out.println(num3);
				

			} else if (operator == '-') {
				num3 = num1 - num2;
				System.out.println(num3);

			} else if (operator == '*') {
				num3 = num1 * num2;
				System.out.println(num3);

			} else if (operator == '/') {
				num3 = num1/num2;
				System.out.println(num3);

			} else {
				System.out.println("You used wrong operator. Please try again");
			}
		}
	}
