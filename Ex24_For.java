package com.test.java;

public class Ex24_For {
	
	public static void main(String[] args) {
		
		//Ex24_For.java
		/*
		 
			중첩된 반복문
			- 단일 for문
			- 2중 for문
			- 3중 for문
			
			for(){
			  단일 for문
			}
			
			for(){
				for(){
					for(){
					**2중, 3중 이렇게 안에다가 하나씩 넣으면 된다.
					
					}
				}
			}
		 
		 
		 */
		
		
		//m1(); 다중for문 이해하기
		//m2(); 다중for문으로 구구단만들기
		//m3();	다중for문에 if문을 넣기, break나 continue사용해보기
		m4();
		
		
		
	}//main

	private static void m4() {
		
		//별찍기(제어문(루프이해하기) 연습)
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}// 기본형
		System.out.println();
		
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}// 별찍기 응용
		System.out.println();
		
		
		
		
		
		
		
		
	}//m4

	private static void m3() {
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				if(i ==5 ) {
					continue; // break랑 똑같이 돌린다. 근데 i를 j로 바꾸면 달라진다
					//break; //j for문을 나가기 때문에 i5만 빼고 나머지를 돌린다/ i를 j로바꾸면j를 4까지만 돌린다.
					
				}
				
				
				System.out.printf("i: %d, j: %d\n",i,j);
			}
			
		}
		
		
		
		
		
	}//m3

	private static void m2() {
		
		// 구구단 만들어보기
		// 2단 ~ 9단
		
		for(int dan=2;dan<=9;dan++) {
		
		//int dan = 2; //2단 전용
		System.out.println("============");
		System.out.printf("	%d단\n",dan) ;
		System.out.println("============");
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d =%2d\n", dan, i, dan*i);
			} // 2단 하나만 만든것.
		
		}//구구단 만들어버리기 ~
		
	
		
	}//m2

	private static void m1() {
		
		//단일 for문
		for(int i=0; i < 10; i++) {
			System.out.println("i:"+i);
		}
		System.out.println();
		
		
		//2중 for문 > 루프 변수 2개
		for(int i=0; i<10; i++) { //대회전
			
			for(int j=0; j<10; j++) {//소회전
				
				//System.out.println("안녕하세요"); // 몇번 실행 ?? -> 10(바깥회전수) x 10(바깥회전수) = 100번
				System.out.printf("i :%d, j: %d\n", i, j); //i는 0인채로 j가 10바퀴돌고 i로 올라가고 그렇게 루프만큼 반복
				}//j for문
			
			}//2중for문
			System.out.println();
		
			
		//3중 for문 (보통 3중까지를 많이 쓴다)
			for(int i=0; i<10; i++) {//대회전
				for(int j=0; j<10; j++) {//중회전
					for(int k=0; k<10;k++) {//소회전
						System.out.printf("i:%d, j:%d, k:%d\n",i,j,k); // 2중for문이라 똑같은 원리다.
						
					}
				}
			}
			
			//3중for문을 활용해서 시계처럼 표현하기
			for(int i=0; i<24; i++) {//대회전
				for(int j=0; j<60; j++) {//중회전
					for(int k=0; k<60;k++) {//소회전
						System.out.printf("%d시 %d분 %d초\n",i,j,k);
					}
				}
			}
			
//			//학교
//			for(학년) {
//				for(반) {
//					for(번호) {
//						
//					}
//				}
//			}
			
			
//			//아파트 4중for문이 되 ~ 복잡해서 머리가 깨져 ~ 그니까 3중까지만 해버려 ~
//			for(단지) {
//				for(동) {
//					for(층) {
//						for(호수) {
//							
//						}
//					}
//				}
//			}
			
			
		
		}
}


