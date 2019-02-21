package com.nexiilabs.sample;

public class CountNoOfTimeOccuranceOfNumberAndString {

	public static void main(String[] args) {
		int a[] = { 3, 56, 5, 54, 32, 32, 32,3, 5, 2, 6, 56, 54, 32 };
		int len = a.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			
			for (int l = i + 1; l < len; l++) {
				if (a[i] > a[l]) {
					int temp = a[i];
					a[i] = a[l];
					a[l] = temp;
				}
			}

			for (int k = 0; k < len; k++) {
				if (a[i] == a[k]) {
					count++;
				}

			}

			for (int j = i + 1; j < len; j++) {

				if (a[i] == a[j]) {
					a[j] = a[len - 1];
					len--;
					j--;
				}

			}

			System.out.println(a[i] + "::::::::::::" + count);
			count = 0;

		}

	}
}
