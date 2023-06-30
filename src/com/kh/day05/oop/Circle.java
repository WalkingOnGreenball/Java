package com.kh.day05.oop;

// ============ 클래스
public class Circle {
	
	// ============ 필드
	public int radius; // 원의 반지
	public String name; // 원의 이름
	
	
	
	
	// ============ 생성자
	// 특징 1 : 반환형이 없다(return 이 없어도 void를 안써도 된다.)
	// 특징 2 : 클래스의 이름과 이름이 동일하다.
	// 특징 3 : 기본 생성자는 생략이 가능하다. * 단 매개변수 생성자가 없을때만 !
	// 특징 4 : 객체 초기화 : 필드에 값을 넣는 것
	
	
	// 기본 생성자
	public Circle() { 
		radius = 1;
		name = "아무개";
	}
	
	// 매개변수가 있는 생성자
	public Circle(int radius, String name) { 
		this.radius = radius;
		this.name = name;
	}
	
	
	
	
	// ============ 메소드
	public double getArea() { // 원의 넓이를 구해주는 메소드
		return 3.14*radius*radius;
	}
}
