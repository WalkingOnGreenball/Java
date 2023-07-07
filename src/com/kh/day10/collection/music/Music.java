package com.kh.day10.collection.music;

public class Music {
	// 필드
	private String title; // 캡슐화의 원칙
	private String singer;
	
	// 생성자
	public Music() {}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// getter 메소드
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	// setter 
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
}
