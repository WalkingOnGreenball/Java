package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface{
// 1. The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class - extends 안됨, implements로 써야함
	
	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루");
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}

}
