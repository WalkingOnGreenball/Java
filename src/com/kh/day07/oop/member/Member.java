package com.kh.day07.oop.member;

public class Member {
	// 입력받을거 3개정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	public Member() { // 오버로딩 : 갯수도 다르고 타입도 다르지만 이름이 같은 메소드. ex) 아래 것과 오버로딩
		
	}
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	// getter 메소드 - return 함 기본자료형
	public String getMemberId() {
		return this.memberId;
		
	}
	
	public String getMemberPw() {
		return this.memberPw;
	}
	
	public String getMemberEmail() {
		return this.memberEmail;
	}
	
	public String getMemberAddress() {
		return this.memberAddress;
	}
	
	// setter 메소드 - return 안함 void
	// new Member().setMemberId("khuser01");
	public void setMemberId(String memberId) {
		// memberid = "khuser01";
		this.memberId = memberId;
	}
	
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
}
