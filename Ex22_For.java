package com.test.java;

import java.util.Scanner;

public class Ex22_For {
	
	public static void main(String[] args) {
		
		//Ex22_For.java
		
		/*
		 
		 반복문
		 - 코드를 원하는 횟수만큼 반복하는 제어
		 - only 생산성 + 유지보수
		 
		 
		 for 문
		 
		 ex)
		 - for(초기식; 조건식; 증감식) {
		 		구현부;
		 }
		 
		 
		 
		 
		 
		 */
		
		
		//m1(); for문의 기본
		//m2(); for문의 보편적인 방법
		//m3(); for문의 예제
		//m4(); for문의 누적연산
		//m5(); for문의 예제
		//m6(); for문의 예제
		//m7(); for문의 예제
		//m8(); 무한루프
		//m9(); for문에서의 분기문 (break, continue 사용법)
		//m10(); 예제 (잘못된 예)
		//m11(); for문 \b(백스페이스)의 예
		//m12(); for문 지역변수의 예
		//m13(); for문 난수만들기
		
	}//main

	

	private static void m13() {
		
		
		//난수 만들기(랜덤)
		// - 임의의 수 만들기
			//1. Math 클래스
			//2. Random 클래스
		
		//1. Math 클래스
		
		//System.out.println(Math.random());
		
		for(int i=0; i<10; i++) {
			//System.out.println(Math.random()); //-> 0 ~ 0.99999999999999999999
			
			//가공
			//ex)
			//0.0 > 0.0 > 0
			//0.1 > 1.0 > 1
			//0.4 > 4.0 > 4
			//0.6 > 6.0 > 6
			//0.9 > 9.0 > 9
			//0.1234 > 1.234 > 1
			
			//System.out.println((int)(Math.random()*10)); //형변환(int)를 붙히려면 10을 먼저 곱해줘야 하니 랜덤이랑 곱하기 10을 ()로 묶어준다.
			
			
			//주사위 ( 1 ~ 6 )
			// 0.0 > *6 = 0.0 > 0 > +1 = 1
			// 0.1 > *6 = 0.6
			// 0.2 > *6 = 1.2
			// 0.3 > *6 = 1.8
			// 0.4 > *6 = 2.4
			// 0.5 > *6 = 3.0
			// 0.6 > *6 = 3.6
			// 0.7 > *6 = 4.2
			// 0.8 > *6 = 4.8
			// 0.9 > *6 = 5.4 > 5 > +1 = 6
			System.out.println((int)(Math.random()*6)+1); //난수만들기의 예.
			
	
			
		}
		
		
	}



	private static void m12() {
		
		//지역 변수 영역의 예(스코프)
		// - 자신이 포함된 메서드 영역
		// - 자신이 포함된 제어문 영역
		// ** 위에 두개를 합쳐서 [블록 스코프]를 가진다.
		
		int a = 10; //영역 : m12메서드
		
		//초기화
		// 초기값 ?? > 업무를 살펴보고 판단
		//				1. 필요한 값
		//				2. 최대한 피해주지 않는 값
		//초기화할때 흔하게 쓰는 값. (없다 라는 뜻)
		int b = 0; //초기화
		double c = 0.0;
		char d = '\0'; // null문자 (자바x)
		boolean e = false;
		String f = "";
		
		if(a>0) {
			
			System.out.println(a);
			
			b = a * 2; // 영역 : if문 (아예 if문 밖으로 빼면 가능하다.)
			
		}
		System.out.println(b);
		
		
		
		int i = 0;//for밖으로 뺄 수도 있다
		
		for(i=0; i<10; i++) {
			System.out.println("반복");

		}
		System.out.println(i);// i는 for문안에 있으면 밖으로 못나온다
		
		
	}



	private static void m11() {
		
		int sum = 0;
		
		for(int i=1; i<=3; i++) {
			sum += i;
			System.out.print(i + "+");
		
	}
			System.out.println("\b\b= " + sum);

	}
	
	
	
	private static void m10() {
		
		//예제) 1 + 2 + 3 = 6 (과정도 같이)
		
		int sum = 0;
		
		for(int i=1; i<=3; i++) {
			sum += i;
			
			System.out.print(i);
			
			if(i != 3) {
				System.out.print("+");
			}
		}
		
		System.out.println("=" + sum);
	}// 잘못된 예



