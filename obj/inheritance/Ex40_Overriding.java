package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex40_Overriding {
	
	public static void main(String[] args) {
		
		
		//Ex40_Overriding.java
		
		
		
		
		
		
		Time t1 = new Time(2, 30);
		Time t2 = new Time(3, 40);
			System.out.println(t1.info());
			System.out.println(t2.info());
			
			System.out.println(t1);
			System.out.println(t1.toString());
			//두개는 같은거다 -> 오버라이딩 해야한다.(ToString()을 오버라이딩 하자)
			// 즉, info()의 역할을 대신한다..
			
			
			
			Calendar now = Calendar.getInstance();
//			  System.out.println(now);
//			  System.out.println(now.toString());
//			//이 두개도 같은거다 but, 이건 오버라이딩을 자동으로 해준다
		
		
		
	}//main

}//class


//시간 클래스
class Time{ 
	
	private int hour;
	private int min;
	
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public String info() {
		return this.hour + ":" + this.min;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
	
//	@Override //어노테이션 (주석)
//	public String toString() { // .ToString을 오버라이딩 하는법
//		
//		return this.hour + ":" + this.min;
//	}


	
	
	
}



















