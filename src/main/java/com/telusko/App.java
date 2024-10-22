package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Desktop dt = context.getBean("desktop1", Desktop.class);
		dt.compile();
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Alien obj = context.getBean("alien1", Alien.class);
//		obj.code();
//
//		Computer obj2 = context.getBean(Computer.class);
//		obj2.compile();

	}

}
