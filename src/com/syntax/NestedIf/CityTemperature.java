package com.syntax.NestedIf;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and 
		 * print “The temperature is the city  is ” 
		 * 
		 */
 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		String city=scanner.nextLine();
		
		System.out.println("Please enter the temperature in "+city+" in Fahrenheits");
		int tempF=scanner.nextInt();
		int tempC=(tempF-32)* 5/9;
		System.out.println("The temperature in " +city+ " is "+ tempC+" in Celsius");

		
		
	}

}
