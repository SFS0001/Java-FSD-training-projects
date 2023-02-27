package com;

import java.io.IOException;
import java.util.Scanner;

// sub-class BusinessOperation menu, extending super-class WelcomeStartMenu , 
// re-use methods clearnScreen,pressEnterToContinue, etc...

public class BusinessOperation extends WelcomeStartMenu {


public void operationMenu () throws IOException {

// Description:
// Business operation menu 
//	2.1 Add file ; 
//	2.2 Delete file ; 
//	2.3 Search file ;
//	2.4 return to main menu
	
	while (true)
	{
	//clear the screen
	clearScreen();
	
	// Welcome Header includes, application name, developer, how-to use guide 
	System.out.println("\nBusiness Operation [1]: Add a file...");
	System.out.println("                   [2]: Delete a file (case sensitive)...");
	System.out.println("                   [3]: Search a file (case sensitvie)...");
	System.out.println("                   [4]: Return to main menu");
	System.out.println("---------------------------------------------------------\n");
	//Read input
	int userChoice;
	Scanner sc = new Scanner(System.in);
	do {
	System.out.println("Please enter your choice [1, 2, 3 or 4]: ");
	userChoice = sc.nextInt();
	
	if (userChoice!=1 && userChoice!=2 && userChoice!=3 && userChoice!=4 ) 
	{ System.out.println("\nYou entered ["+userChoice+ "] is out of range, please enter again.\n");
	   };
	}while (userChoice!=1 && userChoice!=2 && userChoice!=3 && userChoice!=4);
	
	switch(userChoice) {
	case 1: 
		// Call public class ListFiles for Option 1,
		AddFile af= new AddFile();
        af.addFile();
        
		// Pause for user see the result
        pressEnterToContinue();
		break;

	case 2:
		// Call public class DeleteFile for Option 2
		DeleteFile df= new DeleteFile();
		df.deleteFile();
		
		// Pause for user see the result 
		pressEnterToContinue();
        break;
        
	case 3:
		
		// Call public class SearchFile for Option 3
		SearchFile sf= new SearchFile();
		sf.SearchFile();
		
		// Pause for user see the result 
		pressEnterToContinue();
        break;
		
	case 4:
		// return to main menu
		break;
		
		// do not need default, because logic should not reach default
	}
	// if user wants to return to main menu, break this menu loop
      	if ( userChoice==4 )
	  { break;
	   };
}
}
}
