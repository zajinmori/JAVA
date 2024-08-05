package com.test.java.obj.inheritance;

public class Ex45 {
	
	public static void main(String[] args) {
		
		
		//Ex45.java (추상클래스(Abstract)의 사례)
		
		
		//상황] 프린터 판매 대리점 운영
		//			1. LG100 모델 x 5대	보유
		//			2. HP200 모델 x 3대 보유
		//			3. 하루 1번씩 **제품 점검**
		//추가상황] 
		//	1. 프린터 재고 증가
		//		- LG100 모델 > 500대
		//		- HP200 모델 > 300대
		//	2. 프린터 종류 증가
		//		- Dell300 모델
		//		- BenQ400 모델
		
		
		
		// 결론 
		// - 보통 형제 클래스 > 부모 배열 > 한번에 관리 -> 업캐스팅 **서로 다른 자료형을 하나의 자료형에
		// - 가끔씩 자식 클래스가 구현한 기능을 접근하려면 *다운캐스팅*을 통해 접근하기 **고유의 기능을 사용하고 싶을때
		
		
		
		//m1(); //Case 1. 절때 쓰면 안됨
		
		//m2(); //Case 2.
		m3(); //Case 3. 
		//m2와 m3는 상황별로 써야됨
		
		//m4(); Case 3(배열)의 원리
		
		
	}//main

	private static void m4() {
		
		// - Printer(부모
		// 	- LG100(자식
		// 	- HP200(자식
		
		LG100 p1 = new LG100();
		HP200 p2 = new HP200();
//		Printer p3 = new Printer(); - 추상메서드라 불가능
		Printer p3 = new LG100(); //자식을 부모에 넣는건 가능 (업캐스팅)
		Printer p4 = new HP200(); // 역시나 가능
		
		Printer[] list = new Printer[2]; //부모타입으로 배열을 만들면 자식들 전부를 한번에 생성가능
		list[0] = new LG100(); //p3와 같음
		list[1] = new HP200(); //p4와 같음
		
		// 반드시 형제 클래스여야지만 부모의 배열에 한번에 담길 수 있음
	}
	
	
	
	

	private static void m3() {
		
		//Case 3.
		// - 배열 사용 + 형변환 사용
		
		Printer[] list = new Printer[8];
		
		for(int i=0; i<list.length; i++) {
			
			if(i < 5) { //5 -> LG의 재고
				list[i] = new LG100();
			}else {
				list[i] = new HP200();
			}
			
		}// 재고를 만드는 루프
		
		
		//점검하기
		
		for(int i=0; i<list.length; i++) {
			list[i].print();
//			list[i].check();
			
//			System.out.println(객체 insstance of 클래스);
//			System.out.println(list[i] instanceof LG100); //instanceof -> list[i]가 LG100이 맞냐? ->true, false
//			System.out.println(list[i] instanceof HP200);
			
			//다운캐스팅 !!!
			if(list[i] instanceof LG100) { //instanceof -> 재고의 수가 바뀌어도 유연해진다
				LG100 lg = (LG100)list[i]; //형변환 
				lg.check();//형변환을 해서 이제 자식만 가지고 있던거를 가져올수있음
			}else if(list[i] instanceof HP200) {
				HP200 hp =(HP200)list[i];
				hp.call();
			}
		}// 점검 하는 루프
		
		
		
	}
	
	
	
	
	
	
	

	private static void m2() {
		
		//Case 2.
		// - 배열 사용하기
		
		LG100[] lg = new LG100[5]; //프린터를 담을 껍데기만 생성
		HP200[] hp = new HP200[3];
		Dell300[] dell = new Dell300[5]; //브랜드가 늘어나면 루프문을 또 작성해야하니 효율적 x
		
		//lg[0] = new LG100();
		//lg[1] = new LG100(); 이러지 말고 루프돌리기
		for(int i=0; i<lg.length; i++) {
			lg[i] = new LG100();
		}
		
		for(int i=0; i<hp.length; i++) {
			hp[i] = new HP200();
		}
		
		
		//점검 x 반복
		for(int i=0; i<lg.length; i++) {
			lg[i].print();
			lg[i].check(); // 나만 가지고 있는 기능도 가능
		}
		System.out.println();
		
		for(int i=0; i<hp.length; i++) {
			hp[i].print();
			hp[i].call();
		}
		
		
		
		
		
		
		
	}

	private static void m1() {
		
		//Case 1.
		// - 가장 비효율적인 방법
		// - 프린터 1대 > 비용 동일 발생 > 효율성 x
		// 상황이 변하면
		LG100 lg1 = new LG100();
		LG100 lg2 = new LG100();
		LG100 lg3 = new LG100();
		LG100 lg4 = new LG100();
		LG100 lg5 = new LG100();
		
		
		HP200 hp1 = new HP200();
		HP200 hp2 = new HP200();
		HP200 hp3 = new HP200();
		
		
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
		
	}

}//class

//부모 역할이 가능
// 1. 클래스
// 2. 추상클래스
// 3. 인터페이스


//구현부를 가질 수 있는 부모 (멤버 변수, 바디를 갖는 멤버 메서드)
// 1. 클래스
// 2. 추상클래스

abstract class Printer{
	private String model;
	private int price;
	
	public abstract void print(); //abstract 꼭 붙여줄것
	
}



class LG100 extends Printer{
	//private String model;
	//private int price;
	private String color;
	
	public void print() {
		System.out.println("LG 기술을 사용 > 출력");
	}
	
	
	public void check() {
		System.out.println("자가 점검");
	}
	
}

class HP200 extends Printer{
	//private String model;
	//private int price;
	private String type;
	
	public void print() {
		System.out.println("HP 기술을 사용 > 출력");
	}
	
	
	public void call() {
		System.out.println("상담원 연결");
	}
	
}

class Dell300 extends Printer{
	
	
	public void print() {
		System.out.println("Dell 기술을 사용 > 출력");
	}
	
	
}


























