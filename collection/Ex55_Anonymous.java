package com.test.java.collection;

public class Ex55_Anonymous {
	
	public static void main(String[] args) {
		
		
		//Ex55_Anonymous.java
		
		/*
		 
		 익명 클래스, Anonymous Class
		  - 익명 객체, Anonymous Object
		  - 이름 없는 클래스
		  
		  
		  프로젝트
		  - 수많은 클래스 생성
		  
		  
		  
		  실명 클래스
		  - class BBB
		  	- 객체를 여러개 만들 수 있다. (장점)
		  	- 너무 많은 클래스 관리 > 어려움 
		  	
		  
		  익명 클래스
		 - 객체를 여러개를 만들 수 없다. (단점)
		 - 객체를 평생 1개만 만든다. (특징)
		 - 일회성으로 필요함 > 쉬움
		 
		 */
		
		//요구사항] 인터페이스를 구현한 클래스 선언 > 객체를 생성하기
		
		
		BBB b1 = new BBB();
		b1.test();
		
		AAA b2 = new BBB(); //인터페이스는 객체는 못만들어도 변수는 만들 수 있따 -> 업캐스팅
		b2.test();
		
		
		//익명 클래스로 익명 객체 만들기
		AAA b3 = new AAA() {

			@Override
			public void test() { //익명객체
				System.out.println("익명 객체로 만든 메서드");
				
			}
			
		};
		
		b3.test();
		
	}//main

}


interface AAA{
	
	void test();
	
}

class BBB implements AAA{

	@Override
	public void test() {
		System.out.println("추상 메서드를 구현함");
		
	}
	
	
	
}





