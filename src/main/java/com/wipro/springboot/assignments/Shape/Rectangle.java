package com.wipro.springboot.assignments.Shape;

public class Rectangle implements Shape{

	private double length;
	
	private double width;
	
	
	public Rectangle (double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	@Override
	public double calculateArea() {
		return this.length*this.width;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(this.length+this.width);
	}

}
