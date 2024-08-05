package com.test.java.obj;

public class Ex34_Constructor {
	
	public static void main(String[] args) {
		
		
		
		
		//Ex34_Constructor.java
		
		/*
		 
		 생성자, Constructor
		 - 특수한 목적을 가지는 메서드
		 - 객체의 멤버(변수)를 초기화하는 전용 메서드
		 
		자료형 객체명 = new 생성자(); 
		 Book 	n1 	  = new  Book ();
		 
	
		 
		 */
		
		
		//호출순서
			//1. new > 객체 생성 연산자 (값이 전부 null로 생성한다)
			//2. Box() > 값을 초기화  (값형 ->0 참조형 -> null) > 반드시 new옆에만 있어야한다
																  //b1.Box(); ->x 단 1회만 호출가능(new Box)
		
		//즉, 세터는 수정의 역할을 한다 !!
		
//		Box b1 = new Box();
//		
//		//Box() : 메서드 호출 구문
//		
//		
//		
//		
//		System.out.println(b1.info()); // -> 사이즈(null), 무게(0)
		
		
		
		//요구사항] "대형" + 100 > 1000씩
		
		Box b2 = new Box();
		
		//b2.setSize("대형");
		//b2.setWeight(100);
		
		System.out.println(b2.info());
		
		//요구사항2] 가끔씩 "소형" + 50 > 10개씩
		Box b3 = new Box("소형",50);
		
		System.out.println(b3.info()); //생성자 오버로딩
		
//		b3.setSize("소형");
//		b3.setWeight(50);
		
		Box b4 = new Box("중형");
		
		Box b5 = new Box(30);
		
		
		
		
		
	}//main

}//class

class Box{
	
	
	private String Size;
	private int Weight;
	
	
	//메서드 (나 모르게 컴터가 자동으로 만듬) 
	// 1. 메서드명 == 클래스명
	// 2. 반환타입 X -> return 불가
	// -> 생성자 -> 기본 생성자(Default)라고 부름.
	public Box() {
		//this.Size = "대형";
		//this.Weight = 100;
		this("대형", 100);
	}
	
	//메서드 오버로딩 : 인자값을 관리해서 같은 이름의 메서드를 만든다.
	//생성자도 메서드이기 때문에 오버로딩이 가능
	public Box(String size, int weight) {
		this.Size=size;
		this.Weight=weight;
	}// 생성자 오버로딩 한것.
	
	public Box(String size) {
		//this.Size = size;
		//this.Weight = 0;
		this(size, 0);
	}// 생성자 오버로딩 한것.
	
	public Box(int weight) {
		//this.Weight = weight;
		//this.Size = null;
		this(null,weight);
	}// 생성자 오버로딩 한것.
	
	//오버로딩을 하면 훨씬 깔끔하고 개발자가 편하다 .. 사실 뭔말인지 모르겠다....
	
	
	
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	
	
	
	public String info() {
		return String.format("사이즈(%s), 무게(%d)", this.Size, this.Weight);
	}
	
	
	
}
