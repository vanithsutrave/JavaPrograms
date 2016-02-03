//c. Write a program that creates a class Circle extending Shape abstract class and 
//implementing ShapeConstants interface and has following behavior.
  		//	--> Properties: radius.
  		//	--> Constructor: To set number of sides.
  		//	--> Overrides all the methods from parents.

package com.OOPSConcepts;

public class Circle extends Shape implements ShapeConstants{
	
	private double radius;
	
	public Circle(int noOfSides) {
		this.noOfSides = noOfSides;	
	}
	
	public void calculateArea() {
		double area = pi * (radius * radius);
		System.out.println("Total circle area = " + area);
	}
	
	public void calculatePerimeter() {
		double perimeter = 2 * pi * radius;
		System.out.println("Total circle perimeter = " + perimeter);
		
	}
	
	public void setSides(){
		noOfSides = 0;
		System.out.println(noOfSides);
		
	}

}
