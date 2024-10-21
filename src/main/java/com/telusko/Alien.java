package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {

	private int age;
	private int salary;
	private Laptop lap;

	@ConstructorProperties({ "age", "lap" })
	public Alien(int age, Laptop lap) {
		this.age = age;
		this.lap = lap;
		System.out.println("Alien is created with two parameter");
	}

	@ConstructorProperties({ "age", "salary", "lap" })
	public Alien(int age, int salary, Laptop lap) {
		super();
		System.out.println("Alien is created with three parameters");
		this.age = age;
		this.salary = salary;
		this.lap = lap;
	}

	public void code() {
		System.out.println("Coding");
		lap.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter injection");
		this.age = age;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		System.out.println("Setter injection lap");
		this.lap = lap;
	}

}
