package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;

@Configuration
public class AppConfig {
	
	
	@Bean
	public Alien alien(Computer com) {
		Alien obj = new Alien();
		obj.setAge(25);
		obj.setCom(com);
		return obj;
	}
	
	@Bean
//	@Scope("prototype")
	@Primary
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}
	
	
	

}
