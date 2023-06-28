package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10 = 55
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			
			if (i <= 9) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(sum);
	}
	
	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1~9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다."를 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		
		if (dan < 10 && dan >= 1) {
			System.out.println(dan+"단");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan+" * "+i+" = "+dan*i);
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
	}
	
	public void forDoubleExercise1() {
		// 구구단 출력
		// 2단 옆에 3단, 3단 옆에 4단 ... 이 되게 하시오
		
		
//		System.out.print("2 * 1 = 2\t"); // /t는 간격을 맞춰준다.
//		System.out.print("3 * 1 = 3\t");
//		System.out.print("4 * 1 = 4\t");
//		System.out.print("5 * 1 = 5\t");
//		System.out.print("6 * 1 = 6\t");
//		System.out.print("7 * 1 = 7\t");
//		System.out.print("8 * 1 = 8\t");
//		System.out.print("9 * 1 = 9\t");
//		System.out.println();
//		System.out.print("2 * 2 = 4\t");
//		System.out.print("3 * 2 = 6\t");
//		System.out.print("4 * 2 = 8\t");
//		System.out.print("5 * 2 = 10\t");
//		System.out.print("6 * 2 = 12\t");
//		System.out.print("7 * 2 = 14\t");
//		System.out.print("8 * 2 = 16\t");
//		System.out.print("9 * 2 = 18\t");
		
		
		for (int k = 1; k < 10; k++) {
			for (int h = 2; h < 10; h++) {
				System.out.print(h + " * "+k+" = " +h +"\t");
			}
			System.out.println();
		}
	}
	
	public void forDoubleExercise2() {
//		*
//		**
//		***
//		****
//		*****
		
		for (int j = 0; j < 10; j++) {			
			for (int i = 0; i < j+1; i++) {			
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void forDoubleExercise3() {
		// 0시 0분부터 23시 59분까지 출력하기 !
		
		for (int k = 0; k < 24; k++) {
			for (int h = 0; h < 60; h++) {
				System.out.printf("%2d시 %2d분\n", k, h); // printf, 형식문자를 사용해 문자 공간의 너비를 정해줌
			}
		}
	}
}
