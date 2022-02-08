package com.devoliga.crudpessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devoliga.crudpessoa.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
