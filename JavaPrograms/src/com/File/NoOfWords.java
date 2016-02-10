//b. Write a program to count the number of words in a file.

package com.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWords {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("test.txt");
		
		
		BufferedReader br = new BufferedReader(fr);
		String line;
		int total_no_of_words = 0;
		
		while((line=br.readLine())!=null)
		{		
			System.out.println("Read line" + line);
			String[] words_arr = line.split(" ");
			total_no_of_words += words_arr.length;

		}
		System.out.println("Total no of words = " + total_no_of_words);
			
			
			
			
			
		
	
	}
}
		