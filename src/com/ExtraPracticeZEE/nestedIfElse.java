package com.ExtraPracticeZEE;

import java.util.Scanner;

public class nestedIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		char gender = scanner.next().charAt(0);

		System.out.println("Please enter your age");
		int age = scanner.nextInt();

		if (gender == 'M') {
			if (age <= 18) {
				System.out.println("Boy");
			} else {
				System.out.println("Man");
			}
		} else if (gender == 'F') {
			if (age <= 18) {
				System.out.println("Girl");
			} else {
				System.out.println("Woman");

			} 
		}else {
			System.out.println("Please enter correct age");
		}		
			 
		}

	}


