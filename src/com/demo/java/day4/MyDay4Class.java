package com.demo.java.day4;

import java.util.Date;

public class MyDay4Class {
	
	String value = "";
	
	public static void main(String[] args) {
			Number a = new Integer(232);
			Number ab = new Long(232);
			Number ac = new Float(232.5);
			
			a.doubleValue();
			
			//Number = byte, short, int, long, float, double
			
			String abc = "hello+$23290";
			abc = abc + "asdasda";
			
			
			
			String s = "hello"; //-> String pool
			String s1 = " hello ";
			String ss = new String("hello");
			String ss1 = new String("hello");
			
			if(s == s1){
				System.out.println("1 yes");
			}
			if(s.equals(ss)){
				System.out.println("2 Yes");
			}
			if(ss == ss1){
				System.out.println("3 Yes");
			}
			
			if(ss.equals(ss1)){
				System.out.println("4 Yes");
			}
			
			String temp = null;
			
			if(temp != null && s.equals(temp)){
				System.out.println("true");
			}
			
			String tt = s.replace("ll", "rr");
			
			String nnn = "5555";
			
			Integer.parseInt(nnn);
			Long.parseLong(nnn);
			int num = 121;
			
			tt = String.valueOf(num);
			
			Integer in = 1231;
			
			in.toString();
	}
	
	
	@Override
	public String toString() {
		return "String value is :"+value;
	}
}
