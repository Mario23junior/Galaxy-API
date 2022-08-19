package com.api.galaxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Modelmapper {
  
	@Bean
	public Modelmapper mapper() {
		return new Modelmapper();
	}
}
