package com.nexiilabs.sample;

public class WithOutLoop {

	static void  loop(int n) {
		if(n<=10) {
			System.out.println(n);
			loop(n+1);
		}
	}
	public static void main(String[] args) {
		loop(1);
	}
}
