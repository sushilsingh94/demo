package com.demo.java.day9;

import java.util.Comparator;

public class MyNameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
