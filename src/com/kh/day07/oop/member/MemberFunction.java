// 기능 저쟝용

package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member [] memArrs;
	private int index; // 변화하는 수를 넣기위해 index 변수
	
	public MemberFunction() {
		memArrs = new Member[3];
		index = 0;
	}
	
	public int printMenu() {
		// 회원 관리 프로그램
		// 1. 회원 정보 입력
		// 2. 회원 정보 출력
		// 3. 프로그램 종료
		// 메뉴 입력 : 
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원 관리 프로그램 =====");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice; // 리턴 안하면 사라짐
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원 정보 입력 =====");
		System.out.println("아이디 : ");
		String memberId = sc.next();
		System.out.println("비밀번호 : ");
		String memberPw = sc.next();
		System.out.println("이메일 : ");
		String memberEmail = sc.next();
		System.out.println("주소 : ");
		sc.nextLine(); // 개행 제거 코드 추가 (엔터까지 입력 받아버림)
		String memberAddress = sc.nextLine();
		
		
		memArrs[index] = new Member(memberId, memberPw, memberEmail, memberAddress); // 변화하는 수를 넣기위해 index 변수
		index++;
		// 둘은 같은 의미
//		memArrs[0] = new Member();
//		memArrs[0].setMemberId(memberId);
//		memArrs[0].setMemberPw(memberPw);
//		memArrs[0].setMemberEmailemail);
//		memArrs[0].setMemberAddress(address);
	}
	
	public void printInfo() {
		System.out.println("===== 회원 정보 출력 =====");
		for(int i = 0; i < index; i++) {
			System.out.printf(
				"%s님의 비밀번호는 %s이고, 이메일은 %s 이며, 주소는 %s 입니다.\n"
				, memArrs[i].getMemberId()
				, memArrs[i].getMemberPw()
				, memArrs[i].getMemberEmail()
				, memArrs[i].getMemberAddress()
			);
		}
	}
}
