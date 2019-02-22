package com.nexiilabs.sample;

public class SubStringInJava {

	public static void main(String[] args) {
		String str = "www.nexiilabs.com";
		
		System.out.println("Last 4 char String: " + str.substring(str.length()-4));
		System.out.println("First 4 char String: " + str.substring(0, 4));
		System.out.println("website name: " + str.substring(4,str.length()-4));
	}
}
