package com.test.java;

public class Ex04_Variable {
	
	public static void main(String[] args) {
		
		
		//모든 자료형 변수 생성해보기
		
		//정수형
		 byte b1;
		 b1 = 10; //10 -> 상수(데이터) -> 정수형 상수 -> 정수형 리터럴(***권장)
		 System.out.println(b1);
		 
		 
		 b1 = 127;
		 System.out.println(b1);
		 
		 b1 = -128;
		 System.out.println(b1);
		 
		 //b1 = 3.14;
		 
		 //자료형	> 래퍼(Wrapper)클래스 / 유틸 클래스
		 //byte		> Byte
		 //short	> Short
		 //int		> Integer
		 //long		> Long
		 //float	> Float
		 //double	> Double
		 //boolean	> Boolean
		 //char		> Character
		 //예시
		 System.out.println(Byte.MAX_VALUE); //-> 바이트가 가질 수 있는 최대 값
		 System.out.println(Byte.MIN_VALUE); //-> 바이트가 가질 수 있는 최소 값	
		 
		 //short
		 short s1;
		 s1 = 10000;
		 System.out.println(s1);
		 
		 System.out.println(Short.MAX_VALUE);
		 System.out.println(Short.MIN_VALUE);
		 
		 //int
		 int n1;
		 n1 = 100000000;
		 System.out.println(n1);
		 
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE);
		 
		 //long
		 long l1;
		 l1 = 1000;
		 
		 System.out.println(l1);
		 
		 //l1 = 10000000000; // -> 자동 int로 컴파일러가 인식해서 오류남
		   l1 = 10000000000L; // -> ***뒤에 L을 붙혀주면 long로 인식 가능***
		 
		 //System.out.println(l1);
		
		 System.out.println(Long.MAX_VALUE);
		 
		 
		 //b1의 자료형? = byte
		 //n1의 자료형? = int
		 // 모든 100은 int이다
		 // - ***자바에서 모든 정수형 상수(리터럴)은 int자료형을 가진다***
		 b1 = 100; // = int (cpu가 한번에 가져올수있는건 4byte이기 때문
		 s1 = 100;
		 n1 = 100;
		 l1 = 100;
		 
		 System.out.println(100);
		 
		 int n;
		 n=100;
		 System.out.println(n);
		 
		 //CPU가 한번에 가져오는 데이터 크기 = 워드(Word)
		 //워드 = int
		 
		 
		 
		 
		//실수
		 	//- 실수형 상수에서는 cpu가 double자료형을 가진다
		 
		 float f1;
		 f1 = 3.14F; // -> F를 붙이면서 float자료형으로 변환완료.
		 System.out.println(f1);
		 
		 double d1;
		 d1 = 5.28;
		 System.out.println(d1);
		 
		 //float > 단정도형
		 //double > 배정도형
		 f1 = 100000000000000000000000000000000000000.0F; // .0을 붙히면 가능
		 d1 = 100000000000000000000000000000000000000.0D; // .0을 붙히면 가능
		 System.out.println(f1);
		 System.out.println(d1);
		 
		 f1 = 123456789012345678901234567890123456789.0F; // .0을 붙히면 유효숫자자리까지 값을 냄 (마냥 무한대의 값은 아니다)
		 d1 = 123456789012345678901234567890123456789.0F;
		 
		 System.out.println(f1);
		 System.out.println(d1);
		 
		 double d2=0.2;
		 double d3=0.1; //약간의 오차범위가 있음
		 System.out.println(d2+d3); 
		 
		 //0.2 X 10 = 2
		 //0.1 X 10 = 1
		 //2 + 1 + 3
		 //3/10 = 0.3
		 
		 
		 
		 
		 //문자형
		  char c1;
		  c1 = 'A'; //문자형 리터럴 ( 'A' 코따움표를 붙인다)
		  System.out.println(c1);
		  
		  c1= '가';
		  System.out.println(c1);
		  
		  c1= '@';
		  System.out.println(c1);
		  
		  c1= '5';
		  System.out.println(c1);

		  //c1= 'abc'; (잘못된것. char는 무조건 한글자만 가능)
		  //System.out.println(c1); X
		  
		  //연속 문자를 하고 싶을 때
		  char name1 = '홍';
		  char name2 = '길';
		  char name3 = '동'; //이런식으로 한글자씩 변수를 만들어줘야함
		  
		  //String = 문자열(자료형), "홍길동"(문자열 리터럴)
		  String name = "홍길동"; 
		  System.out.println(name);
		  
		 
		 //논리형
		  boolean flag;
		  
		  flag = true; //true,false -> 논리형 리터럴
		  System.out.println(flag);
		  
		  //각 자료형 별(9가지) > 변수 1개 생성 > 값을 대입 > 출력
		  //x 10번씩
		  
		  
		  
