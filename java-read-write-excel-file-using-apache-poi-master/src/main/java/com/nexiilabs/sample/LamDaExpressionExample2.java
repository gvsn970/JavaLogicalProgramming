package com.nexiilabs.sample;

public class LamDaExpressionExample2 {

	public static void main(String[] args) {
		new Thread(()->{System.out.println("New Thread");}).start();
	}
}
