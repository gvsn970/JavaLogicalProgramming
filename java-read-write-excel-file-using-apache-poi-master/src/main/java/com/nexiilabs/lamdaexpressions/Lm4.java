package com.nexiilabs.lamdaexpressions;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
} 

interface SayBle{
	public String say();
}

public class Lm4 {
	
	public static void main(String[] args) {
		int width=40;
		Drawable size=()->System.out.println(width);
		size.draw();
		SayBle say=()->{
			return "welcome Lamda Expressions";
		};
		System.out.println(say.say());  
	}
}
