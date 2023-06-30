package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main (String [] args)
	{
//		Circle circle = new Circle();  
//		Circle circle2 = new Circle();  
//		Circle circle3 = new Circle();  
//		Circle circle4 = new Circle();  
//		
//		circle.radius = 10;
//		circle2.radius = 100;
//		circle3.radius = 1000;
//		circle4.radius = 10000;
//		
//		System.out.println(circle.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
		

////		 ============ Circle =============
//		Circle pizza;
//		
////		pizza = new Circle();
////		pizza.radius = 10;
////		pizza.name = "청년피자";
//		pizza = new Circle(10, "청년피자");
//		
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
//		
//		
////		Circle donut = new Circle();
////		donut.radius = 2;
////		donut.name = "청년도넛";
//		Circle donut = new Circle(2, "청년도넛");
//		
//		area = donut.getArea();
//		System.out.printf("%s의 면적은 %.2f",donut.name, area);
		
		
		

////		 ============ Rectangle =============
//		Rectangle rect = new Rectangle();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("너비 입력 : ");
//		rect.width = sc.nextInt();
//		System.out.print("높이 입력 : ");
//		rect.height = sc.nextInt();
//		
//		int result = rect.getArea();
//		System.out.println("넓이 : " + result);
		
		
		
		
//		 ============ Book =============
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생텍쥐페리";
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향뎐");
		
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		System.out.println(loveStory.title + ", " + loveStory.author);
		
		
		
		
		
		
		
		
		
	}
}
