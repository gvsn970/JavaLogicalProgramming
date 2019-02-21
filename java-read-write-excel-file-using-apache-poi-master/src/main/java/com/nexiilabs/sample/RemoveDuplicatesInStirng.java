package com.nexiilabs.sample;

public class RemoveDuplicatesInStirng {

	public static void main(String[] args) {
		String str = "aa ssssurya nammdsmmssme";
		char c[] = str.toCharArray();
		int len = c.length;
		int count=0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				
				if(c[i]==c[j]) {
					count++;
				}
			}
			for(int k=i+1;k<len;k++) {
				if(c[i] == c[k]) {
					c[k]=c[len-1];
					len--;
					k--;
				}
			}
			System.out.println(c[i]+"::::::::"+count);
			count=0;
		}
	}
}
