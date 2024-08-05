package com.test.java.obj;

public class Ex35_Static {
	
	
	//1. 여러가지 선행작업 > 클래스 로딩(클래스 인식)
	//2. main>코드 실행
	public static void main(String[] args) {
		
		
		//Ex35_Static.java
		
		/*
		 
		 
		 static(정적) 키워드
		 	- 지시자 중 하나
		 	- 클래스 or 클래스 멤버에 붙이는 키워드
		 	
		 	
		 		 
		 
		 */
		
		//상황] 학생 3명 정보 관리
		//- "역삼 중학교"
		
		Student.setSchool("역삼중학교"); // 정적(static)메서드 접근.
		//static의 사용.
		//클래스(Student)로 접근했으니 여기다 선언한번해주면 다른 객체에도 값을 똑같이 만들어줌 
		//유지보수할때도 여기만 바꾸면 되니까 너무너무 편안..
		
		Student s1 = new Student();
		
		s1.setName("홍길동");
		s1.setAge(15);
		//s1.setSchool("역삼중학교");
		
		
		
		Student s2 = new Student();
		
		s2.setName("강아지");
		s2.setAge(14);
		//s2.setSchool("역삼중학교");
		
		
		
		Student s3 = new Student();
		
		s3.setName("고양이");
		s3.setAge(16);
		//s3.setSchool("역삼중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		
	}//main

}//class


class Student {
	
	private String name;
	private int age;
	
	//private String school; // 학교를 세번써야되는 노가다의 원인
	
	private static String school;
	

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school; //static은 this.을 못쓴다 왜냐면 스태틱(정적멤버)은 객체멤버가 아니기 때문
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

//	public String getSchool() {
//		return school;
//	}
//
//	public void setSchool(String school) {
//		this.school = school;
//	}
	
	public String info() {
		
		return String.format("%s(%d세, %s)", this.name, this.age, Student.school);
		
	}
	
	
	
	
}






