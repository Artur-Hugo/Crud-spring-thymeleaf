package com.devoliga.crudpessoa.department.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devoliga.crudpessoa.department.entity.Funcionario;
import com.devoliga.crudpessoa.department.service.FuncionarioService;

@Service @Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Override
	public void salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override @Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
