package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main (String [] args)
	{
		// 점수와 학년을 입력 받아 60점 이상이면 합격,
		// 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int point = sc.nextInt();
		
		System.out.print("(숫자로만 입력) 학년 : ");
		int grade = sc.nextInt();
		
//		if (100 >= point || 4 >= grade) {
//			if (grade < 4 && point >= 60) {
//				System.out.println(grade + "학년 " + point + "점 " + "합격입니다.");
//			} else if (grade == 4 && point >= 70) {
//				System.out.println(grade + "학년 " + point + "점 " + "합격입니다.");
//			} else {
//				System.out.println(grade + "학년 " + point + "점 " + "불합격입니다.");
//			}
//		}
//		else {
//			System.out.println("잘못 입력하셨습니다");
//		}
		
		
		
		
		if(point >= 60) {
			if(grade != 4) {
				System.out.println(grade + "학년 " + point + "점 " + "합격입니다.");
			} else if (grade == 4 && point >= 70) {
				System.out.println(grade + "학년 " + point + "점 " + "합격입니다.");
			} else {
				System.out.println(grade + "학년 " + point + "점 " + "불합격입니다.");
			}
		} else {
			System.out.println(grade + "학년 " + point + "점 " + "불합격입니다.");
		}
	}
}
