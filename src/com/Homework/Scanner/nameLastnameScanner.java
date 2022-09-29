package com.Homework.Scanner;

import java.util.Scanner;

public class nameLastnameScanner {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner (System.in);
		System.out.println("In:");
		String name=inp.nextLine();
		if(name.equals("Zorah")) {
			System.out.println("teacher");	
		}else if(name.equals("Amelia")) {
			System.out.println("student");
		}
	}

}
