package com.kh.day03.array;

public class Exam_insertionSort {
	public static void main (String [] args)
	{
		// 삽입 정렬이란?
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘!!
		// 배열의 N번 인덱스 값을 0번에서 n-1번 인덱스까지 비교!
		// {2, 5, 4, 1, 3}
		
		// 작은 값을 왼쪽으로 보낸다고 했을 때
		
		// 1 : 5하고 2 비교 -> X
			// {2, 5, 4, 1, 3}
		
		// 2 : 4하고 5 비교 -> 교환
			// {2, 4, 5, 1, 3}
		
		// 3 : 1하고 5 비교 -> 교환
			// {2, 4, 1, 5, 3}
		// 3 : 1하고 4 비교 -> 교환
			// {2, 1, 4, 5, 3}
		// 3 : 1하고 2 비교 -> 교환
			// {1, 2, 4, 5, 3}
		
		// 4 : 3하고 5 비교 -> 교환
			// {1, 2, 4, 3, 5}
		// 4 : 3하고 4 비교 -> 교환
			// {1, 2, 3, 4, 5}
		
		int [] arrs = {2, 5, 4, 1, 3};
		
		for (int i = 1; i < arrs.length; i++) {	
			for (int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				} // 자리를 바꿔주는 로직
			} // 그 안의 값이 반복되어 for문으로 만듬
		} // 이것을 반복해야해서 for문으로 증가
		
		// 배열 출력 
		for (int h = 0; h < arrs.length; h++) {
			System.out.print(arrs[h] + " ");
		}	
		
		
	
		
		// {2, 5, 4, 1, 3}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		
		// {2, 4, 5, 1, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		
		// {2, 4, 5, 1, 3}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
		
		
		
		
		
		
	}
}
