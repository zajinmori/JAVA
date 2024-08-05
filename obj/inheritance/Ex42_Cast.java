package com.test.java.obj.inheritance;

public class Ex42_Cast {

	
		public static void main(String[] args) {
			
			
			//Ex42_Cast.java
			
			/*
			 
			 형변환, Type Casting
			 
			 1. 값형 형변환
			 	- 값형끼리 형변환
			 	- byte, short, int, long, float, double, char
			 	
			 2. 참조형 형변환
			 	- 클래스끼리 형변환
			 	- 상속 관계에 있는 클래스끼리만 형변환이 가능하다.
			 		-> 직계끼리만 가능하다.
			 		-> 방계는 불가능.
			 	
			 	
			 	참조형 형변환 2가지 타입
			 	
			 	1. 업캐스팅, Up Casting
			 		- 암시적인 형변환
			 		- '자식' 클래스를 '부모' 클래스로 형변환
			 		- 100% 가능
			 	
			 	2. 다운캐스팅, Down Casting
			 		- 명시적인 형변환
			 		- '부모' 클래스를 '자식' 클래스로 형변환
			 		- 100% 불!!가능
		
			 */
		
			
			CastParent p1;
			CastChild c1;
			c1 = new CastChild(); // 자식 객체 > 원본역할
			
			//복사
			//자료형이 같다.. 왜 되는거냐??
			//-> 암시적형변환 -> 100%안전하다.
			//-> 부모클래스 = 자식클래스
			//업캐스팅
			p1 = c1; //(CastParent)c1->오른쪽이 왼쪽으로 형변환 
			
			//복사가 잘 된건지 어쩐지 검증은 ??
			// - 값형 형변환 > 검증 ? > 복사본 출력 > 원본과 동일한지?
			// - 참조형 형변환 > 검증 ? > 
			
			
			p1.a =10;
			p1.b =20;
			
			System.out.println(p1.a);
			System.out.println(p1.b);
			
			
			CastParent p2;
			CastChild c2;
			
			p2 = new CastParent(); //부모 객체 > 원본역할
			
			//복사
			//자식 = 부모
			//다운캐스팅
			//반드시 명시적 형변환
			//!!! 다운캐스팅은 100% 불가능 !!!
			//c2 = (CastChild)p2;
			
			//검증 ??
//			c2.a = 10;
//			c2.b = 20;
//			c2.c = 30;
//			c2.d = 40;
			
			
			
		}//main
	
	
}//class


class CastParent{
	
	public int a;
	public int b;
	
	
}//CastParent


class CastChild extends CastParent{
	
	public int c;
	public int d;
	
	
}


















































