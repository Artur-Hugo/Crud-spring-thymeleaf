package com.devoliga.crudpessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devoliga.crudpessoa.model.Country;
import com.devoliga.crudpessoa.repository.CountryRepository;

@Controller
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	@GetMapping("/country")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data", countryRepository.findAll(PageRequest.of(page, 4)));
		model.addAttribute("currentPage", page);
		/**/
		return "country";
	}

	@PostMapping("/save")
	public String save(Country country) {
		countryRepository.save(country);
		return "redirect:/";
	}

	@GetMapping("/delete")
	public String deleteCountry(Integer id) {
		countryRepository.deleteById(id);
		return "redirect:/";
	}

	@GetMapping("/findOne")
	@ResponseBody
	public Country findOne(Integer id) {
		return countryRepository.findById(id).get();
	}
}
