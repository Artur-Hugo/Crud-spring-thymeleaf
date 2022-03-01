package com.devoliga.crudpessoa.department.service;

import java.util.List;

import com.devoliga.crudpessoa.department.entity.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);

	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
}
