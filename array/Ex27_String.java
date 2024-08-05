package com.test.java.array;

import java.util.Scanner;

public class Ex27_String {
public static void main(String[] args) {
	
	//Ex27_String.java
	
	//문자열, String
	//- String 클래스에서 문자열 조작에 관련 기능을 제공한다
	
	//m1(); .length 의 이해
	//m2(); 문자열 추출
	//m3(); .charAt() 사용법
	//m4(); .trim() 사용법
	//m5(); .indexOf 사용법
	//m6(); 금지어 설정방법
	//m7(); String toUpperCase() : 대소문자 구분하는 법
	//m8(); .startsWith() : 시작하는 글자, 끝나는 글자 검색하기
	//m9(); .substring() : 문자열 추출하기. 
	//m10();.contains : 문자를 찾아서 있는지 없는지만 확인하기
	//m11();//.replace() : 특정 글자나 단어를 바꿀 수 있다.
	//m12();//.split() : 특정 문장을 분리 시킬 수 있다.
	
	
	
	}//main

private static void m12() {
	
	//문자열 분리
	//-String[] split(String delimiter) 리턴값이 배열이다
	
	String txt = "홍길동,아무개,강아지,고양이,병아리";
	
	String[] list = txt.split(","); // ,(구분자)는 사라진다
	
	for(int i=0; i<list.length; i++) { //.length > 몇번째인지 세기 힘드니까 이걸 쓰면 간단하다
		System.out.println("이름: " + list[i]);
	}
	
	
	
	
	
	
}

private static void m11() {
	
	//문자열 치환(바꾸기)
	//- String replace(char old, char new)
	//- String replace(String old, String new)
	
	String txt = "안녕하세요. 홍길동님. 홍길동님. 홍길동님.";
			
	System.out.println(txt.replace("홍길동", "아무개")); // 왼쪽이 옛날거(홍길동), 오른쪽이 새로 바꿀거(아무개) 대상이 몇개든 전부 바꿔준다.
	
	String content = "게시판 글쓰기입니다. 바보야 !!";
	String stop = "바보";

	System.out.println(content.replace(stop, "**")); //masking처리라고 한다.
	
	
	txt = "    하나    둘    셋    ";		
	System.out.println(txt.trim()); // 앞 뒤 필요없는 공백 지울 때.
	System.out.println(txt.replace(" ", "")); // 공백을 전부 삭제 해버릴때. 즉, ""이걸 넣으면 삭제라는 의미가 된다.
	
	
	 txt = "홍 길동";
	 System.out.println(txt.length()); // 4글자 > 12바이트
	 System.out.println(txt.replace(" ", "").length()); // 3글자 > 9바이트
	
}

private static void m10() {
	
	
	//문자열 검색
	//- indexOf(), lastIndexOf()
	//- boolean contains(String s) -> 있다 없다만 알려줌 
	
	String txt = "안녕하세요. 홍길동님.";
	
	if(txt.indexOf("홍길동") > -1) { // -1은 없을때
		System.out.println("O");
	}else {
		System.out.println("X");
	}
	
	
	
	if(txt.contains("홍길동")) { // 찾아서 있는지 없는지만 확인할땐 .contains가 편리하다.
		System.out.println("O");
	}else {
		System.out.println("X");
	}
	
}

private static void m9() {
	
	//문자열 추출
	//- char charAt(int) : 한글자만 추출
	//- String substring(int beginIndex, int beginIndex) : 한글자 이상 가능(범위를 지정해서 사용)(사용성 높음)
	//- Stirng substring(int beginIndex)
	//- beginIndex : 포함(Inclusive)
	//- endIndex : 미포함(Exclusive)
	
	
	//			  0 1 2 3 4 5 6 7 8 9 10111213
	String txt = "가나다라마바사아자차카타파하";
	
	System.out.println(txt.substring(3, 8));//"라 마 바 사 아" 출력. 즉, 3번째부터 8번째까지 출력하라는 메서드(.substring)
	System.out.println(txt.substring(8));// "자차카타파하" 출력. 8번째부터 끝까지 출력
	System.out.println(txt.substring(5,6));// "바" 출력. 한글자만 추출하고 싶을때.
			char num2 = 'A';
			System.out.println((int)num2);	//문자코드값 추출
			
			//String num = "A"
			//System.out.println((int)num); // 값형과 참조형간의 형변환 불가 사례. 참조형은 hip메모리에 생긴다. 암튼 String은 절때 절때 형변환 할 수 없다.
	
			
			
			String jumin = "970702-1234567";
			
			//성별 ?
			System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자"); //charAt 활용
			
			System.out.println(jumin.substring(7,8).equals("1") ? "남자" : "여자"); //substring 활용
			
			//몇년생 ?
			System.out.println(""+jumin.charAt(0) + jumin.charAt(1)); // 112 출력. 즉, +연산자가 문자코드값을 더했기때문. 앞에다가 ""를 붙히면 문자열로 더해버린다. 근데 이건 안좋은 방법
			
			System.out.println(jumin.substring(0,2)); //97. 깔끔하게 출력.
			
			//몇월생 ?
			System.out.println(jumin.substring(2,4)); // 07. 깔끔 
			
			//몇일생 ?
			System.out.println(jumin.substring(4,6)); // 02. 꺨끔
			System.out.println();
			
			
			
			//파일 경로
			String path = "C:\\class\\code\\java\\Hello.java"; // '\\' 이건 한글자이다.
			
			//요구사항 1 : 파일명 추출 > Hello.java
			int index = path.lastIndexOf("\\"); //.lastIndexOf 끝에서 부터 찾는다
			System.out.println(index);
			String filename = path.substring(index + 1);
			System.out.println("파일명: " + filename);
			
			//요구사항 1 : 확장자 없는 순수 파일명 추출 > Hello
			index = filename.lastIndexOf("."); // 파일 이름 자체에도 . 을 쓸수 있다 그럼 확장자를 구분짓는 .을 걸러내기엔 어렵다 그래서 lastIndexOf를 해야한다
			
			String filenameWithoutExtension=filename.substring(0, index);
			System.out.println("순수 파일명: "+filenameWithoutExtension);
			
			//요구사항 1 : 확장자 추출 > .java
			String extension = filename.substring(index);
			System.out.println("확장자 :" + extension);
			
}

private static void m8() {
	
	
	//문자열 패턴 검색
	//-boolean startsWith(String word)
	//-boolean endsWith(String word)
	
	
	String name = "홍길동";
	
	//'홍'씨? > boolean
	
	System.out.println(name.charAt(0)=='홍'); //첫번째 방법
	System.out.println(name.indexOf('홍')==0); // 두번째 방법
	System.out.println(name.startsWith("홍")); // 마지막 방법 (제일 좋음)
	System.out.println();
	
	
	//'동'으로 끝나?
	
	System.out.println(name.charAt(name.length()-1)=='동'); //첫번째 방법
	System.out.println(name.indexOf('동')==name.length()-1);//두번째 방법
	System.out.println(name.endsWith("동"));//마지막 방법 (역시 제일 좋음)
	System.out.println();
	
	//예제) 자원 경로
	String path = "C:\\class\\code\\java\\Hello.java";
	
	//위의 자원이 자바 소스 파일인가 ? > 확장자.java (확장자 검사해라 !)
	
	if(path.toLowerCase().endsWith(".java")) {//전부 소문자 걸고 마지막에.java를 검색한것
		System.out.println("O");
	}else {
		System.out.println("X");
	}
	
	
	
	
	
}

private static void m7() {
	
	//문자열 대소문자 변경
	//- String toUpperCase() 전부 대문자로 바꾸기
	//- String toLowerCase() 전부 소문자로 바꾸기 
	//- 비교, 검색할때 많이씀 ex)메모장에서 대소문자 구분해서 검색 등등

	
	String txt = "오늘은 Java를 공부하는 시간입니다.";
	
	
	//System.out.println(txt.toUpperCase());
	//System.out.println(txt.toLowerCase());
	
	String word = "java"; //검색어
	if(txt.indexOf(word)> -1) { // -1은 없을경우 반환 / 0은 같을경우 반환 / 1은 있을경우 반환
		System.out.println("검색결과 o");
		
	}else {
		System.out.println("검색결과 x");
	}//대소문자 구분(Case sensitive)
	//- 정확도 높음
	//- 검색률 낮음
	
	

	if(txt.toLowerCase().indexOf(word.toLowerCase())> -1) {//.메서드().메서드() : 메서드 체인
		System.out.println("검색결과 o");
		
	}else {
		System.out.println("검색결과 x");
	}//대소문자 구분x(case insensitive)
	// - 검색률 높음
	// - 정확도 낮음
	
	
	
	
	
	
}

private static void m6() {

	//요구사항) 게시판 글쓰기 > 금지어 !!
	String stop = "바보"; // 금지어
	
	String content = "안녕하세요. 바보야. 저는 홍길동입니다.";
	
	if(content.indexOf(stop) > -1) {
		System.out.println("금지어 쓰지마세요!!");
	}else {
		System.out.println("글쓰기 진행");
	}
	
	
	content = "안녕하세요.  저는 홍길동입니다.";
	
	String[] stops = {"바보", "멍청이", "메롱","ㅂㅏ보"};
	
	for(int i=0; i<stops.length;i++) {
		if(content.indexOf(stops[i])> -1) {
			System.out.println("금지어 !!");
			break;
		} 
			
		
	}
	System.out.println("종료");//여러개의 금지어 설정하는법
	
	
	
	
	
	
	
	
	
}

private static void m5() {
	
	//문자열 검색(*****)
	//- 문자열 내에서 원하는 문자(열)을 검색 > 발견된 위치(index) 반환
	// - int indexOf(char c)
	// - int indexOf(String c)
	// - int indexOf(char c, int b)
	// - int indexOf(String c, int b)
	
	String txt = "안녕하세요. 홍길동입니다.";
	System.out.println(txt.indexOf('홍')); // =7 홍이 7번째 글자이다.
	System.out.println(txt.indexOf("홍길동"));// =7 첫번째(시작위치)만 알려준다 
	System.out.println(txt.indexOf('김')); // = -1 0보다 하나작은값(못찾았다는 뜻) 
	System.out.println();
	
	
	txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
	
	System.out.println(txt.indexOf("홍길동")); //7
	System.out.println(txt.indexOf("홍길동")); //7 무조건 처음 홍길동만 찾아준다.
	
	System.out.println(txt.indexOf("홍길동",10));// =22 10이 뜻하는건 10번째 글자부터 검색해라라는뜻. 두번째 홍길동을 찾았다.
	System.out.println(txt.indexOf("홍길동",25));// =38 25도 마찬가지 세번째 홍길동을 찾은거다
												// 10,25 상수를 쓰는건 글자가 추가되면 말짱도루묵이다..
	
	System.out.println(txt.indexOf("홍길동",10));
	System.out.println(txt.indexOf("홍길동",25));
	
	int index = -1; //-1은 고정이다
	index = txt.indexOf("홍길동"); //7 첫번째 홍길동
	System.out.println(index);
	
	//index+= 3; 이런식으로 하면 한번에 가능.
	
	index = txt.indexOf("홍길동", index + 3);//22 3은 홍길동 세글자여서 3이다 두번째 홍길동
	System.out.println(index);
	
	index = txt.indexOf("홍길동", index + 3);//38	세번째 홍길동
	System.out.println(index);
	System.out.println();
	
	
	
	txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
	
		// - int lastindexOf(char c)
		// - int lastindexOf(String c)
		// - int lastindexOf(char c, int b)
		// - int lastindexOf(String c, int b)
	
		System.out.println(txt.lastIndexOf("홍길동"));// =38 세번째 홍길동 즉, 끝에서부터 시작점으로 검색한다.
		System.out.println(txt.lastIndexOf("홍길동", 37));
		System.out.println(txt.lastIndexOf("홍길동", 21));
	
	
}

private static void m4() {
	
	//문자열 공백 제거
	//- String trim()
	//- 문자열의 시작과 끝에 있는 공백 문자(Whitespace > 스페이스, 탭, 개행)를 제거한다.

	
	String txt = "     하나     둘     셋     ";
	System.out.printf("[%s]\n",txt);//[%s] 공백을 잘 보기 위한조치
	System.out.printf("[%s]", txt.trim());
	
	
	
	
}

private static void m3() {
	//요구사항) 주민등록번호 입력
	//ex)950701-1234567
	//.charAt() 사용
	
	Scanner scan = new Scanner(System.in);
	System.out.println("주민등록번호('-'필수) :");
	String jumin = scan.nextLine();
	
	if(jumin.charAt(6)=='-') {// - 을 안넣으면 안되게 만드는 법
		System.out.println("올바른 주민등록번호");
	}else {
		System.out.println("잘못된 주민등록번호");
	}
	
	
}

private static void m2() {
	
	
	//문자열 추출
	//- char charAt(int index)
	//- 원하는 위치의 문자를 추출
	//- 0부터시작 (zero-based index)
	//- 스페이스바도 한글자다.
	String txt = "안녕하세요. 홍길동님.";
	char c = txt.charAt(txt.length()-1);//글자가 추가되어도 고정할수있는 방법
	System.out.println(c);
	
	
	
	
	
	
	
}

private static void m1() {
	
	//문자열 생성하기
	//1. 리터럴
	//2. 객체 생성
	
	String str1 = "홍길동";
	// 			= 같은 말이다.
	String str2 = new String("홍길동");
	
	//문자열 == 문자의 집합
	//String = char[]
	
	//문자열 길이
	
	//int length() : 문자의 개수
	String txt = "홍길동님";
	System.out.println(txt.length()); //nums.length(배열에선 렝스가 변수이다)
	System.out.println("자바".length());
	System.out.println("한글ABC123!@#".length());//한글 영어 등 상관없이 무조건 한글자이다
	
	//요구사항) 사용자 입력 > 문자수?
	Scanner scan = new Scanner(System.in);
//	System.out.println("문자 입력 :");
//	String statement = scan.nextLine();
//	
//	System.out.printf("%s > %d문자\n",statement,statement.length());
	
	//요구사항) 이름입력
	//- 2자 ~ 5자 이내
	
	System.out.print("이름 :");
	String name = scan.nextLine();
	if(name.length() >=2 && name.length()<=5) {
		System.out.println("올바른 이름");
	}else {
		System.out.println("이름을 2자에서 5자 이내로 입력하세요.");
	}
	
	
	
	
	}//m1
}
