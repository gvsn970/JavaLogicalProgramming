package com.nexiilabs.sample;

public class RevesreString {

	public static void main(String[] args) {
		String str="surya";
		char c[]=str.toCharArray();
		int len=c.length;
		for(int i=len-1;i>=0;i--) {
			char a=str.charAt(i);
			System.out.print(a);
		}
		
	}
}
