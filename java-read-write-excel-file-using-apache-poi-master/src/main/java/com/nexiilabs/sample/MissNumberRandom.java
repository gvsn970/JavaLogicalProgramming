package com.nexiilabs.sample;

import java.util.Scanner;

public class MissNumberRandom {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n=s.nextInt();
		System.out.println("Enter Array numbers Random:");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int len = a.length;
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			temp = a[i] - a[i + 1];

			if (temp == -2) {
				System.out.println("The Missing Number is:"+(a[i]+1));
				break;

			}

		}

	}
}
