package com.Homework.Array;

import java.util.Scanner;

public class groupTask2 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created, 
		 * retrieve all values from it and while retrieving those values print capital 
		 * for each country.(use 2 different loops).
		 */
         Scanner in=new Scanner (System.in);
         System.out.println("Please enter a country 1");
         String country1=in.nextLine();
         System.out.println("Please enter a country 2");
         String country2=in.nextLine();
         System.out.println("Please enter a country 3");
         String country3=in.nextLine();
         System.out.println("Please enter a country 4");
         String country4=in.nextLine();
         
         
         String []countries= {country1, country2, country3, country4};
         
         for (int i=0; i<countries.length; i++) {
        	if (countries[i].equals("Azerbaijan")) {
        	 System.out.println("The capital of "+countries[i]+" is Baku");
         } else if (countries[i].equals("Ukraine")) {
        	 System.out.println("The capital of "+countries[i]+" is Kiev");
         } else if (countries[i].equals("France")) {
        	 System.out.println("The capital of "+countries[i]+" is Paris");
         } else if (countries[i].equals("USA")){
        	 System.out.println("The capital of "+countries[i]+" is Washington");

         } else {
        	 System.out.println("The capital of "+countries[i]+" is unknown");
         }
       
}
	}
}
