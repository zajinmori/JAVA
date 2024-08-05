package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex50_ArrayList {
			
	public static void main(String[] args) {
		
		
		//Ex50_ArratList.java
		/*
		 
		 
		 1. 제어문
		 2. 배열보다 컬렉션을 많이 쓴다.
		 3. 클래스
		 
		 
		컬렉션, Collection
		- JCF, Java Collection Framework
		- (향상된) 배열 
		- 뭐가 향상 돼?
		 	1. 성능 향상 (상황에 따라서 애매함..)
		 	2. 사용법 향상 > 업무의 목적에 따라서 배열의 사용법을 다양하게 제공
		 	3. 길이가 가변 > 배열의 길이가 늘었다가 줄었다가 가능..
		 
		 
		 컬렉션의 종류
		 	1. List 계열
		 		- ArrayList (***** 중요 *****)
		 		- LinkedList
		 		- Queue
		 		- Stack
		 		- Vector ( 없어질거야 )
		 		
		 	2. Set 계열
		 		- HashSet (***** 중요 *****)
		 		- TreeSet
		 		
		 	3. Map 계열
		 		- HashMap (***** 중요 *****)
		 		- TreeMap
		 		- Properties
		 		- HashTable ( 없어질거야 )
		 		
		 	------------------------------------------
		 	
		 	
		 	ArrayList 클래스
		 	- 일반 배열과 구조가 거의 유사함.
		 	
		 	
		
		 
		 */
		
		//m1(); ArrayList의 기초
		//m2(); //ArrayList의 사용법
		//m3(); ArrayList의 다차원
		//m4(); //향상된 for문
		//m5(); //객체 배열
		//m6(); //성적표 만들어보기
		m7(); //컬렉션의 길이가 가변인 이유
		
	}//main

	private static void m7() {
		
		//배열의 길이 > 불변
		//컬렉션의 길이 > 가변 > 눈에 안보이는 안쪽에서는 2배씩 뻥튀기로 배열이 생성된다. > 복사 후 삭제 를 반복

		
		int[] list = new int[4];
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //처음엔 4칸짜리가 자동으로 생김. 
		
		for(int i=0; i<10; i++) {
			list2.add(i);
		}
		System.out.println(list2);
		
		//list2.trimToSize();// 남은 방을 없애줌 -> 잘 안씀
		
		
	}

	private static void m6() {
		//성적표 만들기
		
		//선택 ? > 데이터 집합?
		// 1. 배열 사용?		<기준> 길이 고정 > 학생수 정확(고정)
		// 2. ArrayList 사용?	<기준> 길이 가변 > 학생수 불명확(가변)
		
		
		//성적표 > 학생 집합만들기
		ArrayList<Student>list = new ArrayList<Student>();
		
		String[]names = {"홍길동", "아무개", "강아지", "고양이", "병아리"};
		
		for(int i=0; i<5; i++) {
			Student s = new Student();
			
			s.setNo(i+1);
			s.setName(names[i]);
			
			//60~100 난수
			// 1. 0 ~ 40 난수발생 + 60
			s.setKor((int)(Math.random()*41)+60);
			s.setEng((int)(Math.random()*41)+60);
			s.setMath((int)(Math.random()*41)+60);
			
			//이걸 추가하면서 더 깔끔해졌따 그치만 이거도 지워버림 클래스에서 계산을 다해놨음
//			s.setTotal(s.getKor() + s.getEng() + s.getMath());
//			s.setAvg(s.getTotal()/3.0);
			
			
			list.add(s); //학생 집합에 추가
			
			
		}
		
		
		//출력
		
		System.out.println("===========================================================================================");
		
		
		
		
		System.out.println("                        성적표");
		System.out.println("===========================================================================================");
		
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for(Student s : list) {
			
			System.out.printf("%5d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n", s.getNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(),s.getTotal(),s.getAvg());
		}
		
	}

	private static void m5() {
		
		//객체 배열
		
//		Cup[]list = new Cup[5];
		ArrayList<Cup> list = new ArrayList<Cup>();
		
		Cup c1 = new Cup("white", 5000);
		list.add(c1);
		
		list.add(new Cup("blue", 3000));
		
		list.add(new Cup("yellow", 2000));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------");
		
		for(Cup c : list) {
			System.out.println(c);
		}
		System.out.println("------------------");
		
		System.out.println(list);

		
	}

	private static void m4() {
		
		//제어문 > 반복문
		// 1. for문
		// 2. 향상된 for문 
		
		//1. for문
		int[] nums = {100, 200, 300, 400, 500};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		
		
		//2. 향상된 for문
		for(int num : nums) { //첫번째 방부터 끝 방까지 순서대로 읽는 것 밖에 못한다.
			System.out.println(num);
			
		}
		System.out.println();
		
		
		//3. ArrayList에서 향상된 for문
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("강아지");
		names.add("고양이");
		names.add("코뿔소");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		//배열 덤프
		System.out.println(Arrays.toString(nums));
		
		//컬렉션 덤프
		System.out.println(names.toString());
		System.out.println(names); // 이렇게만 해도 된다
		
		
	}

	private static void m3() {
		
		int[] 		ns1 = new int[3];
		ArrayList<Integer> ms1 = new ArrayList<Integer>();//1차원의 ArrayList
		
		
		int[][]		ns2 = new int[3][4];
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>(); //2차원의 ArrayList
		
		
		int[][][]	ns3 = new int[3][4][5];
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>(); //3차원의 ArrayList
		
		
		
	}

	private static void m2() {
		
		
		//String[] list;
		ArrayList<String> list = new ArrayList<>();
		
		//1. 요소 추가하기
		// -boolean add(T value)
		// - 배열의 마지막에 추가하기 > Append Mode
		
		list.add("바나나"); //0번째방
		list.add("사과"); // 1번째방 쭊쭉 차례대로 채워진다
		list.add("딸기");
		list.add("파인애플");
		list.add("귤"); //0 ~ 4까지 5개의 방이 생성
		
		//2. 요소개수
		// - int size()
		System.out.println(list.size()); //5
		
		//3. 요소 읽기
		// - T get(int index)
		System.out.println(list.get(2)); //딸기
//		System.out.println(list.get(5)); //없는 방번호 에러(IndexOutOfBoundsException)
		
		//4. 요소 수정
		// - T set(int index, T newValue)
		list.set(2, "참외"); // set -> 2번째 방에 "참외"를 덮어쓰기 해라 ~ 라는 뜻
		System.out.println(list.get(2));
		
		//5. 요소(방1개) 삭제 ***주의 !!!!
		// - 방 없애기
		// - T remove(int index) > 방 번호로 삭제가능
		// - boolean remove(T value) > 값으로 삭제
		// - 삭제된 방 이후 ~ 모든 요소의 방번호가 -1  > Left Shift 발생
		list.remove(2); // (유일 O)
//		list.remove("참외"); -> 값(참외)로 지울 수도 있다 (유일 X), 값이 같은 방이 있을수도있으니 최대한 방번호로 삭제하자.
		System.out.println(list.size());// 4 > 2번째 방이 삭제 되었기 때문에 방이 하나 줄었다.
		System.out.println(list.get(2));//파인애플 > 즉 삭제가 되면 뒤에 있던 방들이 앞으로 땡겨지고 방개수가 줄어준다. 주의 !!!
		
		//6. 요소 추가하기 ***주의 !!!!
		// - 원하는 곳에 추가하기
		// - 삽입 모드(Insert Mode) -> 새치기(끼워넣기)
		// - void add(int index, T value)
		// - 삽인된 방 이후 모든 요소 > 방번호가 +1 > Right Shift 발생
		list.add(1, "망고"); //오버로딩된 .add를 쓴다
		System.out.println(list.get(1));// 망고
		System.out.println(list.get(2));// 사과
		
		//7. 요소 검색
		// - int indexOf(T value)
		// - int lastIndexOf(T value)
		// - boolean contains(T value)
		
		System.out.println(list.indexOf("사과")); // = 2 > 2번째 방에 사과가 있다.
		System.out.println(list.indexOf("키위")); // = -1 > 없는것은 -1을 반환
		System.out.println(list.contains("파인애플"));// = true > 파인애플이 있나요 ? 
		
		//8. 요소 탐색
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//9. 초기화
		// - 모든 요소 삭제 > 모든방 삭제 > 새로운 데이터를 넣어 재활용할때
		// - void clear();
		list.clear(); // 모든 요소 삭제
		System.out.println(list.size()); // =0 > 모든 방이 삭제되었다.
		
		//10. 빈배열 확인
		// - boolean isEmpty()
		System.out.println(list.isEmpty()); // = true > 방에 아무것도 없나요 ?
		
		
		
		
	}

	private static void m1() {
		
		//배열
		//- 타입 명시(int)
		//- 길이 명시([3])
		int[] nums1 = new int[3];
		
		//요소접근 > 첨자(index)사용
		nums1[0] = 10; // 배열명(index) > 표기법 > 인덱서(Indexer)
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		
		System.out.println(nums1.length);
		System.out.println("-----------------");
		
		
		
		//컬렉션
		//- 타입 명시(구번전엔 없었는데 이제는 제네릭 타입으로 명시한다)
		//- 길이 명시(X) > 가변이다
		
//		ArrayList nums2 = new ArrayList(); // 구버전.. Object배열이다
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		//요소접근
//		nums2[0] = 100; 불가하다. 순수 배열만 가능한 표기법이다
		nums2.add(100); // =num2에 0번째 방에 100을 넣어라. 방번호가 없지만 처음에 넣는건 무조건 첫번째(0) 방에 들어간다
		nums2.add(200); // =num2[1] = 200
		nums2.add(300); // =num2[2] = 300
		
		System.out.println(nums2.get(0)); // =nums2[0]의 값
		System.out.println(nums2.get(1)); // =nums2[1]의 값
		System.out.println(nums2.get(2)); // =nums2[2]의 값
		
		System.out.println(nums2.size()); // =nums2.length (길이를 말한다)
		
		nums2.add(400);
		nums2.add(500); //집어 넣을때마다 방이 늘어난다. > 가변이다
		
		System.out.println(nums2.size());
		
		
		for(int i=0; i<nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
	}

}//class


class Cup{
	
	private String color;
	private int price;
	
	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		return this.color + ":"+this.price;
	}
	
}//Cup

class Student{
	
	private int no;			//번호
	private String name;	//이름
	private int kor;		//국어
	private int eng;		//영어
	private int math;		//수학
	
//	private int total;		//총점
//	private double avg;		//평균
	
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
//	public void setTotal(int total) {
//		this.total = total;
//	}
	public double getAvg() {
		return this.getTotal()/3.0;
	}
//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

