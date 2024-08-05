package com.test.java.obj.inheritance;

public class Ex43_Abstract {
	
	public static void main(String[] args) {
		
		
		
				//Ex43_Abstract.java
		
		/*
		 
		 Abstract
		 - 추상 클래스, Abstract Class 
		 - 추상 메서드, Abstract Method
		 
		 
		 
		 
		 */
		
		//홍길동이 쓰던 마우스		
		G305 m1 = new G305();
		
		m1.color = "black";
		m1.weight = 100;
		m1.buttons = 7;
		
		m1.click();
		m1.charge();
		
		//홍길동이 새로 산 마우스
		M410 m2 = new M410();
		
		m2.weight = 150;
		m2.buttons = 5;
		m2.size = "대형";
		
		m2.click(); //똑같은 click인데 바꿔서 불편함 그래서 그냥 click로 만들어야함(사용자경험) 
		m2.autoScroll();
		
		
		
		
		//Mouse m3 = new Mouse(); -> 추상 클래스는 객체 생성을 할 수 없다.
									// 왜냐면 ?? -> 추상메서드 때문이다. 추상메서드는 구현부(바디)를 가지지 못하기 때문에 호출하면 에러가 나기 때문이다.
		
		
		
		
		
		
		
	}//main

}//class


//추상 클래스
// - 추상 메서드를 가질 수 있다.
// - 객체 생성을 할 수 없다.
// - 일반 클래스의 부모역할 ( 상속 ) <- 이게 목적이다


//추상 클래스 선언하기 -> mousedown과 click를 통일하기 위한것
abstract class Mouse{
	
	public int weight;
	public int buttons;
	
	//추상 메서드 선언하기(규약)  -> mousedown과 click를 통일하기 위한것
	public abstract void click(); // abstract를 붙이면 바디(구현부)가 없어도 괜찮다 즉, 자식한테 click를 상속하기 위해서 만든것
								 // abstract메서드는 abstract클래스 안에서만 쓸수있다
									// 머리통(click)은 똑같은걸 쓰고 바디(구현부)는 너네 마음대로 해라 라는 뜻 
}									// 자식 클래스들은 무조건 click이 들어간 메서드를 사용해야 에러가 안난다.

// 결론.
//추상 메서드 > 상속 > 구현
// 1. 추상 메서드를 구현한다.(없던 바디를 추가로 구현했기 때문에.
// 2. 오버라이드를 했다.
// -> 만드는 사람보다 사용하는 사람의 편의를 위한 클래스이다. 최대한 편하게 만들어줘야 생산성이 올라간다.



//예제)마우스 생산
class  G305 extends Mouse{ 
	
	public String color;
//	public int weight;
//	public int buttons; -> 상속을 함으로써 필요없음
	
	public void click() {	
		System.out.println("클릭합니다.");
	}
	
	public void charge() {
		System.out.println("충전합니다.");
	}
	

	
}//G305

class M410 extends Mouse{
	
//	public int weight;
//	public int buttons;
	public String size;
	
	public void click() {
		System.out.println("클릭~!");	
	}
	
	public void autoScroll() {
		System.out.println("스크롤합니다.");
	}
	
}


































