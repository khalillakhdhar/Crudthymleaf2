package com.th.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.model.Formation;
import com.th.repository.FormationRepository;

@RestController
@RequestMapping("/formationapi")
public class FormationController {
@Autowired
FormationRepository formationRepository;

@GetMapping("")
List<Formation> findAll()
{
return formationRepository.findAll();	

}
@PostMapping("")
Formation addone(@RequestBody Formation formation )
{
return formationRepository.save(formation);	
}
@DeleteMapping("/{id}")
public void deleteFormation(@PathVariable long id)
{
formationRepository.deleteById(id);	
}
@GetMapping("/{titre}/{prix}")
public List<Formation> search(@PathVariable String titre,@PathVariable double prix,Pageable pageable)
{
return formationRepository.findByTitreOrPrix(titre, prix,pageable);	

}



}
