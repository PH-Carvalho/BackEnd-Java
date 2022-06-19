package com.amazon.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("produtos")
public class Produto {
  @Id
  private String id;
  private Integer codigo;
  private String descricao;
  private Double valor;
  private Double precoCusto;
  private String fornecedor;


  public Double getPrecoCusto() {
    return precoCusto;
  }

  public void setPrecoCusto(Double precoCusto) {
    this.precoCusto = precoCusto;
  }

  public String getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(String fornecedor) {
    this.fornecedor = fornecedor;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getCodigo() {
    return this.codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return this.valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }


}