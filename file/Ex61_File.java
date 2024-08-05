package com.test.java.file;

import java.util.Scanner;

public class Ex61_File {// 관리자의 역할(컨트롤만 하는)
	
	public static void main(String[] args) {
		
		
		
		//Ex61_File.java
		//1. 각 클래스의 목적(용도)
		//2. 클래스간의 관계
		//	- 누가 누구를 왜 호출?
		//	- 호출할 때 뭘 넘긴는지?(name, dto ...)
		//	- 호출뒤 뭘 반환하는지?
		
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		ScoreService service = new ScoreService(); //실무 담당자의 역할
		ScoreView view = new ScoreView(); // 출력 담당자 
		
		while(loop) {
			
			//파일 데이터 CRUD
			view.mainMenu();
	
			
			String sel = scan.nextLine();
		
			if(sel.equals("1")) {
				service.add();
				
			}else if(sel.equals("2")) {
				service.get();
				
			}else if(sel.equals("3")) {
				service.edit();
				
			}else if(sel.equals("4")) {
				service.remove();
				
			}else {
				//종료
				loop=false;
			}
			
			
		}
		
		System.out.println("\n프로그램을 종료하겠습니다");
		
		
		
		
	}//main

}//class































