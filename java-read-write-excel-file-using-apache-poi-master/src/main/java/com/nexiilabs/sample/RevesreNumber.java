package com.nexiilabs.sample;

public class RevesreNumber {

	public static void main(String[] args) {
		int num=1232;
		int temp=num;
		int rev=0;
		int count=1;
		System.err.println("GIven Number:"+num);
		while(num!=0){
			int digit=num%10;
		
			rev=rev*10+digit;
	
			num=num/10;
	
			count++;
		}
	
		if(temp==rev)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
