package com.falmeida.tech.comparator;

public class Person {

	private String name;
	
	private int age;
	
	private Double wage;
	
	public Person(String name,int age,Double wage) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.wage=wage;
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

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}
	
}
