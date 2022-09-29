package com.ReviewArrayLoops;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String [] invidualsInRoom1 = new String[] {"Zorah","Max", "Amelia"};
    String [] invidualsInRoom2 = new String[] {"Maria","Marina", "Jason"};
    String [] invidualsInRoom3 = new String[] {"Camila","Juls", "Amina"};
  
    String[][] rooms=new String [3][];
    rooms[0]=invidualsInRoom1;
    rooms[1]=invidualsInRoom2;
    rooms[2]=invidualsInRoom3;
    System.out.println(rooms[0][1]);
    }

}
