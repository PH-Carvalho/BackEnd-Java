package com.payment.payment.client;

public class Produto {

    private String id;
    private Integer codigo;
    private String descricao;
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
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
}