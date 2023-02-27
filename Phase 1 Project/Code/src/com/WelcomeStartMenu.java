package com;

import java.io.IOException;
import java.util.Scanner;

public class WelcomeStartMenu {
	public static void pressEnterToContinue()
	 {
	    System.out.println("\n\nPress Enter key to continue...");
	        try
	        { 	Scanner sc=new Scanner(System.in);
	        	String ekey= sc.nextLine();
	        }  
	        catch(Exception e)
	        {}  
	 }
		
    public static void clearScreen()  
    {  
    	System.out.print("\033[H\033[2J");
    	System.out.flush();  
    }  
      
	
	public static void main(String[] args) throws IOException {
		// Initial clean screen
		clearScreen();
	    
		// Welcome Main Menu 
		while (true)
		{		
		// Clear the console 
		 clearScreen();	
			
		// Welcome Header includes, application name, developer, how-to use guide 
		System.out.println("\n>>> Welcome to LockedMe.com, developed by Steven Feng Situ.\n");
		System.out.println("This application enables you to:\n");
		System.out.println("[1]: List all files in acsending order of filenames");
		System.out.println("[2]: Operations: Add a file, Delete a file, Search a file");
		System.out.println("[3]: Exit this application\n");
		System.out.println("-------------------------------------\n");
		//Read input
		int userChoice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please enter your choice [1, 2,or 3]: ");
		userChoice = sc.nextInt();
			
		if ( userChoice!=1 && userChoice!=2 && userChoice!=3 ) 
		{ System.out.println("\nYou entered ["+userChoice+ "] is out of range, please enter again.\n");
		   };
		}while (userChoice!=1 && userChoice!=2 && userChoice!=3);
		
		switch(userChoice) {
		case 1: 
			//List filenames ascending order
		
			// Call public class ListFiles for Option 1,
			ListFiles pFilenames= new ListFiles();
            pFilenames.printFilename();

			// here should return to main menu 
			pressEnterToContinue();
			
			break;
		case 2:
			//Business operations
			
			//do menu 2 list 2.1, 2.2, 2.3
			BusinessOperation operations= new BusinessOperation();
			operations.operationMenu();
			
			break;
		case 3:
			// Exit application , choice 3

			//exiting the application
			System.out.println("......\nGood Bye, thanks for using!");
			System.exit(0);
			break;
			
			// do not need default, because logic should not reach default
		}
	 }
	}
}