package com.test.java.obj.inheritance;

public class Ex44_Interface {
	
			public static void main(String[] args) {
				
				
			//Ex44_Interface
				/*
				 
				 
				 인터페이스, Interface
				 	- 클래스의 일종(자료형이다)
				 	
				 
				 
				 
				 
				 */
				
				//Keyboard k1 = new Keyboard(); -> 인스턴스 생성 불가
				
//				
//				A100 a = new A100();
//				a.open();
//				a.set("핸드폰");
//				a.close();
//				a.clean();
//				
//				B200 b = new B200();
//				b.open();
//				b.set("지갑");
//				b.close();
//				b.check();
				
				
				//인터페이스는 객체를 생성할 수 없다
				// - 인터페이스는 변수는 만들 수 있다
				
				//Bag bag = new Bag(); 불가능
			
				
//				Bag a;	//인터페이스 참조변수
//				A100 b; //클래스 참조변수 ->가능
//				
//				b = new A100();
//				
//				//Bag = A100
//				//부모 = 자식
//				//업캐스팅(100%가능)
//				a=b;
				
				Bag a = new A100();
				//-> 자식타입의 변수를 부모타입 변수에 넣을 수 있다
				
				a.open();
				a.set("핸드폰");
				a.close();
//				a.clean();
				
				
				Bag b = new B200();
				
				b.open();
				b.set("지갑");
				b.close();
//				b.check();
				
//				추상화를 한것. ->각각의 클래스가 변화해도 유연한 대처가 가능하다.
				
			}//main
			

}//class


//Interface 예제) 가방클래스 2종류
//	- 가방으로써 가져야할 행동 규칙
//		- 추상 클래스 생성 or 인터페이스 클래스 생성 (인터페이스 생성을 더 많이한다)


interface Bag{
	void open();
	void close();
	String get(String item);
	void set(String inem);
}


class A100 implements Bag{
	public String color;
	public int price;
	
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String get(String item) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void set(String inem) {
		// TODO Auto-generated method stub
		
	}
	
	public void clean() {
		//나(A100)만의 기능(세척기능)
		
		
	}

}


class B200 implements Bag{
	public int price;
	public String size;
	
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String get(String item) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void set(String inem) {
		// TODO Auto-generated method stub
		
	}
	
	public void check() {
		//나(B200)만의 기능(점검기능)
		
		
	}
	
}


















//인터페이스 선언하기
interface Keyboard{
	
	//인터페이스 멤버 선언하기
	// - 메서드만 선언가능 (변수는 불가능)
	// - 구현메서드 -> 바디를 가지는 메서드는 생성 불가능 -> 추상메서드만 선언가능
	
	// *** 인터페이스는 추상메서드(Abstract)의 집합이다 ***
	// *** 인터페이스는 구현멤버(변수,구현부)를 가질 수 없다 ***
	// *** 반드시 public으로 만들어야한다. 즉, public을 생략한다 ***
	
	
	//public int a; ->멤버 변수 불가능
	//public void int aaa() {} -> 구현부 불가능
	
	//public void test(); // ->추상메서드만 가능


	//	***** 키보드가 가져야할 행동 규범 > 추상메서드 *****

	
	 void on();
	 void off();
	 void keydown();
	 void keyup();
	//인터페이스 추상메서드는 public을 생략 ~

}

//내가 만든 F87 클래스는 Keyboard인터페이스를 구현했습니다. 구현했다는 표현을 쓴다. 
class F87 implements Keyboard { // implements -> 인터페이스 클래스에 상속할때만(extends를 대신 하는 역할)
	

	@Override
	public void on() {
		System.out.println("전원 ON");
		
	}

	@Override
	public void off() {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void keydown() {
		System.out.println("키다운");
		
	}

	@Override
	public void keyup() {
		System.out.println("키업");
		
	}
	
	
	
}






























