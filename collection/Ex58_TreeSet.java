package com.test.java.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ex58_TreeSet {
	
	public static void main(String[] args) {
		
		
		//Ex58_TreeSet.java
		
		
		/*
		 
		 컬렉션 이름
		 
		 [물리구조]					[사용법 = 인터페이스 or 특징(용도)]
		 Array			->		List
		 Linked			->		List
		 
		 Hash			->		Set
		 Tree			->		Set
		 
		 Hash			->		Map
		 Tree			->		Map
		 
		 
		 
		 TreeSet
		 - 순서가 없다.
		 - 중복값을 가지지 않는다. 
		 	->Set의 특징
		 - '이진' 탐색 트리 구조, Binary Search Tree
		 	->내부 데이터가 정렬이 되어있는 구조로 저장.
		 
		 
		 
		 중복값 필요없고 속도 빠른거 -> HashSet
		 중복값 필요없고 정렬이 필요하지만 좀 느린거 -> TreeSet
		 
		 
		 */
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(1);
		set.add(7);
		set.add(8);
		set.add(10);
		set.add(6);
		set.add(9);
		
		System.out.println(set.size());
		System.out.println(set);
		
		
		for(int n : set) {
			System.out.println(n);
		}
		System.out.println("===========");
		
		
		//범위 관련 기능 제공
		System.out.println(set.first());// 가장 첫번째 있는거(작은거)
		System.out.println(set.last());// 가장 마지막에 있는거(큰거)
		
		System.out.println(set.headSet(3));// 3전까지 다
		System.out.println(set.tailSet(7));//7부터 뒤에 다
		
		System.out.println(set.subSet(3, 7));// 3부터 7전까지
		
		
		
		
		
		
		
		
		
		
		//Set > (변환) > List
		
		//ArrayList<String> list = new ArrayList<String>( !!! );
		//Collections.sort($$$);
		
		
		
		
	}//main
	
	

}//class















































































