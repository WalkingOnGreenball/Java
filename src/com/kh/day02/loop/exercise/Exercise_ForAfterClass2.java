package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_ForAfterClass2 {
	public static void main (String [] args)
	{
		//2번
	    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
	}
}
