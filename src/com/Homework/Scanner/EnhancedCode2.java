package com.Homework.Scanner;

import java.util.Scanner;



public class EnhancedCode2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	   
		System.out.println("Enter your quiz score");
		int quiz=scanner.nextInt();
		
		System.out.println("Enter your mid term score");
		int midterm=scanner.nextInt();
		
		System.out.println("Enter your final score");
		int finalScore=scanner.nextInt();
		int average=(quiz+midterm+finalScore)/3;
		String grade;
	
		if (average>=90) {
		grade="A";
		} else if (average>=70 && average<90){
			grade="B";
		} else if (average>=50 && average<70){
			grade="C";
		} else if ( average<50 && average>0){
			grade="F";
		}else {
		System.out.println("please enter valid score");
		grade="None";
	}
	      System.out.println("Your grade is "+grade);
	    
	}   
	
}
		
	    
	    
	
