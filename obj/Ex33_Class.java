package com.test.java.obj;

public class Ex33_Class {

	
		public static void main(String[] args) {
			
			
			//Ex33_Class.java
			
			String[] nick = {"코딩초보", "에러마왕", "오타쟁이"};
			
			User u1 = new User();
			
			u1.setName("홍길동");
			u1.setId("hong");
			
//			u1.setNick("코딩초보");
//			u1.setNick("에러마왕");
//			u1.setNick("오타쟁이"); //별명이 여러개일떄 어떻게 넣을래 ?
			
			u1.setNick(nick); //배열을 사용하여 여러개를 넣음
			
			
			//내가 만든 객체(u1)의 상태를 확인하고 싶다. > 개발자 업무
			System.out.println(u1.getName());
			System.out.println(u1.getId());
			System.out.println(u1.getNick());
			
			System.out.println(u1.info()); //디버깅용 (개발자가 그냥 확인하고 싶을때 -> 덤프)
			
			
			System.out.println();
			System.out.println();

			//홍길동 별명 ?
			//System.out.println(u1.getNick());
			
			for(int i=0; i<u1.getNick().length; i++) {
				
				System.out.println("별명: " + u1.getNick()[i]); //사용자한테 보여주는 방법 (배열을 이용한다)
			}
			
			
			
			
			
			Person p1 = new Person();
			
			p1.setName("홍길동");
			p1.setAge(20);
			
			
//			String[]nickList = new String[3];
//			
//			nickList[0] = "강아지";
//			nickList[1] = "고양이";
//			nickList[2] = "병아리"; ->배열을 이렇게 쓰면 사용자가 불편하다
			
//			p1.setNick(nickList); // 
			
			p1.addNick("강아지");
			p1.addNick("고양이");
			p1.addNick("병아리"); // -> 이렇게 쓰면 편하다... 사용자가 편하다 but, 요구사항에 따라 위 아래를 골라하면 된다.
			
			
			System.out.println(p1.info());
			
			System.out.println(p1.getNick(0));
			System.out.println(p1.getNick(1));
			System.out.println(p1.getNick(2));
			
			
		}
			
}
