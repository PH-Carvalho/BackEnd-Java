package com.payment.payment.dto;

import com.payment.payment.model.FormaPagamento;

public class PaymentDto {

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
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
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

    
 
    
}
