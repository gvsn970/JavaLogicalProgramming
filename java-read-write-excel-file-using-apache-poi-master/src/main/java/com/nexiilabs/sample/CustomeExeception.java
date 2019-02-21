package com.nexiilabs.sample;

class TooYoung extends RuntimeException{
	TooYoung(String msg){
		super(msg);
	}
}
class Old extends RuntimeException{
	Old(String msg){
		super(msg);
	}
}
public class CustomeExeception {

	public static void main(String[] args) {
		int age=12;
		int age2=36;
		if(age>20) {
			throw new TooYoung("Your Age Too Young");
		}else if(age2>30) {
			throw new Old("Your Age Old");
		}
	}
}
