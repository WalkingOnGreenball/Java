package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {

	public void exercise1()
	{
		
//		arrs[0][0] = 5;
//		arrs[0][1] = 4;
//		arrs[0][2] = 3;
//		arrs[0][3] = 2;
//		arrs[0][4] = 1;
//		
//		arrs[1][0] = 10;
//		arrs[1][1] = 9;
//		arrs[1][2] = 8;
//		arrs[1][3] = 7;
//		arrs[1][4] = 6;
		
		int [][] arrs = new int[5][5];
		
		int k = 1;
		
		for (int i = 0; i < arrs.length; i++) {			
			for (int j = arrs.length-1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public void exercise2()
	{
		
//		arrs[4][0] = 1;
//		arrs[3][0] = 2;
//		arrs[2][0] = 3;
//		arrs[1][0] = 4;
//		arrs[0][0] = 5;
//		
//		arrs[4][1] = 6;
//		arrs[3][1] = 7;
//		arrs[2][1] = 8;
//		arrs[1][1] = 9;
//		arrs[0][1] = 10;
		
		int [][] arrs = new int[5][5];
		
		int k = 1;
		
		for (int j = 0; j < arrs.length; j++) {			
			for (int h = arrs.length-1; h >= 0; h--) {
				arrs[h][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
		
	}
	public void exercise3()
	{
		
//		arrs[0][0] = 1;
//		arrs[1][0] = 2;
//		arrs[2][0] = 3;
//		arrs[3][0] = 4;
//		arrs[4][0] = 5;
//		
//		arrs[0][1] = 6;
//		arrs[1][1] = 7;
//		arrs[2][1] = 8;
//		arrs[3][1] = 9;
//		arrs[4][1] = 10;
		
		int [][] arrs = new int[5][5];
		
		int k = 1;
		
		for (int h = 0; h < arrs.length; h++) {
			for (int s = 0; s < arrs.length; s++) {
				arrs[s][h] = k;
				k++;
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}
	public void exercise4()
	{
		
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[0][4] = 5;
//		
//		arrs[1][4] = 6;
//		arrs[1][3] = 7;
//		arrs[1][2] = 8;
//		arrs[1][1] = 9;
//		arrs[1][0] = 10;
		
		int [][] arrs = new int[5][5];
		
		int k = 1;
		
		for (int s = 0; s < 5; s++) {			
			if (s % 2 == 0) {			
				for (int m = 0; m < 5; m++) {
					arrs[s][m] = k;
					k++;
				}
			} else {
				for (int m = 4; m >= 0; m--) {
					arrs[s][m] = k;
					k++;
				}
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}
	public void exercise5()
	{
		// 2차원 배열에 학년별로 1, 2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.

		double [][] score = {{3.3, 3.4} , {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.5}};

		double sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f ", score[i][j]);
				sum += score[i][j];
			}
			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : " + result);
	}
	
	public void exercise6()
	{
	
	}
	
	
	public void exercise7()
	{
	
	}
	
	
	public void exercise8()
	{
	
	}
	
	
	public void exercise9()
	{
	
	}
}
