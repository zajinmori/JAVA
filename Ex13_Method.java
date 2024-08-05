package com.test.java;

public class Ex13_Method {

	
	//main 메서드이다.
	//	- 특수 메서드
	//	- 이름이 예약어(main)
	//	- 프로그램을 실행 > 자바가 최우선해서 main메서드 검색 > main()호출
	//		-즉 프로그램을 실행하면 자동으로 실행한다 (main()메서드만.)
	// 	- 프로그램의 시작점(Entry Point)
	//	- 프로그램의 종착(End Point) 즉, main메서드는 프로그램의 시작이자 끝이다.
	public static void main(String[] args) {
		
		
		//Ex13_Method.java
		/*
		 
		 메서드, Method
		 	- 함수(Function), 프로시저(Procedure), 서브 루틴(SubRoutine)
		 	- 코드의 집합
		 	- 같은 목적을 가지는 코드의 집합
		 	- 코드 재사용의 단위(***)
		 	
		 메서드 사용
		 	1. 메서드 선언
		 	2. 메서드 호출(사용한다. 라는 뜻)
		 	3. 메서드는 클래스의 멤버(메서드가 형제, 클래스가 부모)
		 	
		 
		 */
		
		//예제) 요구사항] "안녕하세요" 5회 출력
		//		수정사항] "반갑습니다" 수정		
		
		//하드 코딩
		//System.out.println("안녕하세요");
		//System.out.println("안녕하세요");
		//System.out.println("안녕하세요");
		//System.out.println("안녕하세요");
		//System.out.println("안녕하세요");
		
			//main메서드 밖에서 사용
			System.out.println("반갑습니다");
			System.out.println("반갑습니다");
			System.out.println("반갑습니다");
			System.out.println("반갑습니다");
			System.out.println("반갑습니다");
			
			
			//선언한 메서드 > 호출하기(콜한다)(사용한다라는 뜻)
			hello(); // 호출한것. 이렇게 호출하면 hello메서드로 갔다가 반드시 이 줄로 돌아온다
			hello();
			hello();
			hello();
			hello(); // 요구사항 5회를 간단하게 가능, 수정도 1번만 하기 때문에 유지보수 용이.
		
	}//main 메서드
	
	//!!!메서드의 선언 위치(클래스 내부)
	//메서드끼리는 선언 순서가 무관하다.
	//메서드는 클래스의 멤버이다.
	
	
	
	/*
	 
	 접근지정자 - public
	 정적키워드 - static
	 반환타입	- void
	 메서드명	- hello
	 인자리스트	- ()
	 - 이것들을 시그니처, 헤더 라고 부른다
	 
	 
	 {} - 메서드 본문(body), 구현부라고 부른다
	 	- 코드 작성
	 */
	public static void hello() { 
		//'hello' 메서드의 할일을 지금 위치에 적는다.
		
		System.out.println("안녕하세요"); // 여기까지가 'hello'메서드의 선언
		
		
		
	}
	
}//class 메서드
