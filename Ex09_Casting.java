package com.test.java;

public class Ex09_Casting {

	public static void main(String[] args) {
		
		
		//Ex09_Casting.java
		/*
		 
		 형변환, 자료형변환
		 - Casting, Promotion
		 - 하나의 자료형을 다른 자료형으로 변화하는 작업
		 - 코드 작성을 유연하게 하기 위해서(개발자 편의성)
		 - int > double
		 - long > float
		 - byte > short
		 
		 1. 암시적(묵시적) 형변환, 자동 형변환, Promotion, 눈에 안보임
		 	-크기가 큰 자료형 = 크기가 작은 자료형 (오른쪽이 왼쪽으로 !!!)
		 	-100% 안전
		 
		 2. 명시적 형변환, 강제 형변환, Casting > 너가 직접 적어라(범위를 확인하고!!)
		 	-크기가 작은 자료형 = 크기가 큰 자료형 (오른쪽이 왼쪽으로 !!!)
		 	-논리 오류가 생기는 이유중 하나 !!
		 	-경우에 따라 다르다. > 오버플로우 발생(결과 값이 이상하다)
		 
		 
		 */
		
		
		//정수간의 형변환 
		byte b1; 	//1byte
		short s1;	//2byte
		
		b1 = 8; //원본
		
		//LValue = RValue
		//공간	 = 값
		
		//***절대규칙 > LValue와 RValue의 자료형은 반드시 동일해야 한다 > 동일하지 않으면 무조건 컴파일 오류
		
		//short=byte
		//s1  =  b1; // 왼쪽은 공간, 오른쪽은 데이터
		s1 = (short)b1; // (자료형) : 형변환 연산자, b1(byte)를 (short)가 short자료형으로 바꾼다. 그래서 문제없다
		
		//검증
		System.out.println(s1);
		
		
		
		byte b2;
		short s2;
		
		s2 = 127; // byte의 범위 안에서만 가능
		
		//Type mismatch: cannot convert from short to byte
		//b2 = s2; > 잘못된거
		b2 = (byte)s2; // > 잘한거
		
		System.out.println(b2);
				
		
		//명시적 형변환의 논리적오류 예)
		int money = 2100000000;
		
		short money2; // short는 21억이 안들어가기 때문에 잘못됨
		
		
		//오버 플로우(Overflow)현상
		//언더 플로우(Underflow)현상
		money2 = (short)money;
		
		System.out.println("계좌 이체 결과 잔액은: " + money2);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//(값형끼리의) 형변환
			//- 값형과 참조형간에는 형변환이 불가능하다.
		//byte, short, int, long
		//float, double
		//char
		//boolean(참여X) 
		//String(참여X) 참조형
		
		
		
		//실수간의 형변환
		
		float f1; //4byte
		double d1; //8byte
		
		f1 = 3.14F;
		
		//8=4
		d1 = f1; //작은게 큰걸로 가기때문에 큰 문제없음
		System.out.println(d1);
		
		
		d1=3.1234567890123456789;
		
		//4=8
		f1=(float)d1; //큰게 작은걸로 가지만 (float)형변환을 해주면서 가능. 근데 범위 안에서만 해야함
		
		System.out.println(d1); //원본
		System.out.println(f1); //복사본 (run해보면 뒤에 소수자리가 짤린다 (float로 형변환 했기때문))
		
		//정수 > 정수
		//실수 > 정수
		//정수 > 실수
		//실수 > 정수
		
		int n1 = Integer.MAX_VALUE;	//원본 4byte
		float n2;		//복사본 4byte
		
		//4 = 4
		n2 = n1; // 암시적형변환
		
		System.out.println(Integer.MAX_VALUE); //(int의 최대 값)
		System.out.println(n2); //조심 *** 암시적 형변환은 값의 손상이 생길수 있음
		
		
		int n3;							//복사본 4byte(작은형)
		float n4 = 100000000000000F;	//원본 4byte(큰형)		[int와 float는 물리적인크기는 같으나, float가 훨~씬 크다 그래서 명시적형변환을 해야한다]
		
		
		//실수형이 int로 바뀔때 int의 최대값이 출력된다.
		
		//Type mismatch: cannot convert from float to int <- 명시적형변환을 해라라는 에러
		n3=(int)n4; //그러므로 오른쪽이 더 크고 왼쪽이 더 작기 때문에 명시적 형변환을 해야한다.
		
		System.out.println(n3);
		
		
		//숫자형 크기 비교
		//byte(1) < short(2) < int(4) < long(8) <<< float(4) < double(8) = 모든 정수형은 실수형보다 작다.
		
		//***char 형변환
		// - 문자 코드값 <- (형변환) -> 숫자 가능. (문자 코드값도 숫자이기때문에 정수형 변환이랑 같다.)
		// - 사실 정수형 변환이다.
		
		
		
		System.out.println(65); //65=알파벳 A의 문자코드값
		System.out.println((char)65); //char의 형변환의 예.
		System.out.println('a');
		System.out.println((int)'a'); //a를 문자 코드값으로 형변환(int)
		
		System.out.println("A"); //String
		//System.out.println((int)"A"); 참조형과 값형간의 형변환은 불가능하다
		
		
		//***
		char c1; //정수 2byte
		short t1; //정수 2byte <- 정수+정수 길이+길이 = 쌍둥이다
		
		c1 = 'A'; 
		//c1='가'; //44032 (한글은 short범위를 벗어난다 영어 한글자는 가능한데 그냥 int로 해야한다 (밑에 설명있음))
				
		//t1 = c1; 에러남
		
		t1 = (short)c1;
		
		System.out.println(t1); //65
		// char이 short보다 크다
		
		
		char c2;
		short t2;
		
		t2=97;
		
		//c2=t2; 이번엔 short가 더크다고 에러가 난다
		
		c2=(char)t2;
		//*** 문자를 정수로 형변환 할때에는 무조건 !! int로 형변한 한다(short는 사용금지!!)) ***
		//즉 크기는 같지만, 영역이 다르다.
		//char은 음수를 못하고 short는 음수가 가능하기 때문에 혹시 몰라서 무조건 명시적 형변환을 해라 ~ 해서 무조건 자바가 명시적형변환을 요구함)
		//오로지 char과 short의 경우에만 생기는 일이다.
		System.out.println(c2);
		
		
		
		
		//"100" -> 100 (문자를 숫자로 바꿀때)
		String txt = "100";
		int result;
		
		//result = (int)txt; 참조형 = 값형(X)
		
		
		result = Integer.parseInt(txt);
		
		System.out.println(result); // 문자를 진짜 숫자로 바꾸는 방법
		
		txt = "3.14";
		
		
		double result2 = Double.parseDouble(txt);
		System.out.println(result2); // 문자를 숫자로 바꾸는건데 실수인경우
		// -> "100" 이건 문자인데 100 이것처럼 완전 숫자로 바꾸는 방법이다.
		
		//Wrapper별로 문자열을 자신의 자료형으로 바꿔주는 메서드
		//byte.parseByte (정수)
		//short.parseShort (정수)
		//float.parseFloat (실수)
		
		
		
		
		
		
		
		
		
		
	}
	
}
