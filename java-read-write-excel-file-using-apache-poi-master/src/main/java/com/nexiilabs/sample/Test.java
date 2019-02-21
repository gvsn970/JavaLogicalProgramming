package com.nexiilabs.sample;

class P{
	P(){
		System.out.println(this.hashCode()+":::::::::::::::Parent");
	}
}class C extends P{
	C(){
		System.out.println(this.hashCode()+":::::::::::::::Child");
	}
}
public class Test {
	
	public static void main(String[] args) {
		
		C c=new C();
		System.out.println(c.hashCode());
	}

}