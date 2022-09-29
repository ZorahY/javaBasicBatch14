package com.syntaxArray2D;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * reate a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms,
		 *  Miss and  Smith, Jordan, Jackson, Obama.
		 *  After storing values print following String:
		 *  Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		  String [][]names=new String [3][4];
	       
	        names[0][0]="Mr";
	        names[0][1]="Mrs";
	        names[0][2]="Ms";
	        names[0][3]="Miss";
	        
	        		 names[0][0]="Mr";
	        names[1][0]="Smith";
	        names[1][1]="Obama";
	        names[1][2]="Jackson";
	        names[1][3]="Jordan";
	        System.out.println(names[0][1]+" "+ names[1][0]);
	        
	    }
	

}
