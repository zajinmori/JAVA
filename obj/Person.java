package com.test.java.obj;

import java.util.Arrays;

public class Person {
	
	
	
	private String name;
	private int age;
	
	private String[] nick = new String[3];
	
	
	

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

//	public String[] getNick() {
//		return nick;
//	}
//
//	public void setNick(String[] nick) {
//		this.nick = nick;
//	}
	
	
	//배열에 접근하는 메서드
	
	private int index = 0;
	
	public void addNick(String nick) {
		this.nick[this.index] = nick;
		this.index++;
	}
	
	
	public String getNick(int index) {
		return this.nick[index];
	}
	
	
	
	
	
	
	
	public String info() {
		String temp = "";
		
		temp += "이름: " + this.name + "\r\n";
		temp += "나이: " + this.age + "\r\n";
		temp += "별명: " + Arrays.toString(this.nick) + "\r\n";
		
		return temp;
	}
	

}
