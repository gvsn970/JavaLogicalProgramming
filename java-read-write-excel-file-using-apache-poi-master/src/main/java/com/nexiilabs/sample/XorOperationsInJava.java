package com.nexiilabs.sample;

public class XorOperationsInJava {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("After Swap:");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a:"+a+"::::::::b:"+b);
	}
}
