package com.ReviewArrayLoops;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		  int[] number=new int [5];
		  number[0]=scanner.nextInt();
		  number[1]=scanner.nextInt();
		 number [2]=scanner.nextInt();
		number [3]=scanner.nextInt();
		   number[4]=scanner.nextInt();
		   
		  for (int i=number[4]; i<number.length; i--){
		  
		  System.out.println(number[i]);
		  number[i]--;
		}
		}
		}