package com.kh.day02.loop;

public class Exam_For {
	public static void main (String [] args) 
	{
		// 1. For 문
		for (int i = 0 ; i < 10; i ++) {
			System.out.println((i+1) + " ");
		}
		
		
		// 2. While 문
		int i = 0;
		while (i < 10) {
			System.out.println((i+1) + " ");
			i++;
		}
		
		
		// 3. do while 문
		int j = 0;
		do {
			System.out.println((i+1) + " ");
			j++;
		} while (j < 10);
	}
}
