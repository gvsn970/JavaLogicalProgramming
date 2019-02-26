package com.nexiilabs.sample;

public class MissNumberRandom {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6 };
		int len = a.length;
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			temp = a[i] - a[i + 1];

			if (temp == -2) {
				System.out.println(a[i] + 1);
				break;

			}

		}

	}
}
