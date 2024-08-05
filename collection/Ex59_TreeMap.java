package com.test.java.collection;

import java.util.TreeMap;

public class Ex59_TreeMap {
	
	public static void main(String[] args) {
		
		//Ex59_TreeMap.java
		
		
		
		//TreeMap
		// - 키 + 값 > Map
		// - 이진 탑색 트리 > 내부 정렬
		
		TreeMap<String, String> map = new TreeMap<String,String>();
		
		map.put("white", "흰색");
		map.put("black", "검은색");
		map.put("red", "빨강색");
		map.put("blue", "파란색");
		map.put("yellow", "노란색");
		
		System.out.println(map); // 키 로 정렬이 되어있음
		
		System.out.println(map.get("white")); // 흰색
		
		System.out.println(map.firstKey());//black (첫번째)
		System.out.println(map.lastKey());//yellow (마지막)
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		
		System.out.println(map.subMap("r", "w"));
		
		
		
		
		
		/*
		 List
		 - ArrayList ******************* 가장 중요 !!!
		 - Stack 후입선출 구조 쓸때
		 - Queue 선입선출 구조 쓸때
		 - LinkedList 중간삽입 할 일이 있을때
		 - Vector(x)
		 
		 
		 Set
		 - HashSet ************ 3번째로 중요 !
		 - TreeSet 정렬이 필요할때
		 
		 Map
		 - HashMap *************** 2번째로 중요 !!
		 - TreeMap 정렬이 필요할때
		 - Properties
		 - HashTable(x)
		 */
		
		
		
	}

}
