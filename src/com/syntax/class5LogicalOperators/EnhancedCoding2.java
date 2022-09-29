package com.syntax.class5LogicalOperators;

import java.util.Scanner;

public class EnhancedCoding2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz=scanner.nextInt();
		System.out.println("Please enter your mid term score");
     int midTerm=scanner.nextInt();
     System.out.println("Please enter your final score");
          int finalScore=scanner.nextInt();
          int avr=(quiz+midTerm+finalScore)/3;
          String grade;
       
           if(avr>=90 && avr<=100) {
        	   grade="A";
           } else if(avr>=70 && avr<90 ) {
        	   grade="B";
           } else if(avr>=50 && avr<=70 ) {
        	   grade="C";
           } else if(avr<50 && avr>0 ) {
        	   grade="F";
           } else {
        	   System.out.println("Please enter a valid score");
        	   grade="None";
           }
           System.out.println(grade);
	}

}
