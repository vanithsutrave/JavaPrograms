package com.General;

public class AccessModifiersTestClass {

	public static void main(String[] args) {

		AccessModifiers a = new AccessModifiers();

		// default
		System.out.println("Result= " + a.sum(2, 5));

		// protected -----> Within the package and outside the package only
		// through inheritance
		a.check(4, 5);

		// public
		int[] students = { 2, 3, 4, 6, 7 };
		a.college(students);

		// private
		// a.msg(); ----------> Compile time error

	}

}
