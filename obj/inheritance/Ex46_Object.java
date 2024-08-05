package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex46_Object {
	
	public static void main(String[] args) {
		
		//Ex46_Object.java
		
		/*
		 
		 
		 Object 클래스
		 	- 모든 클래스의 부모 클래스이다.
		 	- 업캐스팅과 다운캐스팅을 가장 많이 사용하는 클래스다.
		 	
		 
		 
		 */
		
		
		AAA a1 = new AAA();
		AAA a2 = new BBB(); // 부모 = 자식 업캐스팅
		AAA a3 = new CCC(); // 할아버지 = 손자 객체 업캐스팅(직계니까 가능)
		
		//Object 참조 변수는 만능 타입이다 > ***** 모든 것을 저장할 수 있다ㅏㅏㅏ *****
		Object o1 = new Object();
		Object o2 = new AAA(); //Object는 모든 클래스의 부모이기 때문에 가능
		Object o3 = new BBB();
		Object o4 = new CCC();
		
		Object o5 = new Scanner(System.in);
		Object o6 = new Test();
		
		Object o7 = new int[3];
		Object o8 = "홍길동";
		
		//이건 이상함 > int(값형), boolean > 클래스 ?? > X
		// 클래스는 참조형 변수만 넣어야함
		Object o9 = 100; // ->Object o9 = new Integer(100);으로 알아서 바꿈 -> '박싱(Boxing)' 이라고 한다.
		System.out.println((int)o9 + 100); //->박싱을 꺼내오는 법(!!!언박싱!!!)(형변환) 이렇게 하면 +(연산)를 할 수 있다
		System.out.println((Integer)o9 + 100); //위에랑 같은 말이다 (언박싱)
		
		Object o10 = true;
		System.out.println((Boolean)o10 ? "0" : "X"); //->언박싱
		
		// 값형의 데이터를 Object 변수에 넣을 때 자동으로 '박싱' 발생
		
		//오브젝트 변수에 값형을 넣는 법.
		// 그치만 오브젝트에 값형을 넣으면 성능이 안좋아진다.
		
		
		
		Object[] list = new Object[5]; // -> 모든 자료형의 데이터를 저장할 수 있다.
		//첫번째방에 넣은 값을 다음 방에도 똑같이 넣어야한다(규칙을 만들어줘야한다)
		// 약이자 독이 된다..
		
		list[0] = 100;
		list[1] = "홍길동";
		list[2] = true;
		list[3] = new AAA();
		list[4] = new Scanner(System.in); //-> 뭐가 뭔지 찾을 수가 어렵다.
		
		
		
		
		
		
	}//main

}//class

class AAA{ //AAA의 부모는 Object
	
	public int a;
	
}



class BBB extends AAA{
	public int b;
	
}

class CCC extends AAA{
	public int c;
	
}