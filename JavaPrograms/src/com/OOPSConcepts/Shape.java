//a. Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter)
// and methods(calculateArea,calculatePerimeter,setSides.





package com.OOPSConcepts;


abstract class Shape {
	
	protected int noOfSides;
	protected double area;
	protected double perimeter;
	
	protected abstract void calculateArea();
	
	protected abstract void calculatePerimeter();
	
	protected abstract void setSides();

}
