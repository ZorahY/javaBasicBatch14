package com.ExtraPracticeZEE;

import java.util.Arrays;

public class practiceWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String [] name= { "Zorah", "Turan", "Amelia"," Camila"};
   		
   
   System.out.println(Arrays.toString(name));
       System.out.println("**************************");
       String family= "I love my family so much";
       int counter=0;
       
       char [] array=family.toCharArray();
        for (int c:array) {
        	if (c=='f') {
        		counter++;}
        }
        
        		System.out.println(counter);
        	}
        
       //System.out.println(Arrays.toString(array));
       //System.out.println(array[4]);
       //System.out.println("**************************");

        //String phrase="I love you";
       
        //System.out.println(phrase.charAt(5));
        

        
}

	
