package com.nexiilabs.strems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample4 {

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
		
		Integer[] i=list.stream().toArray(Integer[]:: new);
		/*for(Integer ele:i) {
			System.out.println(ele);
		}*/
		Stream.of(i).forEach(System.out :: println);
	}
}
