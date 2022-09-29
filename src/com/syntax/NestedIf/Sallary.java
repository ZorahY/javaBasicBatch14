package com.syntax.NestedIf;

import java.util.Scanner;

public class Sallary {

	public static void main(String[] args) {
	/* Write a program to ask user to enter numbers of worked years and annual salary. 
	 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
	 * otherwise he is not. 
	 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000. 
	 */
      Scanner scanner= new Scanner(System.in);
      
      System.out.println("How many years have you worked?");
       int years=scanner.nextInt();
             if(years>=5) 
       {
    	     System.out.println("You are eligible for the bonus!");
    	     System.out.println("Please enter your annual sallary");
    	     
       Double salary=scanner.nextDouble();
    	     if (salary>50000.00)
    	     {
        	     System.out.println("Your bonus is 5000");

    	     }
    	     else {
        	     System.out.println("Your bonus is 3000");

       }}
       else
       {
    	     System.out.println("You are NOT elegible for the bonus YET");
       }
	}

}
