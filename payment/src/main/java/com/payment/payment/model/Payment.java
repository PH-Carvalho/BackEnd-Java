package com.payment.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Document("payment")
public class Payment {
    
    @Id
    private String id;
    private FormaPagamento formaPagamento;
    private Double valorPago;
    private String idProduto;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Double getValorPago() {
        return valorPago;
    }
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
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
