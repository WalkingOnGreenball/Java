package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while((readByteCount = is.read(readBytes, 0, 3)) != -1) { // ~ 부터 ~개 가져오세요
				result += new String(readBytes, 0, readByteCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close(); // 다 쓴 것 반납해야 다른데서 또 쓸 수 있음
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
