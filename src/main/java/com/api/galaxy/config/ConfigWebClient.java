package com.api.galaxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigWebClient {
   
	@Bean
	public WebClient webClientFrom(WebClient.Builder builder) {
		return builder
				.baseUrl("https://api.nasa.gov/planetary/apod?")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}
}
