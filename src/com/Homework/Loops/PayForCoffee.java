package com.Homework.Loops;

import java.util.Scanner;

public class PayForCoffee {

	public static void main(String[] args) {
		/*Declare a variable to store a price for a coffee. 
		 * Ask the user to pay for a coffee. Keep asking to pay for coffee 
		 * until the user enters the EXACT amount . If the user gives more than coffee price --> 
		 * ask them to give less, if the user gives less money then ask to give more. 
		 * Once user give EXACT amount print “Please enjoy your coffee
		 */
    Scanner in= new Scanner(System.in);
    double price=5.99;
    double pay;
    
	  System.out.println("Please pay for coffee");

	   
	  do {
		  pay=in.nextDouble(); 
	
	   
	   if (pay<price) {
		   System.out.println ("Please pay more");
	   } else if (pay>price) {
		   System.out.println("Please pay less");
	   } 
		} while (pay!=price);
     System.out.println("Enjoy your coffee");
}
	}
