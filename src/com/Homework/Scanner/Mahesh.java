package com.Homework.Scanner;

import java.util.Scanner;

public class Mahesh {

	 public static void main (String [] args ){
		 Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter the roll number of the Child");
		    int number=scanner.nextInt();
		    String name;

		    switch(number) {
		      case 101:
		      name="Ramesh";
		      break;

		      case 102:
		      name="Mahesh";
		      break;

		      case 103:
		      name="Mukesh";
		      break;

		     default:
		     name="unknown";
		    System.out.println("Not found Student name: in Class");
		    break;
		    }
		     System.out.println("Student name:"+name);
		  }
		 }
	