package com.nexiilabs.sample;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]=  { {2, 3, 4}, {5, 6, 4},{5, 6, 4} };
		int row=3,colum=3;
		int sum=0;
		int len=a.length;
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				
				if(i +j == len-1) {
					sum=sum+a[i][j];
				}
			}	
			
		}
		System.out.println(sum);
		
	}
}
