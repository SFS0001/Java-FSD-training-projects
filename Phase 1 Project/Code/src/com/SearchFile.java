package com;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchFile {
	
	public boolean CaseSensitiveSearch(String fileName) {
	       boolean fileFound = false;
		   //filename with full path
			String filePath="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage";
			String filePathAndName="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage\\"+fileName;
				
			File fP = new File(filePath);
			File fPname = new File(filePathAndName);
				
			//define Array listFiles storing list of file path and name
			File[] listFiles = fP.listFiles();
			
			// define an collections ArrayList arFilename for filenames, prepare for filename match test		
			ArrayList<String> arFilename1= new ArrayList<String>();
			 			
			for ( int i=0; i < listFiles.length; i++) 
			   { if (listFiles[i].isFile())  // exclude directory, only files allowed to be added to ArrayList
				 { arFilename1.add(listFiles[i].getName());  //get the filename without absolute path
			      } 		
			    }
			// define and initiate file finding result flag, fFound 
			int fFound =0;	     
			
			for (Object i : arFilename1)  // use Object i to test ArrayList arFilename with user specified filename
				 { 	if (fileName.equals(i.toString()))
					{
        			  fileFound = true;
			    	  } 
				  };
			return fileFound;
	}
	
	public void SearchFile () {
		System.out.println("\nPlease enter the file name for search: ");
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
			
		//filename with full path
		String filePath="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage";
		String filePathAndName="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage\\"+fileName;
		
		File fP = new File(filePath);
		File fPname = new File(filePathAndName);

		// call public class for case-sensitive file search
		 // if exact match is true, do something = display File Found
		
	 	if( CaseSensitiveSearch(fileName) ) {
	 	// get file modify time stamp
		      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		      System.out.println("\n"+fileName+" is found, it was created at "+sdf.format(fPname.lastModified()));
	 								 	} 
	 	else { 	   
	 		  // file not found 
	 	    	 System.out.println("\n"+fileName+" does not exist!");
    	     }; 		    
  }
}
	