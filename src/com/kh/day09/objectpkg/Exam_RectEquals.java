package com.kh.day09.objectpkg;

class Rect {
	int width, height;
	public Rect() {}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect)obj; // 다운캐스팅
		if(width*height == r.width*r.height) {
			return true;
		}else {
			return false;
		}
	}
}

public class Exam_RectEquals {
	public static void main(String[] args) {
		Rect rect1 = new Rect(2, 3);
		Rect rect2 = new Rect(2, 3);
		
//		if(rect1 == rect2) { // 다르다
//		if(rect1.equals(rect2)) { // 변수가 2개여서 다르다
		if(rect1.equals(rect2)) { // Rect 가 가지고 있는 rect2는 같다
			
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}
	}
}
