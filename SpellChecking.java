//Author Name: Kylie Fauquher
//Date: 01/2022

package spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class SpellChecking {
	
	//Constant files that will be entered
	private static String FILE_TO_CHECK = "File to Check";
	private static String DICTIONARY_FILE = "Dictionary File";
	
	//Scanner for user input
	private static Scanner keyboard;
	
	//Main method
	public static void main(String[] args) {
		
		System.out.println("**************Welcome to Java Spell Checker!**************\nFollow directions below, otherwise enter 'Quit' to exit program at any time.");
		
        //Scanner for user input
		keyboard = new Scanner(System.in);
		
		//Lists created for each file
		ArrayList<String> filetoCheckLIST = null;
		ArrayList<String> dictionaryFileLIST = null;
		
		//User enter file to be checked
		while(filetoCheckLIST == null) {
			String fileToCheck = fileName(FILE_TO_CHECK);
			
			filetoCheckLIST = createArrayListFromFile(fileToCheck);
			
		}
		
		//User enter dictionary to be checked
		while(dictionaryFileLIST == null) {
			String fileToCheck = fileName(DICTIONARY_FILE);
			
			dictionaryFileLIST = createArrayListFromFile(fileToCheck);
		}
		
		//Checks dictionary file and file to check, if word is not in dictionary then print
		System.out.println("\n\nJava Spell Checker has detected the following mispelled words: \n");
		for(Object word : filetoCheckLIST) {
			if(!dictionaryFileLIST.contains(word)) {
				System.out.println(word);
			}
		}
		
		System.out.println("\n\nThank you for using Java Spell Checker. Exiting program now...");
		System.exit(0);
		
	}
	
	//Method asks for file name
	public static String fileName(String fileName) {
		System.out.println("\n\nEnter Path and File Name: " + fileName + "\n(Right click on your file and navigate to Properties, click on the Details tab and enter the Folder Path)");
		String fileToCheck = keyboard.nextLine();
		return fileToCheck;
	}
	
	//Method creates ArrayList from files
	public static ArrayList<String> createArrayListFromFile(String file) {
		
		//Exit program if user enters quit
		if(file.equalsIgnoreCase("quit")) {
			
			System.out.println("\n\nThank you for using Java Spell Checker. Exiting program now...");
			System.exit(0);
		}
		Scanner textFile;
		
		//Puts contents of file on ArrayList
		try {
			textFile = new Scanner(new File(file));
			ArrayList<String> filesArrayList = new ArrayList<String>();
			
			while(textFile.hasNextLine()) {
				filesArrayList.add(textFile.nextLine());
			}
			textFile.close();
			return filesArrayList;
		}
		catch(FileNotFoundException e) {
			System.out.println("\n\nERROR: FILE NOT FOUND: " + file + "\nPlease try again.erg(Example: C:\\Users\\ABC\\Desktop\\File.txt)\n\n");
		}
		
		return null;
		}
	}
	
		
		
		
		
		
		
	

	
	
	
			 


		 
		 
	 


	

	


		
		
			
			 
		

			
			 
			

			
					
		   



		
		
		
	


