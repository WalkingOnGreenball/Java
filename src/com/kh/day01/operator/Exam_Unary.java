package com.kh.day01.operator;

public class Exam_Unary {
	public static void main (String [] args)
	{
		// 단항 연산자
		int a = 1;
		// a++,++a -> a = a + 1;
		System.out.println(a++); // 후위 연산 (나중 연산)
		// - a가 2인 상태
		System.out.println(++a); // 전위 연산 (먼저 연산)
		// - a가 3인 상태
		System.out.println(a);
	}
}