package com.api.galaxy.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Modelmapper {

	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
}
