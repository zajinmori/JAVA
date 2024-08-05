package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ex63_Lambda {
	
	public static void main(String[] args) {
		
		//Ex63_Lambda
		/*
		 
		 람다식, Lambda Expression
		 	-함수형 프로그래밍 기법 중 하나
		 	-익명 함수를 간단하게 표현하는 방법
		 	
		 	
		 람다식 형식
		 	- 인터페이스 변수 = 람다식;
		 
		 
		 */
		
		//요구사항] MyInterface를 구현한 객체를 생성하시오.
		
		//Case 1. 클래스 선언 + 객체 생성
		MyInterface m1 = new MyClass();
		m1.test();
		
		//Case 2. 익명 객체 생성
		MyInterface m2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 메서드");
			}
		};
		m2.test();
		
		//Case 3. 람다식 > 익명 클래스의 추상 메서드를 간단한 표현으로 구현하는 기술
		MyInterface m3 = () -> {
			System.out.println("람다식에서 구현한 메서드");
		};
		m3.test();
		
		
		
		TestInterface t1 = new TestInterface() {
			
			@Override
			public void bbb() {
			
			}
			
			@Override
			public void aaa() {
					
			}
		};
		t1.aaa();
		t1.bbb();
		
//		TestInterface t2 = () -> {
//			람다식은 추상 메서드를 단 1개만 가지고 있어야한다 ..
//		};
		
		
		
		
		
		//메서드의 형식
		// 1. 매개 변수 유/무
		// 2. 반환값 유/무
		
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
				
			}
		};
		pr1.call();
		
		//-> 람다식
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//***구현부 문장이 1개면 {}생략 가능하다
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		
		
		
		
		//void call(int n);
		ParameterNoReturn pr4 = (int n) -> {
			System.out.println("pr4: " + n);
		};
		pr4.call(10);
		pr4.call(20);
		
		//람다식의 매개변수 자료형은 생략가능
		ParameterNoReturn pr5 = (n) -> {
			System.out.println("pr5: " + n);
		};
		pr5.call(10);
		pr5.call(20);
		
		//*** 람다식의 매개변수 ()를 생략 할 수 있다.
		ParameterNoReturn pr6 = n -> {
			System.out.println("pr6 :" + n);
		};
		pr6.call(10);
		pr6.call(20);
		
		//가장 간단한 방법
		ParameterNoReturn pr7 = n -> System.out.println("pr7 :" + n);
		pr7.call(10);
		pr7.call(20);
		
		
		
		
		
		
		MultiParameterNoReturn pr8 = (String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr8.call("홍길동", 28);
		
		
		MultiParameterNoReturn pr9 = (name, age) -> {
			System.out.println(name + "," + age);
		};
		pr9.call("아무개", 29);
		
		
		
		
		
		
		NoParameterReturn pr11 = () -> {
			return 10;
		};
		System.out.println(pr11.call());
		
		NoParameterReturn pr12 = () -> 20;
		System.out.println(pr12.call());
		
		
		
		
		ParameterReturn pr13 = (int a, int b) -> {
			return a+b;
		};
		System.out.println(pr13.call(5, 8));
		
		
		ParameterReturn pr14 = (a,b) -> a+b;
		System.out.println(pr14.call(9, 9));
		
		
		
		
		
		//배열, 컬렉션 > sort()
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i=0; i<10; i++) {
			nums.add(rnd.nextInt(100));
		}
		System.out.println(nums);
		
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
		});
		
		//->람다식
		nums.sort((o1,o2)->o2-o1);
		
		System.out.println(nums);
		
		
		
	}//main

}//class

@FunctionalInterface // 람다식을 위한 인터페이스 -> 다른 사람들 보라고 이렇게 표시를 해줌
interface MyInterface{
	void test();
}


class MyClass implements MyInterface{
	
	@Override
	public void test() {
		System.out.println("MyClass 클래스에서 구현한 메서드");
		
	}
}


interface TestInterface{
	void aaa();
	void bbb();
}


interface NoParameterNoReturn {
	void call();
}


interface ParameterNoReturn{
	void call(int n);
}


interface MultiParameterNoReturn{
	void call(String name, int age);
}


interface NoParameterReturn{
	int call();
}


interface ParameterReturn{
	int call(int a, int b);
}






















