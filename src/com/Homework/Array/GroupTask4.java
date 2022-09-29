package com.Homework.Array;

public class GroupTask4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */

		int[][] numbers = { { 0, 2, 4, 6, 8, 10, 12 }, { 1, 3, 5, 7, 9, 11, 13 } };
		for (int[] num : numbers) {
			for (int n : num) {
				if (n % 2 == 0) {
					System.out.println(n);

				}
			}

		}
	}
}