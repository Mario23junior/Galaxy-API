package com.api.galaxy.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.galaxy.dto.GalaxyDTO;
import com.api.galaxy.exceptions.ExceptionsReturnMessageError;
import com.api.galaxy.model.Galaxy;
import com.api.galaxy.repository.GalaxyRepository;

@Service
public class GalaxyService {
  
	private ModelMapper mapper;
	private GalaxyRepository repository;
	
	public GalaxyService(ModelMapper mapper, GalaxyRepository repository) {
 		this.mapper = mapper;
		this.repository = repository;
	}
	
	
	public ResponseEntity<GalaxyDTO> save(GalaxyDTO galaxyDto) {
		ValidValueDuplicate(galaxyDto);
		Galaxy body = bodySave(mapper.map(galaxyDto, Galaxy.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(body, GalaxyDTO.class));
	}
	
	public Galaxy bodySave(Galaxy galaxy) {
		return repository.save(galaxy);
	}
	
	public void ValidValueDuplicate(GalaxyDTO galaxyDto) {
		Galaxy dtoData = mapper.map(galaxyDto, Galaxy.class);
		Galaxy systemFind = repository.findByNome(galaxyDto.getNome());
		if(systemFind != null && systemFind.getId() != dtoData.getId()) {
			throw new ExceptionsReturnMessageError("A Galaxya "+ systemFind.getNome()+" já esta cadastrado");
		}
	}
	
	public ResponseEntity<GalaxyDTO> listId(Long id) {
		Optional<Galaxy> listId = repository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), GalaxyDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
	}
	
	
}
