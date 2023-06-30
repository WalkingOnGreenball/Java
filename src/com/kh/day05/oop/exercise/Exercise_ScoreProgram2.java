package com.kh.day05.oop.exercise;

import java.util.Scanner;

//====== 구조적 프로그래밍

public class Exercise_ScoreProgram2 {
	
	public static void main (String [] args) 
	{
		finish:
		while(true) {
			Scanner sc = new Scanner (System.in);
			printMenu();
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : 
					Student.inputScore();
					break;
				case 2 :
					Student.printScore();
					break;
				case 3 : 
					showGoodBye();
					break finish;
				default : printException();
			}
		}
	}
	public static void printMenu() {
		System.out.println ("====== 메인 메뉴 ======");
		System.out.println ("1. 성적 입력");
		System.out.println ("2. 성적 출력");
		System.out.println ("3. 종료");
		System.out.println ("선택 : ");
	}
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	public static void printException() {
		System.out.println ("1, 2, 3 중에 입력하세요.");
	}	
}
