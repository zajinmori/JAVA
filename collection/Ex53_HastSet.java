package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex53_HastSet {
	
	public static void main(String[] args) {
		
		
		//Ex53_HastSet.java
		
		/*
		 
		 
		 1. List 계열
		 	- 순서가 있는 집합
		 	- 첨자(방번호)
		 	- 데이터 중복을 허용
		 
		 2. Map 계열
		 	- 순서가 없는 집합
		 	- 키(방이름)
		 	- 키가 유일하기 때문에 데이터는 중복을 허용
		 
		 3. Set 계열
		 	- 순서가 없는 집합 !!
		 	- 식별자가 없다(방번호X, 방이름X) > 방을 구분할 수가 없다
		 	- 데이터 중복을 허용 하지 않는다 (***)
		 
		 
		 
		 데이터 집합 선택 가이드 ~!!
		 
		 -순수 배열 > 하나하나 다 관리를 직접 해야함
		 
		 ~ 그래서 컬렉션을 쓰면 편한거다 ~
		 
		 
		 근데 어떤 상황에 어떤 컬렉션을 쓸까 ??
		 
		 	1. 순수 배열과 비슷한 상황 : ArrayList
		 	2. 요소를 구분하고 이름을 넣고 가독성을 높이고 싶다 : HashMap
		 	3. 요소가 중복되면 안된다 > HashSet
		 
		 
		 
		 
		 
		 
		 */
		
		
		//m1();// HashSet의 기본, iterator의 이해
		//m2();// 일반 로또 만들기와 Set을 이용한 로또만들기
		//m3();// List와 Set의 차이
		m4();// Set의 심화과정과 Set의 재정의
		
		
		
		
		
	}//main

	private static void m4() {
		
		// **** Set + Object
		
HashSet<String> set1 = new HashSet<String>();
		
		set1.add("홍길동");
		set1.add("아무개");
		set1.add("하하하");
		
		set1.add("홍길동");
		
		System.out.println(set1);
		
		
		
		//회원 명단
		//Member[] list;
		//ArrayList<Member> list;
		
		//중복된 회원(Member) > 배제
		HashSet<Member> set2 = new HashSet<Member>();
		
		set2.add(new Member("홍길동", 20)); //해시코드로 구분
		set2.add(new Member("아무개", 22));
		set2.add(new Member("하하하", 25));
		
		set2.add(new Member("홍길동", 20)); // 해시코드로 구분
		
		System.out.println(set2);
		System.out.println();
		
		int a1 = 10;
		int a2 = 10;
		System.out.println(a1 == a2);
		
		Member m1 = new Member("홍길동", 20);
		Member m2 = new Member("아무개", 22);
		Member m3 = new Member("홍길동", 20);
		
		//주소값(참조형) 변수의 비교는 연산자 사용하지 말것 > equals
		System.out.println(m1 == m2); 		//false
		System.out.println(m1.equals(m2));	//false
		
		System.out.println(m1 == m3); // 연산자는 재정의 불가..
		System.out.println(m1.equals(m3)); //->주소값비교 -> 밑에서 재정의함
		
		
		
		System.out.println("m1: " + m1.hashCode()); //1321640594 ->.hashCode : 주소값메서드
		System.out.println("m2: " + m2.hashCode()); 
		
		System.out.println("m3: " + m3.hashCode()); //457233904
		//->m1과m3를 같게 만들려면 '재정의'해야함

		
		
		
	}

	private static void m3() {

		//List vs Set ??
		
		//마트 경품 추첨행사
		// - 중복 당첨 허용O 
		// - 중복 당첨 허용X
		
		
		
		String[] list = {"홍길동","아무개","하하하","호호호","강아지","고양이","병아리","호랑이","사자","햄스터"};
		
		Random rnd = new Random();
		
		//당첨자 > 배열에 저장
		// - 중복 당첨 허용O > ArrayList
		ArrayList<String> result1 = new ArrayList<String>();
		
		for(int i=0; i<5; i++) {
			result1.add(list[rnd.nextInt(list.length)]);
		}
		
		System.out.println(result1);
		
		
		
		//당첨자 > 배열에 저장
		// - 중복 당첨 허용X > Set
		
		HashSet<String> result2 = new HashSet<String>();
		
		while(result2.size() < 5) {
			result2.add(list[rnd.nextInt(list.length)]);
			
		}
		System.out.println(result2);
		
		
		
	}

	private static void m2() {
		
		//로또 번호 > 난수
		
//			6 + 1~45
		
//		for (int i=0; i<10; i++) {
//			System.out.println((int)(Math.random() * 45) + 1);
//		}
		
		Random rnd = new Random();
		
//		for (int i=0; i<10; i++) {
//			//System.out.println(rnd.nextDouble()); //Math.random()
//			//System.out.println(rnd.nextInt());
//			//System.out.println(rnd.nextInt(10)); //0~9
//			//System.out.println(rnd.nextBoolean());
//		}
		
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
//		for (int i=0; i<6; i++) {
//			
//			int n = rnd.nextInt(45) + 1;
//			
//			//중복 검사
//			if (check(lotto, n)) {
//				lotto.add(n);
//			} else {
//				i--;
//			}		
//			
//		}
		
		
		//위에거보다 편함
		while (lotto.size() < 6) { //숫자가 6개가 확보될때까지 계~속 돌아라
			
			int n = rnd.nextInt(45) + 1;
			
			//중복 검사
			if (check(lotto, n)) {
				lotto.add(n);
			} else {
				
			}		
			
		}
		
		System.out.println(lotto);
		
		
		
		//Set을 사용해서 로또 만들기
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while(lotto2.size() < 6) {
			int n = rnd.nextInt(45)+1;
			lotto2.add(n); //Set은 중복된 값이 못들어가서 알아서 중복검사가 됨..
					
		}
		System.out.println(lotto2);
		
		
		
		
		
		
	}

	private static boolean check(ArrayList<Integer> lotto, int n) {
		
		for (int i=0; i<lotto.size(); i++) {
			if (lotto.get(i) == n) {
				return false; //중복O
			}
		}
		
		return true;//유일O
	}

		
		
	

	private static void m1() {
		
		HashSet<String> set = new HashSet<String>();
		System.out.println(set);
		
		//1. 요소 추가
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		System.out.println(set);
		
		//2. 요소 개수
		System.out.println(set.size());
		
		//3. 요소 읽기 > 메서드 제공 안함
		//- 읽기 도구 제공 > Iterator == 향상된 for문
		
		//set으로부터 이터레이터를 얻어낸다.
		Iterator<String> iter = set.iterator();
		
//		System.out.println(iter.hasNext()); //읽어올 다음 데이터가 있냐?
//		System.out.println(iter.next()); //읽어라
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
		
		
		//set
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
		
		System.out.println("다시 읽기");
		
		iter = set.iterator(); //새로운 반복기 생성 > 커서는 BOF 시작
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
		
		System.out.println();
		
		//향상된 for문 > 내부에 이터레이터 구현
		for (String item : set) {
			System.out.println(item);
		}
		
		for (String item : set) {
			System.out.println(item);
		}

		
		
	}

}//class

class Member{
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
	
		return String.format("%s(%d)", this.name, this.age);
	}
	
	@Override
	public int hashCode() { //재정의 하는 방법
		
//		System.out.println("홍길동20".hashCode());
//		System.out.println("아무개25".hashCode());
//		System.out.println("홍길동20".hashCode());
		
		
		
		
		return (this.name+this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//이름과 나이가 동일하면 같은 객체로 판단하겠다.
		return this.hashCode() == obj.hashCode();
	}

}//Member
