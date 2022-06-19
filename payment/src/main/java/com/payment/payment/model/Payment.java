package com.payment.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Document("payment")
public class Payment {
    
    @Id
    private String id;
    private FormaPagamento formaPagamento;
    private Double valorPagor;
    private String idProduto;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Double getValorPagor() {
        return valorPagor;
    }
    public void setValorPagor(Double valorPagor) {
        this.valorPagor = valorPagor;
    }
    public String getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    } 

    
    



}
