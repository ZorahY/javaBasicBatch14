package com.Homework.Loops;

public class LoopsIf {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		int a=21;
		while (a<=50) {
			System.out.print(a+" ");
			a+=2;
		}
		System.out.println(" another way");
		int b=21;
		
		while (b<=50) {
			if(b%2==1) {
				System.out.print(b+" ");
			}
			b++;
		}
	}

}
