package com.Homework.Array;

public class groupTask3 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of int. print the sum of all numbers
		 */

		int[][] numbers = { { 25, 135, 245, 355 }, { 13, 130, 2, 45 }, { 500, 450, 1000, -2, 19 }, };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
			}
		}
		System.out.println(sum);

	}

}
