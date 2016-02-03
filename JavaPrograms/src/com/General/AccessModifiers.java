//d. Write a program that implements various functions of different type of access modifiers
//(private,protected,default,public) and then access these methods with in 
//or outside the class based on the identifier scope

package com.General;

public class AccessModifiers {
	public static void main(String[] args) {

		new AccessModifiers().passWord();

	}

	private void passWord() {
		System.out.println("Available only in same class");
	}

	int sum(int a, int b) {
		return a + b;
	}

	protected void check(int c, int d) {
		if (c > d) {
			System.out.println("Is greater");
		} else {
			System.out.println(" Is not greater");
		}
	}

	public int college(int[] students) {

		for (int element : students) {
			System.out.println(element);
		}
		return 0;

	}

}
