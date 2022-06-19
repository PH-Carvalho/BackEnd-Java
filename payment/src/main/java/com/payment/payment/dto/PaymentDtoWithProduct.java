package com.payment.payment.dto;

import com.payment.payment.client.Produto;

public class PaymentDtoWithProduct extends PaymentDto {

    private Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    
}
