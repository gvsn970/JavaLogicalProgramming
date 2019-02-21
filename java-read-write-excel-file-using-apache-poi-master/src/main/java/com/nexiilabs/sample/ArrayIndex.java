package com.nexiilabs.sample;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, pos, x;
		System.out.println("Enter Array Size:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		//System.err.println(n);
		System.out.println("Enter Array Elements:");
		int a[] =new int[n+1];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Final Array Size:::"+a.length);
		System.out.println("Enter Position where u want insert Element:");
		pos=s.nextInt();
		System.out.println("Enter Element:");
		x=s.nextInt();
		//System.out.println("Posisiton:::::"+pos+"::::::::::Elelemtn:::::"+x);
		for(int i=(n-1);i>=pos-1;i--) {
			
			a[i+1]=a[i];
		}
		a[pos-1]=x;
	      for(int i = 0; i < n+1; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	    
	}

}
