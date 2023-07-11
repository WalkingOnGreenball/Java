package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	public void addAtLast(Music music) { // view 에서 입력한 값을 전달하기 위해 매개변수 존재
		mList.add(music);
	}
	
	/**
	 * 첫 위치에 곡 추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music); // 첫번째 위치의 인덱스 값 = 0, 오버로딩
	}
	
	/**
	 * 곡 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}

	/**
	 * 음악 전체 정보 출력
	 * @return mList
	 */
	public List<Music> printMusicList(){
		return mList;
	}

	/**
	 * 음악 검색 출력
	 * @return mList
	 */
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>(); // 찾은 음악을 담을 리스트
		for(Music mOne : mList) { // 기존 음악이 있는 mList에서 찾기
			if(mOne.getTitle().equals(title)) { // 입력한 이름이 같으면
				findList.add(mOne); // findList에 추가하기
			}
		}
		return findList; // 다 찾았으면 리턴으로 저장
	}
	
	/**
	 * 이름으로 곡 검색하기
	 * @param title
	 * @return
	 */
	public int searchOneByTitle(String title) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * mList에서 삭제
	 * @param i
	 */
	public void removeMusic(int i) {
		mList.remove(i); // mList에서 삭제
	}
	
	public void insertionSortByTitleASC() {
		
	}
	
	public void selectionSortByTitleASC() {
		
	}

	public void bubbleSortByTitleASC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) { // String 끼리의 비교에 꺽쇠(>)는 안됨. // 결과 값이 0이면 동일함, 양수 값이면 왼쪽이 순서가 더 큼, 음수 값이면 왼쪽이 순서가 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void bubbleSortByTitleDESC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) { // String 끼리의 비교에 꺽쇠(>)는 안됨. // 결과 값이 0이면 동일함, 양수 값이면 왼쪽이 순서가 더 큼, 음수 값이면 왼쪽이 순서가 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void bubbleSortBySingerASC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) { // String 끼리의 비교에 꺽쇠(>)는 안됨. // 결과 값이 0이면 동일함, 양수 값이면 왼쪽이 순서가 더 큼, 음수 값이면 왼쪽이 순서가 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
	
	public void bubbleSortBySingerDESC() {
//		int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size()-1; i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) { // String 끼리의 비교에 꺽쇠(>)는 안됨. // 결과 값이 0이면 동일함, 양수 값이면 왼쪽이 순서가 더 큼, 음수 값이면 왼쪽이 순서가 작음
					Music temp = mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}
}
