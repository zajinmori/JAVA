package com.test.java.array;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex25_Array {
		public static void main(String[] args) {
		
			
			//Ex25_Array.java
			/*
			 
			 배열, Array
			 - 데이터 저장하는 자료 구조
			 - 데이터의 집합 > 변수들을 모아놓은 집합
			 - **같은 성격**의 **같은 자료형**을 저장하는 데이터 집합
			 
			 - 배열 + 반복문 (커플같은 놈들이다)
			 
			 
			 */
			
			
			//m1(); 배열을 쓰기 전
			//m2(); 배열의 사용방법
			//m3(); 배열의 이해
			//m4(); 자료형별 배열만들기
			//m5(); 배열복사 이해하기
			//m6(); 배열복사 이해하기 2
			//m7(); 배열복사(얕은 복사와 깊은 복사의 이해)
			//m8(); 덤프 하는법
			//m9(); 배열 for문 활용
			//m10(); 버블 정렬의 예
			//m11(); 문자열 배열정렬하기
			//m12(); sort메서드로 초간단 정렬하기
			//m13(); 차원별 배열
			//m14(); 차원별 초기화 리스트
			//m15(); 동적 길이 만들기
			//m16(); 문제풀이 (난수만들기)
			//m17(); 문제풀이(2차원배열)
			//m18(); //67문제 (****) 자주 한다
			//m19(); //68문제 (****)
			m20(); //75문제
			
		}//main

		private static void m20() {
			//75번 문제
			
			int[][] nums = new int[5][5];
			
			
//			System.out.println(nums.length); //5 바깥쪽 2차원배열
//			System.out.println(nums[0].length); //5 안쪽의 1차원배열
			
			//입력
			int n =1;
			for(int i=0; i<nums.length-1;i++) {
				for(int j=0; j<nums[0].length-1;j++) {
					
					nums[i][j] = n;
					
					nums[i][4] += n;//오른쪽 줄 더하기가 완성 
					
					nums[4][j] += n;//아래줄 더하기가 완성
					
					nums[4][4] += n; //1 ~ 16 더하면 오른쪽구석 값이 나옴
					
					n++;
				}
			}
			
			
			
			//출력
			for(int i=0; i<nums.length; i++) {
				for(int j=0; j<nums[0].length; j++) {
					
					System.out.printf("%4d",nums[i][j]);
					
				}
				System.out.println();
			}
			
			
			
		}

		private static void m19() {
			//68번 문제
			//배열 > 요소 삭제 > Left Shift 구현
			
			int[] list = {5,6,1,3,2,4,8,7,9,3};
			
			int index = -1; // 삭제 위치
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("삭제 위치 : ");
			index = scan.nextInt();
			
			
			
			System.out.println("원본: " + Arrays.toString(list));
			
			//삭제 구현
			for(int i=index; i<=list.length-2;i++) {
				list[i]=list[i+1]; //삭제완료(레프트시프트완료)
			}
			
			list[list.length-1] = 0; // 마지막방에 0을 넣는 작업
			
			
			System.out.println("결과: " + Arrays.toString(list));
			
		}

		private static void m18() {
			
			//67번 문제
			//배열 > 요소 삽입 > Right Shift 구현
			
			int[] list = {5,6,1,3,2,4,0,0,0,0};
			
			int index = -1; // 삽입 위치
			int value = 0; //삽입 값
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("삽입 위치 : ");
			index = scan.nextInt();
			
			System.out.print("값 : ");
			value = scan.nextInt(); //인티저변수로 선언했으니까 인티저로
			
			System.out.println("원본: " + Arrays.toString(list));
			
			//삽입 구현
			for(int i = list.length-2; i>=index ;i--) {//-2는 뒤에서 두번째자리이기때문에 
				//System.out.println(i); 확인하기
				
				list[i+1] = list[i]; //여기까지 오른쪽으로 한칸씩 이동함
			}
			list[index] = value; //추가할 값을 넣음 (배열의 요소삽입)
			
			System.out.println("결과: " + Arrays.toString(list));
			
			
			
			
			
		}

		private static void m17() {

			int[][]nums = new int[5][5];
			
			//입력
			int n = 1;
			for(int i =0; i<5; i++) {
				for(int j=0; j<5; j++) {
					nums[i][j] = n;
					n++;
				}
					
			}
			
			
			//출력(지금 코드만 사용 > 수정금지)
			for(int i =0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.printf("%3d", nums[i][j]);
				}
					System.out.println();
			}
			
			
		}

		private static void m16() {
			
			//난수 만들기
			for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*10)+1);
			}
		}

		private static void m15() {
			
			//*** 배열의 길이는 불변이다 .
			// - 한번 만들어진 배열의 방의 개수(길이)는 더 늘리거나 삭제할 수 없다.
			// - 배열은 항상 미리 예측해서 적절한 길이로 생성해야한다.(***)
			// - 배열의 길이를 동적으로 정할수있다.(*****)
			
			//int[] kor = new int[300]; // 절때 300이라는 숫자는 못바꾼다.
										// 정적 길이(소스상에 고정(300))
			Scanner scan = new Scanner(System.in);
			System.out.print("학생수 :");
			int length1 = scan.nextInt();
			
			int [] kor = new int[length1]; //동적 길이(미리 정하지 않고 실행중에 결정한다)
			System.out.println(kor.length);//유연하게 만들어진다.
			
		}

		private static void m14() {
			
			//초기화 리스트
			int[] nums1 = {10, 20, 30}; //-> 1차원
			
			int[][]nums2 = 
				{
					{10, 20, 30}, {40, 50, 60}
				}; //->2차원
			
			int[][][]nums3 = 
		{
			{
				{10, 20, 30},
				{40, 50, 60}
			},
			{
				{10, 20, 30},
				{40, 50, 60}
			}
		}; // ->3차원
			
			
			
		}

		private static void m13() {
			
			//배열의 차원
			// - 1차원 배열, 2차원 배열, 3차원 배열 ...
			
			//1차원 배열
			int[]nums1 = new int[3];
			
			nums1[0] = 10;
			nums1[1] = 20;
			nums1[2] = 30;
			
			System.out.println(Arrays.toString(nums1)); 
			
			
			
			//2차원 배열 (표의 형태라고 상상해보기)(2중for문)
			int[][] nums2 = new int[2][3]; // 2 : 2차원 / 3 : 1차원 (2행 3열)
			
			nums2[0][0] = 10;
			nums2[0][1] = 20;
			nums2[0][2] = 30;
			
			nums2[1][0] = 40;
			nums2[1][1] = 50;
			nums2[1][2] = 60;
			
			System.out.println(Arrays.toString(nums2));//1차원 배열에만 사용
			System.out.println(Arrays.deepToString(nums2));//2차원 이상은 .deepToString사용
			
			for(int i=0; i<2; i++) {//층 (행)
				for(int j=0; j<3; j++) {//호 (열)
					System.out.print(nums2[i][j] + " "); //이중for문을 활용해보기
				}
				System.out.println();
			}
			System.out.println();
			
			
			//3차원배열 (3중for문)
			int[][][]nums3 = new int[2][2][3];
			
			nums3[0][0][0] = 10;
			nums3[0][0][1] = 20;
			nums3[0][0][2] = 30;

			nums3[0][1][0] = 40;
			nums3[0][1][1] = 50;
			nums3[0][1][2] = 60;

			nums3[1][0][0] = 70;
			nums3[1][0][1] = 80;
			nums3[1][0][2] = 90;

			nums3[1][1][0] = 100;
			nums3[1][1][1] = 110;
			nums3[1][1][2] = 120; //like 3중for문
			
			for(int i=0; i<2; i++) {//동
				for(int j=0; j<2;j++) {//층
					for(int k=0; k<3; k++) {//호
						System.out.printf("%5d",nums3[i][j][k]);
					}
					System.out.println();
				}
				System.out.println();
			}
			
			
			
		}

		private static void m12() {
			
			String[] names = {"홍길동","강감찬","이율곡","허준","강아지","고양이","닭"};
			int[]nums = {5,3,1,4,2,6,8,9,7,10};
			
			//정렬 (오름차순) sort메서드 활용(퀵정렬) -> 초간단
			// 내림차순하는 메서드는 나중에 배운다.
			Arrays.sort(nums,3,7); //부분정렬 (3번째부터 7번째까지(7은 포함이안되서 6번째까지이다)
			System.out.println(Arrays.toString(nums));
			
			
			Arrays.sort(names);
			System.out.println(Arrays.toString(names));
			
		}

		private static void m11() {
			//문자열 배열정렬
			
			
			//String s1 ="홍길동";
			//String s2 ="강감찬";
			
			//System.out.println(s1 > s2); 문자는 비교가 안됨
			
			//문자열 > 문자 추출 > 문자코드값
			//System.out.println((int)s1.charAt(0));//(0):0번째방. 즉, '홍'의 코드값을 추출한다
													//(int)를 붙여서 코드값. 즉, 숫자로 추출한다
			//System.out.println((int)s1.charAt(0)>(int)s2.charAt(0)); 비교하는법
			
			//System.out.println(s1.compareTo(s2));//문자코드값 비교함
			//System.out.println(s2.compareTo(s1));//문자코드값 비교함
			//copareTo 반환값 (s1 - s2)
			// - 양수 : 앞에 값(s1)이 더 큼 
			// - 음수 : 뒤에 값(s2)이 더 큼
			// - 0 : 동일하다 (s1 = s2)
			
			
			String[] names = {"홍길동","강감찬","이율곡","허준","강아지","고양이","닭"};
			String temp = "";
			
			for(int i = 0; i<names.length -1; i++) {
				for(int j = 0; j<names.length-1-i;j++) {
					if(names[j].compareTo(names[j+1])>0) {
						temp = names[j];
						names[j] = names[j+1]; //+1은 바로옆에 있는 것을 의미한다
						names[j+1] = temp;
					}
				}
			}
			
			System.out.println(Arrays.toString(names));
			
			
			
			
		}

		private static void m10() {
			
			//배열 > 사용 업무 > 정렬
			//- 크기 비교 후 > 요소간의 재배치
			
			//1. 오름차순
				//a. 숫자 : 작은 수 > 큰 수
				//b. 문자열 : 문자코드값 순서(문자끼리는 비교가 불가하기 때문)
				//c. 날짜시간 : 과거 > 미래
			
			//2. 내림차순
				//a. 숫자 : 큰 수 > 작은 수
				//b. 문자열 : 문자코드값 역순서대로
				//c. 날짜시간 : 미래 > 과거
			
			//정렬 구현
			//1. 직접 구현 > 정렬 알고리즘
			//2. JDK 제공(대부분 이걸쓴다)
			
			//정렬 > swap : 두 공간의 값을 바꾸는 행동
			//ex)
			int a = 10;
			int b = 5;
			int temp; //빈 병의 역할
			
			temp = a; // 빈병에 a를 넣음 
			a = b; //a가 비었으니 b를 넣음
			b = temp;//b가 비었으니 temp에 있던 a를 넣음
			System.out.println(a);
			System.out.println(b);
			
			
			//버블 정렬
			
			int[]nums = {5,3,1,4,2};
			
			System.out.println(Arrays.toString(nums));
			System.out.println();
			
			for(int i=0; i<nums.length-1; i++) {//사이클을 위한 for문(방의 개수 - 1)
				
				for(int j=0; j<nums.length-1-i;j++) {//사이클안에 비교를 위한 for문
					//i(0) > j(0,1,2,3)
					//i(1) > j(0,1,2)
					//i(2) > j(0,1)
					//i(3) > j(0)
					if(nums[j] > nums[j+1]) {// > 이걸  < 이거로 바꾸면 내림차순이 된다
						//swap (교환을 해야됨)
						temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}//if
					System.out.println(Arrays.toString(nums));// 전체과정
					
				}//for j
				
				System.out.println(Arrays.toString(nums)); // 정렬과정을 보여줌
				System.out.println();

			}//for i
			
			System.out.println(Arrays.toString(nums));// 오름차순 정렬
			
			
			
			
			
			
			
		}

		private static void m9() {
			
			//배열의 초기화 리스트
			
			int[] nums1 = new int[5];
			
			for(int i=0; i<nums1.length; i++) {
				nums1[i] = (i+1)*10;
			}
			System.out.println(Arrays.toString(nums1));
			//규칙이 있으면 for문으로 돌릴수 있음. 이렇게 !!!
			
			int nums2[] = new int[5];
			
			nums2[0] = 97;
			nums2[1] = 54;
			nums2[2] = 69;
			nums2[3] = 94;
			nums2[4] = 44;
			//규칙이 없으면 for문으로 못돌림.
			
			int nums3[] = new int[] { 97, 54, 69, 94, 44};// nums3에 순서대로 값을 넣어라 라는 뜻 즉, 위에 노가다보단 이게 편함 (편리함!!)
			
			int nums4[] = { 97, 54, 69, 94, 44};//이렇게도 가능. 이게 최고임..
			
			System.out.println(Arrays.toString(nums2));
			System.out.println(Arrays.toString(nums3));
			System.out.println(Arrays.toString(nums4));
			
			
			String[] names = {"홍길동", "이우진", "아무개"};
			
			System.out.println(Arrays.toString(names)); //문자열도 쌉가능.
			
		}

		private static void m8() {
			
			//Arrays 클래스
			//- 유틸리티 클래스
			//- 배열과 관련된 여러가지 기능을 구현한 클래스
			
			int[] nums = new int[3];
			
			nums[0] = 10;
			nums[1] = 20;
			nums[2] = 30;
			
			//배열 상태 확인?
			System.out.println(nums); //[I@5aaa6d82 -> '[I' : 인티저배열 @ '5aaa6d82' : 메모리주소 
			//->실패 . .
			
			printArray(nums);// 배열상태 확인하는 방법 1(루프를돌려보기)
			
			System.out.println(Arrays.toString(nums)); // ***이게 제일 좋은 배열안에 뭐가 있는지 확인하는 법임.(개발자가 보기 위한 용도임)
			//->dump(덤프) 덤프 메서드, 덤프한다 라고 얘기함 (내부 확인하기)
			
			
			//Arrays > 깊은 복사
			
			int[] copy = Arrays.copyOfRange(nums, 0,nums.length); //copy에 뭐가 있는지 확인법
			nums[0] = 111;
			
			System.out.println(Arrays.toString(nums));
			System.out.println(Arrays.toString(copy));
			
					
			
			
			
		}

		private static void printArray(int[] nums) {
			
			for(int i=0; i<nums.length; i++) {
				System.out.println(nums[i]);
			}
			
		}

		private static void m7() {
			
			//배열 복사
			//1. 얕은 복사, Shallow Copy > 기본 동작
			//-주소값 복사
			
			//2. 깊은 복사. Deep Copy > 방 : 방 으로 복사하는거라고 상상해봐 
			//-요소 복사(실제 값 복사)
			
			int[] nums = new int[3];
			nums[0] =10;
			nums[1] =20;
			nums[2] =30;
			
			//int[] copy = new int[3];// new int[3]; 이걸 지워도 된다. 가비지컬렉터를 상상해보자
			
			//얕은복사(주소값복사)
			//copy=nums;
			
			//int = int 값복사
			// 깊은 복사
		int[] copy = new int[3];
//			 copy[0]=nums[0];
//			 copy[1]=nums[1];
//			 copy[2]=nums[2];
			// 노가다하기 . .
		
			for(int i=0; i<nums.length; i++) {
				copy[i] = nums[i];
			}
			nums[0] = 111;
			System.out.println(nums[0]);
			System.out.println(copy[0]);
			// 노가다 말고 for문으로 깊은 복사 해보기
			
		}

		private static void m6() {
			
			int a =10;
			changeValue(a); // 지역변수 이기 때문에 원본에 영향이 없다. 사이드이펙트 x
			System.out.println("a:"+a);
			
			int[] b = new int[3];
			b[0] = 10; //배열복사이기 때문에 원본에도 영향을 미친다. 사이드이펙트 o
			changeArray(b);
			System.out.println(b[0]);
		}

		private static void changeArray(int[] b) {
			
			b [0] = 20;
			
		}

		private static void changeValue(int a) {
			
			a = 20;
			
		}

		private static void m5() {
			
			
			//값형 복사
			int a = 10;
			int b;
			
			b = a;
			//값형 > 원본을 수정해도 복사본에 영향x
			//					-> Side Effect 발생하지 않음 이라고 말한다.
			a = 20; //원본수정
			
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			
			
			//배열 복사
			int[] nums = new int[3];
			
			nums[0] = 10;
			nums[1] = 20;
			nums[2] = 30;
			
			int[] copy = new int[3];
			
		//	int[] <-자료형
			copy = nums;
			//참조형 > 원본을 수정하면 복사본도 수정이 된다.
			//					-> Side Effect가 발생한다 라고 한다. (주의 ***)
			
			nums[0] = 111;
			
			System.out.println(copy[0]); //이게 왜 111이 나오는거냐 ~? 에 대한 것(배열 복사에 관한것).
			System.out.println(copy[1]);
			System.out.println(copy[2]);
			//nums는 주소값이 되니까 카피를 해도 데이터가 바뀌는게 아니라 주소값이 바뀌어서 자동으로 카피가된다.
		}

		private static void m4() {
			
			//각 자료형 > 배열 만들기
			
			
			//정수 배열(byte, short, int, long)
			byte[] list1 = new byte[5];
			
			list1[0] = 10;
			System.out.println(list1[0]);
			
			//------------------------------------------------
			
			//실수 배열(float, double)
			double[] list2 = new double[5];
			
			list2[0] = 3.14;
			System.out.println(list2[0]);
			
			//------------------------------------------------
			
			//문자 배열(char) == String
			char[] list3 = new char[5];
			
			list3[0] = 'a';
			System.out.println(list3[0]);
			
			//------------------------------------------------
			
			//논리 배열(boolean)
			boolean[] list4 = new boolean[5];
			
			list4[0] = true;
			System.out.println(list4[0]);
			
			//------------------------------------------------
			
			//참조형 배열(String)
			String[] list5 = new String[5];
			
			list5[0] = "홍길동";
			System.out.println(list5[0]);
			
			
			//------------------------------------------------
		
			
			Calendar[] list6 = new Calendar[5]; // Calendar 변수 x 5
			
			list6[0] = Calendar.getInstance(); //0번방에 시간을 집어넣는 것.
			System.out.println(list6[0]);
			
			
			
			
			
		}

		private static void m3() {
			
			//방 1개 : 배열의 요소(Element)
			//방 번호 : 배열의 인덱스(Index), 첨자
			//방 개수 : 배열의 길이(Length)
			
			//모든 참조형의 특징
			//- 할당된 공간을 초기화하지 않아도 자동으로 초기화가 된다.
			
			//배열의 자동초기화
			//-int[] 		> 모든 방을 0으로 초기화
			//-double[] 	> 모든 방을 0.0으로 초기화
			//-char[] 		> 모든 방을 '/0'로 초기화
			//-boolean[]	> 모든 방을 false로 초기화
			//-String[] 	> 모든 방을 null로 초기화
			
			int[] nums = new int[5];
			
			nums[0] = 10;
			nums[1] = 20;
			nums[2] = 30;
			//nums[3] = 40; // 0이 나온다.
			//nums[4] = 50;
			
			System.out.println(nums[0]);
			System.out.println(nums[1]);
			System.out.println(nums[2]);
			System.out.println(nums[3]);
			System.out.println(nums[4]);
			
			
			//System.out.println(nums[5]);
			//IndexOutOfBoundsException: <- 없는 방을 만들었다는 에러
			
			//배열탐색 > for문을 사용한다.
			for(int i=0; i<nums.length;i++) {
				System.out.printf("nums[%d] = %d\n",i, nums[i]);
			}
			
			//배열 길이 = 5
			//첨자 범위 = 0 ~ 4 (0 ~ 길이-1)
			
			
			
			
			
		}

		private static void m2() {
			//요구사항] 학생 3명 > 국어 점수 > 총점, 평균 구하기
			//추가요구	학생 300명
			
			//배열선언하기
			
			// - 자료형[] 변수명 = new 자료형[길이]; <-배열선언하는방법
			// - 배열타입(int[]) 배열명(kors) = new 배열타입(int) 길이([3])
			int[] kors = new int[300];
			
			kors[0] = 100; //방(인덱스)의 번호는 0부터 시작한다
			kors[1] = 90;
			kors[2] = 80;
			//얘는 300번을 다 쳐야한다.
			
//			int total = kors[0] + kors[1] + kors[2];
//			
//			int index = 0;
//			kors[index] = 100; //이렇게 변수를 아예 넣을 수도 있따.
			
			
			int total = 0;
			
			for(int i=0; i<kors.length; i++) {
				total += kors[i];
			}// i<300의 값만 바꿔주면 학생이 몇명이든 300만 바꿔주면 된다.
			// .length -> 300의 역할을한다.( 위에 배열선언문에 숫자만 바꾸면 일괄수정된다.)
			
			
			double avg = (double)total/kors.length;
			
			System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
			
			
			
		}

		private static void m1() {
			
			
			//요구사항] 학생 3명 > 국어 점수 > 총점, 평균 구하기
			
		int kor1 = 0;
			int kor2 = 0;
			int kor3 = 0;
			
		kor1 = 100;
			kor2 = 90;
			kor3 = 80;
			
			int total = kor1 + kor2 + kor3;
			
			double avg = total / 3.0;
			
			System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg); //인원수가 늘어나면 꽝이다..
			
			//요구사항] 학생 3명 > 국어 점수 > 총점, 평균 구하기
			//			학생 300명 !! 
			
			
			
			
			
			
			
			
			
			
			
		}
}
