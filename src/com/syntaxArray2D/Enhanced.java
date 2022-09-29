package com.syntaxArray2D;

public class Enhanced {

	public static void main(String[] args) {
		String [][] students= {
				{"Zorah","Adam", "Amelia","John"},
				{"A","B", "C"}
				
		};
    
  for (String[] singleArray:students) {
	  
	  for (String el:singleArray) {
		  System.out.print(el+" ");
	  }
	  System.out.println();
  }



	}

}