	private static void m9() {
		//분기문 > 단독으로 사용 불가, 조건문 or 반복문과 같이 사용
		// - break; : 자신이 포함된 제어문을 탈출. (if문은 제어문이라고 인정안함)
		// - continue; : 
		
//		for(int i=1; i<=10; i++) {
//			
//			
//			if(i==5) {
//				
//				break;
//				
//			}
//			
//			System.out.println(i);
//			
//			
//		} for문에서 break; 사용법
		
//		for(int i=1; i<=10; i++) {
//			
//			if(i==5) {
//				continue;
//				
//			}
//			
//			
//			System.out.println(i);
//			
//			
//			
//		} //for문에서 continue; 사용법
		
		
		//예제) 사용자 숫자 입력 > 홀수의 합 ?
		// - 숫자를 몇개 입력? > x (사용자마음대로) > 회전수 얼마나? > 무한루프.
		// - 0을 입력하면 프로그램 종료
		
		int sum = 0; //누적변수
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			
			
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			
			if(num==0) {
				break;
			}
			
			if(num % 2 ==1) {
				//홀수
				sum += num;
				
			}else {
				
				System.out.println("짝수를 입력했습니다.\n올바르지 않은 숫자입니다.");
				break;
				//짝수
			}
			
		}
		System.out.println("합 : "+sum);
		
		
		
	}



	private static void m8() {
		// 무한 루프, Infinite Loop
		
//		for(int i=0; 1<10; i--) {
//			System.out.println(i); // 약 21억 회전
//		}
		
		//무한 루프 만들기
		
//		for(int i=0; ; i++) {
//			System.out.println(i); //조건문(i<10;)을 true로 바꿈으로써 조건이 없게 만든다 -> 조건문을 없애면 알아서 true가된다.
//		}
		
		for(;;) {
			System.out.println("실행문"); //진정한 무한루프.. (루프변수가 필요없을경우)
		}
		
		
		
	}



	private static void m7() {
		//예제) 구구단 출력
		
		/*
		 5x1=5
		 5x2=10
		 5x3=15
		 ...
		 5x9=45
		 */
		
		for(int i=1; i<10; i++) {
			
			System.out.printf("5x%d=%2d\n",i,5*i);
			
		}
		
		
		
	}
	
	
private static void m6() {
		
		//요구사항] 사용자가 입력한 숫자들의 합 > 10개 입력
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			
			//사용자 숫자 입력 > 누적
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum += num;
			
		}
		
		System.out.println("합: " + sum);
		
	}


	private static void m5() {
		//요구사항1] 1 ~ 사용자가 입력한 숫자까지의 합
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		int sum = 0; // 누적변수
		
		for(int i = 1; i<=num; i++) {
			sum += 1;
		}
		
		System.out.printf("1 ~ %d = %d\n",num, sum);
		
		//요구사항2] 사용자가 입력한 숫자들의 합
//		Scanner scan = new Scanner(System.in);
//		
//		int sum = 0;
//		
//		for(int i=0; i<10; i++) {
//			System.out.println("숫자 : ");
//			int num = scan.nextInt();
//			sum += num;
//			
//		}
		
		
	}

	private static void m4() {
		//요구사항1] 1 ~ 10 까지의 합 > 누적연산
		
		
		//누적값 구하기 (1+2+3+4+5+6+7+8+9+10)
		
		//1. 누적변수
		int sum = 0;
		
		//2. 원하는 수열 만들기
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			
			//위에 식의 원리
			//i(1) : 1 = 0 + 1 -> i(2) 3 = (0 + 1) + 2 ... i(10) 55 = (0+1+2+3+4+5+6+7+8+9)+10
		}
		System.out.println(sum); // -> 요구사항1의 결과 ( 마지막값만 보려면 for문( {} ) 밖에, 과정도 보고 싶으면 {}안에
		
	}

	private static void m3() {
		
		//루프 변수 제어
		// *** 업무 구현 > 특정 숫자의 패턴 사용 > 반복문의 루프 변수 활용
		
		//예제) 요구사항] 숫자 1 ~ 10까지 출력
		
		
		for(int i = 1; i <11; i++) {
			System.out.println(i);} // 루프변수 사용의 예.
			
		
		
		}
		
		


	private static void m2() {
		
		// 반복문의 목적 !!!!
		// 1. 회전수 제어
		// 2. ***루프 변수 제어*** (밑에)'i'를 루프변수라고 한다.
		//
		
		for (int i=0; i<5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		for(int i=5; i<=0; i--) { //--(감소)도 가능
			System.out.println("실행문");
		}
		
		
		//for문의 가장 보편적인 방법
		//- 루프 변수를 0부터 정한다.
		
		for (int i=0; i<5; i++) { //i<5; - 여기서 0부터 시작했을때 5가 회전수이다. 그래서 계산하기 쉽다.
			System.out.println("실행문");
			
		}
		
		
	}

	private static void m1() {
		//요구사항] "안녕하세요." x5회 출력
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요."); // 그냥 바보 꽝..
		
		hello();
		hello();
		hello();
		hello();
		hello(); // 비효율적
		
		
		//for문 구동 순서
			//1. int i=0; (초기식, 제일 먼저 처리하는 것)
			//2. i<5; (조건식 = if(i5<5) 즉, if문이라고 생각.)
			//3. 2번이 만족한다면 구현부 실행
			//4. 끝블럭 ( } )을 만나도 다시 처음으로 돌아간다.
			//5. 다시 돌아오면 i++(증감식)을 실행 (int i=0;(초기식)은 처음 한번만 읽는다.)
			//6. i<5(조건식) 다시 실행
			//7. 다시 구현부 실행
			//8. 다시 i++(증감식)을 실행
			//9. 이렇게 반복을 하다가 i<5(조건식)이 만족을 안하면 끝마친다.
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Hello~"); //요구사항이 500번 실행이면 i<5(조건식)에 5대신 500을 넣으면 된다.
			
		}
		
	}

	private static void hello() {
		System.out.println("반갑습니다.");
		
	}

	

}
