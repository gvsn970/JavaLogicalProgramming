package com.xcompany.practice;

import java.util.HashSet;

public class StringOccurencesINStream {

	public static void main(String[] args) {

		char a = 'a';
        char b = 'c';
        String str = "a";
        System.out.println(a +b);
        System.out.println(str + b);
        
        
        String[] s = {"abc", "ab", "cd", "ab", "abc"};
//		Arrays.stream(s)
//        .distinct()
//        .forEach(System.out::println);
		
		 HashSet<String> uniqueElements = new HashSet<>();
	        for (String element : s) {
	            if (uniqueElements.add(element)) {
	                System.out.println(element);
	            }
	        }
		}
	
	
}