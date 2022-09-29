package com.Homework.Loops;

import java.util.Scanner;

public class secretNumber {

	public static void main(String[] args) {
		/* create a secret number and lett user guess the secret number. 
		*once user guessed- program says u won
		*/
		Scanner in=new Scanner (System.in);
		int number;
		int secret=100;
		do {
			System.out.println("Enter the number");
			number=in.nextInt();
		} while (number!=secret);
			System.out.println("You won!");
		
	}

}

