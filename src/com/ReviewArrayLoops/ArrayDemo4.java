package com.ReviewArrayLoops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of dresses you want to buy");
		int size = scanner.nextInt();
		double[] prices = new double[size];
		
		for (int i = 0; i <size; i++) {
			System.out.println("Please enter the price of dress no " + (i+1));
			prices[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(prices));
		double sum=0;
		for (double price:prices){
			sum+=price;
		}
		System.out.println("Total sum"+ sum);
		}
		
	}


