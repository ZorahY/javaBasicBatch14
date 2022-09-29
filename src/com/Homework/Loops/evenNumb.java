package com.Homework.Loops;

public class evenNumb {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)

		int i=20;
		while (i>=1) {
			if(i%2==0) {
			System.out.print(i+" ");
			}
			i--;
		}
		System.out.println(" another way");
		
		int c=20;
		while (c>=1)  {
			System.out.print(c+" ");
			c-=2;
		}
	}
}

