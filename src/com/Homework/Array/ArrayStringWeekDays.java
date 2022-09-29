package com.Homework.Array;

public class ArrayStringWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] week = {"Monday","Sunday","Wednesday","Thrusday"};
     
     for (String day:week) {
    	 if (day.equals("Sunday")) {
    	 System.out.println(day+ " a funday");
     } else {
    	 System.out.println(day+ " a boring day");
     }
	}

}
}