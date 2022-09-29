package com.syntaxArray2D;

public class ArrayCountry2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] [] countries= {
    		 
    		 {"USA", "Canada"},//1 array with index0
    		 {"Peru", "Brazil", "Columbia","Ecuador"},//1 array with index1
    		 {"Ethiopia","Egypt"," Kenya"},
    		 {"Germany", "Turkey"," Moldova","Ukraine"},
    		 {"Kazakhstan","Afganistan", "Korea"},
     };
     
     for(int row=0; row<countries.length; row++) {
    	 for (int colum=0; colum<countries[row].length; colum++) {
    		 System.out.print(countries[row][colum]+" ");
    	 }
    	 System.out.println( );
         
     }
     
	}
}
