package com.telusko;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

	public Laptop() {
		System.out.println("Laptop is created");
	}

	@Override
	public void compile() {
		System.out.println("Laptop compiling...");
	}

}
