package com.test.java;

public class Ex18_method {

	
	public static void main(String[] args) {
		
		//Ex18_method
		
		//재귀 메서드, Recursive Method
		//- 재귀 구조를 가지는 메서드
		//- 메서드 구현부에서 자기 자신을 호출하는 메서드
		//- 특정 행동을 반복해야 하는 경우에 만든다.(몇번 반복할지 모르는 경우)***
		
		
		//m1();
		//m2();
		//m3();
		
		//팩토리얼 (재귀 구조를 설명하는 예)
		//4! = 4 x 3 x 2 x 1
		
		//예제)요구사항] 팩토리얼 메서드를 구현하시오
		
		factorial();
		
		
		//m4(); (리팩토링 우클릭 + 리팩터 + 엑스트랙터 메서드)
		
		//test();
		
	}//main





	public static void factorial() {
		int n = 4;
		//ex) TODO 김대리님한테 확인할 것 !! ->TODO를 붙이면 윈도우즈 > 쇼 뷰 > 태스크 누르면 TODO리스트를 볼 수 있다 (나중에 까먹을까봐 설정해놓는것)
		int result = factorial(n); //Ctrl + 1 손쉽게 메소드 만들기
		
		
		System.out.printf("%d = %d\n", n, result);
	}





	//public static void m4() {
		//int a = 10;
		//System.out.println(a); <- 리팩토링
	
	


	

	private static int factorial(int n) {
		
		return (n==1) ? 1 : n * factorial(n - 1); //재귀구조의 예.. 굉장히 머리아프다(하지만 결론은 팩토리얼했다)
	}





	public static void m1() {
		
		System.out.println("첫번째 메서드");
		//m2(); (main메서드가 아니어도 호출가능)
		
	}
	
	public static void m2() {
		
		System.out.println("두번째 메서드");
		
	}
	
	//재귀 메서드
	public static void m3() {
		
		System.out.println("세번째 메서드");
		m3(); //StackOverflowError 메모리과부화를 방지 (재귀 호출이라고 한다.
		
	}
}
