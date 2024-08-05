package com.test.java.file;

import java.util.Scanner;

//출력을 담당하는 클래스
public class ScoreView {

	
	public void mainMenu() {
		
		//파일 데이터 CRUD(아래의 행동)
		System.out.println("===============");
		System.out.println("     성적관리");
		System.out.println("===============");
		System.out.println("1.성적추가"); //Create
		System.out.println("2.성적확인"); //Read (데이터가져오기의 행위이기 때문)
		System.out.println("3.성적수정"); //Update
		System.out.println("4.성적삭제"); //Delete
		System.out.println("5.종료");
		System.out.println("--------------");
		System.out.println("선택(번호): ");
		
	}
	
	
	
	public void subTitle(String title) {
		System.out.println();
		System.out.println("🎈" + title + "🎈");
		
	}


	public void pause() {
		
		System.out.println();
		System.out.print("계속 진행하려면 엔터를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine(); //잠시 멈추기
		System.out.println();
		
	
	}
	
}
