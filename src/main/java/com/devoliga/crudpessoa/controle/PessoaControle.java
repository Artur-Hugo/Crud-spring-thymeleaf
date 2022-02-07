package com.devoliga.crudpessoa.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devoliga.crudpessoa.model.Pessoa;
import com.devoliga.crudpessoa.repository.PessoaRepository;


@Controller
public class PessoaControle {

	@Autowired
	PessoaRepository repo;
	
	@GetMapping("/rh/pessoas")
	public String pessoas(Model model) {
		
		model.addAttribute("listaPessoas", repo.findAll());
		return "rh/pessoas/index";
	}
	
	@GetMapping("/rh/pessoas/nova")
	public String novaPessoa(@ModelAttribute("pessoa") Pessoa pessoa) {
		return "rh/pessoas/form";
	}
	
	@PostMapping("/rh/pessoas/salvar")
	public String salvarPessoa(@ModelAttribute("pessoa") Pessoa pessoa) {
		repo.save(pessoa);
		return "redirect:/rh/pessoas";
	}
}
