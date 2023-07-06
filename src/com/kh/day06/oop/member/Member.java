package com.kh.day06.oop.member;

public class Member {
	private String name;
	private int score1;
	private int score2;
	
	public Member () {
		name = "";
		score1 = 0;
		score2 = 0;
	}
	public Member(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public double getAvg() {
		double avg = (double)(this.score1 + this.score2)/2;
		return avg;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
}
