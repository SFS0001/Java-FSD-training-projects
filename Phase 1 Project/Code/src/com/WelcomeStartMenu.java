package com;
import java.io.File;
import java.util.Scanner;
import com.ListFiles;




public class  WelcomeStartMenu {

	private static void pressEnterToContinue()
	 {
		Scanner scEnterKey=new Scanner(System.in);
		
	        System.out.println("\n\nPress Enter key to return to Main Menu...");
	        try
	        {
	            String ekey= scEnterKey.nextLine();
	            
	        }  
	        catch(Exception e)
	        {}  
	 }
	
	
    private static void clearScreen()  
    {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    }  
      
	
	public static void main(String[] args) {
		
		// Initial clean screen
		clearScreen();
	    //Keep the Welcome Menu 
		while (true)
		{		
		// Clear the console 
		 clearScreen();	
			
		// Welcome description 
		System.out.println(">>> Welcome to LockedMe.com, developed by Steven Feng Situ.\n");
		System.out.println("This application enables you to:\n");
		System.out.println("Choose 1: List all files in acsending order of filenames");
		System.out.println("Choose 2: Business Operation: Add a file, Delete a file, Search a file");
		System.out.println("Choose 3: Exit this application\n");
		System.out.println("-------------------------------------\n");
		//Read input
		int userChoice;
		Scanner sc = new Scanner(System.in);
		do {
		clearScreen();
		System.out.println("Please enter your choice [1, 2,or 3]: ");
		userChoice = sc.nextInt();
		
		if (userChoice!=1 && userChoice!=2 && userChoice!=3) 
		{ System.out.println("\nYou entered ["+userChoice+ "] is out of range, please enter again.\n");
		   };
		}while (userChoice!=1 && userChoice!=2 && userChoice!=3);
		
		switch(userChoice) {
		case 1: 
			//List filenames ascending order
			System.out.println("\nYou have entered [1] - List filenames in ascending order.");
			
			// Call public class ListFiles for Option 1,
			ListFiles pFilenames= new ListFiles();
            pFilenames.printFilename();

			// here should return to main menu 
			// main menu
			pressEnterToContinue();
			
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
}