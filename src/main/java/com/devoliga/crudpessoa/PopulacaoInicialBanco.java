package com.devoliga.crudpessoa;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devoliga.crudpessoa.model.Pessoa;
import com.devoliga.crudpessoa.repository.PessoaRepository;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Joao");
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("joao@gmail.com");
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNascimento(LocalDate.of(1990, 1, 1));
		p2.setEmail("maria@gmail.com");
		
		repo.save(p1);
		repo.save(p2);
	}

	
}
