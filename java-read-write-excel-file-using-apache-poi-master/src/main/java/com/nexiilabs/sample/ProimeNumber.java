package com.nexiilabs.sample;

public class ProimeNumber {

	public static void main(String[] args) {
		int remiander = 0;
		for (int i = 1; i <= 100; i++) {
			for(int j=2;j<=i/2;j++) {
				remiander=i%j;
			}
			if(remiander !=0) {
				System.out.println(i);
			}
		}
	}
}
