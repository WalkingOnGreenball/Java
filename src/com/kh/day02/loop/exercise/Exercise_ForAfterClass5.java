package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_ForAfterClass5 {
	public static void main (String [] args)
	{
		//5번
	    // 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요. : ");
		int dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * "+ i + " = " + dan*i);
		}
	}
}
