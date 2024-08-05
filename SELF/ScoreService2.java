package com.test.java.SELF;

import java.util.Scanner;

public class ScoreService2 {
	
	private ScoreDAO2 dao;
	private ScoreDTO2 dto;
	private Scanner scan;
	
	
	public ScoreService2() {
		
		
		
	}

	public void add() {
		
		ScoreDAO2 dao = new ScoreDAO2();
		ScoreView2 view = new ScoreView2();
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		view.subTitle("성적추가");
		
		System.out.println("이름 :");
		name = scan.nextLine();
		
		System.out.println("국어 :");
		kor = scan.nextInt();
		
		System.out.println("영어 :");
		eng = scan.nextInt();
		
		System.out.println("수학 :");
		math = scan.nextInt();
		
		scan.skip("\r\n");
		
		ScoreDTO2 dto = new ScoreDTO2();
		
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		
		dao.add(dto);
		
		System.out.println("성적추가 완료");
		
		view.pause();
	}

	public void get() {
		// TODO Auto-generated method stub
		
	}

	public void edit() {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}
	

}
