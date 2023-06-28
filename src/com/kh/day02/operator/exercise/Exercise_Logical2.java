package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main (String [] args)
	{
		// 입력한 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		System.out.print("입력한 문자가 대문자인지 소문자인지 확인하세요! : ");
		Scanner sc = new Scanner(System.in);
//		String words = sc.next();
//		System.out.println("문자열 확인 : " + words);
		
		char word = sc.next().charAt(0); // 입력받은 문자열에서 첫번째 인덱스 값을 잘라 문자를 만들겠다.
		System.out.println("문자 출력 : " + word);
		boolean result = (word >= 'A') && (word <= 'Z'); // char는 숫자로도 변할 수 있는데 그래서 비교 연산자를 사용할 수 있다. *char로 변하는 글자는 아스키 코드의 숫자에서 온다.
		System.out.println("영어 대문자 확인 : " + result);
		
		
//		boolean result;
//
//		result = (word == "A") || (word == "B"); // || "C" || "D" || "E" || "F" || "G" || "H" || "I" || "J" || "K" || "L" || "M" || "N" || "O" || "P" || "Q" || "R" || "S" || "T" || "U" || "V" || "W" || "X" || "Y" || "Z");
//		
//		System.out.println("결과값 : " + result);
	}
}