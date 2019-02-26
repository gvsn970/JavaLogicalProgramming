package com.nexiilabs.sample;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABC";
		String reg = "";
		char per = 0;
		int count = 0;
		char a[] = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				reg = reg + a[j];
			}
			System.out.println(a[i] + "" + reg);
		}

	}
}
