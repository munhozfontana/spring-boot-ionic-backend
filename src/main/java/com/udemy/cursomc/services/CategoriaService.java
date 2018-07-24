package com.udemy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursomc.domain.CategoriaDomain;
import com.udemy.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public CategoriaDomain buscar(Integer id) {
		Optional <CategoriaDomain> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
