package com.syntax.LOOPS;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 2;

		while (c <= 20) {
			System.out.print(c + " ");
			c += 2;
		}
		
		
		System.out.println("__Another Way____");
		int i = 1;

		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
i++;
		}

	}
}