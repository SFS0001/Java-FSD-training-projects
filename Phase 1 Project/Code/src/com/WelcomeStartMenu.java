package com;
import java.util.Scanner;
	
public class WelcomeStartMenu {
	
	public static void main(String[] args) {
		// Welcome description 
		System.out.println("Welcome to LockedMe.com, developed by Steven Feng Situ."+'\n');
		System.out.println("This application enables you to:");
		System.out.println("Choose 1: List all files in accending order of filenames");
		System.out.println("Choose 2: Business Operation: Add a file, Delete a file, Search a file");
		System.out.println("Choose 3: Exit this application"+'\n');
		//Read input
		int userChoice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please select your choice [1, 2,or 3]: ");
		userChoice = sc.nextInt();
		
		if (userChoice!=1 && userChoice!=2 && userChoice!=3) 
		{ System.out.println('\n'+"Your choice "+userChoice+ " is out of range.");
		   };
		}while (userChoice!=1 && userChoice!=2 && userChoice!=3);
		
		switch(userChoice) {
		case 1: 
			//List filenames accending order
			System.out.println("List filenames choice 1.");
			//do 1
			break;
		case 2:
			//Business operations
			System.out.println("Business Operation,choice 2.");
			//do 2
			break;
		case 3:
			// Exit application , choice 3
			System.out.println("Exist application,choice 3.");
			//do 3.
			break;
			
		default:
			// this should not happen at all
			break;
		}
	}
}
	
	
