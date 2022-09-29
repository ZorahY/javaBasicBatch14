package com.syntaxArray;

public class EnhancedForLoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String [ ] iceCream= {"vanila", "chocolate","pistashio","kulfi"};
		for (String flavor:iceCream) {
			System.out.println(flavor);
	
		}
		
		System.out.println("_____________");
		
		char [] grade= {'A', 'B', 'C', 'D'};
		for(char letter:grade) {
	
		System.out.print(letter+" ");
	}
		System.out.println("_____________");
		int [] numbers= {12,56,345,1,0,9};
		
		for (int i=0; i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("_____________");
		
		for (int n:numbers) {
			System.out.print(n+" ");

		}
	}
}
