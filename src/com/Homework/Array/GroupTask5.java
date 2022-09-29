package com.Homework.Array;

public class GroupTask5 {

	public static void main(String[] args) {
		/*
		 * . Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers
		 * for that array. 
		 */
         
		int [][]numbers= {
				{10,11,20,33,40,60},
				{1,3,5,16,19}
		};
		int sumOfEven=0;
		int sumOfOdd=0;
	
	for (int i=1;i<numbers.length; i++) {
	    	 for (int j=0; j<numbers[i].length; j++) {
	    		 if(j%2==0) {
	    		 System.out.print(sumOfEven+" ");
		
	} else {
		 System.out.print(sumOfOdd+" ");

	}
	}
	    	 }
	}
}