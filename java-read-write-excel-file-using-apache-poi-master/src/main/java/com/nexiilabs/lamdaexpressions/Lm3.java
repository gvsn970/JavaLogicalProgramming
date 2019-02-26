package com.nexiilabs.lamdaexpressions;

class Lm3 
{ 
    interface FuncInter1 
    { 
        int operation(int a, int b); 
    } 
  
    interface FuncInter2 
    { 
        void sayMessage(String message); 
    } 
   
    private int operate(int a, int b, FuncInter1 fobj) 
    { 
        return fobj.operation(a, b); 
    } 
    
    public static void main(String args[]) 
    { 
    	FuncInter1 add=(x,y)-> x+y;
    	add.operation(3, 5);
    } 
} 
