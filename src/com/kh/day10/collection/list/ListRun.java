package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.kh.day10.collection.student.Student;

public class ListRun {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
	}
	
	public void sListExample() {
//		ArrayList<String> aList = new ArrayList<String>(); // 이것도 가능하지만 나중엔 리스트로 받아서 사용하는 경우가 많기 때문에 업캐스팅 로직으로 연습하기 
		List<String> strList = new ArrayList<String>(); // 업캐스팅
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
//		ArrayList 는 size로 길이를 구한다.
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println();
		System.out.println("체리 추가하기");
		System.out.println();
		
		strList.add(2, "체리");
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println();
		System.out.println("체리를 파인애플로 수정하기");
		System.out.println();
		
		strList.set(2, "파인애플");
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println();
		System.out.println("파인애플 삭제");
		System.out.println();
		
		strList.remove(2);
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
	}

	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);
	}
	
	
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');

		Object obj = objList.get(0);
		
		// Object를 쓰면 모든 자료형을 사용할 수 있지만
		// 꺼내 쓸 때 마다 다운캐스팅으로 지정해서 사용해야하는 불편함이 있다.
		
		int num = (int)obj;
		// Type mismatch: cannot convert from Object to int
		
		Object obj2 = objList.get(1);
		String str = (String)obj2;
		// Type mismatch: cannot convert from Object to String
		
		char cOne = (char)objList.get(2);
		// Type mismatch: cannot convert from Object to char
	}
	
	
	public void intExample() {
//		int [] nums new int[3];
		IntList nums = new IntList();
		
//		nums[0] = 1;
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
//		int result = nums[0];
		int result1 = nums.get(0);
		System.out.println("result1 : " + result1);
		
//		int size = nums.length;
		int size = nums.size();
		System.out.println("size : " + size);
		
//		nums = {};, nums = new int[3];
		nums.clear();
	}
}
