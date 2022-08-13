package com.api.estudantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.estudantes.models.Estudantes;
import com.api.estudantes.repositories.EstudantesRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value="/api")
public class EstudantesController {
	
	@Autowired
	EstudantesRepository estudantesRepository;
	
	@GetMapping("/estudantes")
	public List<Estudantes> listaEstudantes(){
		return estudantesRepository.findAll();
	}
	
	@GetMapping("/estudantes/{id}")
	public Estudantes listaEstudantesUnico(@PathVariable(value="id") long id) {
		return estudantesRepository.findById(id);
	}
	
	@PostMapping("/estudantes")
	public Estudantes salvaEstudantes(@RequestBody Estudantes estudantes){
		return estudantesRepository.save(estudantes);
	}
	
	@PutMapping("/estudantes")
	public Estudantes atualizaEstudantes(@RequestBody Estudantes estudantes) {
		return estudantesRepository.save(estudantes);
	}
	
	@DeleteMapping("/estudantes")
	public void deletaEstudantes(@RequestBody Estudantes estudantes) {
		estudantesRepository.delete(estudantes);
	}

}
