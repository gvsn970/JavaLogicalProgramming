package com.nexiilabs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamsExample3 {

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
		
		list.stream().forEach(System.out :: println);
		
		Consumer<String> c=(s->{
			System.out.println("::::::"+(s+""+s));
		});
		list.stream().forEach(c);
	}
}
