package com.test.java;

public class Ex16_LocalVariable {
	
	int b = 20; // 멤버 변수(클래스 변수)
	
	
	public static void main(String[] args) {
		
		
		//Ex16_LocalVariable
		/*
		 
		 자바의 변수
		 - 선언된 위치, 역할
		 
		 1. 멤버 변수, Member Variable
		 	- 클래스 수업때 배울것.
		 	- 클래스내에서 선언한 변수
		 	
		 	
		 2. 지역 변수, Local Variable
		 	- 지금까지 사용한 변수 전부가 지역변수이다.
		 	- 메서드내에서 선언한 변수.
		 	- 변수 스코프(Scope) : 변수의 사용영역(***) -> 자신이 포함된 메서드영역(메서드를 나가면 사용불가)
		 	
		 	지역 변수의 생명 주기(Life Cycle)
		 	- 변수가 언제 태어나서(메모리 생성) ~ 언제 죽는지(메모리 소멸)
		 	- 생성 : 변수 선언문이 실행될 때
		 	- 소멸 : 변수 선언문이 포함된 자신의 블럭(메서드)을 빠져나갈 때
		 	- main메서드 지역변수가 제일 오래 살아있다가 죽는다.
		 */
		
		//The value of the local variable a is not used
		int a = 10; //지역변수
		
		test();
		
		
		
	}//main메서드
	
	public static void test() {
		
		int a = 20; //지역변수1 생성
		System.out.println(a);
		
	}//지역변수1 소멸

}
