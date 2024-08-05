package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex41_Final {

	public static void main(String[] args) {
		
		
		
		//Ex41_Final.java
		
		/*
		 
		 final 키워드
		 - 한번 결정하면 바꿀 수 없다.
		 - 안정성을 높인다.
		 
		 1. 변수 적용(지역 변수, 멤버 변수)
		 	- 초기화를 한 이후에 값을 변경할 수 없다.
		 	- (이름이 있는 ex)b )상수
		 	- 대문자로 적어야한다
		 
		 
		 2. 메서드 적용
		 	- 상속 시 오버라이딩을 못하게 방지
		 	
		 	
		 3. 클래서 적용
		 	- 상속 자체를 못하게 방지
		 
		 
		 */
		
		int a = 10;
		final int b =20;
		
		a = 100;
		//b = 300; final은 상수로 만들어버린다 (변경불가)
		
		
		System.out.println(Calendar.YEAR); // 상수 -> final
		
		
		//성별
		
//		Gender gender = new Gender();
//		System.out.println(gender.male); //1
//		
//		Gender gender2 = new Gender();
		
//		System.out.println(Gender.female);
//		
//		Gender.male = 3;
//		
//		System.out.println(Gender.male);
		
		
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		
	}//main
	
	
}//class


class Gender{
	
	public static final int MALE = 1; 
	public static final int FEMALE = 2; //final을 붙여서 절때 값을 못바꾼다
	
}//Gender

final class FinalParent { // final -> 상속을 못하게 만듬(프로그램 안정성 높이기 위해서 많이 씀)
	
	final public boolean check() {// final -> 오버라이딩(재정의) 금지
		
		return true;
	}
	
	
}

//class FinalChild extends FinalParent{ // 위에 final 때문에 상속불가
	
	//@Override
	//public boolean check() {
		
		//return false;
	//}
	
	
	

