package com.xcompany.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		// given input string
		String input = "suryaa";

		// convert string into stream
		Map<Character,Long> result=input.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		result.forEach(

				(ch, count) -> {
					if (count > 1) {
						System.out.println(ch + " " + count);
					}
				});

	}
}
