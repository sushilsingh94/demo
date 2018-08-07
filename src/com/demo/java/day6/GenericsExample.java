package com.demo.java.day6;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("hello");
		list.add(1234);
		list.add(new Long(3232));
		
		String s = (String) list.get(0);
		
		List<Integer> ll = new ArrayList<>();
		ll.add(458);
		
		
		
	}

}
