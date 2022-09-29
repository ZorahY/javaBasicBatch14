package com.Homework.Scanner;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b && a > c) {
			System.out.println("The lasrgest number is " + a);
		} else if (b > a && b > c) {
			System.out.println("The largest number is " + b);
		} else {
			System.out.println("The lasrgest number is " + c);
		}
	}

}
