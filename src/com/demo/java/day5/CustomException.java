package com.demo.java.day5;

public class CustomException extends Exception{
	
	private int detail;
	private String msg;
	
	public CustomException(int i) {
		detail = i;
	}
	
	public CustomException(String msg, Throwable t){
		super(msg, t);
		this.msg = msg;
	}
	public CustomException(String msg){
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString(){
		return "Exception is -["+msg+"]";
	}
}
