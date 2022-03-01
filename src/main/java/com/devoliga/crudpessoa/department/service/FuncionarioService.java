package com.devoliga.crudpessoa.department.service;

import java.util.List;

import com.devoliga.crudpessoa.department.entity.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

}
