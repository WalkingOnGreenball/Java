package com.kh.day07.oop.polymorphism.instnceof;

public class Exam_InstanceOf {
	
	// person = new Person();
	// person = new Student();
	// person = new Researcher();
	// person = new StudentWorker();
	// person = new Professor();
	static void print(Person person) {
		if(person instanceof Student) {
			System.out.println("Student 입니다!");
		}
		if(person instanceof Researcher){
			System.out.println("Researcher 입니다!");
		}
		if(person instanceof StudentWorker) {
			System.out.println("StudentWorker 입니다!");
		}
		if(person instanceof Professor) {
			System.out.println("Professor 입니다!");
		}
	}

//	 오버로딩
//	static void print(Student student) {
//		System.out.println("Student 입니다!");
//	}
//	static void print(Researcher researcher) {
//		System.out.println("Researcher 입니다!");
//	}
//	
//	static void print(StudentWorker studentworker) {
//		System.out.println("StudentWorker 입니다.");
//	}
//	static void print(Professor professor) {
//		System.out.println("professor 입니다.");
//	}
	
	public static void main(String[] args) {
		print(new Student());
		print(new Researcher());
		print(new StudentWorker());
		print(new Professor());

	}

}
