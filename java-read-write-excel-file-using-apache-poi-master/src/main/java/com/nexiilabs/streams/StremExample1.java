package com.nexiilabs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremExample1 {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(35);
		list.add(40);
		list.add(19);
		list.add(64);
		list.add(73);
		list.add(93);
		System.out.println("BeFore Streimg:"+list);
		
		//List l2=list.stream().map(i->i+2).collect(Collectors.toList());

		//l2=list.stream().filter(i->i%2 == 0).collect(Collectors.toList());
	//	System.out.println("After Streimg:"+l2);
		
	//	long noOfObjects=l2.stream().count();
	//	System.out.println(noOfObjects);
		
		//long faild=list.stream().filter(i->i<35).count();
		//System.out.println(faild);
		
		//List l2=list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		List l2=list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l2);
		
		
		
		
	}
}
