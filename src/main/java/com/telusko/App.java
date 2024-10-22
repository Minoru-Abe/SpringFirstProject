package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj = context.getBean("alien1", Alien.class);
		obj.code();

		Computer obj2 = context.getBean(Computer.class);
		obj2.compile();

	}

}
