package com.Homework.Scanner;
import java.util.Scanner;

public class Morgage {

	public static void main(String[] args) {
		/*First, program should check if rate is higher than 4.5 
		 * user will not buy a house, otherwise user will consider buying. 
		 * Once user decides to buy a house, if price of the house is larger 
		 * than 200000 than user will take a loan, otherwise user will pay cash
		 */

		Scanner scanner=new Scanner (System.in);
		System.out.println("What is the mortgage rate?");
		 double rate= scanner.nextDouble();
		 if(rate<4.5) {
			 System.out.println("I will consider buying the house. ");
		 
			 System.out.println("What is the price? ");

			 int price=scanner.nextInt();
			 if (price>200000)
			 {
				 System.out.println("I will take a loan");
			 }
			 else
			 {	 
				 System.out.println("I will pay cash");
			 }
	}
	else {
		 System.out.println("I will not buy the house. ");

	 }
			 
	
	
		 }
		 
	}

