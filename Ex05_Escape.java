package com.test.java;

public class Ex05_Escape {
	
	public static void main(String[] args) {
		
		
		
		
		//Ex05_Escape.java
		
		//특수 문자 -> Escape Sequence
			//- 컴파일러가 번역할 때 > 소스상의 문자를 그대로 화면 출력하지 않고 미리 약속된 표현으로 바꿔서 출력하는 요소
		// ex) \n, \r, \t, \', \", \b, \\
		
		//1. \n
			// - new line, line feed
			// - 개행문자(엔터)
			// 요구사항
				//ex) " 안녕하세요. 홍길동님." 출력해주세요. / 2번 출력해주세요.
					//상수를 바로 사용한 예 ( 이러면 안됨 ! )
					System.out.println("안녕하세요. 홍길동님.");
					System.out.println("안녕하세요. 홍길동님.");
					
					//데이터를 위에 처럼 직접쓰지말고 변수에 넣어서 사용할것
					String msg = "안녕하세요. 홍길동님."; //-> (변수)
					System.out.println(msg);
					System.out.println(msg);
					System.out.println(msg);
		
			// 요구사항
				//ex) " 안녕하세요." "홍길동님." 각각 다른 라인에 출력해주세요.
					// ***문자열 리터널내에는 개행문자(엔터)를 직접 작성할 수 없다.***
					msg = "안녕하세요.\n 홍길동님."; //-> \n(개행문자) 엔터를 치고싶을때 쓴다.
					System.out.println(msg);
					
		//2. \r 
			//- (carrige return) (타자기를 칠때 종이를 안으로 밀어넣으면 타자기는 맨 앞줄로 가게된다)
			//- 캐럿(carret)의 위치를 현재 라인의 맨 앞으로 이동
			//- /r -> ***자바는 지원을 안함
					//\n 이랑 똑같이 나오는 예
					msg = "안녕하세요.\r홍길동님";
					System.out.println(msg);
					
		//운영체제의 엔터
			
			//1. 윈도우 : \r, \n
			//2. 맥		: \r
			//3. 리눅스 : \n
			
			System.out.println("하나\r\n둘\r\n셋"); //FM
			System.out.println("하나\n둘\n셋"); // 이렇게 쓰는편이 많다.
			
			
			
		//3. \t
			//- 탭문자, tab
			//- 탭이 뭐에요 ? 가장 가까운 탭에 위치로 이동(탭의 위치는 정해져있다)
				msg = "하나	둘	셋"; //키보드 탭을 눌러서 했을때.
				System.out.println(msg);
					
				msg = "하나\t둘\t셋"; //탭은 이렇게 표현해야한다.
				System.out.println(msg);
		
		
				
		//4. \b
			//- backspace(커서가 한칸앞으로가서 덮어쓰기함)
				msg = "홍길동\b입니다";
				System.out.println(msg);
				
			
				
		//5. \", \', \\
			//- 이미 역할이 있는 문자들을 역할을 못하게 만든다.
				
				//요구사항
					//ex) 홍길동: "안녕하세요." 출력해주세요
					//msg="홍길동: "안녕하세요.""; //잘못된 방법
					msg="홍길동: \"안녕하세요.\""; //해결방법 ( 문자안에 쌍따움표를 넣고 싶을때 \를 넣는다)
					System.out.println(msg);
				
				//요구사항
					//ex)수업 폴더가 어딘지 출력해주세요
					//- C:\class\code\java
					
					String path = "C:\\class\\code\\java"; // 이럴경우 \를 한번씩 더 붙인다.
					System.out.println(path);
		
		
					
					
		
		
		
		
		
		
		
	}

}
