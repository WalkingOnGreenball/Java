package com.kh.day05.oop;

class StaticSample {
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	
	public void goodMethod() {
	
	}
	
	public static void originMethod() {
		input = 1225;
	}
}

// 메모리는
// 정적 stack
// 동적 heap
// 늘 준비되어있는 static

public class Exam_Static {
	public static void main (String[] args)
	{
		StaticSample.input = 10;
		// new 하지 않아도 바로 쓸 수 있음
		// static이라는 메모리 공간에 저장하여 씀
		
		StaticSample.originMethod();
		
		System.out.println(StaticSample.input);
		
		StaticSample sample = new StaticSample();
		sample.num = 26;
	}
}
