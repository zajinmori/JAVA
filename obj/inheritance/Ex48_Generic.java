package com.test.java.obj.inheritance;

public class Ex48_Generic {
	
	public static void main(String[] args) {
		
		
		//Ex48_Generic.java
		
		Item<String> s1 = new Item<String>(); //< >안에 자료형 넣어주기
		
		s1.a = 10;
		s1.b = "문자열";
		s1.c = "홍길동";
		
		
		Item<Integer> s2 = new Item<Integer>();//객체를 만들때 자료형을 결정한다.
		
		s2.c = 100;
		
		
		
		
		Pen<Integer> p1 = new Pen<Integer>();
		Pen<Integer> p2 = new Pen<>(); //뒤에만 타입생략 가능
		
		p1.a = 10;
		p1.b = 30;
		p1.c = 20;
		
		
		Desk<Boolean> d1 = new Desk<>();
		d1.setData(true);
		System.out.println(d1.getData());
		
		
		Laptop<String,Integer> l1 = new Laptop<String,Integer>("맥북",1000);
		
		System.out.println(l1.getA());
		System.out.println(l1.getB());
		
		// --> 이런게 Generic 클래스 이다
		
		
	}//main

}//class

//제네릭 클래스
// - T : 타입변수(매개변수 역할) > 자료형을 저장하는 변수..
// - ex) T = String
// - ex) T = int : 불가능.
// - ex) T = Integer : 가능.
class Item<T>{ //뒤에다가 <T> 붙인다
	
	public int a;
	public String b;
	public T c;
	
}

class Pen<T>{
	public T a;
	public T b;
	public T c;
	
	
}

class Desk<T>{
	private T data;

	public void setData(T data) { //매개변수 -> T
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	// 자료형을 쓸수있으면 전부 T를 쓸수 있따
}


class Laptop<T,U>{ //타입변수를 여려개 만들 수 있따. 보통 2개까지만 쓴다
	private T a;
	private U b;
	
	public Laptop(T a, U b) {
		this.a = a;
		this.b = b;
		
	}
	
	public T getA() {
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
}














