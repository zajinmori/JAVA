package com.test.java;

import java.util.Scanner;

public class Ex15_Method {
	
	public static void main(String[] args) {
		
		//Ex15_Method.java
		
		//public static void hello()
		
			//	void : 반환타입
			//		void = 없다 = null
		
		String name =  getName();
		System.out.println(name); //반환값
		
		
		String result = checkScore(100,85,90);
		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
	}//main 메서드
	
	//String : 반환타입
	public static String getName() {
		
		//return문 (한가지의 값만 돌려준다)
		return "홍길동"; // String과 return"홍길동" 이 세트다// return은 메서드종료 + 돌아가기
		
		//System.out.println("종료"); 이건 실행불가. 위에 return이 있기 때문.
		
		
		
	}

	public static String checkScore(int kor, int eng, int math) {
		
		int total = kor + eng + math;
		double avg = total / 3.0; //double로 선언했는데 정수니까 3을 실수로만들었따
		
		String result = avg >= 60 ? "합격" : "불합격";
		return result;
		
	}
	
}
