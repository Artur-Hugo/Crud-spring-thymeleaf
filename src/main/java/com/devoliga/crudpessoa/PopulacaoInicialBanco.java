package com.devoliga.crudpessoa;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devoliga.crudpessoa.model.Country;
import com.devoliga.crudpessoa.model.Pessoa;
import com.devoliga.crudpessoa.repository.CountryRepository;
import com.devoliga.crudpessoa.repository.PessoaRepository;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepository repo;
	
	 @Autowired
	    CountryRepository countryRepository;
	
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
		
		
        countryRepository.save(new Country("Earth", "World"));
        countryRepository.save(new Country("China", "Beging"));
        countryRepository.save(new Country("Germany", "Berlin"));
        countryRepository.save(new Country("USA", "Washington DC"));
        countryRepository.save(new Country("Russia", "Moscow"));
        countryRepository.save(new Country("Namibia", "Windhoek"));
        countryRepository.save(new Country("India", "New Delhi"));
        countryRepository.save(new Country("North Korea", "Pyongyang"));
        countryRepository.save(new Country("Kenya", "Nairobi"));
        countryRepository.save(new Country("Canada", "Ottawa"));
        countryRepository.save(new Country("Jamaica", "Kingston"));
        countryRepository.save(new Country("Brazil", "Brasilia"));
        countryRepository.save(new Country("Egypt", "Cairo"));
        countryRepository.save(new Country("Nigeria", "Lagos"));
        countryRepository.save(new Country("Jordon", "Amman"));
        countryRepository.save(new Country("Curacao", "Willemstad"));
        countryRepository.save(new Country("Sao Tome Principe", "Sao Tome"));
	}

	
}
