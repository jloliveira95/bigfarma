package com.generation.bigfarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.bigfarma.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
