package com.kh.day03.array;

public class Exam_ArraySort {
	public static void main (String [] args)
	{
		// {1, 3, 6, 10, 4, 7, 5, 2, 9, 8}
		// -> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		
		// 정렬 알고리즘의 종류
		// 1. 삽입 정렬
		// 2. 선택 정렬 
		// 3. 버블 정렬
		// 4. 퀵 정렬
		// 5. ...
		
		int num1 = 5;
		int num2 = 15;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		int temp = num1; // 임시 변수 설정
		num1 = num2; // 여기서 num1의 값이 바뀌어버리기 때문
		num2 = temp;
		// 두 개의 자리를 바꿀 때에는 임시변수가 꼭 필요함!
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
		
		
		// 3 2 1 로 바꿔보시오
		int [] nums = {2,1,3};
		
//		int temp1 = nums[0];
//		int temp2 = nums[1];
//		nums[0] = nums[2];
//		nums[1] = temp1;
//		nums[2] = temp2;
		
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		
//		System.out.print(nums[0]);
//		System.out.print(nums[1]);
//		System.out.print(nums[2]);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
}
