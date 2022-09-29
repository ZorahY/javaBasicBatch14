package com.syntax.LOOPS;

import java.util.Scanner;

public class while4 {


		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String answer;
			
			System.out.println("Did you get a job?");
			answer=in.nextLine();
			
			while (!answer.equals("yes"));
				System.out.println("Did you get a job?");
			answer=in.nextLine();
			}

		}


	


