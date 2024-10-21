package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj = (Alien) context.getBean("alien1");
		System.out.println(obj.getAge());
		obj.code();
		
		Alien obj2 = (Alien) context.getBean("alien1");
		obj.code();
		
		
	}

}