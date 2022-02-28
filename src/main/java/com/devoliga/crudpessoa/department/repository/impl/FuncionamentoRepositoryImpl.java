package com.devoliga.crudpessoa.department.repository.impl;


import org.springframework.stereotype.Repository;

import com.devoliga.crudpessoa.department.entity.Funcionario;
import com.devoliga.crudpessoa.department.repository.AbstractDao;
import com.devoliga.crudpessoa.department.repository.FuncionarioRepository;

@Repository
public class FuncionamentoRepositoryImpl extends AbstractDao<Funcionario, Long> implements FuncionarioRepository {

}
