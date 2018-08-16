package com.demo.java.day10;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.demo.java.day9.Employee;
import com.demo.java.day9.MyNameComp;
import com.demo.java.day9.MySalComp;

public class Day10Queue {
	
	public static void main(String[] args) {
		Queue<Integer> qList = new LinkedList<>();
		
		qList.add(700);
		qList.add(300);
		qList.add(600);
		qList.add(100);
		
		System.out.println("elements in qList:"+qList);
		while(!qList.isEmpty()){
			System.out.println(qList.remove());
		}
		System.out.println("elements in qList after removal:"+qList);
		
		////////////////////////
		
		Queue<Integer> pList = new PriorityQueue<>();
		
		pList.add(700);
		pList.add(300);
		pList.add(600);
		pList.add(100);
		
		System.out.println("elements in pList:"+pList);
		while(!pList.isEmpty()){
			System.out.println(pList.remove());
		}
		System.out.println("elements in pList after removal:"+pList);
		
		///////////////////////
		Queue<Employee> pList1 = new PriorityQueue<>(new MySalComp());
		
		pList1.add(new Employee("john", 5854));
		pList1.add(new Employee("sam", 100));
		pList1.add(new Employee("bill", 300));
		pList1.add(new Employee("roger", 3500));
		
		System.out.println("elements in pList1:"+pList1);
		while(!pList1.isEmpty()){
			System.out.println(pList1.remove());
		}
		System.out.println("elements in pList1 after removal:"+pList1);
	}

}
