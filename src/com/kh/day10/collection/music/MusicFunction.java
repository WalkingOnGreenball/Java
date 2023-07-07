package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	
	List<Music> mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	
	// 뒤에 곡 추가하기
	public void inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mList.add(music); // 최종 저장소에 저장
	}
	
	// 앞에 곡 추가하기
	public void inputMusicAtFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mList.add(0, music); // 첫번째 위치의 인덱스 값 = 0, 오버로딩
	}
	
	// 음악 전체 출력
	public void printAllMusics() {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 -> 곡명 : %d, 가수명 : %s\n", (i+1), music.getTitle(), music.getSinger());
		}
	}
	
	// 곡명으로 음악 검색하기
	public void printOneByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 곡 입력 : ");
		String title = sc.nextLine();
		for(Music music : mList) {
			if(music.getTitle().equals(title)) { // 원래 있는 곡. 지금 입력한 곡 equals 비교
				System.out.printf("검색 결과 >> 곡명 : %d, 가수명 : %s\n", music.getTitle(), music.getSinger());
				break; // 찾았으면 그만 나와라
			}
		}
	}
	
	// 곡명으로 음악 삭제하기
	public void removeMusicByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				// mList에서 삭제
				mList.remove(i);
				break; // 삭제했으면 그만 나와라
			}
		}
	}
	
	// 곡 수정하기
	public void modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.println("수정할 곡명 입력 : ");
		String modTitle = sc.nextLine();
		System.out.println("수정할 가수명 입력 : ");
		String modSinger = sc.nextLine();
		Music modMusic = new Music(modTitle, modSinger);
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				mList.set(i, music);
			}
		}
	}
}
