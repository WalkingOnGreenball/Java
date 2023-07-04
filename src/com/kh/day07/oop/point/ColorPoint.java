package com.kh.day07.oop.point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(int x, int y, String color) {
//		super.x = x;
//		super.y = y;
		super(x, y); // 생성자 초기화 작업 - 부모의 생성자
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		super.showPoint(); // 부모에게서 옴
	}
}