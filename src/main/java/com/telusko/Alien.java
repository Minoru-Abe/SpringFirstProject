package com.telusko;

public class Alien {
	
	
	private int age;
	private Laptop lap;
	
	public Alien() {
		System.out.println("Alien is created");
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
