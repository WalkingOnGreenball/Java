package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 하나씩 넣는 방법
public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
			char [] data = "Java/Oracle/JDBC".toCharArray();
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush(); // 버퍼 비우기, 스트림에 있는 데이터들을 비워냄, 버퍼를 비워야 파일로 옮길 수 있다.
			System.out.println("파일 쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
