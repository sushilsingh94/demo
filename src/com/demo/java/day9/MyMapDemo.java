package com.demo.java.day9;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MyMapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "john");
		map.put(9, "john9");
		map.put(4, "john4");
		map.put(3, "john3");
		map.put(null, null);
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		TreeMap<Integer, String> tree = new TreeMap<>(Comparator.reverseOrder());
		tree.put(1, "john");
		tree.put(9, "john9");
		tree.put(4, "john4");
		tree.put(3, "john3");
		Iterator<Entry<Integer, String>> itr1 = tree.entrySet().iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		Map<Employee, String> tmap = new TreeMap<>(new MySalComp());
		tmap.put(new Employee("John1", 234), "john1 234");
		
		tmap.put(new Employee("Ram", 2234), "ram 2234");
		tmap.put(new Employee("Ramesh", 56564), "ramesh 56564");
		tmap.put(new Employee("Ganesh", 2006), "ganesh 2006");
		tmap.put(new Employee("Anil", 342), "anil 342");
		
		Iterator itr2 = tmap.entrySet().iterator();
		while(itr2.hasNext()){
			Entry<Employee, String> entry = (Entry<Employee, String>) itr2.next();
			System.out.println(entry.getKey());
		}
		
		
		Map<Employee,String> map1 = new HashMap<>();
		
		map1.put(new Employee("Ram", 2234), "ram 2234");
		map1.put(new Employee("John", 2234), "john 2234");
		Iterator<Entry<Employee, String>> itr22 = map1.entrySet().iterator();
		
		while(itr22.hasNext()){
			System.out.println(itr22.next());
		}
	}

}
