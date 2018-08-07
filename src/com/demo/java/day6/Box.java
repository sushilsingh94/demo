package com.demo.java.day6;

public class Box {
	
	private int length;
	private String name;
	
	Box(int l, String n){
		length = l;
		name = n;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
