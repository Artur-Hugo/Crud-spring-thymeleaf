package com.devoliga.crudpessoa.department.repository;

import java.util.List;

import com.devoliga.crudpessoa.department.entity.Departamento;

public interface DepartamentoRepository {
	
	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
