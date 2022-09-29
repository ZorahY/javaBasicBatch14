package com.Homework.Loops;

public class loop {

	public static void main(String[] args) {
		// from 1-50 pls find the sum of all even and all odd numbers
		int sumOdd=0;
		int sumEven=0;
		for (int i = 1; i <= 50; i++) {
			if (i%2==0) {
				sumEven += i;
			} else {
				sumOdd += i;				
			}
		}
			System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
			System.out.println("SUM OF EVEN NUMBERS = " + sumEven);

		}

	}

