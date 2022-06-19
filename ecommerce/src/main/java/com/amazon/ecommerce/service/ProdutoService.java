package com.amazon.ecommerce.service;

import java.util.List;

import com.amazon.ecommerce.dto.ProdutoDto;

public interface ProdutoService {
  List<ProdutoDto> obterTodosOsProdutos();
  ProdutoDto obterPorId(String id);
  ProdutoDto obterPorCodigo(Integer codigo);
  ProdutoDto cadastrarProduto(ProdutoDto produto);
  void excluirProduto(String id);
  ProdutoDto alterarProduto(String id, ProdutoDto produto);
  
}
