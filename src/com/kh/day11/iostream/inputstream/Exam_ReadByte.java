package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while((readByteCount = is.read(readBytes)) != -1) {
				result += new String(readBytes, 0, readByteCount); // 0 ~ 읽어들인 갯수(3)까지
			}
			System.out.println(result);
//			while(true) {
//				readByteCount = is.read(readBytes);
//				if(readByteCount == -1) break;
//				result += new String(readBytes, 0, readByteCount);
////				System.out.print(readByteCount);
////				for(byte rByte : readBytes) {
////					System.out.print((char)rByte);
////				}
//			}
//			System.out.println(result);
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
