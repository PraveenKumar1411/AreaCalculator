package com.wipro.springboot.assignments.Shape;

public class Square implements Shape {

	private double side;
	
	
	public Square(double s) {
		this.side=s;
	}
	
	@Override
	public double calculateArea() {
		return this.side*this.side;
	}

	@Override
	public double calculatePerimeter() {
		return 4*this.side;
	}
	
}
