package com.kh.day10.collection.student;

public class StudentRun {
	
	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		
		end :
		while(true) {
			
			int choice = sFunc.printMenu();
			
			switch(choice) {
			case 1 : sFunc.inputInfo();
				break;
			case 2 : sFunc.searchInfoByName();
				break;
			case 3 : sFunc.printInfo();
				break;
			case 4 : sFunc.checkPass();
				break;
			case 5 : System.out.println("프로그램이 종료되었습니다.");
				break end;
			}
			
		}
	}
}
