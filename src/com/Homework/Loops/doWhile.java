package com.Homework.Loops;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...

       Scanner in=new Scanner(System.in);
       System.out.println("Please enter your name?");

       for (int i=1; i<+3;i++) {
       
        String name=in.nextLine();       
     
    	   System.out.println("Good afternoon "+ name);
       }
       
       
	}

}
