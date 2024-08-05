package com.test.java.obj;

public class Ex36_Static {
	
	public static void main(String[] args) {
		
		
		//Ex36_Static.java
		
		//요구사항] 
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		
		
		
		//Case 1.
		// - 간편하다.
		// - pen과 count간의 관계 애매.. 
		// - count++ 오류 (추가하거나 누락하거나)
		// 결론 : 좋은 방법이 아니다.
		
		/*
		 * int count = 0;
		 * 
		 * Pen p1 = new Pen("MonAmi", "Black"); 
		 * count++;
		 * 
		 * Pen p2 = new Pen("MonAmi", "Black"); 
		 * count++;
		 * 
		 * Pen p3 = new Pen("MonAmi", "Black");
		 * count++;
		 * 
		 * System.out.println("펜의 개수 : " + 
		 * count);
		 */
		
		
		
		
		//Case 2.
		// - pen과 count간의 관계가 강해짐
		// - count 변수를 객체마다 가지고 있음(문제점..)
		//		a. 누적 변수를 여러개 ?? (물리적이유)
		//		b. 왜 누적 변수를 p1꺼를 사용해?? 
		//    		-> 왜 누적 변수를 개인이 가지고 있냐고(모임통장에 넣어야지 왜 개인꺼에다 회비를 넣냐 라는상황)
		//    	 	->공용 누적값을 왜 객체 변수(개인값을 저장하는 공간)에 넣었냐
		/*
		 * Pen p1 = new Pen("MonAmi", "Black");
		 *  p1.count++; //누적변수로 선언해놔서 소속감이 확실..
		 * 
		 * Pen p2 = new Pen("MonAmi", "Black"); 
		 * p1.count++;
		 * 
		 * Pen p3 = new Pen("MonAmi", "Black"); p1.count++;
		 * 
		 * System.out.println("펜의 개수 : " + p1.count); System.out.println("펜의 개수 : " +
		 * p2.count); System.out.println("펜의 개수 : " + p3.count);
		 */
		
		
		
		
		
		//Case 3.
		// - Pen클래스와 count간의 관계 강화
		// - 개인 데이터와 공용 데이터 구분 확실
		// - count++ 오류 (추가하거나 누락하거나)
		
		/*
		 * Pen p1 = new Pen("MonAmi", "Black");
		 *  Pen.count++;
		 * 
		 * Pen p2 = new Pen("MonAmi", "Black");
		 *  Pen.count++;
		 * 
		 * Pen p3 = new Pen("MonAmi", "Black");
		 *  Pen.count++;
		 * 
		 * System.out.println("펜의 개수 : " + Pen.count);
		 */
		
		
		
		
		
		
		//Case 4.
		// - GOAT..
		
		Pen p1 = new Pen("MonAmi", "Black");
		Pen p2 = new Pen("MonAmi", "Black");
		Pen p3 = new Pen("MonAmi", "Black");
		
		System.out.println("펜의 개수 : " + Pen.count);
		
	m1();	
		
	}//main

	private static void m1() {
		
		Pen p = new Pen("젤리펜","노란색"); // 객체 변수 생성
		
		
		
	}//제어 종료 ( 객체변수(p) 가 소멸) -> Pen의 참조가 끊긴다 -> Pen의 값은 가비지가 된다
	
	
	
	

}//class


//Case 4.
class Pen{
	
	
	//멤버 변수의 생명주기
	// 1. 객체 변수
	//	- new 를 할때 생성 ~ 객체가 소멸할때 소멸
	
	// 2. 정적 변수(static)
	//	- 클래스로딩(프로그램 실행 전) 할때 생성 ~ 프로그램 종료(main끝나고) 할때 소멸
	//	- 제일 먼저 태어나서 제일 늦게 죽는다 -> 데이터 많이 차지함 -> 신중하게 써야함
	
	
	
	
	
	private String model;
	private String color;
	public static int count = 0;
	
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		
		Pen.count++; //여기다가 count를 생성
		
	}





	/* Case 3.
	 * 
	 * class Pen{
	 * 
	 * private String model;
	 *  private String color;
	 *   public static int count = 0; //누적변수 (개인X > 모두O)
	 * 
	 * 
	 * public Pen(String model, String color) { this.model = model; this.color =
	 * color; }
	 */






	/*Case 2.
	 * class Pen{
	 * 
	 * private String model;
	 *  private String color;
	 *   public int count = 0; //누적 변수생성(게터세터를 안만들기(귀찮으니까) 위해서 public으로 생성)
	 * 
	 * 
	 * public Pen(String model, String color) { this.model = model; this.color =
	 * color; }
	 */






	/* Case 1
	 * 
	 * class Pen{
	 * 
	 * private String model; private String color;
	 * 
	 * 
	 * public Pen(String model, String color) { this.model = model; this.color =
	 * color; }
	 */
	
	
	public String info() {
		return String.format("model : %s, color : %s", this.model, this.color);
		
	}
	
	
}




























