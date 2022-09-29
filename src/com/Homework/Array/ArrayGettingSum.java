package com.Homework.Array;

public class ArrayGettingSum {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		int[] num = { 2, 4, 6 };
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum +=num[i];
		}
		{
			System.out.println(sum);

		}
    sum=0;
    for (int number:num) {
    	sum+=number ;
    
    } 			System.out.println(sum);

	}

}
