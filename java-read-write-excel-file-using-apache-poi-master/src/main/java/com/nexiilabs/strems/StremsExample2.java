package com.nexiilabs.strems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremsExample2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("ABC");
		list.add("AAAA");
		list.add("ABCGD");
		list.add("ABAAAA");
		list.add("FESAAAA");
		list.add("ABCGDAAAA");
		System.out.println("BeFore Streimg:"+list);
		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;else if((l1>l2)) return +1; else return 0;
		};
		List<String> l2=list.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l2);
	}
}
