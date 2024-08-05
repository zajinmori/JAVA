package com.test.java.SELF;

import java.util.Scanner;

public class ScoreView2 {

	public void mainMenu() {
		
		System.out.println("==============");
		System.out.println("		성적관리");
		System.out.println("==============");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적확인");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 종료");
		System.out.println("--------------");
		System.out.println("선택(번호) : ");
	}
	
	public void subTitle(String title) {
		System.out.println();
		System.out.println("❤️"+ title+"❤️");
	}
	
	public void pause() {
		
		System.out.println();
		System.out.println("계속 진행은 엔터를 누르세요");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		System.out.println();
		
	}
	

}
