package com.nexiilabs.sample;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int[] list = { 2, 5, 6, 9 };
		System.out.println("Enter the value :");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println("Enter the Posiotin :");
//	Scanner s=new Scanner(System.in);
		int pos = sc.nextInt();
		int position = 0;
		int[] num = new int[list.length + 1];
		int isEntered = 0;
		for (int i = 0; i < list.length + 1; i++) {
			position++;
			if (position == pos) {
				num[i] = value;
				isEntered++;
			} else {
				if (position > list.length && isEntered > 0) {
					num[i] = list[i - 1];

				} else if (isEntered > 0) {
					num[i] = list[i - 1];
				} else {
					num[i] = list[i];
				}
			}

		}

		System.out.println("Modified Array::::" + Arrays.toString(num));
	}
}
