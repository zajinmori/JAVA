package com.test.java.array;

import java.util.Calendar;

public class Ex26_Calendar {
	public static void main(String[] args) {
		
		
		
		//Ex26_Calendar.java
		
		//달력 만들기
		//1. 해당 년월의 마지막 일
		//2. 해당 년월의 1일의 요일
		
		//int year = 2024;
		//int month = 1;
		
		//printCalendar(year, month);
		
		
//		Calendar now = Calendar.getInstance();
//		printCalendar(now.get(Calendar.YEAR)
//				,now.get(Calendar.MONTH)+1);
		
		//올해 달력
		for(int i=1; i<=12; i++) {
			printCalendar(2024, i);
			System.out.println();
			System.out.println();
		}
		
		
		
	}//main

	
	private static void printCalendar(int year, int month) {
		
		//1. 해당 년월의 마지막 일
		int lastDay = getLastDay(year, month);
		
		//2. 해당 년월의 1일의 요일
		int dayOfWeek = getDayOfWeek(year, month);
		
		
		//준비 끝 달력출력 .
		System.out.println("=====================================================");
		System.out.printf("			%d년 %02d월\n",year,month);
		System.out.println("=====================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		for(int i=0; i<dayOfWeek;i++) {
		System.out.print("\t");}
		
		for(int i=1; i<=lastDay; i++) {//날짜루프
			System.out.printf("%3d\t",i);
			
			//토요일 개행
			//if(i%7==6) {2024년 7월 한정
			if((i+dayOfWeek)%7==0) {
				System.out.println();
			}
		}
		
		
		
	}


	private static int getDayOfWeek(int year, int month) {
		
		
		//서기 1년 1월 1일 ~ 2024년 7월 1일
		
		int date = 1; // 7월1일이라는 뜻
		
		int sum = 0;//누적변수
		
		//서기 1년 1월 1일 ~ 2023년 12월 31일 > 1년 365일
		for(int i=1;i<year; i++) {
			sum+=365;
			
			if(isLeafYear(i)) {
				sum++;//윤년인 애들만 모아서 하루씩 더해주기
				
			}
		}//2023년 12월 31일까지
		
		//2024년 1월 1일 ~ 2024년 6월 30일 > 1달씩
		for(int i=1; i<month; i++) {
			sum+=getLastDay(year, i);
		}
		//2024년 7월 1일 ~ 2024년 7월 1일
		sum+=date;
		
		
		return sum%7;
	}


	private static int getLastDay(int year, int month) {
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28;
		}
		
		return 0;
	}


	private static boolean isLeafYear(int year) {
		
		if(year % 4 ==0) {
			if(year % 100 ==0) {
				if(year % 400 ==0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;//윤년
			}
		}else {
			return false;//평년
		}
		
		
	}

}
