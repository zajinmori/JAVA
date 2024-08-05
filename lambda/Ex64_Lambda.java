package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import javax.print.DocFlavor.STRING;

public class Ex64_Lambda {
	
	public static void main(String[] args) {
		
		
		
		//Ex64_Lambda.java
		/*
		 
		 
		 람다식 > 익명 객체의 추상 메서드 > 인터페이스 참조 변수에 저장
		 - 람다식을 사용하려면 결국 인터페이스가 필요하다 !!
		 
		 함수형 인터페이스(Functional Interface)
		 - 평범한 인터페이스
		 - 추상 메서드 1개만 소유
		 - 목적 > 람다식을 저장하기 위한 인터페이스
		 
		 	1. 표준 API 함수형 인터페이스 > JDK 제공
		 	2. 사용자 정의 함수형 인터페이스 > 개발자가 직접 선언(Ex63)
		 
		 
		 표준 API 함수형 인터페이스의 종류
		 1. Consumer
		 	- Consumer<T>
		 	- BiConsumer<T,U>
		 	- ...
		 - 매개변수O, 반환값X > 추상 메서드를 제공
		 	
		 2. Supplier
		 	- Supplier<T>
		 	- ...
		 - 매개변수X, 반환값O > 추상 메서드를 제공
		 	
		 3.Function
		 	- Function<T>
		 	- BiFunction<T,U,R>
		 	- ...
		 - 매개변수O, 반환값O > 추상 메서드를 제공
		 	
		 4. Operator
		 -Function의 하위 셋
		 	- UnaryOperator<T>
		 	- BinaryOperator<T>
		 	- ...
		 - 매개변수O, 반환값O > 추상 메서드를 제공
		 	
		 5. Predicate
		 -Function의 하위 셋
		 	- Predicate<T>
		 	- BiPredicate<T>
		 	- ...
		 - 매개변수O, 반환값O > 추상 메서드를 제공	
		 
		 
		 */
		
		//m1(); //Consumer
		//m2(); //Supplier
		//m3(); //Function
		//m4(); //Operator
		m5();
		
		
		
		/*
		 
		 람다식 + 함수형 인터페이스
		 
		 람다식
		 - 익명 객체의 익명 메서드(추상 메서드 구현)를 간단한 표기법으로 선언하는 표현식
		 - 고정으로 반복되는 구문을 제거
		 - 매개변수 or 구현부를 최소화 표현
		 
		 함수형 인터페이스
		 - 익명 객체를 저장하는 인터페이스 -> 람다식을 저장하는 인터페이스
		 - 추상 메서드를 1개만 가지는 익명 객체를 저장하는 인터페이스
		 
		 표준 API 함수형 인터페이스
		 - 자바에서 제공하는 람다식을 저장하기 위한 인터페이스 
		 - 여러가지 형태의 추상 메서드를 선언한 인터페이스들 ..
		 - 람다식을 사용하기 위해 추가로 인터페이스를 선언하지 않아도 되게 비용을 절감
		 
		 
		 1. Consumer
		 	- 반환값 X , 매개변수 O > 추상메서드
		 	- void Consumer<T>.accept(인자);
		 	
		 2. Supplier
		 	- 반환값 O, 매개변수 X > 추상메서드
		 	- 반환값 Supplier.get();
		 	
		 3. Function
		 	- 반환값 O, 매개변수 O > 추상메서드
		 
		 4. Operator
		 	- 반환값 O, 매개변수 O > 추상메서드
		 	- Function의 하위셋
		 
		 5. Predicate (true, false 전용)
		 	- 반환값 O, 매개변수 O > 추상메서드
		 	- Function의 하위셋
		 
		 
		 */
		
		
	}

	private static void m5() {
		
		//Predicate
		//- 매개변수를 전달하면 처리 후 반환값을 돌려주는 업무를 구현하는 인터페이스
		//- test???() 추상 메서드 제공
		//- 반드시 반환값이 Boolean이다
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(5)); //
		//두개는 같다 Predicate는 Boolean의 값 전용이다 Predicate 
		Predicate<Integer> p1 = num -> num > 0;
		System.out.println(p1.test(5)); //
		
