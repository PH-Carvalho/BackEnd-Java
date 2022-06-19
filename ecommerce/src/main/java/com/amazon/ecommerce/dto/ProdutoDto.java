package com.amazon.ecommerce.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class ProdutoDto {
  private String id;
  private Integer codigo;
  @NotEmpty (message = "A descrição do produto deve ser informada")
  private String descricao;
  @Positive 
  private Double valor;
  private Double precoCusto;
  private String fornecedor;
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public Integer getCodigo() {
    return codigo;
  }
  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
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

  
  
}
