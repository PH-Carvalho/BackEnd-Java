package com.amazon.ecommerce.repository;

import com.amazon.ecommerce.model.Produto;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String>{

  Produto findByCodigo(Integer codigo);
  
}
