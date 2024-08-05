package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex56_Sort {
	
	public static void main(String[] args) {
		
		
		
		//Ex56_Sort.java
		
		// 정렬
		//	- 배열 or 컬렉션(List)
		//	- 순서가 있는 집합 > 정렬 가능
		
		//1. 직접 정렬 > 정렬 알고리즘
		//2. JDK 제공 > Arrays.sort()
		
		
		//m1(); //배열과 컬렉션의 오름차순 정렬
		//m2(); //내림차순 정렬하는 방법
		//m3();// 익명 객체로 내림차순 하는 방법
		//m4();// 객체배열 정렬방법
		//m5();
		//m6();// 두가지를 한번에 비교할때
		m7();
		
		
		
	}//main

private static void m7() {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("홍길동","부장"));
		list.add(new Employee("아무개","사원"));
		list.add(new Employee("고양이","대리"));
		list.add(new Employee("강아지","과장"));
		list.add(new Employee("하하하","사원"));
		
		
//		Collections.sort(list, new Comparator<Employee>() { //정적 메서드에 한것
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
////				return o1.getName().compareTo(o2.getName());// 이름 오름차순
////				return o1.getPosition().compareTo(o2.getPosition());
//			
//				return getPositionNumber(o2.getPosition()) - getPositionNumber(o1.getPosition());
//			}
//		});
		
		
		list.sort(new Comparator<Employee>() {//객체 메서드에 한것 

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());// 이렇게 바로 list에 박아도 된다
			}
		});
		
		
	
		System.out.println(list);
	
		
	}

	private static int getPositionNumber(String position) {
		if(position.equals("부장")) {
			return 4;
		}else if(position.equals("과장")) {
			return 3;
		}else if(position.equals("대리")) {
			return 2;
		}else if(position.equals("사원")) {
			return 1;
		}
		
		return 0;
		
	}// 누가 더 높은지를 기준을 만듬





	private static void m6() {
User[] list = new User[5];
		
		list[0] = new User("홍길동",20,180,70);
		list[1] = new User("아무개",25,180,65);
		list[2] = new User("강아지",23,180,75);
		list[3] = new User("고양이",24,180,80);
		list[4] = new User("병아리",22,180,60);
		
		
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {

				
				

					if(o2.getHeight() > o1.getHeight()) {
					return 1;
				}else if(o1.getHeight() < o2.getHeight()) {
					return -1;
				}else {
					
					
					//키가 같을때 몸무게까지 비교하기
					if(o1.getWeight() > o2.getWeight()) {
						return 1;
					}else if (o1.getWeight() < o2.getWeight()) {
						return -1;
					}else {
						return 0;
					}
					
				}
			
				
				
			}
				
		});
		
		System.out.println(Arrays.toString(list));
	}

	private static void m5() {
			
		Student2[] list = new Student2[5];
		
				list[0] = new Student2("홍길동",100 ,90 ,80 );
				list[1] = new Student2("아무개",80 ,76 ,50 );
				list[2] = new Student2("고양이",44 ,33 , 52);
				list[3] = new Student2("강아지",100 ,84 ,42 );
				list[4] = new Student2("하하하",65 ,48 ,55 );
				
				Arrays.sort(list, new Comparator<Student2>() {

					@Override
					public int compare(Student2 o1, Student2 o2) {
						
						return (o1.getKor()+o1.getEng()+o1.getMath()) - (o2.getKor()+o2.getEng()+o2.getMath());// 첫번째가 먼저들어갔으니 오름차순
					}
					
					
				});

				System.out.println(Arrays.toString(list));
				
	}

	private static void m4() {
		
		// 객체 배열
		
		
		User[] list = new User[5];
		
		list[0] = new User("홍길동",20,180,70);
		list[1] = new User("아무개",25,175,65);
		list[2] = new User("강아지",23,170,75);
		list[3] = new User("고양이",24,185,80);
		list[4] = new User("병아리",22,190,60);
		
		
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {

				
				
//				return o1.getAge()-o2.getAge(); // 나이를 기준으로할때.. 직접 내가 꺼내줘야함 오름차순
//				return o2.getAge()-o1.getAge(); // 나이를 기준으로할때.. 직접 내가 꺼내줘야함 내림차순
				return o2.getName().compareTo(o1.getName()); // 이름을 기준으로할때.. 문자열은 compareTo 사용
//				return o2.getHeight()-o1.getHeight(); // 키를 기준으로할때.. 직접 내가 꺼내줘야함 내림차순
				//등등 내가 직접 비교할걸 골라서 꺼내주면 이런게 가능하다
			}
				
		});
		
		System.out.println(Arrays.toString(list));
		
	}

	private static void m3() {
		Integer[] nums1 = {1,5,2,3,4};
		
//		Comparator<Integer> c1 = new Comparator<Integer>() {//익명객체는
//
//			@Override
//			public int compare(Integer o1, Integer o2) {// 추상메서드를 꼭 생성해야한ㄷㅏ
//				
//				return o2-o1; //내림차순 오름차순하고싶으면 순서를 (o2,o1) 바꿔준다
//			}
//			
//		}; //익명객체 생성
//		
//		
//		Arrays.sort(nums1, c1);
		
		
	 
		
		
		Arrays.sort(nums1, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1; 
			}
			
		});
		// 제일 간단하다 !!
		
	}

	private static void m2() {
		
		Integer[] nums1 = {1,5,2,3,4};
		
		MyComparator c1 = new MyComparator();
		
		Arrays.sort(nums1, c1);
		
		System.out.println(Arrays.toString(nums1));
		
		
	}

	private static void m1() {
		
		//정렬 대상
		//	1. 숫자
		//	2. 문자, 문자열
		// 	3. 날짜, 시간
		
		
		//1. 숫자 + 배열
		
		int[]nums1 = {1,3,4,2,5};
		
		System.out.println(Arrays.toString(nums1));
		
		Arrays.sort(nums1); // 정렬하기
		
		System.out.println(Arrays.toString(nums1));
		
		
		//1-1 숫자 + List
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(1);
		nums2.add(4);
		nums2.add(2);
		nums2.add(3);
		nums2.add(5);
		
		System.out.println(nums2);
		
		//오름차순
		Collections.sort(nums2);//컬렉션용 정렬하기
		
		System.out.println(nums2);
		
		
		
		//2. 문자열 + 배열
		
		String[] names1 = {"병아리","고양이","아무개","강아지","홍길동"};
		Arrays.sort(names1); // 문자열 오버로딩이 없는데 문자열은 오버로딩을 Object로 한다
		
		System.out.println(Arrays.toString(names1));
		
		String s1 = "홍길동";
		String s2 = "아무개";
		
		//문자열의 비교 !!!! ->compareTo
		System.out.println(s1.compareTo(s2)); // 앞에꺼가 크면 '양수' or 둘이 같으면 0 or 뒤어꺼가 크면 '음수'
		
		
		
		//2-1. 문자열 + 컬렉션
		
		ArrayList<String> names2 = new ArrayList<>();
		
		names2.add("홍길동");
		names2.add("강아지");
		names2.add("아무개");
		names2.add("고양이");
		names2.add("병아리");
		
		Collections.sort(names2);
		
		System.out.println(names2);
		
		
		
		
		
		//3. 날짜 / 시간 + 배열
		
		Calendar[] clist = new Calendar[5];
		
//		System.out.println(Arrays.toString(clist));
		
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);//5일전
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 3);//3일후
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -2);//2일전
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 7);//7일후
		
		clist[4] = Calendar.getInstance();//현재
		
		for(Calendar c : clist) {
			System.out.printf("%tF\n",c);
		}// 시간순서가 아닌 만든 순서이다 !
		
		Arrays.sort(clist);
		
		for(Calendar c : clist) {
			System.out.printf("%tF\n",c);
		}// 시간순서를 맞췄다 !
		
		
		//3-1. 날짜/시간 + 컬렉션
		
		ArrayList<Calendar> clist2 = new ArrayList<Calendar>();
		
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE,-5);
		
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE,3);
		
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE,-2);
		
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE,7);
		
		clist2.add(Calendar.getInstance());
		
		for(Calendar c : clist2) {
			System.out.printf("%tF\n", c);
		}//정렬안한것
		System.out.println();
		
		
		
		Collections.sort(clist2);//정렬
		
		for(Calendar c : clist2) {
			System.out.printf("%tF\n", c);
		}//정렬한것 !!!
		System.out.println();
		
		
		
		

	}//m1
	
	
	

}//class



class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		//o1 과 o2중 누가 더 큰지? 더 작은지?

		
//		if(o1>o2) {
//			return -1;
//		}else if(o1<o2) {
//			return 1;
//		}else {
//			return 0;
//		} 너무 길다..
		
		return o2 - o1; //위에 코드랑 같은거다, 1,2를 바꾸면 오름차순이 될지 내림차순이 될지 결정하ㄴ다
		
		
	}
	
	
}

class User{
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	
	public User(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("\n%s(%d세) %dcm %dkg\n",
				this.name,
				this.age,
				this.height,
				this.weight);
	}
	
	
	
}



class Student2{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	public Student2(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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


	@Override
	public String toString() {
		return "Student2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
}


class Employee{
	
	private String name;
	private String position;
	public Employee(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + "]";
	}
	
	
	
}



















