package com.generation.bigfarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.bigfarma.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
