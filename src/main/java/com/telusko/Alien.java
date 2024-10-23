package com.telusko;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {

	private int age;
	@Value("250000")
	private int salary;
	
	@Autowired
	@Qualifier("laptop")
	private Computer com;

	public Alien() {
		System.out.println("Default constructor");
	}

	@ConstructorProperties({ "age", "com" })
	public Alien(int age, Computer com) {
		this.age = age;
		this.com = com;
		System.out.println("Alien is created with two parameter");
	}

	@ConstructorProperties({ "age", "salary", "com" })
	public Alien(int age, int salary, Computer com) {
		super();
		System.out.println("Alien is created with three parameters");
		this.age = age;
		this.salary = salary;
		this.com = com;
	}

	public void code() {
		System.out.println("Coding");
		com.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter injection");
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
}
