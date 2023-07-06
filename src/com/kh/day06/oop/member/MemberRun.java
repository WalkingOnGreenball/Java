package com.kh.day06.oop.member;

import java.util.Scanner;

import com.kh.day05.oop.exercise.Student;

public class MemberRun {
	public static void main(String []args) {
		
		Member [] memArr = new Member[2];
		
		finish:
		while(true) {
			int choice = menu();
			
			switch(choice) {
			case 1 :
				inputScore(memArr);
				break;
			case 2 :
				printScore(memArr);
				break;
			case 3 :
				testResult(memArr);
				break;
			case 4 :
				exitProgram();
				break finish;
			}
		}
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 성적 확인 프로그램 =====");
		System.out.println("=== 1. 학생 성적 입력 ===");
		System.out.println("=== 2. 학생 성적 출력 ===");
		System.out.println("=== 3. 재평가 여부 확인 ===");
		System.out.println("=== 4. 프로그램 종료 ===");
		System.out.println("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public static void inputScore(Member [] memArr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < memArr.length; i++) {
			System.out.println((i+1)+"번째 학생 성적 입력");
			System.out.println("학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("1차 점수 입력 : ");
			int score1 = sc.nextInt();
			System.out.println("2차 점수 입력 : ");
			int score2 = sc.nextInt();
			memArr[i] = new Member();
			memArr[i].setName(name);
			memArr[i].setScore1(score1);
			memArr[i].setScore2(score2);
		}
	}
	public static void printScore(Member [] memArr) {
		for(int i = 0; i < memArr.length; i++) {
			System.out.println((i+1)+"번째 학생 성적 출력");
			System.out.println(memArr[i].getName() + "학생의 점수는 1차 점수 : "
					+ memArr[i].getScore1() + ", 2차 점수 : " 
					+ memArr[i].getScore2() + "입니다.");
		}
	}
	public static void testResult(Member [] memArr) {
		for(int i = 0; i < memArr.length; i++) {
			double avg = memArr[i].getAvg();
			int num1 = memArr[i].getScore1();
			int num2 = memArr[i].getScore2();
			System.out.println((i+1)+"번째, " + memArr[i].getName() + "학생 확인 결과");
			
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재평가");
				} else if (num2 < 40) {
					System.out.println("2차 시험 재평가");
				} else {
					System.out.println("통과");
				}
			} else {
				if (num1 < 60) {
					System.out.println("1차 시험 재평가");
				}
				if (num2 < 60) {
					System.out.println("2차 시험 재평가");
				}
			}
		}
	}
	public static void exitProgram() {
		System.out.println("프로그램 종료");
	}
}
