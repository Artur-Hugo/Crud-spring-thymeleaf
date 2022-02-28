package com.devoliga.crudpessoa.department.repository;

import java.util.List;

import com.devoliga.crudpessoa.department.entity.Cargo;

public interface CargoRepository {
	
void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();

}
