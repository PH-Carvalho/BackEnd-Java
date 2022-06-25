package com.payment.payment.dto;

import com.payment.payment.client.Produto;

public class PaymentDtoWithProduct extends PaymentDto {

    private Produto produtoDetalhes;

    public Produto getProdutoDetalhes() {
        return produtoDetalhes;
    }

    public void setProdutoDetalhes(Produto produtoDetalhes) {
        this.produtoDetalhes = produtoDetalhes;
    }

    
    
}
