package com.Homework.Array;

public class ArrayLargest {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 */
		int[] num = { 42, 564, 126 };
		int large = num[0];
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] > large) {
				
				large=num[i];
			}
		
		}System.out.println(large);
		
		System.out.println("____________");
		large=num[0];
		for(int n:num) {
			if (n>large) {
				large=n;
				
			}
		}
		System.out.println(large);
			}

		
	}

