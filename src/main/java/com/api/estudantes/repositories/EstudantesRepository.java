package com.api.estudantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.estudantes.models.Estudantes;

public interface EstudantesRepository extends JpaRepository<Estudantes, Long>{
	
	Estudantes findById(long id);

}
