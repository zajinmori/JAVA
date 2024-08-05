package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex19_DateTime {
	
	
	public static void main(String[] args) {
		
		
		//Ex19_DateTime.java
		/*
		 
		 자바의 날짜/시간 자료형
		 1. Date 클래스
		 2. Calendar 클래스
		 ------------------------------------
		 3. java.time 패키지 > 여러 클래스
		 
		 시각
		 시간
		 -> 둘의 자료형이 다르다.
		 
		 2024년 6월 25일 17시 22분 15초 -> 시각
		 8시간 ->시간
		 
		 시각, 시간 > 연산
		 
		 시각 + 시각 : 2024년 6월 25일 17시 22분 15초 + 2024년 7월 10일 10시 10분 20초 -> X 안한다.
		 시각 - 시각 = 시간 : 2024년 7월 10일 10시 10분 20초 - 2024년 6월 25일 17시 22분 15초 -> O 한다
		 
		 시간 + 시간 : 8시간 + 2시간 = 10시간 -> O된다.
		 시간 - 시간 : 8시간 - 2시간 = 6시간 -> O된다.
		 
		 시각 + 시간 = 시각 : 2024년 6월 25일 17시 22분 15초 + 8시간 -> O된다.
		 시각 - 시간 = 시각 : 2024년 6월 25일 17시 22분 15초 - 8시간 -> O된다.
		 
		 
		 
		 
		 */
		
		
	
	//F3, 컨트롤 + 클릭 -커서 가져다 놓고 누르면 바로가기.
	//컨트롤 + 1 =메서드 간단생성
	//m1(); 
	//m2();
	//m3();
	//m4();
	//m5(); //F3, 컨트롤 + 클릭 -커서 가져다 놓고 누르면 바로가기.
	m6();
	//m7();
		
		
		//문자열 > 숫자 바꾸는법
			//-"100" -> 100
				int a = Integer.parseInt("100");
					
			
		//숫자 > 문자열 바꾸는법
			//100 -> "100"
				String b = String.valueOf(100);
		
				//숫자 > 문자열 더 쉽게 바꾸는법
					String c = "" + 100; //""->(빈문자열,Empty String)
		
				
				
		//int a = 10;
		//int b = 5;
		
		System.out.println(a + "+" + b + "=" + a + b);
		//-> 숫자랑 문자열을 +하면 문자열방식으로 값이 나온다. 그러니 산술연산을 하려면 미리 ()를 붙히자.
		
		
		
		
		
		
		
		
		
		System.out.println(10.0 / 3.0);
		System.out.printf("%.1f\n", 10.0 / 3.0);
		
		String result = String.format("%.1f\n", 10.0 / 3.0);
		System.out.println(result);
		
	}//main

	private static void m7() {
		
		
		//연산
		//- 시간 + 시간 = 시간
		//- 시간 - 시간 = 시간
		
		
		//2시간 + 1시간 = 3시간
		int h1 = 2;
		int h2 = 1;
		System.out.println(h1+h2);
		
		
		//2시간 30분 + 10분 = 2시간 40분
		int hour = 2;
		int min = 30;
		
		min += 10;
		System.out.printf("%d시간 %d분\n", hour, min);
		
		
		//2시간 30분 + 40분 = 2시간 70분 = 3시간 10분
		int hour2 = 2;
		int min2 =30;
		
		min2 += 40;
		
		//자리올림
		hour2 = hour2 + (min2 / 60);
		min2 = min2 % 60;
		
		System.out.printf("%d시간 %d분\n", hour2, min2);
		
	}

	private static void m6() {
		
		//연산
		//시각 - 시각 = 시간 / 자바는 1970.01.01을 기준점으로 잡아서 -를 한다.
		
		//예제) 내가 태어나서 살아온 시간 ?
		//		개강일 ~ 종강일 > 며칠 ?
		//		올해 크리스마스 며칠 남았는지 ?
		
		
		//예제) 내가 태어나서 살아온 시간 ?
		Calendar now = Calendar.getInstance(); //현재
		Calendar birthday = Calendar.getInstance();	//생일
		birthday.set(1995, 6, 10); //1995년 7월 10일
		
		//System.out.println(now - birthday); //산술연산자( - )는 무조건 숫자여야한다. 그래서 이러면 안됨
		
		//2024년 6월 26일 - 1995년 7월 10일
		
		System.out.println(birthday.getTimeInMillis());
		System.out.println(now.getTimeInMillis());
		
		long gap = now.getTimeInMillis() - birthday.getTimeInMillis(); // 위에 둘을 빼면 
		
		System.out.printf("살아온 시e간 : %,d시간\n", gap / 1000 / 60 / 60); //시간으로 바꾸려면 뒤에 나누기를 해준다
		System.out.printf("살아온 시간 : %,d일\n", gap / 1000 / 60 / 60 / 24);// 살아온 일.
		
		
		
		//수료일까지 며칠 남았는지 ?
		Calendar end =Calendar.getInstance();
		end.set(2024, 11, 2);
		System.out.printf("남은 수업일 수 : %d일\n", (end.getTimeInMillis() - now.getTimeInMillis())/1000/60/60/24);
		
		//오늘 집에 가려면 몇시간 ?
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, 17);
		out.set(Calendar.MINUTE, 50);
		out.set(Calendar.SECOND, 0);
		
		System.out.printf("남은시간 : %.1f시간\n" , (out.getTimeInMillis()-now.getTimeInMillis())/1000.0/60/60);
		
		//out.getTimeInMillis() : Epoch Time, Tick
		
		
		
	}

	private static void m5() {
		
		//연산
		// - 시각 + 시간 = 시각
		// - 시각 - 시간 = 시각
		
		//오늘 만난 커플 > 100일이 언젠지? -> 시각 + 시간
		
		Calendar now = Calendar.getInstance(); //오늘
		
//		System.out.printf("1일차 : %tF\n",now);
//		
//		now.add(Calendar.DATE, 99); //100일 -> now는 100일뒤가 됐다(덮어쓰기) (내일부터1일로 치기때문에 -1을해서 한다)
//
//		System.out.printf("100일차 : %tF\n",now);
		
		
		//now.add(Calendar.YEAR, 20);
		//System.out.printf("%tF %tT\n", now, now); //2044-06-26 11:04:31 년도에 20 더한거(년월일시분초 다 가능하다) 
		
		
		
		now.add(Calendar.DATE, -7); // -7은 음수이기 때문에 빼는거다. 똑같이 년월일시분초 다 가능하다.
		System.out.printf("%tF %tT\n", now, now);
		
		
		
	}

	private static void m4() {
		
		Calendar now = Calendar.getInstance();
		
		//내가 원하는 부분만 추출하는법
		//-int get(int) int자료형을 썼기 때문에 무조건 숫자로 돌려줌. (요일이나 AM,PM도 숫자로 나옴)
		
		System.out.println(now.get(1)); //1은 연도를 뜻하기 때문에 년도가 실행됨
		System.out.println(now.get(Calendar.YEAR)); //2024. 년 1을 외우기 힘들기 때문에 이렇게 하면 바로 년도가 실행됨.
		System.out.println(now.get(Calendar.MONTH));//5, 월 (0~11이기 때문에 6월=5)
		System.out.println(now.get(Calendar.DATE));//26, 일
		System.out.println(now.get(Calendar.HOUR));//9, 시(12시간표기법)
		System.out.println(now.get(Calendar.HOUR_OF_DAY));//9, 시(24시간표기법)
		System.out.println(now.get(Calendar.MINUTE));//49, 분
		System.out.println(now.get(Calendar.SECOND));//5, 초
		System.out.println(now.get(Calendar.MILLISECOND));//101, 밀리초
		System.out.println(now.get(Calendar.AM_PM));//0, 오전(0) 오후(1)
		System.out.println(now.get(Calendar.DAY_OF_YEAR));//178, 올해들어 며칠인지
		System.out.println(now.get(Calendar.DAY_OF_MONTH));//26, 이번달들어 며칠인지
		System.out.println(now.get(Calendar.DAY_OF_WEEK));//4, 이번주들어 며칠인지 == 요일  1(일요일) ~ 7(토요일)
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));//26, 올해들어 몇주차인지
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));//5, 이번달들어 몇주째인지
		
		//-----------------------------------------------------get메서드의 예제
		//예제)요구사항]"오늘은 2024년 6월 26일입니다." 출력
			//System.out.println("오늘은 2024년 6월 26일입니다."); -> X 바보같은짓
			System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
					, now.get(Calendar.YEAR)
					, now.get(Calendar.MONTH)+1
					, now.get(Calendar.DATE));

		//예제)요구사항] "오늘은 2024년 06월 26일입니다."
			System.out.printf("오늘은 %d년 %s월 %d일입니다.\n"
					, now.get(Calendar.YEAR)
					, now.get(Calendar.MONTH)+1 < 10 ? "0" + (now.get(Calendar.MONTH)+1) : now.get(Calendar.MONTH)+1 + ""
					, now.get(Calendar.DATE));
			
		//예제)요구사항] "오늘은 2024년 06월 26일입니다."	더 쉬운 방법 !!!!!(addZero 메서드를 생성한다)
			System.out.printf("오늘은 %d년 %s월 %s일입니다.\n"
					, now.get(Calendar.YEAR)
					, addZero(now.get(Calendar.MONTH)+1)
					, addZero(now.get(Calendar.DATE)));
			
		//예제)요구사항] "오늘은 2024년 06월 26일입니다."  더 더 편한 방법 !!!! (%d에 자릿수02를 붙힌다)
			System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n"
					, now.get(Calendar.YEAR)
					, now.get(Calendar.MONTH)+1
					, now.get(Calendar.DATE));
			
			
			
			//printf, String.format
			// - 날짜/시간 형식 문자
			System.out.printf("%tF\n", now); //2024-06-26. 년 월 일을 찍을때 제일 쉬운법 (%tF)
			System.out.printf("%tT\n", now); //10:40:30. 시 분 초 (%tT)
			System.out.printf("%tA\n", now); //수요일. 요일 (%tA)
			
			
	}

	private static String addZero(int i) {
		
		String result = i < 10 ? "0" + i : "" + i;
		
		return result;
	}

	private static void m3() {
		
		//메서드명의 패턴
		//- get???() : getter. 읽기작업할때 씀 (호출하는 입장에서 만들었기 때문에 뭔가를 get한다 -> 가져온다)
			//ex) getName, getAge, getNumber
		//- set???() : setter. 쓰기작업할때 씀 (뭔가를 쓸때)
			//ex) setName("홍길동"), setAge(20) <- ()안에 인자값을 넣어야함
		//- is???()	 : 확인할때 씀. 보통 boolean 자료형을 씀. 반환값을 줌 (뭔가를 확인할 때)
			//ex) isNumeric("10") -> ()안에가 숫자면 참, 문자면 거짓 처럼 true, falce를 반환함
		
		
		//Calendar 클래스
		//1. int get(int)
		//2. void set(값)
		
		//현재 시각
				Calendar now = Calendar.getInstance();
				
		//예제) 특정 시각(날짜)를 생성하기
				//- 현재 시각 > 값 수정 > 원하는 시각
				Calendar christmas = Calendar.getInstance(); //2024-06-26
				
			//final int YEAR = 1;
			System.out.println(Calendar.YEAR); //캘린더 상수이다. ->  final int YEAR = 1; 같은거다
				
			
				
				//christmas.set(year, 2025); 연도를 바꾸고 싶다.
					//-> 밑에 식으로 하면 수정 작업(년도)을 할 수 있다
//						christmas.set(Calendar.YEAR, 2024);
//						
//						christmas.set(Calendar.MONTH, 12);
//						christmas.set(Calendar.DATE, 25);
//						christmas.set(Calendar.HOUR, 6);
//						christmas.set(Calendar.MINUTE, 0);
//					
//						System.out.println(christmas);
//		
		
			
			//christmas.set(2024, 12, 25); 인티제 3개를 쓰면서 오버로딩이다 
			christmas.set(2024, 12, 25, 12, 45, 25); //이런식으로 초단위까지 가능하다.
			System.out.println(christmas);
		
		
	}

	private static void m2() {
		
		//현재 시각 얻어오기 1
		Calendar now = Calendar.getInstance(); //Date보다 상세한 시각을 가져온다.
		
		System.out.println(now);
		
	}

	private static void m1() {
		
		//현재 시각을 얻어오기 2
		Date now = new Date(); //현재시간이 오는 코드. 컴퓨터 메인보드의 시계에서 가져온다. 100% 완벽하진 않다.
		System.out.println(now);
		
		
	}

	
	
}
