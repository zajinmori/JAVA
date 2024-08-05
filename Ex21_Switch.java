package com.test.java;

import java.util.Scanner;

public class Ex21_Switch {

	
	public static void main(String[] args) {
		
		
		
		//Ex21_Switch.java
		
		/*
		 
		 
		 switch문, switch case문
		 - 조건 : 값(데이터) > 정수, 문자열, 열거형
		 
		 switch case의 모양
		 switch(조건) {
		 	 case 값 :
		 	 	문장;
		 	 	break;
		 	 	[case 값 : 
		 	 	문장;
		 	 	break;]xN
		 	 [default:
		 	 문장;
		 	 break;]
		 	 	
		 }
		 
		 */
		
		//m1(); //switch case의 느낌
		//m2(); //switch case 예제
		//m3(); //switch case가 안되는 경우
		m4();
		

		
	}

	private static void m4() {
		
		
		//달력 만들기
		
		//예제)요구사항] 사용자 월 입력 > 해당 월의 마지막 일 ?
		
		int lastDay = 0; //마지막 일
		
		int month = 5; //내가 알고싶은 달
		
		if(month == 1 || month == 3 || month == 4 || month == 5 || month == 6 || month ==7 || month == 8 || month == 9 || month == 10 || month == 11 || month ==12 ) {
			
	lastDay = 31;}else if(month ==4 || month == 6 || month == 9 || month == 11) {
		lastDay = 30;
	}else {
		lastDay = 28;
	}
		
		
		
		switch(month) {
		case 1:
		case 3:
		case 4:
		case 7:
		case 8:
		case 10:
		case 12: lastDay = 31;
		break;
		
		case 5:
		case 6:
		case 9:
		case 11: lastDay = 30;
		break;
		
		case 2 : lastDay = 28;
		break;
			
		

		// if 와 switch case 비교인데 이런경우엔 switch case가 가독성이 더 좋다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		int num = 10;
		if (num<0) {
			System.out.println("양수");
		}else {
			System.out.println("양수아님");
		}// -if문
		
		
		//if문보다 제약사항이 더 큰 경우.. (스위치에 ()에는 무조건 정수나 문자가 들어가야한다.)
//		switch(num < 0) {
//		case true :
//			System.out.println("양수");
//			break;
//		case false:
//			System.out.println("양수아님");
//			break;
//		}
		
		
	}

	private static void m2() {
		
		//예제) 요구사항] 자판기
		// - 메뉴 출력 >음료 선택 > 가격 출력
		// - 가격 변동 > 사이다 700원, 콜라와 사이다는 가격동일
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("	자판기");
		System.out.println("=========================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("-------------------------");
		System.out.print("선택(번호) : ");
		
		String input = scan.nextLine();
		
		if(input.equals("1") || input.equals("2")) {
			System.out.println("700원");
		}else if(input.equals("3")) {
			System.err.println("300원");
		}else {
			System.out.println("선택하신 음료는 없습니다.");
		}
		// -if문을 사용
		
		
		
		switch (input) {
		case "1" :
		case "2" :
			System.out.println("700원입니다");  //결과값이 같으니까 지워버렸다. 위에 if문에 ||를 사용한거와 같은 경우.
			break;
		case "3" :
			System.out.println("500원입니다");
			break;
		default: // 없는 값을 아무거나 입력하면 출력
			System.out.println("없는 번호");
			break;
		}
		//switch문 사용.
		
		
		
		
		
		
	}

	private static void m1() {
		
		//요구사항) 숫자를 1개 입력 > 한글로 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("하나");
		} else if(num == 2) {
			System.out.println("둘");
		} else if(num == 3) {
			System.out.println("셋");
		} // -----if문으로 만든것.
		
		
		
		switch(num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
		}
		
		
		
		
	}
	
}
