package com.syntax.NestedIf;

public class NestedIfCondition {

	public static void main(String[] args) {
	
		double moneyInMyAccount=1000;
		String season="Spring";
		if(season.equals("Spring"))
		{
			
	    
			if (moneyInMyAccount>30000)
	     {
	    	System.out.println("lets go vacations"); 	 
	     }
	     else 
	     {
	    	 System.out.println("need save more money");
	     }
			
		}
	}

}
