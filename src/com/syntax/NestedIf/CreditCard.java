package com.syntax.NestedIf;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
       Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean card=scanner.nextBoolean();
        
        if (card)
        {
        	System.out.println("What is the balance on the card?");
        int ballance=scanner.nextInt();
        if (ballance>1000)
        {
        	System.out.println("Your balance "+ballance+ " is passed due. Make a payment!");
        }
        else
        {
        	System.out.println("We are encouraging you to spend more!");

        }  }
        else
        {
        	System.out.println("Would you like to apply for a credit card?");

        }
        }
	}


