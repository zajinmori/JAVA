package com.test.java.obj;

public class Ex30_Class {
	public static void main(String[] args) {
		
		
		//Ex30_Class.java
		
		
		/*
		 클래스 역할
		 
		 
		 1. 데이터 집합
		 	- 멤버 변수만 구현
		 	
		 2. 데이터 집합 + 행동  -> **가장 많이 씀**
		 	-멤버 변수 구현 > 객체 특성(성질)
		 	-멤버 메서드 구현 > 객체 행동
		 	
		 3. 행동
		 	-멤버 메서드만 구현
		 	
		 */
		
		
		
		
		
		Member m1 = new Member();
		
		m1.name = "홍길동"; // -> 특성(Property), 속성(Attribute)
		m1.age = 20;
		m1.hello();
		
		Member m2 = new Member();
		
		m2.name = "아무개";
		m2.age = 25;
		m2.hello();
		
		//m1과 m2에 넣은 값(홍길동,홍길동)이 똑같아도 다른걸로 분류한다(쌍둥이처럼 똑같이 생겨도 다른 사람인것처럼 그렇게 생각하면 된다)
	}

}

class Member{
	
	//멤버 변수
	public String name;
	public int age;
	
	//멤버 메서드
	public void hello() {
		//System.out.println("안녕하세요."); -> 이러면 호출후에 똑같은게 나오기 때문에 구분이 안가서 못만든거임. 쓸데가 없음
		 System.out.printf("안녕하세요. 저는 %s입니다.\n",name); //이렇게 하면 호출이 되어도 구분이 가기 때문에 잘 만 든 것 ! 즉, 꼭 멤버변수를 활용해야한다.
	}
	
}
