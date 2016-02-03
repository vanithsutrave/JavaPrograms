//DatainputStream: Use this class to input 2 integer numbers and multiply them.

package com.File;


import java.io.DataInputStream;
import java.io.IOException;



public class Multiply {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = null;
		
		try {	
		dis = new DataInputStream(System.in);
		System.out.println("Enter the first integer");
		int x = dis.readInt();
	
		System.out.println("Enter the second integer");
		int y = dis.readInt();
		
		int mul = x * y;
		System.out.println("The result of subtraction is: " + mul);
		mul = dis.readInt();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		dis.close();
	}

}
