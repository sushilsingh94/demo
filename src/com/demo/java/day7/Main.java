package com.demo.java.day7;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static void drawShape(List<? extends Shape> list){
		for (Shape shape : list) {
			shape.draw();
		}
	}
	
	public static void main(String[] args) {
		List<Rectangle> rec = new ArrayList<>();
		rec.add(new Rectangle());
		
		List<Circle> cir = new ArrayList<>();
		cir.add(new Circle());
		
		drawShape(rec);
		drawShape(cir);
		
		List<Number> list = new ArrayList<>();
		list.add(1547);
		list.add(5584.5);
		sum(list);
	}
	
	
	
	static void sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		System.out.println(sum);
	}

}
