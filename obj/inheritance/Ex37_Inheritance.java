package com.test.java.obj.inheritance;

public class Ex37_Inheritance {
	
	
	//ctrl + shift + L : 검색하기
	
	
	public static void main(String[] args) {
		
		
		//Ex37_Ingeritance.java
		
		/*
		 
		 
		 
		 상속, Inheritance
		 	- 부모가 가지고 있는 재산을 자식에게 물려주는 행동
		 	- 부모 -> 클래스, 자식 -> 클래스, 재산 -> 멤버(변수,메서드)
		 	- 즉 , 부모클래스가 가지고 있는 멤버들을 자식클래스에게 물려주는 행동
		 
		 
		 상속 관계에 있는 클래스 호칭
		 - 부모 클래스 <-> 자식 클래스
		 = 슈퍼 클래스 <-> 서브 클래스
		 = 기본 클래스 <-> 확장 클래스
		 = 기본 클래스 <-> 파생 클래스
		 
		 
		 
		 
		 */

		//상속 발생 > 부모클래스는 영향 X
		Parent p = new Parent();
		
		p.a = 10;
		p.b = 20;
		p.ccc();
		
		
		//우선, 상속은 복사를 해서 주는 것
		Child c = new Child();
		
		c.a = 10;
		c.b = 20;
		c.ccc();
		
		c.d = 30;
		c.e = 40;
		c.fff();
		
		
		
		
		
		
		
	}//main

}//class


//부모 클래스
class Parent {
	
	public int a;
	public int b;
	
	public void ccc() {
		System.out.println("ccc");
	}
	
	
}//Parent


//자식 클래스
class Child extends Parent { // extends 부모이름 -> 상속하는법
	
	//부모 멤버를 상속 받고
	
	public int d;
	public int e;
	
	public void fff() {//자기 멤버도 만들어야됨
		System.out.println("fff");
		
	}
	
	
	
	
}//Child




















