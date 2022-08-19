package com.api.galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.galaxy.model.Galaxy;

@Repository
public interface GalaxyRepository extends JpaRepository<Galaxy, Long>{

}
