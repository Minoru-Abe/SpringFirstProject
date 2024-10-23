package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Alien obj = context.getBean(Alien.class);
		obj.code();
		System.out.println(obj.getSalary());
		
		
		Alien obj2 = context.getBean(Alien.class);
		obj2.setSalary(10000000);
		System.out.println(obj2.getSalary());
		
//		Computer dt = context.getBean(Desktop.class);
//		dt.compile();
//		
//		Computer dt2 = context.getBean(Desktop.class);
//		dt2.compile();
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Alien obj = context.getBean("alien1", Alien.class);
//		obj.code();
//
//		Computer obj2 = context.getBean(Computer.class);
//		obj2.compile();

	}

}
