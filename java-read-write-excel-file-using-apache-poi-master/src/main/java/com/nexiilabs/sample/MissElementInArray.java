package com.nexiilabs.sample;
import java.util.ArrayList;
import java.util.List;

public class MissElementInArray {

	public static void main(String[] args) {

		int a[] = { 1,2, 3, 4, 5,6, 7, 9 };
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + a[i];
		} //
		System.out.println("Sum OF Array Elements:" + sum);
		int sumOfNumbers1T0n = 9*(9 + 1) / 2;
		int missingEllemtn = sumOfNumbers1T0n - sum;
		System.out.println(missingEllemtn);

	/*	int arrayListSum=0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(9);
		//System.out.println(list);
		
		for (Integer object: list) {
			arrayListSum=arrayListSum+object;
		}
	
		int sumOfNumbers1Ton=9*(9+1)/2;
	
		int missingLement=sumOfNumbers1Ton-arrayListSum;
		System.out.println(missingLement-1);*/

	}
}
