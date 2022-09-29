package com.syntax.LOOPS;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String answer;
	do {
	System.out.println("Did you get a job?");
	answer=in.nextLine();
	} while (!answer.equals("yes"));
	System.out.println("Congrats");
	}

}
