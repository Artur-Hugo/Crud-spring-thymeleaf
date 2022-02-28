package com.devoliga.crudpessoa.department.repository;

import java.util.List;

import com.devoliga.crudpessoa.department.entity.Funcionario;

public interface FuncionarioRepository {

void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
