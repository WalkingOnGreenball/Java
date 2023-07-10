package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			// 요런 것들을 Checked Exeption 이라고 함. (try, catch 문 필수인 것들)
			// Unhandled exception type FileNotFoundException // try, catch 문 안쓰면 안됨
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			
			while(true) {
				// Unhandled exception type IOException
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Unhandled exception type IOException
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
