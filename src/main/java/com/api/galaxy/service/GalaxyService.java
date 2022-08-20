package com.api.galaxy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public ResponseEntity<GalaxyDTO> dataUpdate(Long id, GalaxyDTO galaxyDto) {
		Optional<Galaxy> galaxyData = repository.findById(id);
		if(galaxyData.isPresent()) {
			Galaxy data = galaxyData.get();
			data.setId(galaxyDto.getId());
			data.setSatelitesNaturais(galaxyDto.getSatelitesNaturais());
			data.setMassa(galaxyDto.getMassa());
			data.setRaio(galaxyDto.getRaio());
			data.setRotacao(galaxyDto.getRotacao());
			data.setUrlImg(galaxyDto.getUrlImg());
			data.setNome(galaxyDto.getNome());
			data.setCoordenadas(galaxyDto.getCoordenadas());
			data.setDeclinacao(galaxyDto.getDeclinacao());
			data.setDescricao(galaxyDto.getDescricao());
			data.setDesvioVermelho(galaxyDto.getDesvioVermelho());
			data.setEstrelas(galaxyDto.getEstrelas());
			data.setIdadeEstimada(galaxyDto.getIdadeEstimada());
			data.setMagnitude(galaxyDto.getMagnitude());
			data.setDistancia(galaxyDto.getDistancia());
			data.setDimensoes(galaxyDto.getDimensoes());
			repository.save(data);
			return ResponseEntity.ok(mapper.map(data, GalaxyDTO.class));	
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<GalaxyDTO> deleteGalaxy(Long id) {
		Optional<Galaxy> listId = repository.findById(id);
		if(listId.isPresent()) {
			repository.delete(listId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
	}
	
	public List<GalaxyDTO> listAllData() {
		List<Galaxy> list = repository.findAll();
		try {
			return list
					.stream()
					.map(listDto -> mapper.map(listDto, GalaxyDTO.class))
					.collect(Collectors.toList());
		} catch (ExceptionsReturnMessageError e) {
			throw new ExceptionsReturnMessageError("Erro ao listar todas as galaxias ");
		}
 	}
	
	
}
