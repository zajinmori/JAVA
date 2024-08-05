package com.test.java.obj.inheritance;

public class Ex38_Object {
	
	public static void main(String[] args) {
		
		
		
		//Ex_38 Object
		
		/*
		 
		 
		  Object 클래스
		  - 개발자가 선언하는 모든 클래스는 자동으로 무 조 건 Object를 상속받는다
		  - 모든 클래스의 근원이 되는 클래스 > 루트 클래스(Root)
		  - Object 클래스 멤버는 9개 > 상속 > 모든 클래스는 상속받은 9개 클래스(공통기능)를 보유한다.
		  
		 - Class Object is the root of the class hierarchy.
		 - Every class has Object as a superclass.
		 - All objects,including arrays, implement the methods of this class.
		 
		 
		 
		 */
		
		Object o1 = new Object();
		
		
		
		Test t1 = new Test();
		
		t1.a = 10;
		t1.b = 20;
		
		
	
		
		
		
		
	}//main
	
	
}//class

class Test extends Object {//Object는 자동으로 상속을 받는다
	public int a;
	public int b;
	
	public void ccc() {}
}









































