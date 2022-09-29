package com.Homework.Array;

import java.util.Scanner;

public class GroupTask1 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that arra
		 */
        Scanner in=new Scanner (System.in);
        System.out.println("Enter number 1 ");
        int num1=in.nextInt();
        System.out.println("Enter number 2 ");
        int num2=in.nextInt();
        System.out.println("Enter number 3 ");
        int num3=in.nextInt();
         
        int[] numbers= {num1,num2,num3};
        
        		int sum=0;
        		for (int i=0; i<numbers.length; i++) {
        			sum+=numbers[i];
        		}
        		System.out.println(sum);
        		
        		
     
  
	
	}
	
        
	


}
