package com.syntax.class5LogicalOperators;

public class SwitchCase2 {

	public static void main(String[] args) {
		char choice='Y';
		
		String answer;
		
		switch(choice) {
		case'Y':
			answer="Yes";
			break;
		case'N':
			answer="No";
			break;	
		case'M':
			answer="Maybe";
			break;
			default:
				answer="Unknown";
			break;
		}
		System.out.println(answer);
	 

}
}