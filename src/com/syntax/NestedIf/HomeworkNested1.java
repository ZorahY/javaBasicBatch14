package com.syntax.NestedIf;

import java.util.Scanner;

public class HomeworkNested1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a diploma?");
		
		boolean hasDiploma=scanner.nextBoolean();
        if(hasDiploma)
        {
        	System.out.println("Congratulations!What is your Gpa score?");
        
        	double gpa=scanner.nextDouble();
            
  
        		if(gpa>=3.5)
            {
            	System.out.println("You are eligible for scholarship");
            }
            else
            {
            	System.out.println("You should have studied harder");
            }
        	} else
        		
        	{System.out.println("You should get a degree");
        	}
        	
        }
}
        

        
	


