package com.th.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.th.model.Formation;
import com.th.repository.FormationRepository;

@Controller
@RequestMapping("formation")
public class FormationControllerSimple {
	@Autowired
	FormationRepository formationRepository;
@GetMapping("")
public String welcomepage(Model m, @RequestParam(name = "titre", required = false) String titre, @RequestParam(name = "prix", required = false) String prix,Pageable pageable)
{
	Page<Formation> listeFor;
	if(titre==null || prix==null)
	{
	 listeFor= formationRepository.findAll( pageable); 
	}
	else
	{
		 listeFor=(Page<Formation>) formationRepository.findByTitreOrPrix(titre, Double.parseDouble(prix), pageable);
	}
	
	Formation f=new Formation();
	m.addAttribute("f", f);
	m.addAttribute("liste", listeFor);
return "formation";	
}
@PostMapping("add")
public String addUser(@ModelAttribute(name = "formation") Formation formation)
{
formationRepository.save(formation); // ajouter BDD
return "redirect:/formation";

}
}
