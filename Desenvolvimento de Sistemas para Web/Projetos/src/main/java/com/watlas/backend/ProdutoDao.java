package com.watlas.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // faz virar dao
public interface ProdutoDao extends JpaRepository<Produto, Long> {
}
