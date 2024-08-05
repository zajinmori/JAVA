package com.test.java;

import java.util.Scanner;

public class Ex08_Error {

	
	public static void main(String[] args) {
		
		
		
		//Ex08_Error.java
		
		
		/*
		 
		 
		 에러, Error
		 - 오류, 버그(Bug), 예외(Exception) 등..
		 
		 1. 컴파일 에러(빨간밑줄-이클립스 기능) (가장 잡기 쉬운 에러)
		 - 컴파일 작업 중에 발생하는 에러
		 - 컴파일러가 발견 !! > 번역하다가 > 문법오류발견 !!
		 - 발생 !! > 컴파일 중단 > 프로그램 생성 불가 > 반드시 해결 !!
		 - 난이도 가장 낮음 > 컴파일러가 알려줌 !! > 에러 메세지
		 - 오타로 발생!!
		 - 에러메세지 정독하기 !!
		 
		 2. 런타임 에러
		 - 런타임(Runtime) > 프로그램 실행 중에 나는 에러
		 - 컴파일 작업 중에서는 발견x > 실행 중에 발견되는 에러
		 - 문법에는 오류가 없었는데.. 다른 이유로 발생하는 에러
		 - 예외(Exception)라고 부른다 !!
		 - 난이도 중간 > 발견이 될수도, 안될수도 있기 때문
		 
		 3. 논리 에러
		 - 컴파일o > 런타임o > 결과가 이상..		 
		 - 난이도 최상
		 
		 */
		
		
		
		int a1 =10;
		int a2 = 5;
		System.out.println(a1 + a2);
		
		
		
		
		
		
		
		/* 런타임에러
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력: ");
		int num = scan.nextInt();
		
		System.out.println(100 / num);
		*/
		
		
		
	}
}
