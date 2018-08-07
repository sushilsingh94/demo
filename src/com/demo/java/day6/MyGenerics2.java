package com.demo.java.day6;

public class MyGenerics2 <K, V>{
	private K key;
	private V value;
	
	MyGenerics2(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	public V getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		MyGenerics2<String, Integer> p1 = new MyGenerics2<String, Integer>("hello", 1254);
		
		System.out.println(p1.getKey()+" - "+p1.getValue());
	}
}
