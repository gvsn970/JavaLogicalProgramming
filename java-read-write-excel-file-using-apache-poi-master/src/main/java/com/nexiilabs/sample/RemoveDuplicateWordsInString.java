package com.nexiilabs.sample;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		String input = "Welcome to Java Session Java Session Session Java"; // Input String
		String[] words = input.split(" "); // Split the word from String
		int len = words.length;
		for (int i = 0; i < len; i++) {
			if (words[i] != null) {
				for (int j = i + 1; j < len; j++) {
					if (words[i].equals(words[j])) {
						words[j] = words[len - 1];
						len--;
						j--;
					}
				}
			}
			System.out.println(words[i]);

		}

	}
}
