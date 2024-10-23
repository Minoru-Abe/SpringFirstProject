package com.telusko;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	public Desktop() {
		System.out.println("Desktop is created");
	}

	public void compile() {
		System.out.println("Desktop compiling...");
	}

}
