package com.Homework.Array;

public class ArrayTask5 {

	public static void main(String[] args) {
		/*
		 * Create an array to store char values and then print those in reverse order
		 */

		char [] letters = {'A', 'B','C','D'};
		
		for (int n=letters.length-1; n>=0; n--) {
			
			System.out.println(letters[n]);
		}
		}

}
