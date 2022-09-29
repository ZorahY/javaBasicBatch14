package com.Homework.Array;

public class ArrayTask2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
System.out.println("Loop 1");
		      String animals[]= {"wolf", "lion", "elephant","donkey","leopard"};
		      
		      for (int i=0; i<animals.length; i++) {
		    	  System.out.print(animals[i]+" ");
		      }
		      System.out.println(" ");
		      System.out.println("Loop 2");
		      for (String list:animals) {
		    	  System.out.print(list+" ");

		      }
	}

}
