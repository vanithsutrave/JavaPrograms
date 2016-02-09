//c. Write a program to search for a string in a file and then return the count of number of occurrences of the string.

package com.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchString {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int total_no_of_words = 0;
		
		while((line=br.readLine())!=null)
		{		
			System.out.println("Read line :" + line);
			System.out.println("Does the file contain the string 'you' :" + line.contains("you")); 
			
		}
		fr.close();
		br.close();
	}

}
