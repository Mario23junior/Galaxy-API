package com.api.galaxy.cargaBase;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.galaxy.dto.GalaxyDTO;
import com.api.galaxy.model.Galaxy;
import com.api.galaxy.repository.GalaxyRepository;

@Service
public class cargaService {

	private GalaxyRepository repository;
	private ModelMapper mapper;

	public cargaService(GalaxyRepository repository, ModelMapper mapper) {
		super();
		this.repository = repository;
		this.mapper = mapper;
	}

	public void powerDataBase() {
		Galaxy galaxy1 = new Galaxy(1l, "Andromeda",
				"https://i.pinimg.com/originals/65/10/90/651090e75255e0b95904305b77b3b73c.gif", 3.44, "+41° 16′ 9″",
				"752 kpc", "−0,001",
				"A galáxia de Andrômeda (Messier 31, NGC 224) é uma galáxia espiral localizada a cerca de 2,54 milhões de anos-luz de distância da Terra, na direção da constelação de Andrômeda.",
				0.0, 152.000, 110.000, 100113, 1.230, 1, "M32, M110", "RA 00h 42m 44s | Dez +41° 16' 09");

		GalaxyDTO gDto = mapper.map(galaxy1, GalaxyDTO.class);
		
		repository.saveAll(Arrays.asList(mapper.map(gDto, Galaxy.class)));
	}
}
