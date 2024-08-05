package com.test.java.obj;


public class Child {
	
	
	private String name;
	private int age;
	
	private Parent mother;
	private Parent father;
	
	public String getName() {
		return name;
	}
	public Parent getMother() {
		return mother;
	}
	public void setMother(Parent mother) {
		this.mother = mother;
	}
	public Parent getFather() {
		return father;
	}
	public void setFather(Parent father) {
		this.father = father;
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

	

}
