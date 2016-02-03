//g. Write a program to implement hashCode() and equals() methods.

package com.Strings;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = new String("Hello");

		if (s1.equals(s2)) {
			System.out.println("s1: " + s1.hashCode() + " is same as " + "s2: " + s2.hashCode());
		} else {
			System.out.println("Hashcode are not same");
		}

	}

}
