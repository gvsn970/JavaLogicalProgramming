package com.nexiilabs.sample;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str="hi hello world gud moring";
		String st1=str.replaceAll("\\s+","");
		System.out.println(st1);
	}
}
