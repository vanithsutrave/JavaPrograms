/*
h. Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******
 */

package com.loops;

public class Patterns {

	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();

		}
	}

}
