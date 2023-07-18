package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <=50; i++) {
				System.out.print("=");
				Thread.sleep(10);		// 0.02초 대기 후에 실행시킴
			}
			System.out.println("100%");
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
				// 받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			for(;;) {
					// 데이터 받기
				String recvMsg = dis.readUTF();
				System.out.printf("받은 메시지 : %s\n", recvMsg);
					// 24 / + / 42 로 자르기
				String [] msgArrs = recvMsg.split(" ");		// 띄어쓰기 기준으로 문자열 배열 만들기
				if(recvMsg.equalsIgnoreCase("exit")) {		// equalsIgnoreCase : 대소문자 구별없이 equal 비교
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				
				if(msgArrs.length != 3) {	// 형식이 틀렸을 때
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;	// 다시 무한 반복문의 시작으로 돌아감
				}
				
				int num1 = Integer.parseInt(msgArrs[0]);	// String -> Int 형변환
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				
				String result = "";
				switch(operator) {
					case "+" : 
						result = String.valueOf(num1 + num2);	// String 으로 형변환
						break;
					case "-" : 
						result = String.valueOf(num1 - num2);
						break;
					case "*" : 
						result = num1 * num2 + "";	// 문자열로 만들기
						break;
					case "/" : 
						result = num1 / num2 + "";
						break;
					case "%" : 
						result = num1 % num2 + "";
						break;
				}
				dos.writeUTF(result);
				dos.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
