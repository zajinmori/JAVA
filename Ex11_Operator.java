package com.test.java;

import java.util.Scanner;

public class Ex11_Operator {
	
	public static void main(String[] args) {
		
		
		//Ex11_Operator.java
		/*
		 
		 비교 연산자
		 - >, > =, <, < =, = =(equals), ! =(not equals)
		 - 2항 연산자
		 - 피연산자들의 우위를(동등) 비교
		 - 피연산자는 숫자형이다.
		 - 연산의 결과가 항상 boolean이다. (true, false로 답한다.)
		 
		 */
		
		int a = 10;
		int b = 3;
		
		System.out.println(a > b);	//초과
		System.out.println(a >= b);	//이상
		System.out.println(a < b);	//미만
		System.out.println(a <= b);	//이하
		System.out.println(a == b);	//같다
		System.out.println(a != b);	//같지 않다
		
		//흐름의 조건으로 사용한다.
		
		//ex)요구사항] 사용자로부터 나이를 입력받아 성인이면 통과. 미성년자이면 거절.
		
			/*Scanner scan = new Scanner(System.in);
			
			System.out.print("나이 입력:");
			int age = scan.nextInt();
			
			boolean result = age >= 18;
			System.out.println(result);
			*/
		
		//System.out.println(result);
		
		//비교연산자 주의사항
		// - 문자열(참조형) 비교할때
		int n1 = 100;
		int n2 = 100;
		int n3 = 50;
		n3 = n1 + n2;
		int n4 = 200;
		
		System.out.println(n1 == n2);
		System.out.println(n1 == n3); //n3는 200이다 왜냐면 위에 n3 = n1 + n2; 덮어썼기 때문에.
		System.out.println(n3 == n4); //n1(100) + n2(100) == 200
		
		//주의사항 !!!!!!!
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동"; // "홍" + "길동" = "홍길동"
		System.out.println(s1 == s2); //<- 잘못된 행동
		System.out.println(s3);
		System.out.println(s1 == s3); // false <- 잘못된행동
		// -> ***문자열을 비교할때는 절대로 연산자(==, !=)를 사용하면 안된다.\
		// ***문자열의 비교는 equals() 메서드를 사용한다.
		// 해결방법 !
		System.out.println(s1.equals(s2)); //s1 == s2
		System.out.println(s1.equals(s3)); //s1 == s3
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		/*
		 
		 논리 연산자
		 - &&(and), ||(or), !(not)
		 - 2항 연산자(&&. ||)
		 - 1항 연산자(!)
		 - 피연산자의 자료형이 boolean 이다.
		 - 연산의 결과는 항상 boolean 이다. 즉, 입력과 출력 모두 boolean이다.
		 - 정해진 규칙에 따른 결과를 반환
		 
		 %% 연산자
		 ex) a && b = ?
		 
		 논리곱 * ( true = 1, false = 0) 즉, 모든걸 만족해야 통과(밑에 소개팅 예시를 대입해서 생각해보면 쉬움). ->완벽이 필요할때.
		 ture && true = true = 1
		 ture && false = false = 0
		 false && true = false = 0
		 false && false = false = 0  -> 경우의 수. !!!!외워라!!!!
		 
		 || 연산자
		 논리합 + ( true = 1, false = 0) 즉, 한개이상만 만족해도 통과 -> 부분적으로도 괜찮을때.
		 ture || true = true = 2 (2에 대한건 나중에 설명해준다고 하셨음)
		 ture || false = true = 1
		 false || true = true = 1
		 false || false = false = 0
		 --> 외울때 하나라도 안맞으면 논리합, 둘다 맞으면 논리곱. 으로 외우면 편함
		 ex) 소개팅 > 남자 소개
		 		1. 키 180cm 이상
		 		2. 잘생김
		 
		 ! 연산자
		  - 반대로 뒤집는다.
		 !A
		 
		 !true = false
		 !false = true
		 
		 베타적 논리합(xor)
		 - exclusive or = xor
		 
		 ex) A^b = ?
		 
		 T ^ T = F
		 T ^ F = T
		 F ^ T = T
		 F ^ F = F
		 
		 
		 */
				
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(b1^b2);
		
		//&&을 이용한 예제) 나이입력 > 18세 이상 + 60 미만 ( 18 <= age < 60) 
		
		int age = 20;
		
		//The operator < is undefined for the argument type(s) boolean, int
		//System.out.println(18 <= age < 60); 연산자 ( <=, <가 2개여서 에러난다. 18 <= age는 true인데 true랑 int는 비교할수없다는에러이다)
		//해결방법
		System.out.println((18 <= age) && (age< 60)); // 두개로 나누고 중간에 &&(and)를 넣어준다
		
		/*
		 
		 대입(할당) 연산자
		 - =
		 - +=, -=, *=, /=, %= (복합 대입 연산자)
		 - 2항 연산자
		 - LValue(변수)(공간) = RValue(상수, 변수)(값)
		 - LValue와 RValue의 자료형이 반! 드! 시! 일치해야한다. 일치하지 않을경우 형변환사용.
		 - 대입 연산자의 연산자 우선 순위가 가장 낮다.
		 
		 연산자 우선 순위
		 - 1순위, 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		 
		 
		 
		 */
		
		int sum = 1 + 2 * 3; //연산자 =, +, * -> 3개 / *1등, +2등, =3등
		System.out.println(sum);
		
		
		int m1 = 100;
		int m2;
		int m3;
		
		m2 = m1;
		m3 = m1;
		
		//연산자의 연산 방향
		//- 하나의 문장에 동일한 우선순위를 갖는게 여러게 있을경우에 어느방향 ??
		
		
		m3 = m2 = m1; //대입 연산자는 오른쪽에서 왼쪽으로 방향을 가진다.
		
		
		//복합 대입 연산자
		
		
		//ex) n 에 1을 더하시오 > 누적
		
		int n =10;
		
		n = n + 1; // ->누적한다 라는 식
		System.out.println(n);
		n += 1; // 같은 값인데 복합대입연산자(+=)를 활용해서 만든것. 보통 이런식으로 쓴다. 왜 ? n을 한번만 적어도 되기때문에 편하다.
		System.out.println(n);
		
		n = n - 2;
		System.out.println(n);
		n -= 3;
		System.out.println(n);
		
		n = n * 2;
		System.out.println(n);
		n *= 3;
		System.out.println(n);
		
		n = n / 3;
		System.out.println(n);
		n /= 2;
		System.out.println(n);
		
		n = n % 7;
		System.out.println(n);
		n %= 3;
		System.out.println(n);
		
		n = n + 10;// = n =+ 10;
		
		n = n - 10;// = n -= 10;
		
		n = 10 + n;// = n+=10;
		
		n = 10 - n;
		n -= 10; //조심해야할것!!!
		System.out.println(n);
		
		
		
		/*
		 
		 증감 연산자
		 - ++(증가), --(감수)
		 - 1항 연산자
		 - 피연산자는 숫자형이다.
		 - 누적 연산
		 - 기존의 값에 1을 더하거나 1을 뺀다.
		 - *****피연산자의 위치를 바꿀 수 있다.
		 	- 연산자의 위치에 따라 연산자 우선순위가 바뀐다..
		 		- ++n : 전위 > 연산자 우선순위 최상(소괄호를 제외한 모든연산자중에 제일 먼저다)
		 		- n++ : 후위 > 연산자 우선순위 최하
		 		
		 
		 */
		//ex)
		n = 10;
		++n; // 10에 1을 더함
		System.out.println(n);
		
		n = n + 1;
		n += 1;
		++n;
		// -> 3개가 다 같은값이다.
		
		n = n -1;
		n -= 1;
		--n;
		// -> 역시나 같다. 
		
		++n;
		n++;
		System.out.println(n);
		
		--n;
		n--;
		System.out.println(n);
		System.out.println();
		
		
		//전위의 예. ***하나의 문장안에 증감 연산자와 다른 연산자를 동시에 사용하지 말자!! > 가독성 저하
		n = 10;
		int  result = 0;
		
		//result = 10 + ++n; 잘못됨. 다른연산자(+) 있기 때문.
		
		// 위 아래가 같은 값인데 밑에껄 써야 더 좋은 코드이다
		
		++n; // <- 증감연산자는 따로 빼준다.
		result = 10 +n;
		
		System.out.println(result);
		
		//------------------
		
		//후위의 예. 잘못된 값이 나온다.
		n = 10;
		result = 0;
		
		//result = 10 + n++; // 후위에 있으니 +, =, ++의 순서로 연산이 된다.
		
		//위아래가 같은 값이다. 물론 밑에껄 써라.
		
		result = 10 + n;
		n++;
		
		System.out.println(result);
		System.out.println(n);
		
		
		
		
		
		int o = 10;
		System.out.println(--o - o--); // ->가독성 쓰레기
		
		
		/*
		 
		조건 연산자 (조건의 따라 결과가 달라진다) (조건을 잘 만들면된다) //제어문 > 조건문 > if문
		- ?:
		-3항 연산자 (유일하다)
		- A ? B : C
		- A = boolean > 조건으로 사용
		- B, C = 상수, 변수 > 연산의 결과로 사용
		- A가 참이면 B를 반환(B가 결과)
		- A가 거짓이면 C를 반환(C가 결과)
		
		 */
		
		//조건 연산자 ex)
		System.out.println(true ? 10 : 20); // true니까 10이 결과
		System.out.println(false ? 10 : 20); // false니까 20이 결과
		
		age = 20;
		System.out.println(age >= 18);
			//System.out.println(age >= 18 ? B : C); //B는 조건을 만족했을때 결과, 만족하지 않을때 결과.
				System.out.println(age >= 18 ? "성인" : "미성년자"); //B=성인, C=미성년자
		
		//ex2)18세 이상 ~ 60세 미만 > 통과, 거절
		age = 20;
		//System.out.println(age>= 18 && age < 60); -> true, false말고 다른거를 쓰고 싶을때는
		System.out.println(age>= 18 && age < 60 ? "통과" : "거절"); //이렇게 쓰면 된다.
		
		//하면 안되는 예 )
		age = 10;
		//System.out.println(age >= 18 ? "성인" : 100); !!! 두개의 자료형이 꼭 꼭 !!! 같아야한다.
		
		
		//비트 연산자
		// -bit값을 대상으로 연산
		//  &(and), |(or)
		a = 10;
		b = 5;
		
		System.out.println(a & b); // 0
		System.out.println(a | b); // 15
		
		// 정수 / 정수
		//System.out.println(5 / 0); 0으로 나누는건 에러가 난다.
		System.out.println(0 / 5);
		
		// 실수 / 실수
		System.out.println(5 / 0.0); // Infinity 
		System.out.println(5 % 0.0); // NaN(Not a Number)
		//->정상적인 값은 아니다.
		
		
		//Shift 연산자, 비트 이동 연산자
		// ex) 	a >> 오른쪽으로 비트를 한칸씩 이동시켜라(2진수에서)
		//		b << 왼쪽으로 비트를 한칸씩 이동시켜라
		
		
		 System.out.println();
		 
		char c = 'G';
		
		System.out.println((int)c>= 65 && (int)c <= 90);
		
			// -> 업그레이드
			System.out.println((int)c>= (int)'A' && (int)c <= (int)'Z'); // 이렇게 하면 문자코드값을 몰라도 된다.
		
				//-> 또 업그레이드 [비교 연산자는 char 비교 가능 > 숫자로서 비교]
				System.out.println(c>= '가' && c <= '힣'); // 이렇게 하면 문자코드값을 몰라도 된다. 이 방법을 주로쓴다.
				
		
		
	}

}
