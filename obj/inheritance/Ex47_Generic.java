package com.test.java.obj.inheritance;

public class Ex47_Generic {
		
		public static void main(String[] args) {
			
			
			//Ex47_Generic.java
			
			/*
			 
			 	제네릭, Generic
			 		- 제네릭 클래스
			 		
			 
			 */
			
			//요구사항] 클래스 설계..
			//			1. 멤버 변수 > int 1개
			//			2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드 선언하기
			
			//추가사항] String을 중심으로 여러가지 행동을 하는 메서드 선언하기
			//추가사항2]boolean을 중심으로 여러가지 행동을 하는 메서드 선언하기
			
			//추가사항2]double을 중심으로 여러가지 행동을 하는 메서드 선언하기
			//추가사항2]char을 중심으로 여러가지 행동을 하는 메서드 선언하기
			//추가사항2]float을 중심으로 여러가지 행동을 하는 메서드 선언하기
			//추가사항2]Student을 중심으로 여러가지 행동을 하는 메서드 선언하기
			//추가사항2]Employee을 중심으로 여러가지 행동을 하는 메서드 선언하기
			// -> 무한대...
			// 해결방법 -> Object클래스를 사용한다 ..! but, 꺼낼때마다 뭘 집어넣었는지 기억하기가 힘들다..
			
			
			WrapperInt n1 = new WrapperInt(10);
			System.out.println(n1);
			System.out.println(n1.getData());
			System.out.println(n1.getData()*2);//요구사항
			System.out.println("======================");
			
			WrapperObject n2 = new WrapperObject(20); //박싱
			System.out.println(n2);
			System.out.println(n2.getData());
			System.out.println((int)n2.getData()*2); //형변환 -> 언박싱 ***
			System.out.println("======================");
			
			Wrapper<Integer> n3 = new Wrapper<Integer>(30);
			System.out.println(n3);
			System.out.println(n3.getData());
			System.out.println(n3.getData()*2); //제네릭은 형변환이 필요없다
			System.out.println();
			
			
			WrapperString s1 = new WrapperString("홍길동");
			System.out.println(s1);
			System.out.println(s1.getData());
			System.out.println(s1.getData().length());//추가사항 1
			System.out.println("======================");
			
			WrapperObject s2 = new WrapperObject("대한민국");
			System.out.println(s2);
			System.out.println(s2.getData());
			System.out.println(((String)s2.getData()).length()); //형변환. 대신 ()를 겟데이터 까지 붙여줘야됨
			System.out.println("======================");
			
			Wrapper<String> s3 = new Wrapper<String>("독도");
			System.out.println(s3);
			System.out.println(s3.getData());
			System.out.println(s3.getData().length());
			System.out.println();
	
			
			WrapperBoolean b1 = new WrapperBoolean(true);
			System.out.println(b1);
			System.out.println(b1.getData());
			System.out.println(b1.getData()?"합격" : "불합격");
			System.out.println("======================");
			
			WrapperObject b2 = new WrapperObject(false);
			System.out.println(b2);
			System.out.println(b2.getData());
			System.out.println((boolean)b2.getData()?"합격":"불합격"); // 형변환
			System.out.println("======================");
			
			Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
			System.out.println(b3);
			System.out.println(b3.getData());
			System.out.println(b3.getData() ? "합격" : "불합격");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//main
	
}//class

class WrapperInt{
	
	private int data; //1번 요구사항
	
	public WrapperInt(int data) {//생성자 생성
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		
		return "[data =" + data + "]";
	}
}
	
	
class WrapperString{
		
		private String data; //1번 요구사항
		
		public WrapperString(String data) {//생성자 생성
			this.data = data;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
		
		
		@Override
		public String toString() {
			
			return "[data =" + data + "]";
		}
	
	
	
	}

class WrapperBoolean{
	
	private boolean data; //1번 요구사항
	
	public WrapperBoolean(boolean data) {//생성자 생성
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		
		return "[data =" + data + "]";
	}



}

class WrapperObject{
	
	private Object data; //1번 요구사항
	
	public WrapperObject(Object data) {//생성자 생성
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		
		return "[data =" + data + "]";
	}



}


//제네릭 클래스

class Wrapper<T>{
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "[data =" + data + "]";
	}
	
}















