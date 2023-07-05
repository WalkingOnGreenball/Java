package com.kh.day08.oop.homework.q5;

public class CongCafe extends Cafe{
	@Override
	public void makeCoffee(int money) {
		if(money == Menu.CONG_AMERICANO) {
			System.out.println("주문하신 그냥 아이스 아메리카노 한잔 나왔습니다.");
		} else if (money == Menu.CONG_LATTE) {
			System.out.println("주문하신 그냥 라테 한잔 나왔습니다.");
		} else {
			System.out.println("금액이 더 필요합니다.");
		}
	}
}
