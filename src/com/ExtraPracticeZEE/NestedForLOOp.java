package com.ExtraPracticeZEE;

public class NestedForLOOp {

	public static void main(String[] args) {
		/*
		 * *
		 * **
***
*****
******
		 */
		
		String sign="*";
		
		 for (int i=0; i<6;i++) {
			 for (int j=0; j<=i; j++) {
				 System.out.print(sign);
				
			 }
			 System.out.println();
		 }
		 
		 System.out.println("*********");
		 
		 

	}

}
