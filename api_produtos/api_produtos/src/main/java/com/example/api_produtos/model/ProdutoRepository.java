package com.example.api_produtos.model;

// ProdutoRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
