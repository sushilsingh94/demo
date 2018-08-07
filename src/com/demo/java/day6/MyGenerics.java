package com.demo.java.day6;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics <E>{
	
	private E t;
	
	public E get(){
		return t;
	}
	
	public void set(E t){
		this.t= t;
	}
	
	public static void main(String[] args) {
		MyGenerics<String> mg = new MyGenerics<String>();
		
		mg.set("hello");
		String s = mg.get();
		System.out.println(s);
		
		MyGenerics<Integer> mg1 = new MyGenerics<>();
		
		mg1.set(232);
		
		List<Box> l = new ArrayList<>();
		l.add(new Box(123, "hello"));
		
		MyGenerics<Box> m = new MyGenerics<>();
		Box b = new Box(11, "test");
		m.set(b); 
		
		Box ee = m.get();
		
		System.out.println(ee.getLength()+" - "+ee.getName());
	}

}
