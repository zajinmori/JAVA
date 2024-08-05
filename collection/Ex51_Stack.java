package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex51_Stack {
	
	public static void main(String[] args) {
		
		
		//Ex51_Stack.java
		/*
		 
		 
		 List 계열
		 - ArrayList
		 - Stack
		 - Queue
		 
		 
		 Stack
		 - 후입선출 구조를 갖는 데이터 구조
		 - LIFO, Last Input, First Output
		 - 저장소에 나중에 들어간 요소가 먼저 나온다.
		 ex) 메모리 구조
		 ex) 되돌리기(ctrl + z), 다시하기(ctrl + y)
		 ex) 브라우저 > 뒤로가기, 앞으로가기
		 
		 
		 Queue
		 - 선입선출 구조를 갖는 데이터 구조
		 - FIFO, First Input, First Output
		 - 저장소에 먼저 들어간 요소가 먼저 나온다.
		 ex) 줄서기
		 ex) 주문리스트
		 ex) 순서가 있는 목록 ~
		 
		 */
		
		//m1(); //Stack의 기본
		//m2(); //Queue의 기본
		
		
		
		
	}

	private static void m2() {

		//Queue
		Queue<String> queue = new LinkedList(); // Queue는 인터페이스다
		
		//1. 요소 추가하기 .add
		// - boolean add(T value)
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
		//2. 요소 개수 .size
		System.out.println(queue.size());
		
		//3. 요소 읽기 .poll
//		System.out.println(queue.poll()); // = 빨강 > 처음들어간게 처음으로 나옴 > 선입선출
//		System.out.println(queue.size()); // = 2 > 빨강이 빠졌다
//		
//		System.out.println(queue.poll()); 
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); 
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); // = null > queue는 없어도 에러가 안난다
		
		
		
//		while(queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		System.out.println(queue.peek()); // = 빨강 > 사이즈 안줄음
		System.out.println(queue.size()); // = 3 > 사이즈 안줄었음
		
		
		
		
	}

	private static void m1() {
		
		// Stack
		Stack<String> stack = new Stack<String>();
		
		// 1. 요소 추가하기
		// - T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		// 2. 요소 개수
		System.out.println(stack.size()); // = 3
		
		// 3. 요소 읽기
		// - T pop()
//		System.out.println(stack.pop()); // = 파랑 > 후입선출 > 하나를 뺌
//		System.out.println(stack.size());// = 2 > 하나를 뺏으니 2
//		
//		System.out.println(stack.pop()); // = 노랑
//		System.out.println(stack.size()); // = 1 > 노랑이 빠졌으니
//		
//		System.out.println(stack.pop()); // = 빨강
//		System.out.println(stack.size()); // = 0 > 빨강이 빠져서 0
		
//		for(int i=0; i<stack.size(); i++) {
//			System.out.println(stack.pop()); // 빨강이 안나옴 > 그냥 size로 하면 for문을 돌면서 size가 하나씩 빠지기 때문이다
//		}
		
//		while(stack.size() > 0) { //stack나 queue를 루프돌리때 쓰는 방법 !!!!!!!!!!!!!! 많이 씀
//			System.out.println(stack.pop());
//		}
		
//		System.out.println(stack.isEmpty()); // = false > 뭐가 들어있으니까 
		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		
		
		
		//요소 읽기
		// - T peek()
		// - size의 변화가 없다
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		
		
		
		
		
	}//main

}
