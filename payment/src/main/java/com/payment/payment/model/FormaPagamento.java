package com.payment.payment.model;


public enum FormaPagamento {
    DINHEIRO("Dinheiro"),
    DEBITO("Cartão de debito"),
    CREDITO("Cartão de crédito"),
    PIX("Pix"),
    TRANSFERENCIA("Transferência");

    String descicao;

    private FormaPagamento(){
        
    }

    private FormaPagamento(String descricao){

        this.descicao=descricao;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }
    
}
