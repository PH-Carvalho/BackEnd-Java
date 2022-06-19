package com.payment.payment.dto;

import com.payment.payment.model.FormaPagamento;

public class PaymentDto {

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
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
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

    
 
    
}
