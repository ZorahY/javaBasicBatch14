package com.Homework.Loops;

import java.util.Scanner;

public class ForLoop6 {

	public static void main(String[] args) {
		
	Scanner in=new Scanner (System.in);	
		int end=in.nextInt();
		for (int i=0; i<end*2; i++) {
			System.out.println(i);
		}
	}
}
