package com.api.galaxy.service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.api.galaxy.dto.DayPhotoNasa;

import reactor.core.publisher.Mono;

@Service
public class ServiceDayPhotoNasa {

	private WebClient webClient;
	private String url = "https://api.nasa.gov/planetary/apod?api_key=";
	private String key = "O9GhnLpLgZPJ6ZvdMEaDtqXZUmnbdVC1tlf9SG55&";

	public ServiceDayPhotoNasa(WebClient webClient) {
		this.webClient = webClient;
	}
	 
	public DayPhotoNasa listDayData(String date) {
		String urlApi = url + key + date;
		
		Mono<DayPhotoNasa> bodyResponseData = this.webClient
				.method(HttpMethod.GET)
				.uri(urlApi)
				.retrieve()
				.bodyToMono(DayPhotoNasa.class);
		
		DayPhotoNasa dayPhoto = bodyResponseData.block();
		System.out.println(dayPhoto);
		return dayPhoto;
	}
}