		Predicate<Integer> p2 = age -> age >=18;
		System.out.println(p2.test(20)); // 성인분류 true
		
		
		BiPredicate<String, String> p3 = (s1, s2) -> s1.length() > s2.length();
		System.out.println(p3.test("홍길동", "홍길동님"));
		
	}

	private static void m4() {
		
		//Operator
		//- 매개변수를 전달하면 처리 후 반환값을 돌려주는 업무를 구현하는 인터페이스
		//- apply???() 추상 메서드 제공
		//- 추상 메서드의 매개변수와 반환값의 자료형이 동일하다
		
		//Function은 자료형을 내 맘대로 할 수 있다 (자료형이 전부 같을땐 특수한 상황 -> Operator을 쓰면 된다)
		BiFunction<Integer, Integer, Integer> f1 = (a,b) -> a + b;
		// 두개는 같다 Operator는 자료형이 한개로써 숫자를 받으면 숫자로 반환해야한다
		BinaryOperator<Integer> o1 = (a,b) -> a + b;
		
		System.out.println(f1.apply(10, 20));
		System.out.println(o1.apply(10, 20));

		
		UnaryOperator<Integer> o2 = a -> a * a;
		System.out.println(o2.apply(5));// 제곱이다 -> 25
		
		
		
	}

	private static void m3() {
		
		//Function
		//- 매개변수를 전달하면 처리 후 반환값을 돌려주는 업무를 구현하는 인터페이스
		//- apply???() 추상 메서드 제공
		
		//		  Input   Output(리턴값)
		Function<Integer, Boolean> f1 = num -> num > 0;
		
		System.out.println(f1.apply(10)); //10이 양수인지 아닌지를 판단 -> true
		System.out.println(f1.apply(-10)); //음수니까 false
		
		
		Function<String, Integer> f2 = str -> str.length();
		
		System.out.println(f2.apply("홍길동")); // 문자열의 길이반환 -> 3글자
		System.out.println(f2.apply("안녕하세요 반가워요")); // 10글자
		
		
		
		BiFunction<Integer, Integer, String> f3 = (a,b) -> {
			if(a>b) {
				return "크다";
			}else if(a<b) {
				return "작다";
			}else {
				return "같다";
			}
		};
		System.out.println(f3.apply(5, 3)); // 5가 3보다 크니까 -> 크다
		System.out.println(f3.apply(2, 6)); // 2가 6보다 작으니까 -> 작다
		
		
		//인티저를 넣으면 더블로 반환한다
		IntToDoubleFunction f4 = num -> num * 1.0;
		System.out.println(f4.applyAsDouble(9)); // 9에다가 1.0을 곱한것 -> 9.0
		
		
		
		
		
	}

	private static void m2() {
		
		//Supplier
		//- 매개변수없이 반환값을 돌려주는 업무를 구현하는 인터페이스
		//- get???() 추상 메서드 제공
		
		Supplier<Integer> s1 = () -> {return 100;};
		Supplier<Integer> s2 = () -> 100; // 위에거 말고 이렇게 쓴다 !!
		
		System.out.println(s1.get());
		
		Supplier<String> s3 = () -> "홍길동";
		System.out.println(s3.get());
		
		Supplier<Integer> s4 = () -> {
			Calendar now = Calendar.getInstance();
			return now.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s4.get());
		
		
		BooleanSupplier s5 = () -> true;
		System.out.println(s5.getAsBoolean());
		
		
		
		
		
		
		
		
		
	}

	private static void m1() {
		
		//Consumer
		//- 매개변수를 받아서 소비하는 업무를 구현하는 인터페이스
		// - accept???() 추상메서드 제공
		
		
		
		MyConsumer m1 = num -> System.out.println(num);
		m1.test(100);
		
		
		//인터페이스없이 Consumer를 사용했다 
		Consumer<Integer> c1 = num -> System.out.println(num);
		c1.accept(200);
		
		Consumer<Integer> c2 = num -> System.out.println(num*num);
		c2.accept(5);
		
		Consumer<String> c3 = str -> System.out.println(str.length());
		c3.accept("홍길동입니다");
		
		Consumer<Integer> c4 = count -> {
			for(int i=0; i<count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c4.accept(10);
		
		
		Consumer<Member> c5 = m -> {
			System.out.println(m.getName());
			System.out.println(m.getAge());
		};
		c5.accept(new Member("홍길동", 28));
		
		
		//매개변수가 2개일때는 BiConsumer!!!!
		BiConsumer<String, Integer> bc1 = (name, age)->{
			System.out.println(name + ","+age);
		};
		bc1.accept("아무개", 28);
		
		BiConsumer<Integer, Integer> bc2 = (a,b) -> System.out.println(a+b);
		bc2.accept(88, 76);
		
		
		
		
		//Consumer<Integer> ic1; ->범용
		
		IntConsumer ic1 = num -> System.out.println(num);
		ic1.accept(50); //->인티저 전용
		
		
		
		
		
		
		
	}

	
	

}//class

//람다식을 저장하기 위한 인터페이스
@FunctionalInterface
interface MyConsumer{
	void test(int num);
}


class Member{
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;

	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	}
	
	
	@Override
	public String toString() {
	
		return this.name + ":" + this.age;
	}
	
}





















