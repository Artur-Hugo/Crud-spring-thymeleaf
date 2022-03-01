package com.devoliga.crudpessoa.department.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devoliga.crudpessoa.department.entity.Departamento;
import com.devoliga.crudpessoa.department.service.DepartamentoService;

@Service @Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

	@Override
	public void salvar(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override @Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
