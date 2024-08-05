package com.test.java.obj;

public class Book {
	
	
	public String title; //외부노출가능.
	//private int price; //외부노출불가능. / 근데 이걸(private) 왜씀?? ->보호하기 위해서
	//public int price;
	private int price;
	
	
	
	
	private String publisher;
	private String author;
	private int discount;
	private int pages;
	
	
	
	
	
	
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	///aaa() 이름바꾸기 (Setter)
	//- set키워드 + 멤버변수명(캐멀표기법) (set+Price)
	public void setPrice(int price) {//영역이 넓은 거랑 좁은거랑 충돌이 일어나면 무조건 좁은거가 이긴다.
		this.price = price; //this. -> 객체 접근 연산자 this란 '나'를 뜻하는 말이다. (내부. 즉, 같은 클래스 안에서만 가능하다(객체가 소유한 변수인 멤버변수만 가능하다)
							// 객체가 소유한 변수는 멤버변수밖에없다. 그래서 지역변수는(int price) 안된다.
		//this.title = "";	//O 모든 멤버변수 앞에는 this.가 붙어있다.
		//title = "";			//X
		
	}
	
	//bbb() 이름바꾸기 (getter) 
	//- get키워드 + 멤버변수명(캐멀표기법) (get+Price
	public int getPrice() {
		return this.price;
	}
	
	
	
	public void aaa(int a) { //private 변수에 접근하는 방법
		
		//---개입--- > 통제가 가능해짐 [보통 private로 변수를 생성하고 아래처럼 통제를 해줘야 이상한 값이 안나온다.]
		if(a >= 0 && a <= 100000) {
			price = a;
			
		}
		
		
	}
	
	public int bbb() {
		return price; //통제한것을 호출하게 하는 방법
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	

	
	
}
