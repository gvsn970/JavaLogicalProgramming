package com.nexiilabs.sample;

public class DuplicateCharActer {

	public static void main(String[] args) {
		String str = "Butter Butter";
		char ch[] = str.toCharArray();
		int len = ch.length;
		int count=0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
			for(int k=i+1;k<len;k++) {
				if(ch[i] == ch[k]) {
				ch[k]=ch[len-1];
				len--;
				k--;
				}
			}
			System.out.println(ch[i]+":::::::::"+count);
			count=0;
		}
	}
}
