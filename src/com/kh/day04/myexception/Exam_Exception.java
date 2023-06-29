package com.kh.day04.myexception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main (String [] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print ("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.print ("정수 하나 입력 : ");
			int input2 = sc.nextInt();
			
			System.out.println("나눠드릴게요. 조금만 기다리세요!");
			int result = input1 / input2;
			System.out.printf("몫은 %d 입니다.", result);
		}catch (ArithmeticException e) // 예외 창에서 가져옴, ArithmeticException은 타입이기 때문에 뒤에 변수명을 꼭 써줘야한다.
		{
			System.out.print (e.getMessage());
//			e.printStackTrace();
		}
		
		
	}
}
