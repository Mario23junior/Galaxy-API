package com.api.galaxy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.galaxy.dto.GalaxyDTO;
import com.api.galaxy.service.GalaxyService;

@RestController
@RequestMapping("/project/api/galaxy/")
public class ControllerGalaxy {

	private GalaxyService service;
	
	public ControllerGalaxy(GalaxyService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<GalaxyDTO> save(@RequestBody GalaxyDTO galaxyDto) {
		return service.save(galaxyDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<GalaxyDTO> list(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<GalaxyDTO> update(@PathVariable Long id, @RequestBody GalaxyDTO galaxyDto) {
		return service.dataUpdate(id, galaxyDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<GalaxyDTO> delete(@PathVariable Long id){
		return service.deleteGalaxy(id);
	}
	
}









