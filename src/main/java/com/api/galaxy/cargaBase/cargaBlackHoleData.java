package com.api.galaxy.cargaBase;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.galaxy.dto.BlackHoleDTO;
import com.api.galaxy.model.BlackHole;
import com.api.galaxy.repository.BlackHoleRepositpry;

@Service
public class cargaBlackHoleData {

	private ModelMapper mapper;
	private BlackHoleRepositpry blackHoleRepository;

	public cargaBlackHoleData(ModelMapper mapper, BlackHoleRepositpry blackHoleRepository) {
		super();
		this.mapper = mapper;
		this.blackHoleRepository = blackHoleRepository;
	}

	public void powerDataBlackHoleCarga() {

		BlackHole b1 = new BlackHole();
		b1.setNome("eeeeeeeee");
		b1.setRaioX("232");
		b1.setRaioXInfravermelho("edncejrir");
		b1.setOptico("2323293723");
		b1.setOpticoInfravermelho("wewewewc");
		b1.setDescricao("wewefiwuee");
		b1.setRedshift(2.23);
		b1.setConstelacao("iujhjikj");
		b1.setDeclinacao("23iuhdec");
		b1.setCoordenadas("weweoij");
		b1.setEstimativaDistancia(2.23);
		b1.setDimensoes("oijhwjikj");

		BlackHoleDTO b1Dto = mapper.map(b1, BlackHoleDTO.class);

		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b1Dto, BlackHole.class)));
	}

}
