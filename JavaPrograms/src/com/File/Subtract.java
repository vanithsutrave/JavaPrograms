//BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.

package com.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtract {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {	
		System.out.println("Enter the first integer");
		String first = br.readLine();
		int x = Integer.parseInt(first);
	
		System.out.println("Enter the second integer");
		String second = br.readLine();
		int y = Integer.parseInt(second);
		
		int sub = x - y;
		System.out.println("The result of subtraction is: " + sub);
		sub = br.read();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		br.close();
	}

}
