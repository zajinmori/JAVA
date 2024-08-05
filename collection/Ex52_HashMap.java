package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Ex52_HashMap {
	
	public static void main(String[] args) {
		
		//Ex52_HashMap.java
		/*
		 
		 
		 ***많이 쓰는 컬렉션***
		List : ArrayList
		Map : HashMap 
		
		 
		 
		ArrayList와 HashMap의 차이점.
		 
		 ArrayList
		 - 요소(방) 접근 > 첨자(index) 사용 > 방번호 사용
		 - 순서(방번호)가 있는 집합 
		 ex) 1강의실, 2강의실, 3강의실 -> 순서가 있다
		 -> '스칼라 배열' 이라고 표현한다.
		 		ex) 첨자(index) + 값(value)
		 - 값(value)은 중복이 가능하다.
		 
		 
		 HashMap
		 - 요소(방) 접근 > 키(Key) 사용 > 방이름 사용(번호X)
		 - 순서가 없는 집합
		 ex) 해바라기반, 장미반, 햇님반 -> 순서를 알 수가 없다
		 -> '연관 배열', '사전 구조' 라고 표현한다
		 					ex) Apple (Key)
		 						- 사과, 나무에 열리는 열매 중 하나.(value)
		 					ex) 키(Key) + 값(value)
		 - 키(Key)는 유일해야 한다.
		 - 값(value)은 중복이 가능하다.
		 
		 */
		
		//m1(); //HashMap과 다른 데이터집합의 비교
		//m2(); //HashMap 사용방법
		m3(); //HashMap으로 for문 돌리는 방법
		
	}//main

	private static void m3() {

			
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("white", "흰색");
		map.put("black", "검은색");
		map.put("red", "빨강색");
		map.put("blue", "파란색");
		map.put("yellow", "노란색");
		
		
		Set<String> set = map.keySet();// Set : 부모타입
		System.out.println(set); // 키만 뽑아 냄
		
		
		for(String key : set) {
			System.out.println(key);
		}
		
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println("==========");
		
		for(String key : set) {
			System.out.printf("map[%s] = %s\n", key, map.get(key));
		}// HashMap for문 돌리기
		
		
		
		
		
	}

	private static void m2() {
		
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.put("방이름", 100);
		
		HashMap<Boolean,String> map2 = new HashMap<>();
		map2.put(true, "참");
		map2.put(false, "거짓");
		
		HashMap<Integer,String> map3 = new HashMap<>();
		map3.put(1, "하나");
		map3.put(2, "둘");
		System.out.println(map3.get(1));
		
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		//1. 요소 추가
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blud", "파랑");
		
		//2. 요소 개수
		System.out.println(map.size());
		System.out.println(map); // red=빨강 > Entry
		
		//3. 요소 읽기
		System.out.println(map.get("red"));
		System.out.println(map.get("yellow"));
		System.out.println(map.get("blue")); // 이름이 달라도 에러가 안나고 null이 나옴
		
		//4. 요소 수정
		//- key: 식별자(수정 불가)
		//- value: 값(수정 가능)
		map.put("yellow", "옐로우");
		System.out.println(map);
		
		//5. 요소 삭제
		//- 방번호(X) > Shift X
		map.remove("yellow");
		System.out.println(map.get("yellow"));
		System.out.println(map.size());
		System.out.println(map);
		
		//6. 검색
		//- ArrayList.indexOf()
		//- HashMap.indexOf() > X
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsValue("빨강"));
		
		//7. 초기화
		map.clear();
		System.out.println(map);

		
		
		
		
		
		
	}

	private static void m1() {
		//학생 1명 > 국어,영어,수학 점수 저장 > 어떤 데이터 집합 ?
		
				//1. 배열
				//2. ArrayList
					// ->순서로 무언가 할때
		
				//4. Class
				//3. HashMap
					// -> 이름으로 무언가 할때
				
				
				//1. 배열
				//- 집합
				//- 첨자는 의미가 없다. > 각각의 방이 무슨 데이터인지 파악이 힘들다.
				int[] s1 = new int[3];
				
				s1[0] = 100;
				s1[1] = 90;
				s1[2] = 80;
				
				System.out.println(s1[0] + s1[1] + s1[2]);
				
				
				//2. ArrayList
				//- 집합
				//- 방번호가 무슨 과목??
				ArrayList<Integer> s2 = new ArrayList<Integer>();
				
				s2.add(100);
				s2.add(90);
				s2.add(80);
				
				System.out.println(s2.get(0) + s2.get(1) + s2.get(2));
				
				
				//4. Class
				Score s3 = new Score(100, 90, 80);
				
				s3.setMath(88);
				
				System.out.println(s3.getTotal());
				
				
				//3. HashMap //<String,Integer> <- '키'이다 보통은 String을 첫번째로 많이 쓴다.
				HashMap<String,Integer> s4 = new HashMap<String,Integer>();
				
				s4.put("kor", 100);
				s4.put("eng", 90);
				s4.put("math", 80);
				
				System.out.println(s4.get("kor") + s4.get("eng") + s4.get("math"));

		
	}

}//class
class Score {
	
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
	}
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
}



