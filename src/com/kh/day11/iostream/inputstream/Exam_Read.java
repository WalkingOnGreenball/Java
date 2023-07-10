package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		InputStream is = null; // 사진, 동영상을 읽어들이는데 쓰는 stream
		
		// Unhandled exception type FileNotFoundException // Checked Exception
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByte;
//			while(true) { // 아래의 do while문으로 바꿀 수 있음
//				readByte = is.read();
//				if(readByte == -1) break;
//				System.out.print((char)readByte);
//			}
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			} while(readByte != -1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
