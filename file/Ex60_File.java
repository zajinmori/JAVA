package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex60_File {
	
	public static void main(String[] args) {
		
		
		//Ex60_file.java
		
		/*
		 
		 1. 파일 / 디렉토리(폴더) 조작
		 	- 윈도우 탐색기로 하는 행동 > 자바로 구현
		 	- 파일/디렉토리 정보 열람
		 	- 생성, 수정, 삭제, 이동 등등 
		 
		 
		!!!! 2. 파일 입출력
		 		a. 텍스트 입출력 > 우리가 할 거 !!
		 			- 메모장
		 			- 이클립스
		 			
		 		b. 비텍스트 입출력(바이너리 입출력)
		 			- 동영상
		 			- 이미지
		 			- 음성
		 	
		 	
		 	파일 입출력
		 	- 자바 프로그램 -> (데이터) -> 보조기억장치(HDD,SSD,USB)
		 	-      	->		->		->		->		: 쓰기(저장)
		 	-     	<-		<-		<-		<-		: 읽기
		 
		 	
		 
			저장 장치
				- 데이터 > 1, 0으로 저장
				- 저장 장치라는 환경 > 자료형x
				
				
				인코딩, Encoding
				- 문자 코드 (응용 프로그램(자바)의 데이터)를 부호화(0, 1)를 시키는 작업
				 	ex) 자바("홍길동") > 텍스트파일(1000110101010)
				
				디코딩, Decoding
				- 부호 데이터를 문자 코드로 변환 하는 작업
					ex)텍스트파일(1000110101010) > 자바("홍길동")

		 
		 	인코딩 / 디코딩 규칙
		 	- 저장 장치 or 네트워크에서 데이트를 표현하는 규칙
		 
		 	문자 인코딩 방식	
		 		1. ANSI
		 		2. UTF(Unicode)
		 			2-1. UTF-8
		 			2-2. UTF-16
		 		3. ISO-8859-1
		 		4. EUC-KR
		 		5. MS949
		 		
		 		
		 		ANSI, ISO-8859-1, EUC-KR, MS949
		 		- 영어,숫자,특수문자 등 : 1byte
		 		- 한글,한자,일어 등 : 2byte
		 		
		 		UTF-8 (전 세계 표준) -> 자바, 오라클 사용
		 		- 영어,숫자,특수문자 등 : 1byte
		 		- 한글,한자,일어 등 : 3byte
		 		
		 		UTF-16
		 		- 영어,숫자,특수문자 등 : 2byte
		 		- 한글,한자,일어 등 : 2byte
		 		
		 		
		 		
		 		
		 		
		 		
		 
		 		
		 		
		 		영문자 + 숫자 + 특수문자 > 1byte(256) > ASCII
		 		문자 코드값 > 숫자
		 		char c; = 2byte(Unicode)(65536)
		 		
		 		
		 
		
		 */
		
		//m1(); //파일 쓰기 스트림의 이해
		//m2();//파일 읽기
		//m3();// 편리한 파일 쓰기 방법
		//m4(); // 쓰기 기능만 있는 콘솔버전 메모장 만들어보기
		//m5(); //파일 읽기의 또 다른 방법
		//m6(); //BufferedWriter의 사용법
		//m7(); //BufferedReader의 사용법
		//m8(); //읽기 기능만 있는 콘솔버전 메모장 만들어보기
		m9(); // 파일 읽기로 성적표 만들어보기
		
		
		
		
	}//main

	private static void m9() {
		
		//성적관리
		// - 성적표 출력
		// - 성적 데이터 파일(score.txt)
		
		
		//score.txt 구조 설계
		// - 학생명, 국어, 영어, 수학 X n명
		// CSV : 쉼표를 구분자로해서 데이터를 구분하는 방법 (확장자로 만들어서 저장하면 엑셀로 저장이 된다)
		
		
		File file = new File("dat\\score.txt"); //자바 프로젝트 안에다가 폴더를 만들면 경로를 줄일수가있다 -> 상대경로
		
		if(file.exists()) {
			
			System.out.println("================================================");
			System.out.println("                     성적표");
			System.out.println("================================================");
			
			System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
			
			
			
			try {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				
				String line = null;
				
				while((line = reader.readLine())!=null) {
//					System.out.println(line); //학생 1명의 정보
					
					//홍길동,100,90,80
					
					String[] temp = line.split(",");
					
					String name = temp[0];
					int kor = Integer.parseInt(temp[1]);
					int eng = Integer.parseInt(temp[2]);
					int math = Integer.parseInt(temp[3]);
					
					int total = kor + eng + math;
					double avg = total/3.0;
					
					System.out.printf("%s\t%4d\t%4d\t%4d\t%4d\t%4.1f\n",name,kor,eng,math,total,avg);
					
					
					
				}
			
				
				reader.close();
				
			} catch (Exception e) {
				System.out.println("Ex60_file.m9");
				e.printStackTrace();
			}
			
			
			
			
		}else {
			System.out.println("성적 파일이 없습니다.");
		}
		
		
		
		
	}

	private static void m8() {
		
		
		//콘솔 메모장 ( 읽기 버전)
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("자바 파일명 : ");// Ex01.java
			
			String filename = scan.nextLine();
			
			String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java" + filename;
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1; //줄번호
					
					while((line = reader.readLine())!=null) {
						
						System.out.printf("%3d: %s\n",number, line);
						
					}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m8");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m7() {
		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\메모장.txt"));
			
			//한글자씩 읽고 싶을 때
//			int code = reader.read();
//			
//			System.out.println((char)code);
			
			//한문장씩 읽고 싶을 때 **** -> String
			String line = reader.readLine();
//			System.out.println(line);
//			
//			line = reader.readLine();
//			System.out.println(line);
//			
//			line = reader.readLine();
//			System.out.println(line);//= null 읽을게 없을 때 
			
//			reader.close();
			
			//다시 처음부터 읽으려면 ... 스트림을 닫고 새로 생성해야 한다.
			// BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\메모장.txt"));
			
			
			
			// for문으로 돌려보기
			
			line = null;
			
			while((line = reader.readLine())!=null) {
				
				System.out.println(line);
				
			}
			
			reader.close();
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m7");
			e.printStackTrace();
		}
		
		
		
		
		
	}

	private static void m6() {
		
		
		//java.io 패키지에 있음
		//FileOutputStream > FileWriter(***) > BufferedWriter(***) 두개중 아무거나 써도됨 
		//FileInputStream > FileReader> BufferedReader(거의 이걸 쓴다)
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\메모장.txt"));
			
			writer.write(65);
			writer.write('A');
			writer.write("안녕!");
			writer.newLine(); // = writer.write("\r\n"); 엔터
			writer.write("하세요!");
			
			writer.close();
			
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m6");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m5() {


		try {
			//조금 편리한 파일 읽기 방법
			//FileInputStream > FileReader
			// 1. 문자 단위 읽기(2byte)
			// 2. 문자열XX
			// 3. 한글이 읽힌다는 장점 ..
			
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\메모장.txt");
			
			int code = -1;
			while((code = reader.read())!=-1){
				System.out.println((char)code);
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m5");
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		
		// 콘솔 메모장 ~!~!!!
		
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("저장할 파일명 : ");
			String filename = scan.nextLine();
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\"+filename);
			
			//내용 입력
			boolean loop = true;
			
			while(loop) {
				
				System.out.println("입력 : ");
				String line = scan.nextLine();
				
				if(line.equals("q!")) {
					break;
				}
				
				writer.write(line); //한줄 입력 > 파일에 쓰기
				writer.write("\r\n");
				
				
			}
			
			writer.close();
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m4");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		try {
			
			//파일 쓰기
			// - FileOutputStream > FileWriter
			//	1. 문자 단위 쓰기(2byte)
			// 	2. 문자열 쓰기
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt",true);// true = 이어쓰기
			writer.write('가');
			writer.write('나');
			writer.write('다');
			
			writer.write("\r\n");
			
			writer.write("홍길동");
			
			writer.close();
			
			System.out.println("종료");
			
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		
		try {
			
			
			//파일 읽기(입력)
			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\file\\test.txt");
			
			
			
			// ******중요 로직******* 기억하기
			
			int code = -1;
			
			while((code = stream.read())!= -1){// -1은 없다는 뜻이니까 -1이 아닐때 까지 출력한다
				
			
					System.out.print((char)code);
				
			}
			
			stream.close();
			
			
			
			
			
			
			
			
			
			
			
			
//			int c = stream.read();
//			System.out.println((char)c); // H -> 첫번째글자
//			
//			c = stream.read();
//			System.out.println((char)c);// e
//			
//			c = stream.read();
//			System.out.println((char)c);// l
//			
//			c = stream.read();
//			System.out.println((char)c);// l
//
//			c = stream.read();
//			System.out.println((char)c);// o
//			
//			c = stream.read();
//			System.out.println((char)c);//  
//			
//			c = stream.read();
//			System.out.println((char)c);// W
//			
//			c = stream.read();
//			System.out.println((char)c);// o
//			
//			c = stream.read();
//			System.out.println((char)c);// r
//			
//			c = stream.read();
//			System.out.println((char)c);// l
//			
//			c = stream.read();
//			System.out.println((char)c);// d
//			
//			c = stream.read();
//			System.out.println((char)c);//  
//			
//			c = stream.read();
//			System.out.println((char)c);// !
//			
//			c = stream.read();
//			System.out.println(c);// -1 : 더이상 문자가 없을 때
			
			
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m2");
			e.printStackTrace();
		}
	
		
		
	}

	private static void m1() {
		
	//파일 쓰기(출력)
		
		try {
			
			//텍스트 파일 참조 객체
			File file = new File("C:\\class\\code\\java\\file\\test.txt");
			
			//파일 객체 > 출력스트림(Stream)(자바->파일) 생성
			//출력 스트림 모드
			//	1. Create Mode -> 기본값
			//		a. 파일이 없으면 자동으로 생성된다.
			//		b. 파일이 있으면! 덮어쓰기(새로쓰기)를 한다.
			//	2. Append Mode
			//		a. 파일이 있으면! 이어쓰기를 한다.
			//		b. 파일이 없으면 자동으로 생성된다.
//			FileOutputStream stream = new FileOutputStream(file); //스트림 열기 (빨대꽂기)
			// -> Create Mode
			
			FileOutputStream stream = new FileOutputStream(file,true);
			// -> Append Mode
			
			
			//FileOutputStream
			// - 바이트 단위 쓰기 지원(1 byte) -> 오로지 영어만 가능/ 한글은 불가능에 가깝다
			
			
			//쓰기
//			char c = 'L';
//			stream.write(c); // test.txt에 'A'를 적어라 라는 뜻
//			stream.write('W');
//			stream.write('J');
//			
//			stream.close(); //스트림 닫기 -> 꼭 해야함***(안닫으면 파일 저장이 안된다)
			
			
			String line = "Hello World !";
			
			for(int i=0; i<line.length(); i++) {
				char c = line.charAt(i);
				stream.write(c);
			}// 문자열을 쓰고 싶을 떄..
					
				
			
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("Ex60_file.m1");
			e.printStackTrace();
		}
		
		
	}

}//class
