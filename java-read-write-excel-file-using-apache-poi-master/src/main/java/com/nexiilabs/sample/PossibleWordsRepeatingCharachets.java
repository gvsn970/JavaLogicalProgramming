package com.nexiilabs.sample;

public class PossibleWordsRepeatingCharachets {

	public static void main(String[] args) {


		String str="asuarya";
		 
		char[] ch=str.toCharArray();
		
		String resultString="";
		String res="";
		int a=0;
		int b=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
			if(ch[i]==ch[j]) {
				
				res=str.subSequence(i, j).toString();
				resultString=resultString+" "+res+ch[i];
			}
			}
			
		}
	
		System.out.println(resultString);
		
		
		
	}
}
