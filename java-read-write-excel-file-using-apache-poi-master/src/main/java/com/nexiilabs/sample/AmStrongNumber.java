package com.nexiilabs.sample;

public class AmStrongNumber {

	public static void main(String[] args) {

		int num = 153;

		int amStrongNum = 0;
		for (int i = 1; i <= 1000; i++) {
			int temp=i;
			while (i != 0) {
				int digit = i % 10;
				System.err.println(digit);
				amStrongNum = amStrongNum + digit * digit * digit;
				// int rev=rev*10+digit;
				i = i / 10;
			}
			
			
			if (temp == amStrongNum) {
				System.out.println("Amstrong number : "+amStrongNum);
				
			} 
			
		}
		
	}
}
