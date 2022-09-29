package com.Homework.SwitchCase;

import java.util.Scanner;

public class countryLanguage {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    System.out.println("What country are you from?");
    String country=in.nextLine();
    String language;
    switch(country.toUpperCase()) {
    case "USA":
		language = "English";
		break;
    case "Russia":
    	language= "Russian";
    	break;
    case "Ukraine":
    	language= "Ukrainian";
    	break;
    case "France":
    	language= "French";
    	break;
    case "Italy":
    	language="Italian";
    	break;
    default:
    	language="unknown";
        System.out.println("Please enter another country");

    	break;
    }
    System.out.println("You are from "+country+". You speak "+language);
      
    }

	}

