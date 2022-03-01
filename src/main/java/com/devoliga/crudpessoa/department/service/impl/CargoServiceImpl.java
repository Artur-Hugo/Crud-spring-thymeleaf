package com.devoliga.crudpessoa.department.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devoliga.crudpessoa.department.entity.Cargo;
import com.devoliga.crudpessoa.department.repository.CargoRepository;
import com.devoliga.crudpessoa.department.service.CargoService;

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepository; 
	
	
	@Override
	public void salvar(Cargo cargo) {
		// TODO Auto-generated method stub
		 cargoRepository.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoRepository.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		cargoRepository.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return cargoRepository.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return cargoRepository.findAll();
	}

}
