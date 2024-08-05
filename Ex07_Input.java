package com.test.java;

import java.util.Scanner;

public class Ex07_Input {
	
	public static void main(String[] args) {
		
		/*
		 
		 콘솔 입력
		 	1.System.in.read();
		  	  System.out.print();\
		  	  
		  	2.BufferedReader 클래스
		  	
		  	3.Scanner (클래스 화면으로부터 입력받는 기능)
		 		- 문자열 입력 !!! 많이씀
		 		- 숫자 입력
		 			-정수 입력 !!! 많이씀
		 			-실수 입력 !! 꽤씀
		 		- 논리 입력
		 */

		
		//요구사항] 사용자로부터 문자를 1개를 입력 > 그대로 화면에 출력
		
		//java.lang 이라는 패키지 안에 들어있다.
		//-기본패키지라 풀네임을 안써도된다.
		//String txt;   // -> String의 풀네임
		 //Date처럼 이름이 겹칠경우 하나만 활성화 하고 하나는 풀네임 적기.
		
		//Ctrl + Shift + O -> 한번에 활성화 시킬 수 있음
		//패키지랑 클래스 사이에 써놓으면 활성화됨 
				//import java.util.Scanner; 
				//import java.util.ArrayList;
				//import java.util.*; util폴더안에 있는 모든걸 활성화
				//이런걸 "인풋한다"라고 한다.

		/* 주석달아놓음 풀면 보임
		Scanner scan = new Scanner(System.in); // ***System.in 은 사용자로부터 입력을 받아야 된다는 의미
		
		System.out.println("프로그램 시작");
		
		//사용자로부터 키보드 입력을 받는다.
		 String input = scan.next();//메서드 (변수를 선언하면서 초기화.)
		 
		 System.out.println("입력."+input);
		 
		 System.out.println("프로그램 종료");
		
		
		
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("원하는 숫자를 말하세요.");
		 String input1=sc.next();
		 System.out.println("저는"+input1);
		 System.out.println("잘했어요");
		*/
		 
		//자료형별로 키보드 입력 받기
		
		Scanner scan = new Scanner(System.in);
		
		
		/* 주석입니다 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.print("문자열 입력: "); //화면출력,prin >한줄로, println>엔터치고
		
		//- next() > 토큰(Token) 입력 > 공백을 구분자로 하는 각 요소(단어별로)
		//- nextLine() > 문장 입력 > (한꺼번에)
		String input = scan.next(); //nextLine > 키보드대기상태
		
		System.out.println(input);
		*/
		
		/* 주석있어요 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//요구사항] 사용자로부터 숫자를 1개 입력받아서 x2 출력
		System.out.println("숫자 입력:");
		
		int input = scan.nextInt();//String을 int변수로 바꿔줘야 숫자계산이 가능하다
		
		System.out.println(input*2); // (*는 곱하기로 사용) 문자열 * 숫자
		*/
		 
		/* 주석있어요 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		System.out.print("실수 입력:");
		
		double input=scan.nextDouble();
		
		System.out.println(input);
		*/
		//scan.nextChr > 없다
		 
		//예제) 숫자 2개를 입력 > 그 합을 구하시오.
		
		//[초간단 계산기]
		//숫자1: 10
		//숫자2: 5
		//결과: 10 + 5 = 15
		System.out.println("초간단 계산기");
		
		System.out.print("사용자명: ");
		String name = scan.nextLine();
		
		System.out.print("숫자1: ");
		int num1=scan.nextInt();
		
		System.out.print("숫자2: ");
		int num2=scan.nextInt();
		 
		System.out.printf("%s님이 입력한 결과: %d + %d = %d",name, num1, num2, num1 + num2);
		//단축키 *** Alt + Shift + Y (자동줄바꿈)
		 
		 
		 
		 
		
	}
	
	
}
