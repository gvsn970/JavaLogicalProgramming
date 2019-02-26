package com.nexiilabs.lamdaexpressions;

interface Addable{  
    int add(int a,int b);  
}  
 
public class Lm5 {

	public static void main(String[] args) {
		Addable add=(a,b)->(a+b);
		System.out.println(add.add(4, 9));
		
		Addable add1=(a,b)->{
			return (a+b);
		};
		System.out.println(add1.add(10,10));
	}
}
