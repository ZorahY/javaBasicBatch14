package com.Homework.Scanner;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        if(number%2==0) {
        	System.out.println("Value is even");
        } else {
        	System.out.println("Value is odd");
        }
	}

}
