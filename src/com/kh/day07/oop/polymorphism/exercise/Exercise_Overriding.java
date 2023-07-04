package com.kh.day07.oop.polymorphism.exercise;

// 출력 결과를 대답해보시오.

class SuperClass {
	void paint() { // 4
		draw(); // 5
	}
	void draw() { // 8
		System.out.println("Super Object"); // 9
	}
}

class SubClass extends SuperClass {
	void paint() { // 2
		super.paint(); // 3
		super.draw(); // 7
	}
	void draw() {
		System.out.println("Sub Object"); // 6
	}
}


public class Exercise_Overriding {
	public static void main (String[] args) {
		SuperClass ex = new SubClass();
		ex.paint(); // 1
	}
}