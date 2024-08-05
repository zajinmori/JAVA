package com.test.java.SELF;

import java.util.Scanner;

public class file {
	
	public static void main(String[] args) {
		
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		ScoreService2 service = new ScoreService2();
		ScoreView2 view = new ScoreView2();
		
		while(loop) {
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
				loop=false;
			}
			
			
			
		}
		System.out.println("프로그램 종료");
		
	}

}
