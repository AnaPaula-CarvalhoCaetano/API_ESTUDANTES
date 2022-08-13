package com.api.estudantes.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;

@Entity
@Table(name= "TB_ESTUDANTES")
@Configuration
public class Estudantes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nome_aluno;
	private String sobrenome_aluno;
	
	public Estudantes() {
		super();
		
	}

	public Estudantes(long id, String nome_aluno, String sobrenome_aluno) {
		super();
		this.id = id;
		this.nome_aluno = nome_aluno;
		this.sobrenome_aluno = sobrenome_aluno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public String getSobrenome_aluno() {
		return sobrenome_aluno;
	}

	public void setSobrenome_aluno(String sobrenome_aluno) {
		this.sobrenome_aluno = sobrenome_aluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudantes other = (Estudantes) obj;
		return id == other.id;
	}
	
	
	
	
	

}
