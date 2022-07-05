package lockedMe;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe 
{
	// Declaring variable
	
	static String fileName;
	static final String projectPath = "E:\\Simpli\\JAVA\\NewLockedMe";
	static int choice = 0;
	  
	// Scanner class for accessing all files functions
	
	static Scanner readScanner = new Scanner(System.in);
	static final String errorMessage = "Error occured ,Please contact on garudrhutuja28@rediffmail.com";
	
	//This method displays the all file Menu

	public static void displayMenu() {
		 System.out.println("\t***************************************************************\n");
		 System.out.println("\t\tWelcome to Company Lockers Pvt. Ltd.\n");
		 System.out.println("\t****************************************************************");
		 System.out.println("\t**Get the All Files name in Ascending order**");
		System.out.println("\t\t 1 - Display all the files Menus");
		System.out.println("\t\t **Business Level Operation**");
		 System.out.println("\t\t 2 - Create  a New File");
		 System.out.println("\t\t 3 - Delete a File");
		 System.out.println("\t\t 4 - Search a File");
		 System.out.println("\t\t**Close the Application**");
		 System.out.println("\t\t 5 - Exit\n");
		 System.out.println("\t***************************************************************\n"); 
		 System.out.println("\t\t Developer Details: Rhutuja J. Garud\n");
		 System.out.println("\t*****************************************************************");
	}
	
	//  Method for  return all the files in the directory

	    public static void getAllFiles() 
	    {
	    // using try-catch block
	    	try 
	    	{
	    		File folder = new File(projectPath);
	    		File[] listOfFiles = folder.listFiles();
	    		if (listOfFiles.length == 0) 
	    		{
	    			System.out.println("Files are not available in the directory");
	           }
	    		else
	    		{
	    			for (var l : listOfFiles) 
	    			{ 
	    				System.out.println("File: " + l.getName());
	    			}
	    		}
	} 
	    	catch (Exception ex) 
	    	{
	System.out.println(errorMessage);
	       }
	}
	
	 // Method for creating files
	
	public static void createFiles() 
	{
	     int linesCount = 0;
	// Using Try-Catch Block
	     try 
	     {
	        System.out.println("Enter your File Name: ");
	        fileName = readScanner.nextLine();
	        FileWriter myWriter = new FileWriter(projectPath + "//" + fileName);
	       
	          for (var i = 0; i <= linesCount; i++) 
	          	System.out.println("File Successfully Created.");
	           	myWriter.close();
	       } 
	     catch (Exception Ex) 
	     {
	          System.out.println(errorMessage);
	}
	}
	//Method for Deleting files
	
		public static void deletefiles() 
	{
		// Creating a Try Catch block
			try 
			{
				String fileName;
				System.out.println("Enter the file name that you want  to be deleted: ");
				fileName = readScanner.nextLine();
				File file = new File(projectPath + "//" + fileName);
				if (file.exists()) 
				{
					file.delete();
					System.out.println("File deleted successfully: " + fileName);
				} 
				else 
				{
					System.out.println("File is not available in the directory, Please create a file in-order to ");
	}
	} 
			catch (Exception Ex)
			{
	System.out.println(errorMessage);
	}
	}
	//Method for searching files 
		
	public static void searchFiles() 
	{
	// Creating a try-catch block
	 try 
	 {
		 String fileName;
		 System.out.println("Enter the file name that you want  to be searched: ");
		 fileName = readScanner.nextLine();
		 File folder = new File(projectPath);
		 File[] listOfFiles = folder.listFiles();
		 LinkedList<String> filenames = new LinkedList<String>();
		 for (var l : listOfFiles) {
			 filenames.add(l.getName());
	}
		 if (filenames.contains(fileName)) 
		 {
			 System.out.println("File is Available");
		 } 
		 else 
		 {
			 System.out.println("File not available in the directory you're searching.");
		 }
	} 
	 catch (Exception Ex)
	 		{
		 System.out.println(errorMessage);
	 		 }
	}
	//Main method for calling  all file operations 
	
	public static void main(String[] args) {
	
		// Do-while loop for repeation
	do 
	   {
	displayMenu();
	System.out.println("Enter your choice: ");
	choice = Integer.parseInt(readScanner.nextLine());
	
	// Using Switch Case for different action base on different condition 
	switch (choice) 
	{
	case 1:
	getAllFiles();
	break;
	case 2:
	createFiles();
	break;
	case 3:
	deletefiles();
	break;
	case 4:
	searchFiles();
	break;
	case 5:
	System.exit(0);
	break;
	default:
	System.out.println("Invalid Option ");
	break;
	 }
	} while (choice > 0);
	
	// Closing the scanner class to ensure no input and output is opened
	readScanner.close();
	  }
	}


