package com.nexiilabs.sample;

public class StringReveseExample {
	
	public static void main(String[] args) {
		reverse();
	}

	static void reverse(){
		String s1="a!b,@cd";
		System.out.println("Given String :"+s1);
		String s="a!b,@cd";
		s=s.replace("@", "");
		s=s.replace("!", "");
		s=s.replace(",", "");
		String k="";
		String[] array=s.split("");
		for(int i=array.length;i>0;i--){
			k=k+array[i-1];
		}
		int position=1;
		int position1=3;
		char[] ka=s1.toCharArray();
		char a=ka[1];
		char b=ka[3];
		char[] word=k.toCharArray();
		 char[] newWord = new char[word.length+1];
		    int offset = 0;
		    for(int i=0; i<newWord.length; i++) {
		        if(position == i) {
		            newWord[i] = a;
		            offset = 1;
		        } else {
		            newWord[i] = word[i-offset];
		        }
		    }
		    k = new String(newWord);
		    word=k.toCharArray();
		 //   System.out.println(k);
		     offset = 0;
		     newWord = new char[word.length+1];
		    for(int i=0; i<newWord.length; i++) {
		        if(position1 == i) {
		            newWord[i] = b;
		            offset = 1;
		        } else {
		            newWord[i] = word[i-offset];
		        }
		    }
		    System.out.println(newWord);
	}

}
