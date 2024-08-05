package com.test.java.file;

import java.util.Scanner;

//업무를 구현하는 클래스
public class ScoreService {
	
	private ScoreDAO dao; //= new ScoreDAO(); // 쓰기 담당자
	private ScoreView view; //= new ScoreView(); // 소제목 출력 담당자
	private Scanner scan; //= new Scanner(System.in); 
	//-> 3개를 한번에 멤버변수로 빼면 계속 안써도 된다. 근데 뒤에 생성자도 따로 빼면

	public ScoreService() {
		this.view = new ScoreView();
		this.dao = new ScoreDAO();
		this.scan = new Scanner(System.in); //좀 더 깔끔하다
	}
	
	
	public void remove() {
		
		view.subTitle("성적 삭제");
		
		System.out.print("학생명 :");
		String name = scan.nextLine();
		
		ScoreDTO dto = dao.get(name);
		
			if (dto != null) {
				
				//성적 삭제
				dao.remove(dto);
				
				
			}else {
				System.out.println("존재하지 않는 학생입니다.");
			}
			
			view.pause();
		
		
		
		
	}

	public void edit() {
		
		//특정 학생의 성적 수정하기
		view.subTitle("성적 수정");
		
		System.out.print("학생명 :");
		String name = scan.nextLine();
		
		ScoreDTO dto = dao.get(name);
		
			if (dto != null) {
			
			System.out.println(dto);
			
			//강아지,88,89,87
			System.out.printf("국어: %d점\n", dto.getKor());
			System.out.print("수정: ");
			int kor = scan.nextInt();
			if (kor != -1) {
				dto.setKor(kor);
			}
			
			System.out.printf("영어: %d점\n", dto.getEng());
			System.out.print("수정: ");
			int eng = scan.nextInt();
			if (eng != -1) {
				dto.setEng(eng);
			}
			
			System.out.printf("수학: %d점\n", dto.getMath());
			System.out.print("수정: ");
			int math = scan.nextInt();
			if (math != -1) {
				dto.setMath(math);
			}
			
			//이곳 > ScoreDTO 
			//System.out.println(dto);
			
			dao.edit(dto);
			
			
		} else {
			System.out.println("학생이 없습니다.");
		}
		
		view.pause();
		
		
		
		
		
			}
		

	public void get() {
		
		//특정 학생의 성적 확인
		
		view.subTitle("성적확인");
		
		System.out.print("학생명 :");
		String name = scan.nextLine();
		
		ScoreDTO dto = dao.get(name);
		
		if(dto != null) {
		System.out.printf("이름: %s\n",dto.getName());
		System.out.printf("국어: %d점\n",dto.getKor());
		System.out.printf("영어: %d점\n",dto.getEng());
		System.out.printf("수학: %d점\n",dto.getMath());
		}else {
			System.out.println("찾을 수 없는 학생입니다.");
		}
		
		view.pause();
	}
	

	public void add() {
		
		ScoreDAO dao = new ScoreDAO(); // 쓰기 담당자
		ScoreView view = new ScoreView(); // 소제목 출력 담당자
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		//성적 추가
		view.subTitle("성적추가");
		
		
		System.out.print("이름 :");
		name = scan.nextLine();
		
		System.out.print("국어 :");
		kor = scan.nextInt();
		
		System.out.print("영어 :");
		eng = scan.nextInt();
		
		System.out.print("수학 :");
		math = scan.nextInt();
		
		scan.skip("\r\n");
		
		//dao.add(name, kor, eng, math); -> 인자의 개수가 2개 이상이면 직접 전달X > 상자(데이터집합)포장 > 상자1개를전달
		
		// -> 상자 역할 클래스의 이름
		// 		-ScoreDTO (Data Transfer Object)
		//		-ScoreVO (Value Object)
		//		-ScoreEntity
		
		//데이터 집합
		// 1. 배열 -> 자료형이 2가지라 탈락
		// 2. 컬렉션 -> List vs Map > List는 배열이랑 똑같아서 탈락 > HashMap<String,Integer> > 귀찮아서 탈락
		// 3. 클래스 -> 당첨 !!!
		
		ScoreDTO dto = new ScoreDTO();
		
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		
		dao.add(dto);
		
		System.out.println("성적추가 완료.");
		
		//잠시 쉬었다 가는 작업
		view.pause();
		
		
	}

}
