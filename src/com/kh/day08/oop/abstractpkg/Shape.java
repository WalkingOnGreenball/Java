package com.kh.day08.oop.abstractpkg;

class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	// 추상메소드 오버라이딩 하기, 안할거면 class 앞에 abstract 붙이기

	@Override
	public void draw() {
		
	}
	
}

public abstract class Shape {
	// 3. The type Shape must be an abstract class to define abstract methods
	// - 추상 메소드가 있으려면 추상 클래스여야한다. = class에 abstract 붙이기
	
	public Shape() {}
	
	public void paint() {}
	
	abstract public void draw();
	// 1. Abstract methods do not specify a body
	// - 추장 메소드는 몸체를 특정할 수 없다. = {} 없애기
	
	// 2. The abstract method draw in type Shape can only be defined by an abstract class
	// - 추상 메소드가 있으려면 추상 클래스여야한다. = class에 abstract 붙이기
	
}
