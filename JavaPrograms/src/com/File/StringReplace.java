//d. Write a program to search for a string in a file and then replace it with another string.

package com.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReplace {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int total_no_of_words = 0;
		
		while((line=br.readLine())!=null)
		{		
			System.out.println("Read line :" + line);
			String replaceString = line.replaceAll("you","flowers"); 
			System.out.println(replaceString); 
			
		}
		fr.close();
		br.close();
	}

}
