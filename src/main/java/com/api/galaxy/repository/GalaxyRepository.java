package com.api.galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.galaxy.model.Galaxy;

 public interface GalaxyRepository extends JpaRepository<Galaxy, Long>{

	Galaxy findByNome(String nome);

}
