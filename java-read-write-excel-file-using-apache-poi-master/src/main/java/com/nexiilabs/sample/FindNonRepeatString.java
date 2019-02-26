package com.nexiilabs.sample;

public class FindNonRepeatString {

	public static void main(String[] args) {

		String str = "suryaswewreerqasuryaE";
		char[] a = str.toCharArray();
		int len = a.length;

		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <len; j++) {
				if (a[i] == a[j]) {
					count++;

				}
			}
			if(count ==1) {
				System.out.println(a[i]);
				
			}
			count = 0;
		}

	}

}