		  //---------------------------------과제
		  //샘플
		  //1. 데이터선정
		  	//- 몸무게
		  //2. 1의 데이터가 저장될 자료형 선택?
		  	//- 몸무게 데이터 > 형태 + 범위
		  	//- 1kg ~ 200kg > 실수 = float/double > float (범위)
		  
		  //3. 변수 생성 + 초기화(리터럴)
		  float weight;
		  weight = 72.5F;
		  
		  //4. 마무리 > 출력
		  System.out.println("제 몸무게는 " + weight + "kg입니다."); //이런경우 쌍따움표로 나눠주고 +를 붙혀준다.
		  
		  
		 
		  
		  double hight;
		  hight = 190.2D;
		  System.out.println("제 키는" + hight + "cm입니다");
		  
		  byte apple;
		  apple = 4;
		  System.out.println("사과가" + apple + "개입니다.");
		  
		  byte things;
		  things = 123;
		  System.out.println(things);
		  
		  byte camera;
		  camera = 36;
		  System.out.println("제 카메라는" +camera+ "개 입니다.");
		  
		  byte temperature;
		  temperature = -46;
		  System.out.println("현재 기온은" + temperature + "도 입니다.");
		  
		  byte banana;
		  banana=100;
		  System.out.println("바나나가" + banana +"개 입니다.");
		  
		  byte cat;
		  cat=99;
		  System.out.println("고양이"+cat+"마리");
		  
		  short car;
		  car=10000;
		  System.out.println("자동차가"+car+"대입니다.");
		  
		  short moon;
		  moon=30000;
		  System.out.println(moon);
		  
		  double kor;
		  kor=4.123123123;
		  System.out.println(kor);
		  
		  long japan;
		  japan=9999999999999L;
		  System.out.println(japan);
		  
		  int call;
		  call=210000000;
		  System.out.println("전화가"+call+"통 왔습니다.");
		  
		  char name4='이';
		  char name5='우';
		  char name6='진';
		  String name_ = "이우진";
		  
		  System.out.println("제 이름은"+name_+"입니다.");
		  
		  char colg1='축';
		  char colg2='하';
		  char colg3='합';
		  char colg4='니';
		  char colg5='다';
		  String colg="축하합니다.";
		  System.out.println("정말"+colg);
		  
		  int three;
		  three=3000;
		  System.out.println(three+"만큼 사랑해");
		  
		  double baby;
		  baby=3.1592;
		  System.out.println("작년출산율은"+baby+"명 입니다.");
	
		
		  boolean fine;
		  fine=true;
		  System.out.println("나는 행복하다."+fine);
		  
		  boolean bad;
		  bad=false;
		  System.out.println("나는 불행하다."+bad);
		  
		  short die;
		  die=4321;
		  System.out.println("이번사고로"+die+"명이 숨졌습니다.");
		  
		  int born;
		  born=28654;
		  System.out.println("어제하루"+born+"명이 태어났습니다.");
				  
		  
		  
		  //주민등록번호 입력 > 출력
		  //ex) 950621
		  int jumin = 950621;
		  
		  System.out.println("주민등록번호 : "+jumin);
		  
		  
		  jumin = 030731;
		  System.out.println("주민등록번호 : "+jumin);//->12761(수치를 나타내는 자료형에 0이 앞에 있기때문에 8진수로 처리됨)
		  
		  
		  //자바의 기수법
		  	//-10진수
		  	//-8진수
		  	//-16진수
		  	//-2진수 
		  	System.out.println(10);		//->10진수	(0 ~ 9 - 10개)
		  	System.out.println(010);	//->8진수	(1 ~ 8 - 8개)
		  	System.out.println(0x10); 	//->16진수	(0 ~ F - 16개)
		  	System.out.println(0b10); 	//->2진수	(0 ~ 1 - 2개)
		  
		  
		  //String 클래스 > 모든 클래스의 이름 > 파스칼 표기법
		  String jumin2 = "030731"; // -> 이런 0이 앞에 오는 숫자는 문자열(String)로 변수를 줘야한다 
		  System.out.println(jumin2);
		  
		  
		  //실수 리터럴
		  double d4 = 120000000000.0; //.0을 붙이는 이유 ( 인티저상수로 바뀌기 때문)
		  double d5 = 1.2e+3; //e+3 = 10에 3승을 의미
		  
		  double d6 = 0.012;
		  double d7 = 1.2e-2; //e-2 = 작을땐 - 붙이기
		  
		  System.out.println(d7);
		  System.out.println(d4);
		  System.out.println(d5);
		  System.out.println(d6);
		  
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 ///*** Shift + 방향키 =블럭잡기
		 /// *** Shift + Ctrl + 방향키 =블럭잡기(단어단위)
		/// *** Ctrl + Alt + 방향키 (위,아래 복사붙여넣기)
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
