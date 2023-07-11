package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null;
		String title = "";
		do {
			choice = view.MusicMenu();
			switch(choice){
			case 1 : 
				// MusicFunction -> MusicView, MusicController
				music = view.inputMusicInfo();
				mController.addAtLast(music);
				view.displaySuccess("마지막 위치에 추가 성공");
				break;
			case 2 : 
				music = view.inputMusicInfo();
				mController.addAtZero(music);
				view.displaySuccess("첫 위치에 추가 성공");
				break;
			case 3 : 
				List<Music> allList = mController.printMusicList(); // 여러개라 List 사용
				view.showAllMusicList(allList);
				view.displaySuccess("전체 정보 조회 성공!");
				break;
			case 4 : 
				title = view.inputMusicName("검색");
				List<Music> searchList = mController.searchMusicsByName(title); // 여러개라 List 사용
				view.showAllMusicList(searchList);
				view.displaySuccess("검색한 " + title + "조회 성공!");
				break;
			case 5 : 
				title = view.inputMusicName("삭제");
				int index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				mController.removeMusic(index);
				view.displaySuccess(title+"삭제 성공!");
				break;
			case 6 : 
				title = view.inputMusicName("수정"); // 수정할 곡 입력 받기
				index = mController.searchOneByTitle(title); // 존재 여부 확인
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				music = view.modifyMusicInfo(); // 수정할 정보 입력 받기
				mController.updateMusic(index, music); // 수정하기
				break;
			case 7 : break;
			case 8 : break;
			case 9 : break;
			case 10 : break;
			case 0 : 
				view.printMessege("프로그램을 종료합니다."); 
				break;
			default : 
				view.printMessege("잘못 입력하셨습니다.");
				break;
			}
		} while (choice != 0);
	}

}
