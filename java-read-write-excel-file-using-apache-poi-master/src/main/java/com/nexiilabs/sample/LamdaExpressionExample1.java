package com.nexiilabs.sample;

public class LamdaExpressionExample1 {
	public static void main(String[] args) {

		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread LamDa");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread ");
		}
	}
}
