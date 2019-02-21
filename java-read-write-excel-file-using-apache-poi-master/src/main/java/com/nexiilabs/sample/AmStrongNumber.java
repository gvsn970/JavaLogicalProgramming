package com.nexiilabs.sample;

public class AmStrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int amStrongNum=0;
		while(num!=0) {
			int digit=num%10;
			amStrongNum=amStrongNum+digit*digit*digit;
		//	int rev=rev*10+digit;
			num=num/10;
		}
		if(temp==amStrongNum){
			System.out.println("Amstrong number");
		}else{
			System.out.println("Not Amstrong Number");
		}
	}
}
