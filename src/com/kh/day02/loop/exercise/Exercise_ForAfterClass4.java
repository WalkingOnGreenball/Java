package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_ForAfterClass4 {
	public static void main (String [] args)
	{
		//4번  
	    //사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	}
}
