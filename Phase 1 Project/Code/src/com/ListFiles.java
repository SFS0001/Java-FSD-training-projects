package com;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ListFiles {
		 // define method printFilename 
		 public void printFilename() {
		     //define working directory path, fpath		
			 String fpath="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage";
			 
			//create a File instance
			 File fClass = new File(fpath);
	      
		    //print the header 
			System.out.println("\nFiles are listed in ascending order, excluding any sub-directories:");
			System.out.println("-------------------------------------------------------------------");

		   //define Object type File listFiles storing list of files 
		    File[] listFiles = fClass.listFiles();
		    
        // define an collections ArrayList arFilename for filenames, prepare for sorting		
			ArrayList<String> arFilename= new ArrayList<String>();
			
		     for ( int i=0; i < listFiles.length; i++) 
		     { 		      
		    	 if (listFiles[i].isFile())  // exclude directory, only files allowed to be added to ArrayList
		    	 { 		           
			          arFilename.add(listFiles[i].getName());  //get the filename by getName without absolute path
			      } 		
		      } 
		     
		 //Sorting ascending with Collections class sort
			Collections.sort(arFilename);
					
		//Printout the list with the help of Object i
			if (arFilename.size()==0)  // If there is no file, print no-file information 
			{
			System.out.println("\nThere is no file in this directory.");	
			}
			else
			{
			for (Object i : arFilename)  // use Object i to printout ArrayList arFilename in vertical ascending order
			 { 
				System.out.println(i.toString());
		     }
			}
			System.out.println("-------------------------------------------------------------------"); //print footer
		 }
}

