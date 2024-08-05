package com.test.java;

public class Ex14_Method {
	
	public static void main(String[] args) {
		
		
		//Ex14_Method.java
		
		//public static void hello()
		
		//- hello : 메서드이름 > 캐멀표기법 사용 + 의미있게
		//- () : 인자리스트(Parameters, Arguments), 매개변수
		
		//예제)요구사항]'홍길동'에게 인사를 하는 메서드를 구현하시오.
		//				'아무개'에게도 인사를 하는 메서드를 구현하시오.	
		//				'테스트'에게도 인사를 하는 메서드를 구현하시오.
		//				'
		hello();
		hello2();
		hello3();
		
		helloEveryone("홍길동");
		helloEveryone("아무개");
		helloEveryone("테스트"); //다용성이 높아지는 메서드 사용법 (실인자(밑에 가인자있음))
		
		
		//helloEveryone(100); 즉, 실인자와 가인자는 자료형타입이 같아야한다.
		
		
		int age = 20;
		checkAge(age); //메서드는 재사용의 용도도 있지만, 관리의 용도로도 만든다.
		//실인자와 가인자간에 형변환이 가능하다면 가능하다.
		
		
		//성적 계산 메서드 만들기
		//	-매개변수는 순서가 중요하다(순서에 값이 대입되기때문) !!!!(***)
		//	-매개변수의 개수도 중요하다(딱! 똑같아야한다)(***)
		checkScore(100, 90, 80);
		//checkScore(100, 90); 적어서 에러
		//checkScore(100, 90, 80, 90); 많아서 에러
		
		
	}//main메서드

	public static void hello() {
		
		System.out.println("홍길동 안녕?");
		
	}
	
	//메서드 이름 지을때 넘버링(1,2,3)은 사용하지말것.
	public static void hello2() {
		
		System.out.println("아무개 안녕?");
	}
	
	public static void hello3() {
		System.out.println("테스트 안녕?");
	}
	
	
	public static void helloEveryone(String name) { //(String name) - 매개변수, 가인자
		
		//String name = "테스트"; - 메서드명 옆에 ()안에 매개변수로 만듬
		System.out.println(name + "님 안녕?");
	}
	
	
	public static void checkAge(int age) {
		
		String result = age >= 18 ? "통과" : "거절";
		
		System.out.printf("입력한 나이 %d세는 %s입니다.\n", age, result);
		
	}
	
	/**   				<-도큐먼트주석 (팀작업할때 쓴다)
	 * 성적을 계산합니다.
	 * @param kor 국어
	 * @param eng 영어
	 * @param math 수학
	 */
	public static void checkScore(int kor, int eng, int math) {
		
		int total = kor + eng + math;
		double avg = total / 3.0; //double로 선언했는데 정수니까 3을 실수로만들었따
		
		String result = avg >= 60 ? "합격" : "불합격";
		System.out.printf("평균 점수 %.1f점은 %s입니다.\n", avg, total);
		
	}
	
	
}
