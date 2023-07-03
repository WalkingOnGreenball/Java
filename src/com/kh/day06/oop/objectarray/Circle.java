package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area; // void 아니고 자료형이면 무조건 return 입력!
	}
}
