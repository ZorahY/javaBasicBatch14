package com.stringClassNew;

public class HomeWork3 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first name
         * if they expecting boy or girl? 
         * Based on the input suggests a name for a baby:
         * 
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? boy
         * Suggested baby name: DANRY
         * 
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? girl
         * Suggested baby name: MAIEL
         */
		
		String motherName="Mary";
		String fatherName="Daniel";
		boolean isBoy=true;
		String firstHalf;
		String secondHalf;
		if (isBoy) {
			firstHalf=fatherName.substring(0,fatherName.length()/2);
			secondHalf=motherName.substring(motherName.length()/2);
			
		} else {
			firstHalf=motherName.substring(0,motherName.length()/2);
			secondHalf=fatherName.substring(fatherName.length()/2);
		}
		System.out.println(firstHalf+secondHalf);



	}

}
