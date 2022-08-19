package com.test.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Files003 {

	public static void main(String[] args) {
		
		
		try {
			
			Scanner scan=new Scanner(new File("text.txt"));
		     String current;
		     String longWord = " ";
		     while(scan.hasNext()) {
				 current=scan.next();
				 if(current.length()>longWord.length()) {
				 
					 longWord = current;
				 }
	}
		     System.out.println("Longest word is: " + longWord);
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
