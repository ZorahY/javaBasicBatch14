package com.syntax.LOOPS;

public class Loop3 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 100 to 1 Print even numbers from 20 to 100 Print only odd
		 * numbers from 100 to 1 (2 different ways)
		 */
		int num = 100;
		while (num >= 1) {
			System.out.print(num + " ");
			num--;
		}
		
		System.out.println(" task 2");
		int num2 = 20;
		while (num2 <= 100) {
			if (num2 % 2 == 0) {
				System.out.print(num2 + " ");
			}
			num2++;
		}
		System.out.println(" task 3");
		int num3 = 99;
		while (num3 >= 1) {
			System.out.print(num3 + " ");
			num3 -= 2;
		}
		System.out.println(" task 4");
		int num4 = 100;
		while (num4 >= 1) {
			if (num4%2==1) {
			System.out.print(num4 + " ");
			}
			num4--;
		}

	}
}
