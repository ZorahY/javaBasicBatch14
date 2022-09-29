package com.Homework.Loops;

public class digitalClock {

	public static void main(String[] args) {
	/*      h1h2:m1m2
	 * max 2 9 5 9
	 */ 
		
		for (int h1=0; h1<=2; h1++) {
			for(int h2=0; h2<=9;h2++) {
				if(h1==2 && h2>3) {
					break;
				}
				for (int m1=0; m1<=5;m1++) {
					for (int m2=0;m2<=9;m2++) {
						
						System.out.println("Time is "+h1+h2+":"+m1+m2);
					}
				}
				
			}
			
		}

	}

}
