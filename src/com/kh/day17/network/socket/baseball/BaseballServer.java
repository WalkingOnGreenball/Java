package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class BaseballServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 1111;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[3];
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버 소켓을 생성하였습니다.");
			Thread.sleep(1000);
			System.out.println("클라이언트 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			System.out.print("서버숫자 -> ");
				// 중복 없이 랜덤 추출하기
			for(int i = 0; i < 3; i++) {
				numbers[i] = (int)(Math.random()*9+1);	// (int)(Math.random() * (최댓값 - 최솟값 + 1) + 최소) : 소숫점을 없애기 위해 강제 형변환
				for(int j = 0; j < i; j++) {
					// #1 skip
					//
					// #2
					// numbers[0] == numbers[1]
					//
					// #3
					// numbers[0] == numbers[2]
					// numbers[1] -- numbers[2]
					if(numbers[j] == numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.printf("%d %d %d\n", numbers[0], numbers[1], numbers[2]);	
			System.out.println();
			System.out.println("서버 준비 완료");
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {
					// 받기
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
					// 결과 보내기
				// numbers 배열과 입력한 값으로 만든 배열을 비교
				// 정답과 비교해서 스트라이크, 볼 알려주기
				String [] inputNums = recvMsg.split(" ");
				int strike = 0;
				int ball = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(numbers[i] == Integer.parseInt(inputNums[j])) {
							if(i == j) {	// 값이 같은 상태에서 인덱스가 같으면 스트라이크
								strike++;
							} else {		// 값이 같은 상태인데 인덱스가 다르면 볼
								ball++;
							}
						}
					}
				}
				
				String result = strike+"스트라이크 "+ball+"볼";
				dos.writeUTF(result);
				dos.flush();
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
