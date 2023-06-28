package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main (String [] args)
	{
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
}
