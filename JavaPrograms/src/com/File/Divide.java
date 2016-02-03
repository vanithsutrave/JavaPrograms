//Console: Use this class to input 2 integer numbers and divide them.

package com.File;

import java.io.Console;
import java.io.IOException;

public class Divide {

	public static void main(String[] args)throws IOException {
		
		Console console = null;
		try {console = System.console();
		System.out.println("Enter the first number");		
		String s = console.readLine();
		int i = Integer.parseInt(s);
		
		System.out.println("Enter the second number");		
		String s1 = console.readLine();
		int i1 = Integer.parseInt(s);
		
		int div = i / i1;
		System.out.println("The result of division is: " + div);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}
