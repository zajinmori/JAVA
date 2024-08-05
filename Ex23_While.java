package com.test.java;

import java.util.Scanner;

public class Ex23_While {
	
	public static void main(String[] args) {
		
		
		//Ex23_While.java
		
		
		
		//m1(); 문자열 스캐너 사이에 숫자열 스캐너가 있으면 이상한경우 해결법.
		//m2(); while문 기본
		//m3(); for문과 while문 활용
		m4();
		//m5(); do while문
		
		
	}

	private static void m5() {
		
		/*
		 
		 
		 K&R 스타일
		 while (조건){
		 	문장;
		 }
		 
		 ALLman 스타일 - 가독성이 높다, 길이가 길어진다..
		  
		  -do while문 (선 실행, 후 조건)
		  do {
		 	문장;
		 }while (조건);
		 
		 */
		
		//1~10출력 do while로
		
		int num =11;
		
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		System.out.println();

		// ----> do while 문으로
		num =11;
		do {
			System.out.println(num);
			num++;
			
		}while(num<=10);
		
	}

	private static void m4() {
		
		//자판기
		//- (메뉴출력 > 음료선택 > 가격출력) x 루프
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true; //무한루프를 break로만이 아닌 밑에다가 loop = false를 쓰면 break같은 역할을 한다. 활용도가 훨씬 높아진다
		
		String sel = ""; //소멸 > 생성은 메모리가 아까우니 여기다가 선언하고 값만 바뀌게 만들면 메모리가 편해진다.
		
		int price = 0; //소멸 > 생성 아까우니 똑같이 여기다가 선언한다.
		
				while(loop) {
			
			System.out.println("==================");
			System.out.println("자판기");
			System.out.println("==================");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 박카스");
			System.out.println("4. 종료");
			System.out.println("----------");
			
			System.out.println("선택 : ");
			
			sel = scan.nextLine();
			
			if(sel.equals("1")) {
				price = 700;
				
			}else if(sel.equals("2")) {
				price = 600;
				
			}else if(sel.equals("3")) {
				price = 500;
				
			}else{
				break; //프로그램 종료? > 무한루프 탈출
				
			}
			
			System.out.println(price+"원");
			
			System.out.println();
			System.out.println("계속하시려면 엔터를 입력하세요");//일시정지 안내멘트
			scan.nextLine();// 일시정지의 역할이다.
			
		}//while
		System.out.println("프로그램 종료");
		
	}//main

	private static void m3() {
		
		//1~10 누적
		
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			sum+=1;
		}
		System.out.println(sum);//for문
		
		//-----while문
		
		sum=0;
		
		int num = 1;
		while (num<=10) {
			sum+=num;
			num++;
		}
		System.out.println(sum);
		
	}

	private static void m2() {
		
		
		/*
		 
		 반복문
		 1. for
		 2. while (if문을 계속 반복한다고 생각하면됨)
		 3. do while
		 4. for
		 
		 ex)
		 while(조건식) {
		 
		 }
		 
		 */
		
		//예제) 요구사항] 1~10 출력
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}//for문을 쓴거 (틀에 박혀있다)
		System.out.println();
		
		
		//while문
		int num = 1; //초기식
		
		while(num<=10) {//조건식
			System.out.println(num);
			num++;//증감식
			
		}//while문을 쓴거 (자유도가 높다)
		
		//for문과 while문은 완전 똑같으니 골라서 쓰면된다.
		
	
		
	}

	private static void m1() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scan.nextLine();
		
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		//scan.skip("\r\n"); // 인티제(숫자열)은 엔터를 남겨놔서 블라블라 ~~~ 기억나지 ???? 그 해결법 첫번째!
		scan.nextLine(); // 두번째 방법 !
		
		System.out.println("주소 : ");
		String address = scan.nextLine();
		
	
		
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		
	}

}
