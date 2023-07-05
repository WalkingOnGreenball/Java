package com.kh.day08.oop.homework.q5;

public class Person {
	private String name;
	private int money;
	
	public Person() {}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(Cafe cafe, int money) { //돈을 가지고 커피가 나와야함
//		this.money = this.money - money;
		this.money -= money;
		cafe.makeCoffee(money);
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}
