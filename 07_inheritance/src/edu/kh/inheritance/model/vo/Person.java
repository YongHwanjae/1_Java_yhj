package edu.kh.inheritance.model.vo;

public class Person {

	private String name;
	private int age;
	
	// ctrl + spacebar + enter : 기본 생성자
	public Person() { }

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// alt + s -> o 또는 alt + shift + s ->o
	// Generate Constructor using Fields..
	
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}


