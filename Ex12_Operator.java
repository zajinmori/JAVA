package com.test.java;

import java.util.Scanner;

public class Ex12_Operator {

	public static void main(String[] args) {
		
	
		//Ex12_Operator.java
		
		//연산자를 이용한 예제) > 이런걸 연습많이 해야함
		// 요구사항] 사용자로부터 문자 1개 입력 > 영어 소문자인지?
		
			// 일의 흐름을 먼저 생각한다 (일의 순서를 생각하고 정리.)
			// 1. Scanner 생성
			// 2. 안내 메시지 출력(Label)
			// 3. 문자 입력
			// 4. 유효성 검사(만족하는지 아닌지 확인)
			// 5. 결과 처리 + 출력
		
				// 1. Scanner 생성
				Scanner scan = new Scanner(System.in);
				
				// 2. 안내 메시지 출력(Label)
				System.out.println("문자 입력 : ");
				
				// 3. 문자 입력
				String input = scan.nextLine();
				
				// 4. 유효성 검사(만족하는지 아닌지 확인) 핵심 !!!!!
				//System.out.println(input);
				
				char c = input.charAt(0); 
				int code = (int)c;
				
				//System.out.println(code);
				
				//a(97) ~ z(122)
				//A(65) ~ Z(90)
				//0(48) ~ 9(57)
				//가(44032) ~ 힣(?)
				
				//String result = c >= '97' && c <= '122' ? "올바른 문자입니다." : "올바르지 않은 문자입니다."; //가장 기본적
				
				//String result = (c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')? "올바른 문자입니다." : "올바르지 않은 문자입니다.";				
				//->영어인가 ? 를 만들때.. 
				
				String result = (c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')||(c >= '0' && c <= '9')? "올바른 문자입니다." : "올바르지 않은 문자입니다.";				
				//영어나 숫자인가 ? 를 만들때.. 
				
				//->굉장히 많이 쓰니까 외우자 !!!!
				
				//문자코드값을 알아내야함. (int)'A' > 65
				//System.out.println((int)"A");
				
				//System.out.println("A".charAt(0)); // "A" -> 'A'
				//char c = "A".charAt(0);
				//System.out.println((int)c); // ->문자코드값을 찾는 방법
				//Ex11 맨밑에도 예제 있음
	
				// 5. 결과 처리 + 출력
				System.out.printf("입력한 문자 '%s'는 %s\n", input, result);
				
				
	}
}
