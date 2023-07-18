package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;		// 보조스트림, 기본 데이터타입 입출력을 도와줌
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("채팅 서버를 구동 중입니다...");	// 서버 구동
			serverSocket = new ServerSocket(port);
			System.out.println("채팅 서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			
			is = socket.getInputStream();	// 채팅 준비
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			
			while(true) {
				System.out.println("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);	// 채팅 보내기
				dos.flush();	// 빨대(스트림) 털기
				
				String recvMsg = dis.readUTF();		// 채팅 읽기
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
