package com.api.galaxy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("{date}")
	public DayPhotoNasa listPhotoDayAniver(@PathVariable String date) {
		return service.listDayData(date);
	}

	@GetMapping
	public List<DayPhotoNasa> listAllPhotoDay() {
		return service.listDayAllData();
	}
}
