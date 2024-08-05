package com.test.java.obj;

import java.util.Scanner;

public class Ex49_Exception {
	
	public static void main(String[] args) {
		
		//Ex49_Exception.java
		
		/*
		 
		 
		 예외,Exception
		 	- 런타임 오류
		 	- 컴파일 발견(X) > 실행 중 발견(O)
		 	- 개발자 미리 예측 > 사전 조치 필요
		 	
		 	예외 처리, Exception Handling
		 		1. 제어문 사용
		 		2. try catch 사용
		 		
		 */
		
		//m1(); try catch문의 기본
		//m2(); try catch문의 활용
		//m3();// 다중catch문과 일반적인 try catch문의 사용
		//m4(); finally의 이해
		
		try {
		m5();//(지방 지사) //예외 미루기(예외 한번에 관리하기)
		}catch(Exception e) {
			System.out.println("예외 처리");
		}
		
	}//main(서울 본사)

	private static void m5() throws Exception { // 'throws Exception'메서드 명 옆에쓰기-> 예외 미루기 -> 메서드를 호출하는 부분에 try catch문을 써준다 -> 한번에 관리하기.
		
		int n = 0;
		System.out.println(100/n);
		
		
		
		
		
		
	}

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		
		try {
			//비즈니스 코드 영역
			System.out.println(100/num);
			
		}catch(Exception c) {
			//예외 처리 코드 영역
			System.out.println("예외처리");
			
		}finally {
			// 에러가 있던 없던 무조건 100% 실행함. return이 있어도 이거까지 실행하고 감.
			// 자원 해제 코드 영역 > clean-up 코드
			System.out.println("finally");
			
		}
		System.out.println("종료");
		
		
		}
		
		
		
	

	private static void m3() {
		
		
		try { //하나로 묶는 법
		int num = 0; //사용자가 입력하는 상황임
		System.out.println(100/num); // throw new ArithmeticException() 인스턴스 생성 즉, 에러메세지를 변수명 앞에(객체명) 적는다.
		
		
		int[]nums = {10, 20, 30};
		System.out.println(nums[5]); // new ArrayIndexOutOfBoundsException()
		
		
		Scanner scan = null;
		scan.nextInt(); // new NullPointerException()
		
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열첨자");
		}catch(NullPointerException e) {
			System.out.println("널 참조"); //
			
		}catch(Exception e) {// 내가 예측하지 못한 에러가 있을 수 있으니 안전빵으로 만든것. 모든 Exception의 최상위(부모) 객체이다. like 'Object클래스'.
			System.out.println("예외 처리"); //꼭 마지막(끝)에 넣어줘야함.
			
		}
		
		// ***에러메시지를 외워놓자 !!!
		
	}

	private static void m2() {
		
		try {
		int num = 0;
		System.out.println(100/num); //0으로 나눠서 예외상황 1
		}catch(Exception e) {
			System.out.println("0으로 나누려고 시도했습니다.");
		}
		
		try {
		int[]nums = {10, 20, 30};
		System.out.println(nums[5]); // 없는방 예외상황 2
		}catch(Exception e){
			System.out.println("배열 첨자 오류입니다.");
		}
		
		try {
		Scanner scan = null;
		scan.nextInt(); // 객체가 없어서 예외상황 3 -> 가장 많이 일어나는 에러
		}catch(Exception e) {
			System.out.println("널 참조");
		}
		// *** try catch문을 쓰면 프로그램이 뻑하고 종료가 되는 상황을 방지한다. 즉, 실행은 한다.
		
		
	}

	private static void m1() {
		
		// 요구사항] 숫자를 입력 > 업무 처리
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		if(num != 0) { //예외 처리 1
			
			//비즈니스 코드(업무 코드)
		System.out.printf("100 / %d = %d\n",num ,100 / num); //0으로 나누면 런타임오류 > 예외상황
		
			//예외 처리 코드(에러가 났을때만 실행)
		}else {
			System.out.println("0을 입력하지 마세요");
		}
		
		
		
		// ***try catch문
		// - try문 > 자신의 영역에서 오류가 발생하는 감시 !!! > 실행을 하다가 에러가 난 코드를 기점으로 나머지를 스킵하고 catch문으로 이동한다.
		// - catch문 > 오류가 발생 > 처리하는 역할
		// - 에러가 나는걸 확실히 몰라도 조금 의심이 가면 try catch로 묶는다. 안전하다.
		
		try {
		//비즈니스 코드(업무 코드)
			System.out.println(111);
		System.out.printf("100 / %d = %d\n",num ,100 / num);
			System.out.println(222);
		}catch(Exception e) {
			//예외 처리 코드
			System.out.println("잘못된 숫자(0) 입니다."); //
		}
		
		
		
		
	}

}//class
