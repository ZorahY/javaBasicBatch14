package com.Homework.Scanner;

import java.util.Scanner;

public class weatherActivity {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		Boolean isSunny = scanner.nextBoolean();

		if (isSunny) {
			System.out.println("It is a sunny day. I should go somewhere!");
			System.out.println("What is temperature outside?");
			int temp = scanner.nextInt();
			if (temp > 85) {
				System.out.println("I should go to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay home and practice Java");
		}

	}

}
