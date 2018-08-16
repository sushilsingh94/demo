package com.demo.java.day10;

import java.util.HashSet;
import java.util.Set;

public class Day10 {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(3);
		set.add(8);
		set.add(5);
		set.add(7);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
	}

}
