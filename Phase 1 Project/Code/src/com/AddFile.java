package com;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile { 
	
	public void addFile () throws IOException {
	System.out.println("\nPlease enter the file name to create: ");
	System.out.println("----------------------------------------");
	Scanner sc = new Scanner(System.in);
	String fileName = sc.next();
	

	//filename with full path 
    	
	//case in-sensitive, by default 
	String filePath="C:\\Users\\Daniel\\Documents\\Feng\\JavaFullStack\\Training\\Java Full Stack Developer Program-Steven Feng Situ\\Phase 1 Project\\Code\\FileStorage\\"+fileName;

	
	File file = new File(filePath);
//	String fileContent = "test content";
	
	if(file.exists()) {
		System.out.println("File already exists!");
	}else {
		//create a file using FielWriter and BufferedWriter for write efficiency
		FileWriter fw = new FileWriter(filePath);
//		// set default butter size 8192 characters for BufferedWriter
//		int bufferSize = 8192;
//		BufferedWriter buffer = new BufferedWriter(fw, bufferSize);
//		
//		// Writes the buffer  to the file
//	    buffer.write(fileContent);
//	    
//	    //flush and close the buffer
//	    buffer.flush();
//	    buffer.close();
		System.out.println("\n"+fileName+" is created.");
	     }
  }
}
