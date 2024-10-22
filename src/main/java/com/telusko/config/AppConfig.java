package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.telusko.Desktop;

@Configuration
public class AppConfig {
	
	@Bean(name={"com2","desktop1"})
	public Desktop desktop() {
		return new Desktop();
	}
	

}
