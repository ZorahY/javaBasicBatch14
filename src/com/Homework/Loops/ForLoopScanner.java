package com.Homework.Loops;

import java.util.Scanner;

public class ForLoopScanner {

	public static void main(String[] args) {

    Scanner scanner=new Scanner (System.in);
    int x=scanner.nextInt();

   for (int num=0; num<x; num++) { 
	  
	  
     System.out.println(num);
   }
    }
}