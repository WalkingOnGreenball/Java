package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_ForAfterClass3 {
	public static void main (String [] args)
	{
		//3번
	    //1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. 
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			
			if (i < num) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
	}
}
