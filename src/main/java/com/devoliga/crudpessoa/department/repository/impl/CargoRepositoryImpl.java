package com.devoliga.crudpessoa.department.repository.impl;

import org.springframework.stereotype.Repository;

import com.devoliga.crudpessoa.department.entity.Cargo;
import com.devoliga.crudpessoa.department.repository.AbstractDao;
import com.devoliga.crudpessoa.department.repository.CargoRepository;

@Repository
public class CargoRepositoryImpl extends AbstractDao<Cargo, Long> implements CargoRepository{

}
