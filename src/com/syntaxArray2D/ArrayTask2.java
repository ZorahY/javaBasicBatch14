package com.syntaxArray2D;

public class ArrayTask2 {

	public static void main(String[] args) {
		String [][] students= {
				{"Zorah","Adam", "Amelia","John"},
				{"A","B", "C"}
				
		};
     for (int i=0; i<students.length;i++) {
    	 for (int j=0; j<students[i].length;j++)
    		 System.out.println(students[i][j]);
     }
	}

}
