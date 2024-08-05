package com.test.java.obj;

public class Ex28_Class {

	public static void main(String[] args) {
		
		
		
		//Ex28_Class.java
		/*
		 
		 자바
		 - 객체 지향 프로그래밍 언어
		 - Object Oriented Programming Language ) OOP
		 - 객체를 중심으로 프로그램을 만드는 방식
		 
		 - 클래스라는 설계도를 사용해서, 
		   객체라는 것을 만들고,
		   만들어진 객체를 사용해서,
		   내가 원하는 행동을 구현하는 것.
		 
		 1. 클래스, Class(***)
		 	- 객체를 만드는 설계도
		 	- 객체를 분류하는 기준
		 	- 자료형
		 	- ex)붕어빵틀
		 	
		 2. 객체, Object(***)
		 	- ex)붕어빵
		 
		 3. 인스턴스, Instance
		 	- ex)붕어빵22
		 	- 진짜 메모리에 실체화된 객체
		 	
		 4. 추상화
		 
		 5. 상속
		 
		 6. 다형성
		 
		 7. 정보은닉
		 	- 캡슐화를 하면 자동으로 정보은닉이 된다
		 	-ex)리모컨 회로판
		 	
		 8. 캡슐화
		 	-ex)리모컨 껍데기, 사람피부 
		 	
		 9. 인터페이스
		 	-ex)리모컨 버튼
		 	
		 10. 프로퍼티(Property), 속성(Attribute)
		 
		 11. 행동(Behavior)
		 
		 
		 */
		
		
		//클래스
		//요구사항) 지도 > 우리집 > 좌표 저장
		
		//Case 1.
		//- 가장 간단한 방법
			//-> 식별자 문제 > 같은 성질의 식별자가 서로 다른 이름을 사용
		//		 구조적 문제 > 규칙(X), 서로가 쌍인지 보장(X)
		
		//우리집 좌표
		int x = 100;
		int y = 200;
		
		System.out.printf("우리 집은 [%d, %d]에 위치합니다.\n",x,y);
		
		
		//추가요구) 마트 좌표
		int x2 = 300;
		int y2 = 400;
		
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",x2,y2);
		
		
		
		
		//Case 2.
		//- 배열 사용
		//	-> 데이터 저장 구조 > 집합 > 관리 용이 > 가독성+
		//		but, 요소를 구분할 단서 > 방번호는 의미를 부여 할 수가 없다..
		// *** 배열은 같은 성질의 같은 자료형의 집합 ***
		
		//우리집 좌표
		
		int[] a1 = {100,200};
		System.out.printf("우리 집은 [%d, %d]에 위치합니다.\n",a1[0],a1[1]);
		
		
		//마트 좌표
		int[] a2 = {300,400};
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",a2[0],a2[1]);
		
		
		
		
		//Case 3.
		//- 클래스 사용
		//	-> Case 1과 Case 2의 문제를 해결 / 데이터 집합을 역할
		//		데이터 저장 구조 역할(x,y)
		//		각 멤버의 이름을 정의 가능(x,y) > 멤버의 성질 구분
		//		but, 초기 비용 발생 !! (클래스를 만드는 자체)
		//			 루프(for)를 못돌린다.
		
		
		//선언된 클래스로 > 객체를 생성하는 방법
		//- 자료형 변수명 = new 생성자();
		//- 클래스 객체(명,변수) = 객체생성연산자(new) 생성자();
		
		//우리집 좌표
		
		//- Point 클래스의 p1이라는 인스턴스를 생성했습니다.
		//- p1 객체를 생성했습니다.
		Point p1 = new Point(); //-> 객체생성 (붕어빵틀로 붕어빵 한개 만듬)
		
		//멤버 접근 연산자 ( . )
		p1.x = 100; //클래스 멤버변수에 값을 집어넣는 방법.
		p1.y = 200;
		System.out.printf("우리 집은 [%d, %d]에 위치합니다.\n",p1.x,p1.y);
		
		
		
		//마트좌표
		Point p2 = new Point(); //-> 두번째 객채 생성(붕어빵 두개째 만듬)
		
		p2.x = 300;
		p2.y = 400;
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n",p2.x,p2.y);
		
		
		
		
		
		
		Size monitor = new Size();
		
		monitor.name = "LG 모니터";
		monitor.width = 1920;
		monitor.height = 1080;
		
		System.out.println(monitor.name + ":" + monitor.width + "," + monitor.height);
		
		
		
		
		Score s1 = new Score();
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		
		
		
		
		
		//클래스를 왜 자료형이라고 하는가 ?
		int a = 10;
		boolean b = true;
		
		Point c;
		Score d; //클래스만 봐도 데이터의 구조나 형태를 예측가능하기 때문이다.
		
		
		
	}//main
	
}//Class



//클래스 선언하기(=붕어빵 틀 만들기)
//- 클래스명 : 파스칼 표기법
class Point {
	
	//구현부
	//- 클래스의 멤버를 선언하기(구현부)
	//	1. 변수
	//	2. 메서드
	
	//멤버 변수
	public int x;
	public int y;
	
	
}//Point


class Size{
	
	public String name;
	public int width;
	public int height;
	
}//Size


class Score{
	
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	
}//Score


