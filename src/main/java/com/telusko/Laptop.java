package com.telusko;

public class Laptop implements Computer {

	public Laptop() {
		System.out.println("Laptop is created");
	}

	@Override
	public void compile() {
		System.out.println("Laptop compiling...");
	}

}
