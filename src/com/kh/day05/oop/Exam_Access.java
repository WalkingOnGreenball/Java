package com.kh.day05.oop;

// 접근 지정자, 접근 제한자
class Sample {
	public int a;
	// 모든 곳에서 접근 가능
	
	private int b;
	// 해당 클래스에서만 접근 가능
	
	int c;
	// default : 아무것도 안쓰면
	// 해당 클래스의 패키지 이내에서만 접근 가능
}

public class Exam_Access {
	public static void main (String [] args)
	{
		Sample sample = new Sample();
		sample.a = 5;
		
		sample.b = 15;
		// The field Sample.b is not visible
		// 멤버변수 b는 private이기 때문에 보이지않아서 접근불가
		
		sample.c = 10;
		// default는 접근가능, 왜냐하면 같은 패키지이기 때문에
	}
}
