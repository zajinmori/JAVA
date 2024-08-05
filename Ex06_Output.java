package com.test.java;

public class Ex06_Output {
	
	
	public static void main(String[] args) {
		
		
		
		
		//기본 입출력
			//- 콘솔 입출력, Console Input Output > IO
			//- 입력 장치 > 키보드
			//- 출력 장치 > 모니터
		
		
		/*
		 
		 콘솔 출력
		 
		 - 클래스.필드.메서드 (인자);
		 1. System.out.println(값);
		 	- println 메서드 (print line의 약자)
		 	 > 값을 행 단위로 출력한다.
		 	 > 값을 출력하고 ***엔터***를 쳐라. 라는 뜻 (한줄씩 따로 출력됨)
		 
		 2. System.out.print(값);
		 	- print 메서드
		 	 > 값을 출력하고 엔터를 안친다.(한줄로 쭉 출력됨)
		 	 
		 3. System.out.printf(값);
		 	- print format 메서드
		 	- 형식을 제공 + 값을 출력 (엔터를 넣을지 탭을 넣을지 등 내가 원하는걸 넣을 수 있음)
		 
		 
		 */
		
		//1,2.
		System.out.println(100);
		System.out.print(200);
		System.out.println(300);
		
		//예제) 성적표 출력하기
		String name1 = "홍길동";
		int kor1=100;
		int eng1=90;
		int math1=80;
		
		String name2 = "아무개";
		int kor2=95;
		int eng2=89;
		int math2=78;
		
		System.out.println("=======================");
		System.out.println("	성적표");
		System.out.println("=======================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.println("------------------------------");
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1+"\t");
		System.out.print(eng1+"\t");
		System.out.print(math1+"\r\n"); // = System.out.println(math1);
		
		//개행(빈줄)
		System.out.println("\r\n");
		System.out.println();
		//System.out.print(); print는 아무것도() 없으면 오류남, println은 가능하다. 
		
		System.out.println(name2+"\t"+kor2+"\t"+eng2+"\t"+math2);
		
		//-----------------------------------------------------------
		
		//3.
		//요구사항 ] "안녕하세요. 홍길동(고정이 아님)님." 출력
		String name = "홍길동";
		
		System.out.println("안녕하세요. " + name +"님.");
		System.out.printf("안녕하세요. %s님.", name); // %s(형식문자) 뒤에 (name)의 자리를 맡아줌
		
		//요구사항 ] "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 안녕히가세요. 홍길동님.";
		System.out.println("안녕하세요." +name+  "님. 반갑습니다." +name+ "님. 안녕히가세요." +name+ "님.");
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님. 안녕히가세요. %s님.", name, name, name); // ->위에꺼말고 이걸로 사용해야함.
	
		//printf()의 형식 문자
			//1. %s = String
			//2. %d = Decimal(정수) > byte, short, int, long
			//3. %f = Float(소수) > float, double
			//4. %c = Char
			//5. %b = Boolean
		
		System.out.printf("문자열: %s\n", "문자열");
		System.out.printf("정수: %d\n,", 100);
		System.out.printf("실수: %f\n", 3.14);
		System.out.printf("문자: %c\n", 'A');
		System.out.printf("논리: %b\n", true);
		
		System.out.printf("문자열: %s\n", "100"); //%s는 문자가 아니어도 ***전부다*** 가능
		System.out.printf("정수: %s\n,", 100);
		System.out.printf("실수: %s\n", 3.14);
		System.out.printf("논리: %s\n", true);
		
		//System.out.printf("정수: %d\n,", 3.14); %d 에는 실수 불가능.
		//System.out.printf("정수: %d\n,", "홍길동"); String 불가능
		//System.out.printf("정수: %d\n,", 'A'); char도 불가능
		//System.out.printf("정수: %d\n,", true); true도 불가능
		
		//System.out.printf("실수: %f\n", 3); 전부불가능
		
		
		//문자 코드
			//정해진 규칙임.
			//A(65), B(66) ~ Z(90) 알파벳 대문자의 문자코드
			//a(97), b(98) ~ z(122) 알파벳 소문자의 문자코드
			//0(48), 1(49) ~ 9(57) 숫자의 문자코드
			//가 ~ 힣 한글의 문자코드 범위 (총 11,172자) (한글은 '가','김' 이런식으로 완성된 문자코드이다.)
			System.out.printf("문자: %c\n", 65); //알파벳 대문자
			System.out.printf("문자: %c\n", 66); 
			System.out.printf("문자: %c\n", 90); 
			System.out.printf("문자: %c\n", 97); //알파벳 소문자
			System.out.printf("문자: %c\n", 98);
			System.out.printf("문자: %c\n", 122);
			System.out.printf("문자: %c\n", 48); //숫자
			System.out.printf("문자: %c\n", 57);
			System.out.println((int)'가'); //출력하면 44032이 나오는데 그게 '가'의 문자코드이다.
			System.out.println((int)'힣'); //출력하면 55203이 나오는데 그게 '힣'의 문자코드이다.
		// ---> %c는 이처럼 ***문자코드(정해진 숫자)를 넣으면 문자나 숫자로 가능.
		
			System.out.println();
			
			
		//형식 문자의 확장 기능
			//1. %숫자d, %숫자s, %숫자f, %숫자c, %숫자b
				//- 정수
				//- 출력할 너비를 지정
				//- 양수(우측 정렬), 음수(좌측 정렬)
				//- 서식을 맞추는 용도\
				//- 자리가 안남으면 아무의미 없음
			int num = 1234567;
			System.out.printf("%d\n", num);
			System.out.printf("[%d]\n", num);
			System.out.printf("[%5d]\n", num);// -> [%10d]는 []안에 10칸을 만드는것
			System.out.printf("[%-10d]\n", num);// 대괄호를 쓰는 이유는 그저 구분하기 위해.
			System.out.println();
		
			
			//2. %.숫자f (실수에서만 가능)
				//- 소수점 이하 자릿수 지정
			double num2 = 3.14;
			System.out.println(num2);
			System.out.printf("%f\n", num2);
			System.out.printf("%.2f\n", num2);//소수점 2개까지만
			System.out.printf("%.1f\n", num2);//소수점 1개까지
			System.out.printf("%.0f\n", num2);//정수만
			
			System.out.printf("%.3f\n", 3.4567); //반올림할때 ***확인 후 작업
			
			
			//3. %,d, %,f
				//- 자릿수 표기
				//- 1,000,000 (컴마를 찍는 이유)
				int price = 1234567;
				System.out.printf("금액%,d원\n", price); // 금액1,234,567원 이렇게 출력된다.

				//천단위마다 , + 소수이하는 2자리 + 출력너비는 20자리 + 우측정렬
				double num3 = 1234567.89012345;
				System.out.printf("[%20f]\n", num3); //출력너비(.도 한글자를 먹는다)
				System.out.printf("[%20.2f]\n", num3); //출력너비+소수이하2자리
				System.out.printf("[%,20.2f]\n", num3); //출력너비+소수이하2자리+천단위마다. 완성 !
				
				
				//예제) 메뉴판 출력 (숫자데이터는 무조건 우측정렬)
				System.out.println("==================================");
				System.out.println("            음료가격");
				System.out.println("==================================");
				System.out.println("콜라: 2500");
				System.out.println("스무디: 3500");
				System.out.println("사이다: 500");
				System.out.println("아메리카노: 15000");
					// Step,1 열정렬(탭문자로 가격길이 맞추기)
					System.out.println("==================================");
					System.out.println("            음료가격");
					System.out.println("==================================");
					System.out.printf("콜라:\t\t%d\n", 2500);
					System.out.printf("스무디:\t\t%d\n", 3500);
					System.out.printf("사이다:\t\t%d\n", 500);
					System.out.printf("아메리카노:\t%d\n", 15000);
						// Step,2) 5를 추가하면서 오른쪽으로 길이를 맞춤( 15000이 5자리기 때문)
						System.out.println("==================================");
						System.out.println("            음료가격");
						System.out.println("==================================");
						System.out.printf("콜라:\t\t%5d\n", 2500);
						System.out.printf("스무디:\t\t%5d\n", 3500);
						System.out.printf("사이다:\t\t%5d\n", 500);
						System.out.printf("아메리카노:\t%5d\n", 15000);
							// Step,3) ,를 추가하면서 자릿수(1,000,000)가 생김
							System.out.println("==================================");
							System.out.println("            음료가격");
							System.out.println("==================================");
							System.out.printf("콜라:\t\t%,5d\n", 2500);
							System.out.printf("스무디:\t\t%,5d\n", 3500);
							System.out.printf("사이다:\t\t%,5d\n", 500);
							System.out.printf("아메리카노:\t%,5d\n", 15000);
								// Step,4) 근데 자릿수(,)를 추가 했더니 아메리카노가 6자리가 됨. 그래서 5를 6으로 바꿔준다.
								System.out.println("==================================");
								System.out.println("            음료가격");
								System.out.println("==================================");
								System.out.printf("콜라:\t\t%,6d\n", 2500);
								System.out.printf("스무디:\t\t%,6d\n", 3500);
								System.out.printf("사이다:\t\t%,6d\n", 500);
								System.out.printf("아메리카노:\t%,6d\n", 15000);
								//5, Finish) 이런건 무조건 단위를 알려줘야함. 그래서 음료가격에 (단위:원)을 넣음. 완 성 !
								System.out.println("==================================");
								System.out.println("            음료가격(단위:원)");
								System.out.println("==================================");
								System.out.printf("콜라:\t\t%,6d\n", 2500);
								System.out.printf("스무디:\t\t%,6d\n", 3500);
								System.out.printf("사이다:\t\t%,6d\n", 500);
								System.out.printf("아메리카노:\t%,6d\n", 15000);
			
			
		
		
	}

}
