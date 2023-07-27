package com.xcompany.practice;

public class StringOccurencesINStream {

	public static void main(String[] args) {
		
		 String str = "geeksforgeeks";
	        char c = 'e';
	       int i= (int) str.chars().filter(s->s == c).count();
	       System.err.println(i);
	}
	
}
