package com.Homework.Array;

public class ArrayTask1 {

	public static void main(String[] args) {
		/*Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
    String [] cars= new String[6];
    cars[0]="Ford";
    cars[1]="Audi";
    cars[2]="Toyota";
    cars[3]="BMW";
    cars[4]="Bentley";
    cars[5]="Buick";
    
    
    for (int i=0; i<cars.length; i++) {
    System.out.print(cars[i]+" ");
    }
  
    System.out.println("________ ");
    String [] car= {"Ford","Audi","Toyota","BMW","Bentley","Buick"};
    for (int b=0; b<car.length; b++) {
        System.out.print(cars[b]+" ");
        }
	}

}
