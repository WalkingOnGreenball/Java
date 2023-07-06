package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_ForAfterClass6 {
	public static void main (String [] args)
	{
		//6번  
	    //사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	    //단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요. : ");
		int dan = sc.nextInt();
		
		for(int j = dan; j < 10; j++) {		
			System.out.println(j + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + j*i);
			}
			System.out.println();
		}
	}
}
