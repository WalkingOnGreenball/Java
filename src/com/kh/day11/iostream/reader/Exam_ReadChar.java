package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3];
			int i = 0;
			String result = "";
			while(i < 10) {
				readCharCount = reader.read(cBuf); // cBuf = 읽은 값
//				System.out.print(readCharCount); // readCharCount = 읽은 갯수
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount); // 읽은데까지만 string으로 바꿔줘
//				for(char c : cBuf) { // for문을 돌리면 마지막 두글자는 덮어쓰기가 안되기 때문에 cdb로 출력된다.
//					System.out.print(c);
//				}
//				System.out.println();
//				i++;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
