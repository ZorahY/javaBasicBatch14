package com.Homework.Array;

import java.util.Scanner;

public class groupTask2Loop2 {

	public static void main(String[] args) {
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
        for(String country:countries) {
        	if (country.equals("Azerbaijan")) {
        
       	 System.out.println("The capital of "+country+" is Baku");
        } else if (country.equals("Ukraine")) {
       	 System.out.println("The capital of "+country+" is Kiev");
        } else if (country.equals("France")) {
       	 System.out.println("The capital of "+country+" is Paris");
        
        } else if (country.equals("USA")){
       	 System.out.println("The capital of "+country+" is Washington");

        } else {
       	 System.out.println("The capital of "+country+" is unknown");
        }
      
	}
}
}