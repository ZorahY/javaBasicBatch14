package com.syntax.class8;

public class breakKeyContinue {

	public static void main(String[] args) {
		for (int i=1; i<=5;i++ ) {
			if(i==3||i==7||i==11) {
				continue;
			}
			System.out.print(i+" ");
	
		}
   System.out.println("______break____");
	}

}
