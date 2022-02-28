package com.devoliga.crudpessoa.department.repository.impl;

import org.springframework.stereotype.Repository;

import com.devoliga.crudpessoa.department.entity.Departamento;
import com.devoliga.crudpessoa.department.repository.AbstractDao;
import com.devoliga.crudpessoa.department.repository.DepartamentoRepository;

@Repository
public class DepartamentoRepositoryImpl  extends AbstractDao<Departamento, Long> implements DepartamentoRepository{

}
