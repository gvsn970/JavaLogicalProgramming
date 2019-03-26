package com.nexiilabs.sample;

public class SumOfTwoArrayElement {

	public static void main(String[] args) {
		int num=12;
		int a[]={4, 5, 7, 11, 9, 13, 8, 12};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j] == num) {
					System.out.println(a[i]+", "+a[j]+":"+num);
				}
			}
		}
	}
}
