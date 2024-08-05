package com.test.java;

import java.util.Scanner;

public class Ex20_if {

	public static void main(String[] args) {
		
		//자바를 배울때의 고비..
		//1. 제어문
		//2. 배열(컬렉션)
		//3. 클래스
		
		
		//Ex20_If.java
		
		
		/*
		 
		 제어문
		 - 수많은 명령어의 집합 > 명령어들이 실행되는 순서 : 위 > 아래
		 - 제어의 흐름을 통제하는 도구
		 - 조건 제어, 반복 제어, 분기 제어
		 
		 1. 조건문
		 	- 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
		 		a. If
		 		b. Switch
		 		
		 2. 반복문
		 	- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
		 		a. For
		 		b. While
		 		c. Do While
		 		d. For
		 3. 분기문
		 	- 코드의 흐름을 원하는 곳으로 이동
		 		a. break
		 		b. continue
		 		c. goto(JDK 1.5 폐기)
		 
		 
		 */
		
		
		//m1(); //if문의 설명
		//m2(); //if문의 활용(예제)
		//m3(); //if문의 예제 (다중조건문의 예)
		//m4(); //if문의 예제 (설문조사)
		//m5(); //if문의 예제 (중첩된 if문)
		m6();
		
	} //main

	private static void m6() {
		if (true) {
			System.out.println("참");}
		
		
		
		boolean flag = true;
		flag = false;
		
		if(flag) {
			System.out.println("참");
		}
		
		
		//if (비교연산자 or 논리연산자)
		
		
//		c언어
		//- boolean 없음
		//- 숫자(0이 아닌값) > true
		//		(0) 		 > false
		//- 문자열("홍길동") > true
		//		  ("")		 > false
		// ->자바는 지원을 안한다.
		
		
		int n = 10;
		
		if (n > 0) {
			System.out.println("양수");
		} else 
			System.out.println("양수 아님");
		// 실행값이 한줄이면 블럭이 없어도 됨
		
		
		
		
	
	}
		
		
		
		
		
	

