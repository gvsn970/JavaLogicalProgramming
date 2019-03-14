package com.nexiilabs.sample;

public class SeparateZerosFromNonZerosInAnArray {

	public static void main(String[] args) {
		int a[]={14, 0, 5, 2, 0, 3, 0};
		int count =0;
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == 0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		
		}
	}
}
