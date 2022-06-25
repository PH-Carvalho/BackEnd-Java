package com.payment.payment.service;

import java.util.List;

import com.payment.payment.dto.PaymentDto;
import com.payment.payment.dto.PaymentDtoWithProduct;

public interface PaymentService {
    
    public PaymentDtoWithProduct obterPagamentoPorId(String id);
    public PaymentDto cadastrarPagamento(PaymentDto tipoDePagamento);
    public PaymentDto produtoComprado(String produtoComprado);
    public List<PaymentDto> obterTodosPagamentos();

}
