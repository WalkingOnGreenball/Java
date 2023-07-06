package com.kh.day08.oop.homework.q5;

public abstract class Cafe { // 추상 클래스 - abstract 기재
	
//	String name;
//	
//	public Cafe() {}
//	public Cafe(String name) {
//		this.name = name;
//	}
	
	// 커피를 만들어줌
	abstract public void makeCoffee(int money); // 추상 메소드 - abstract 기재 *어처피 안쓰고 다른 cafe 클래스들이 오버라이딩으로 대치해서 쓰기 때문에
}
