package com.nexiilabs.sample;

public class MissNumberRandom {

	public static void main(String[] args) {
		int a[] = { 88, 89, 90, 92 };
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
					if(a[i]+1 == a[j] ) {
						System.out.println(a[i]);
					}
			}

		}

	}
}
