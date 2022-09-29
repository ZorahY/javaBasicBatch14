package com.syntaxArray;

public class ArrayTask1 {

	public static void main(String[] args) {
	 char [] grades= new char[4];
	 grades [0]='A';
	 grades [1]='B';
	 grades [2]='C';
	 grades [3]='D';
	 System.out.println("grade " +grades [1]);

 System.out.println("_ _ _");
	 
 char [] grade= {'A', 'B', 'C', 'D'};
 System.out.println("grade "+ grade[1]);
 
 
 System.out.println("___________________");
    char [] gr= {'A', 'B', 'C', 'D'};
    for (int i=0; i<gr.length; i++) {
    System.out.println("grade is "+ gr[i]);
    }
	}

}
