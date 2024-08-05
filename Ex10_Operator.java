package com.test.java;

public class Ex10_Operator {

	
	public static void main(String[] args) {
		
		
		
		//Ex10_Operator
		
		/*
		 
		 연산자, Operator
		 - 수학 연산자 = 프로그래밍 연산자
		 - 피연산자를 대상으로 미리 정해진 연산(행동)을 한 후에, 연산(행동)의 결과를 반환하는 요소.
		 - 주로 기호를 사용한다 (+,-,*,/ 등) + 단어도 사용
		 
		 1. 문장, Statement
		 2. 표현식, Expression
		 3. 연산자, Operator
		 4. 피연산자, Operand
		 5. 연산자 우선순위
		 6. 연산자 연산방향
		 
		 
		 	1. 문장, Statement
		 		- 1개 이상의 표현식이 모여서 문장이 된다.
		 	 	ex) int n1 = 10; ( ;(세미콜론) <- 문장종결(마침표역활)
		 	 	ex) int n2 = 10 + 20;
		 	 	ex) int n3 + scan.nextInt();
		 	 	
		 	2. 표현식, Expression
		 		- 문장을 구성하는 최소 단위
		 		ex) 10
		 			int n1
		 			n1 = 10 (문장안에 잘라서 보면 표현식이다)
		 			
		 	3. 연산자, Operator
		 	ex) int n2 = 10 + 20; (=,+이다)
		 	
		 	4. 피연산자, Operand
		 	ex) int n2 = 10 + 20; (10,20이다)
		 
		 	5. 연산자 우선순위
		 		- 하나의 문장에 속해있는 연산자들 중 누구를 먼저 실행할지 정해져있는 순위.
		 		- 1 + 2 x 3 = ? +이걸 먼저할지 x먼저 할지 우선순위를 정한다는 뜻.
		 		
		 	6. 연산자 연산방향	
		 		- 하나의 문장에 속해있는 연산자들 중 우선 순위가 동일한 연산자들 중 누구를 먼저 실행할지 정해져있는 순위.
		 		- 1 + 2 + 3 = ? 왼쪽먼저할지 오른쪽을 먼저할지. (동일할 경우 자바는 왼쪽부터 한다.)
		 		
		 		
		 연산자 종류
		 	1.행동(목적)
		 		a. 산술 연산자 (1+1)
		 		b. 비교 연산자
		 		c. 논리 연산자
		 		d. 대입 연산자
		 		e. 증감 연산자
		 		f. 조건 연산자
		 		g. 비트 연산자
		 	
		 	
		 	2.형태(피연산자의 개수)
		 		a. 1항 연산자
		 		b. 2항 연산자 (1+1)
		 		c. 3항 연산자
	
		 
		 */
		
		
		//산술 연산자
		// +, -, *, /, %(mod, 나머지 = ex) 10나누기3을 했을때 1이 남는데 그걸 말한다.)
		// - 2항 연산자
		// - 피연산자를 숫자형을 가진다.(정수, 실수) ( true + false <- 이런게 안된다)
		int a = 10; // 정수
		int b = 3;
		
		//java.util.IllegalFormatFlagsException <- 산술연산자를 잘못썼을때 나오는 에러메세지)
		
		//10 + 3 = 13 
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b); // [몫] [정수 / 정수 = 정수]
		//System.out.printf("%d % %d = %d\n", a, b, a%b); // %d 옆에있는 %를 형식문자로 인식해서 에러남
		System.out.printf("%d %% %d = %d\n", a, b, a%b); // 그래서 %를 쓸때는 %%로 하나더붙여준다. [나머지]
		
		double c = 10; // 실수
		double d = 3;
		System.out.printf("%.0f / %.0f = %f\n", c, d, c/d); // [실수 / 실수 = 실수]
		
		System.out.println(10 / 3); //정수 / 정수 int여서 정수만표현
		System.out.println(10.0 / 3.0); // 실수 / 실수 double여서 실수로 표현
		System.out.println(10 / 3.0); // ***정수 / 실수 -> 실수 왜냐면 double과 int인데 double가 더 크니까 실수로 값이 나온다.
		System.out.println(10.0 / 3); // ***실수 / 정수 -> 실수
		
		
		int e = 10000;
		byte f = 10;
		
		System.out.println(e+f); // int값으로 나오는데 이유는 값의 손상을 막기위해서이다.

		//***** 모든 산술 연산자의 결과값 자료형
		// - 두 피연산자의 자료형 중에서 더 크기가 큰 자료형으로 반환된다.<-!외워라! (왜? 데이터 손실을 최소화하기 위해서.)
		
		
		// +, -, * 할때 자주 생기는 문제(오버플로우)
		//ex)
		//int g = 2000000000;
		//int h = 2000000000;
		//System.out.println(g+h); ->int + int 인데 40억이 나와서 오버플로우가 발생 ( 에러없이 이상한 값만 나옴) (이런건 예측이 가능하다)
		
			//해결방법
			int g = 2000000000;
			int h = 2000000000;
			System.out.println(g+(long)h); // 둘중 하나를 long을 캐스팅한다.
			
			
		
		// 정수값 > int 
		// 실수값 > double (float보다 더 정밀해서 그렇다)
			//->거의 모든 자바개발자가 저 자료형들을 쓴다. (이유는 밑에있음)
			
			byte j = 10;
			byte k = 20;
			
			//Type mismatch: cannot convert from int to byte
			//byte l = j + k; 즉, byte + byte = int이다.
			//또, short + short = int이다.
			//즉, int 미만의 모든 자료형의 산술 연산 결과는 항상 int이다.
			// 왜냐하면, cpu가 한번에 처리하는 데이터의 크기가 int이기 때문이다.
			
			//해결방법
			byte l = (byte)(j + k); // ->귀찮다.. 그래서 처음부터 int 쓴다. 메모리를 아껴쓰는거보다 코딩할때 편한게 오히려 더 낫다고 생각해서 !
				System.out.println(j+k);
			
			//주로 쓰는 자료형
				// - int, long
				// - double
				// - char
				// - boolean
			
			
		
		
		
		
		
	}
	
}
