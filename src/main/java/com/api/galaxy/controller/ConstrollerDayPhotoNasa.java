package com.api.galaxy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.galaxy.dto.DayPhotoNasa;
import com.api.galaxy.service.ServiceDayPhotoNasa;

@RestController
@RequestMapping("/project/api/photo/")
public class ConstrollerDayPhotoNasa {
    
	private ServiceDayPhotoNasa service;
	
	public ConstrollerDayPhotoNasa(ServiceDayPhotoNasa service) {
		this.service = service;
	}
	
	public ResponseEntity<DayPhotoNasa> listPhotoDayAniver(){
		return null;
		
	}
	
	

}
