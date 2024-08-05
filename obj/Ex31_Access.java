package com.test.java.obj;

public class Ex31_Access {

		public static void main(String[] args) {
			
			
			//Ex31_Access.java
			/*
			 
			 
			 OO지정자(제어자)
			 - 클래스 or 클래스 멤버 > 여러가지 기능을 제공하는 키워드
			 
			 
			 
			 접근 지정자(제어자), Access Modifier
			 - 클래스 멤버에 적용한다.(멤버 변수, 멤버 메서드)
			 - 클래스에 적용한다.
			 - 지역 변수에 적용 불가능.
			 
			 	1. public
			 		-객체(클래스) 외부에 100% 공개
			 	2. private
			 		-객체(클래스) 외부에 100% 비공개**
			 	------------------------------ 밑에는 나중에 상속 수업 후에 배움
			 	3. protected
			 		- public 과 private 수준의 중간 어디쯤...
			 	4. (default or package) > 생략이란뜻
			 		- public 과 private 수준의 중간 어디쯤...
			 		
			 		
			 		
			 		
			 		클래스 멤버 > 접근 지정자 가이드라인
			 		
			 	***	1. 멤버 변수는 무조건 private을 사용한다.
			 		 	> 경우에 따라(외부에 오픈하고 싶으면) Getter, Setter를 구현한다. ***
			 		2. 멤버 메서드는 경우에 따라 public or private을 사용한다.
			 			> 나만 쓰는 행동(클래스안에서) > private
			 			> 외부에서 쓰는 행동 > public
			 		
			 		
			 
			 
			 
			 */


			//Ex31 클래스 > 내가 있는 곳 > Book b1 객체 사용		
			
			Book b1 = new Book();
			
			b1.title = "이것이 자바다";
			
			//b1.price = 38000; //The field Book.price is not visible
			//b1.color = "white"; //color cannot be resolved or is not a field
			//b1.price = -300000000; // 누가봐도 틀린값인데 별 반응이없다(에러가 안남) -> 이것이 문제
			
			b1.aaa(38000);
			
			System.out.println(b1.title);
			//System.out.println(b1.price);
			
			System.out.println(b1.bbb()); //통제를 하니 정상적인 값으로 출력
			
			
			
			
			
			
			Note n1 = new Note();
			
			
			//쓰기 전용 프로퍼티
			n1.setColor("white");
			
			//System.out.println(n1.getColor());
			//System.out.println(n1.color);
			
			//읽기 전용 프로퍼티
			System.out.println(n1.getPrice());
			
			
			//n1.pages
			n1.setPages(30);
			System.out.println(n1.getType()); //n1.type라는 변수가 있구나 유추가능한데 사실 멤버 변수type는 없음.
											  // 이런걸 가상 프로퍼티 라고 한다
			
			
			
			
			
			
			
		}//main
	
}//class


