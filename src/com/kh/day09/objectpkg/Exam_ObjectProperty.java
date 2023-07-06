package com.kh.day09.objectpkg;

public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}

	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point p2 = new Point(4,5);
		print(p);
		print(p2);
		
		
		// Object 클래스의 equals() 메소드 : 내용 비교
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
		String [] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
		
//		if(javaStr == "java") { // 같다
//		if(javaStr == "javaStr2") { // 같다
//		if(strArrs[0] == strArrs[1]) { // 같다
//		if(javaStr == "javaStr3") { // 주소(해시코드)가 다르다
		if(javaStr.equals(javaStr3)) { // 내용비교 equals를 써서 비교하면 같다
			
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}

}
