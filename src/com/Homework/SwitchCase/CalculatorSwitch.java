package com.Homework.SwitchCase;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter your second number");
		int num2 = scanner.nextInt();
		System.out.println("What operator you would like to use +,-,*,/ ?");
		char operator = scanner.next().charAt(0);
		int num3;

		switch (operator){
		case '+':
		num3 = num1 + num2;
		break;			

		case '-':
		num3=num1-num2;
		break;
		
		case '*':
			num3=num1*num2;
			break;
		
		case '/':
			num3=num1/num2;
			break;
		default:
			System.out.println("Please enter valid operator");
			break;
		}
		System.out.println("The answer is ");

	}
}