	private static void m5() {
		
		//예제) 성적 처리
		// -1과목 > 합격 / 불합격
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 : ");
		int score = scan.nextInt();
		
		if (score >= 60 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		//0 ~ 100 사이로 만들기
		if (score >= 60 && score <= 100) {
			System.out.println("합격");
		}else if (score < 60 && score >= 0) {
			System.out.println("불합격");
		}else {
			System.out.println("점수는 0 ~ 100점 이내로 입력하세요.");
		}
		
		//중첩된 if문
		
				if (score >= 0 && score <= 100) {
					
					if (score >= 60) {
						System.out.println("합격");
					} else {
						System.out.println("불합격");
					}
					
				} else {
					System.out.println("점수는 0~100점 이내로 입력하세요.");
				}

		

					}
		
	

	private static void m4() {
		
		//예제) 설문 조사
		
		int score = 0; //누적변수(누적 변수는 0으로 초기화한다.)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 어떤 개발툴을 선호하십니까?");
		System.out.println("a. 메모장");		// +1
		System.out.println("b. 이클립스");		// +3
		System.out.println("c. 인텔리제이");	// +5
		
		System.out.println("선택 : ");
		
		String input = scan.nextLine();
		
		if (input.equals("a")) {
			score = 1;
		}else if(input.equals("b")) {
			score = 3;
		}else if(input.equals("c")) {
			score = 5;
		}
		
		System.out.println("2. 어떤 프로그래밍 언어를 선호합니까?");
		System.out.println("a. c/c++");		// +1
		System.out.println("b. Java");		// +3
		System.out.println("c. Kotlin");	// +5
		
		System.out.print("선택 : ");
		
		input = scan.nextLine();
		
		if (input.equals("a")) {
			score += 1;
		}else if(input.equals("b")) {
			score += 3;
		}else if(input.equals("c")) {
			score += 5;
		}
		
		System.out.println("3. 하루에 코딩을 몇시간 합니까?");
		System.out.println("a. 1시간 미만");				// +1
		System.out.println("b. 1시간 ~ 3시간 미만");		// +3
		System.out.println("c. 3시간 이상");				// +5
		
		System.out.println("선택 : ");
		
		input = scan.nextLine();
		
		if (input.equals("a")) {
			score += 1;
		}else if(input.equals("b")) {
			score += 3;
		}else if(input.equals("c")) {
			score += 5;
		}
		
		
		System.out.println("설문이 완료되었습니다.");
		
		System.out.println("[결과]");
		
		if (score >= 10) {
			System.out.println("당신은 개발자 자질이 있습니다");
		}else if (score >= 5) { //score >= 5 && score < 10
			System.out.println("개발자가 되기 위해 노력하세요.");
		}else {
			System.out.println("다른거 하세요 ~");
		}
		
		
	}

	private static void m3() {
		
		//기상 > 출근 ( 다중조건문의 예)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("기상시간 : ");
		
		int hour = scan.nextInt();
		
		if(hour < 6) {
			System.out.print("지하철을 탄다.");
		}else if(hour>=6 && hour < 7) {
			System.out.print("버스를 탄다.");
		}else if(hour >= 7 && hour <8) {
			System.out.print("택시를 탄다.");
		}else {
			System.out.print("병가를 낸다.");
		}
		
		
		if(hour < 6) {
			System.out.print("지하철을 탄다.");
		}else if(hour < 7) {
			System.out.print("버스를 탄다.");
		}else if(hour <8) {
			System.out.print("택시를 탄다.");
		}else {
			System.out.print("병가를 낸다.");
		} // -이렇게 짜는게 더 편하고 유지보수에 좋다 hour>=6 && 이걸 지운이유는 앞에 전제조건이 쌓였기 때문.
		
		
	}

	private static void m2() {
		
		//예제) 나이 입력 > 성인 or 미성년 판단.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 :");
		int age = scan.nextInt();
		
		System.out.println(age >= 18 ? "성인" : "미성년자");
		
		
		
		//if 문을 활용한 예제풀이.
		if(age >= 18 ) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
	
	
	}

	private static void m1() {
		
		/*
		 
		 if 문
		 - 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
		 - 조건식 > boolean값을 가진다
		 	
		 	if(조건식) {
		 		문장;
		 	}
			
		_____________________________________________
		
		 
		 if(조건식) {
		 		문장;
		 	}else{
				문장;
			}
		_____________________________________________
		 
		 - 다중 조건문
		   
		 if(조건식) {
		 		문장;
		 	}else if(조건식){
				문장;
			}
			
		_____________________________________________
			
			 if(조건식) {
		 		문장;
		 	}else if(조건식){
				문장;
			}else if(조건식){
				문장;
			}else if(조건식){
				문장;
			}else if(조건식){
				문장;
			}
			
		 if(조건식) {
		 		문장;
		 	}[else if(조건식){
				문장;
			}] x N -> n은 한번이든 세번이든 열번이든 마음대로 늘릴수 있다는 뜻.
		 	
		 	_____________________________________________
		 	
		 		 if(조건식) {
		 		문장;
		 	}else if(조건식){
				문장;
			}else if(조건식){
				문장;
			}else if(조건식){
				문장;
			}else if(조건식){
				문장;
			}
		 
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		if (num > 0) {
			//조건을 만족했을 때 실행하는 블럭 (참 블럭)
			//System.out.printf("입력한 %d는 양수입니다.\n", num);
		}
		
		if (num > 0) {
			//만족시켰을때 출력 (참블럭)
			System.out.printf("입력한 %d는 양수입니다.\n", num);
		} else if (num < 0) { 
			//만족하지 않을때 출력 (거짓블럭)
			System.out.printf("입력한 %d는 음수입니다.\n", num);
		} else {
			System.out.println("입력한 수는 0입니다.");
		}
		
		
	}
	
}
