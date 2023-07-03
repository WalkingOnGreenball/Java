package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	static int choice = 0;
	
	public static void main (String [] args) {
		
		Student [] stdArr = new Student[2];
		
		finish:
		while(true) {			
			int choice = menu();
			switch(choice) {
			case 1 : 
				inputScore(stdArr);
				break;
			case 2 : 
				printScore(stdArr);
				break;
			case 3 : 
				testResult(stdArr);
				break;
			case 4 : 
				exitProgram();
				break finish;
			}
		}
	}
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("=== 학생 성적 확인 프로그램 ===");
		System.out.println("=== 1. 학생 성적 입력 ===");
		System.out.println("=== 2. 학생 성적 출력 ===");
		System.out.println("=== 3. 재평가 여부 확인 ===");
		System.out.println("=== 4. 프로그램 종료 ===");
		System.out.println("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void inputScore(Student [] stdArr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stdArr.length; i++) {			
			System.out.println((i+1)+"번째 학생 성적 입력");
			System.out.println("학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("1차 점수 입력 : ");
			int score1 = sc.nextInt();
			System.out.println("2차 점수 입력 : ");
			int score2 = sc.nextInt();
			stdArr[i] = new Student();
			stdArr[i].setName(name);
			stdArr[i].setScore1(score1);
			stdArr[i].setScore2(score2);
		}
	}
	public static void printScore(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {		
			System.out.println((i+1)+"번째 학생 성적 출력");
			System.out.println(stdArr[i].getName() + "학생의 점수는 1차 점수 : " + stdArr[i].getScore1() + ", 2차 점수 : " + stdArr[i].getScore2() + "입니다.");
		}
	}
	public static void testResult(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++) {			
			double avg = stdArr[0].getAvg();
			int num1 = stdArr[0].getScore1();
			int num2 = stdArr[0].getScore2();
			System.out.println((i+1)+"번째, " + stdArr[i].getName() + "학생 확인 결과");
			
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
//			System.out.println("1차, 2차 재평가");
			}
		}
	}
	public static void exitProgram() {
		System.out.println("프로그램 종료");
	}
	
	// 학생 성적 확인 프로그램
	// 1. 학생 성적 입력
	// 2. 학생 성적 출력
	// 3. 재평가 여부 확인
	// 4. 프로그램 종료
	// 메뉴 입력 : 4
	
	// 1. 선택시
	// 1번째 학생 정보 입력
	// 학생 이름 입력 : 일용자
	// 1차 점수 입력 : 60
	// 2차 점수 입력 : 55
	// => 1명씩 입력받도록 하거나
	// 2명 한꺼번에 입력받도록 하세요.
	
	// 2. 선택시
	// 1번째 학생 정보 출력
	// 일용자 학생의 점수는
	// 1차 점수 : 60, 2차 점수 : 55 입니다.
	
	// 3. 선택시
	// 1번째 일용자 학생의 확인결과
	// 통과했습니다.
	
	// 1번째 일용자 학생의 확인결과
	// 1차 시험 재평가 대상자 입니다.
	// or
	// 2차 시험 재평가 대상자 입니다.
	// or
	// 1차 시험 재평가 대상자 입니다.
	// 2차 시험 재평가 대상자 입니다.
	
	// 4. 선택시
	// 프로그램이 종료되었습니다.
	
	// 재평가 기준 설명
	// 0. 재평가 여부는 1차, 2차가 각각 다르다.
	// 1. 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다
	// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
	// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의
	// 과목은 재평가를 본다.
}
