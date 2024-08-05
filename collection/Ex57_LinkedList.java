package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex57_LinkedList {
	
	public static void main(String[] args) {
		
		
		//Ex57_LinkedList.java
		
		/*
		 
		 Collection(인터페이스) < List(인터페이스) < ArrayList(클래스), LinkedList(인터페이스)
		 Collection(인터페이스) < Set < HashSet
		 
		 ArrayList vs LinkedList
		 - 메서드 구성이 유사 > 사용법이 아주 유사하다.
		 - 내부 구조가 다르다 > 사용 '용도'가 다르다
		 - "똑같은 사용법인데 능력이 달라서 상황에 따라 너무 유용하다"
		 
		 LinkedList의 종류
		 1. LikedList - 방이 다 떨어져 있는데 뒤에 주소값이 각 저장되어 있어서 돌다리 두드리듯 하나씩 찾아갈 수 있지만, 다시 뒤로는 못간다
		 2. Double LinkedList - 전 방의 주소값이 있어서 다시 뒤로 갈 수 있다
		 3. *Double Circular LinkedList* - 첫번째 방에 마지막방의 주소값, 마지막방에 첫번째 방의 주소값을 넣어서 '원'의 구조를 띈다.
		 	-> 순환구조이며 자바의 LinkedList이다.
		 
		 
		 */
		
		
		/*

		ArrayList(배열)
		- 순차적인 추가/삭제 > 양호(최강)
		- 읽기 > 최강
		- 중간 추가/삭제 > 불량(최약) > Shift
		
		LinkedList
		- 순차적인 추가/삭제 > 양호
		- 중간 추가/삭제 > 양호
		
		
		

		[1. 순차적으로 데이터 추가하기, Append]
		ArrayList 작업 시간: 235ms
		LinkedList 작업 시간: 2,147ms
		
		[2. 중간에 데이터 추가하기, Insert]
		ArrayList 작업 시간: 9,827ms
		LinkedList 작업 시간: 0ms
		
		[3. 중간에 데이터 삭제하기, Delete]
		ArrayList 작업 시간: 7,133ms
		LinkedList 작업 시간: 0ms
		
		[4. 순차적으로 데이터 삭제하기, Delete]
		ArrayList 작업 시간: 15ms
		LinkedList 작업 시간: 0ms

	
	
	*/

		
		
		
		//m1();//LinkedList의 사용법
		m2(); //ArrayList vs LinkedList 입출력 속도 비교
		
		
		
		
		
	}//main

	private static void m2() {
		
		//ArrayList vs LinkedList 입출력 속도 비교
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
		//1. 순차적으로 데이터 추가하기 -> Append작업(무조건 마지막 방에 차례로 데이터넣기)
		System.out.println("1. 순차적으로 데이터 추가하기, Append");
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<10000000; i++) {
			list1.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);
		
		
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<10000000; i++) {
			list2.add(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);
		
		
		
		//Result : 데이터가 작을수록 차이가 없지만 아주 많은 양을 수행할 때는 ArrayList가 좀 더 빠르다 !!
		//			- ArrayList는 연속적인 방이고 LinkedList는 떨어져 있는 방이라 구조적인 차이가 난다.
		
		
		
		//2. 중간에 데이터 추가하기 -> Insert
		System.out.println("2. 중간에 데이터 추가하기, Insert");
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			list1.add(0, i);// Insert하는 메서드
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);
		
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			list2.add(0, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);
		
		
		//Result : ArrayList 붙어있어서 하나씩 다 뒤로 Shift하느라 엄~청 '오래' 걸린다 반면에 LinkedList는 붙어 있지 않기에 Shift가 발생하지 않아 엄 ~ 청 '빠르다'
		
		
		
		
		//3. 중간에 데이터 삭제하기 -> Delete
		System.out.println("3. 중간에 데이터 삭제하기, Delete");
				
		begin = System.currentTimeMillis();
				
		for(int i=0; i<1000; i++) {
		list1.remove(0);// Delete하는 메서드
		}
			
		end = System.currentTimeMillis();
				
		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);
				
				
		begin = System.currentTimeMillis();
				
		for(int i=0; i<1000; i++) {
			list2.remove(0);
		}
				
		end = System.currentTimeMillis();
				
		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);
		
				//Result : Insert와 똑같은 상황이 발생한다
		
	
		
		//4. 순차적으로 데이터 삭제하기 -> Delete
		System.out.println("4. 순차적으로 데이터 삭제하기, Delete");
						
		begin = System.currentTimeMillis();
						
		for(int i=list1.size()-1; i>=0; i--) {
		list1.remove(0);// Delete하는 메서드
		}
			
		end = System.currentTimeMillis();
						
		System.out.printf("ArrayList 작업 시간 : %,dms\n", end - begin);
						
						
		begin = System.currentTimeMillis();
						
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(0);// Delete하는 메서드
			}
						
		end = System.currentTimeMillis();
						
		System.out.printf("LinkedList 작업 시간 : %,dms\n", end - begin);
		
		
		
		
		
		
		/*
		 1. 순차적으로 데이터 추가하기, Append
		ArrayList 작업 시간 : 484ms
		LinkedList 작업 시간 : 2,469ms
		2. 중간에 데이터 추가하기, Insert
		ArrayList 작업 시간 : 19,780ms
		LinkedList 작업 시간 : 0ms
		3. 순차적으로 데이터 삭제하기, Delete
		ArrayList 작업 시간 : 19,360ms
		LinkedList 작업 시간 : 0ms
		4. 순차적으로 데이터 삭제하기, Delete
		 
		 
		 
		 
		 */
		
		
		
		
	}

	private static void m1() {
		
		//사용법 (ArrayList와의 비교)
		// - 사용법이 완전히 똑같다
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		System.out.println(list1.size());
		
		System.out.println(list2.size());
		
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		
		for(int n : list1) {
			System.out.println(n);
		}
		
		for(int n : list2) {
			System.out.println(n);
		}
		
		
		
	
	}

}//class






















































