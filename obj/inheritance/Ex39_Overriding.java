package com.test.java.obj.inheritance;

public class Ex39_Overriding {
	
	public static void main(String[] args) {
		
		
		//Ex39_Overriding
		
		/*
		 
		 
		 메서드 오버로딩, Method Overloading
		  - 똑같이 생긴 이름의 메서드를 여러개 만들기(인자값을 다르게 해서)
		 		
		 				!=
		 
		 메서드 오버라이딩, Method Overriding
		 - 메서드 재정의(메서드 다시만들기) > 상속받은 메서드를 수정하는 기술.
		 - 클래스 상속에서만 발생
		 
		 
		
		 
		 */
		
		OverridingParent hong = new OverridingParent();
		hong.name = "홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name = "홍철수";
		jhong.hello(); //메서드 오버라이딩
		//jhong.hi();
		
		
		
		
		
	}//main

}//class

//업무 > 동네사람
class OverridingParent{
	
	public String name;
	public void hello() {
		
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", name);
		
	}
	
	
}//OverridingParent


class OverridingChild extends OverridingParent{
	
	//일종의 덮어쓰기 > 메서드 오버라이딩
	public void hello() {// 메서드명이 같아도 상속 받았으면 자기껄로 내용을 바꿀수가있다.(메서드 오버라이딩)
		
		System.out.printf("하이 ~ 난 %s야", this.name);
		
	}
	
//	public void hi() {
//		System.out.printf("하이 ~ 난 %s야", this.name);
//	} 사용자에게 혼돈을 주는 방법 ...
//	
	
}





































