package com.kh.day08.oop.homework.q6;

public class Card {
	int cardNum;
	static int serialNum = 10000; // 계속 초기화 되길래 static을 전역변수 느낌으로 사용
	
	public Card() {
		cardNum = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNum+ "입니다.");
	}
	
}
