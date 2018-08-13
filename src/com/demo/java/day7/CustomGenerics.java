package com.demo.java.day7;

import java.util.ArrayList;
import java.util.List;

public class CustomGenerics {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(4587);
		list.add("asda");
		
		printAll(list);
	}
	
	public static void printAll(List<?> list){
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
