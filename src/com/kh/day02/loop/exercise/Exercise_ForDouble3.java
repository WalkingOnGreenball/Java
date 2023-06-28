package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main (String [] args)
	{
		// 0시 0분부터 23시 59분까지 출력하기 !
		
		for (int k = 0; k < 24; k++) {
			for (int h = 0; h < 60; h++) {
				System.out.printf("%2d시 %2d분\n", k, h); // printf, 형식문자를 사용해 문자 공간의 너비를 정해줌
			}
		}
	}
}
