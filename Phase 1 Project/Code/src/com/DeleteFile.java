package com;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// subclass DeleteFile extends Super-class SearchFile for re-use the case-sensitive search method
public class DeleteFile extends SearchFile {
	
	public void deleteFile () {
	System.out.println("\nPlease enter the file name to delete: ");
	System.out.println("----------------------------------------");
	Scanner sc = new Scanner(System.in);
    String fileName = sc.next();
		
	//filename with full path
    String filePath="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage";
	
	//filename with full path and name
	String filePathAndName="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage\\"+fileName;
	
	File fP = new File(filePath);
	
	File fPname = new File(filePathAndName);
	
	
//   Inheritance from super class SearchFile for re-use the method CaseSensitiveSearch
//	 SearchFile sf = new SearchFile();
		if (CaseSensitiveSearch(fileName))
		{
		 // delete the file if exact match true
			try { 
				if (fPname.delete()) 
				{ System.out.println("\n"+fileName+" is deleted.");
			     } else
			         { System.out.println("\n"+fileName+" exists, but cannot be deleted.");
			          }
				 } catch (Exception e )
			            { e.printStackTrace(); 
		                 }
		}
	     else
	     {
	       System.out.println("\n"+fileName+" is not found, no deletion!");  
	     }; 
   }	
 }
