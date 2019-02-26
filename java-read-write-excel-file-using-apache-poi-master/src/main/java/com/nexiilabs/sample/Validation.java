package com.nexiilabs.sample;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static void main(String[] args) {
		String regex = "[a-zA-Z0-9]+.*\\S+.*";
		 String name="2Custom  sp";
		Pattern pattern = Pattern.compile(regex);
		
		  Matcher matcher = pattern.matcher(name);
		  System.out.println(matcher.matches());
		
	}
}
