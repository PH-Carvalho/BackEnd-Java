package com.payment.payment.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import com.payment.payment.dto.PaymentDto;
import com.payment.payment.dto.PaymentDtoWithProduct;
import com.payment.payment.model.Payment;
import com.payment.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository ;
    
    private ModelMapper mapper = new ModelMapper();

    @Override
    public PaymentDtoWithProduct obterPagamentoPorId(String id) {
        Optional<Payment> paymentSearch = repository.findById(id);
        
        if(paymentSearch.isPresent()){
            return mapper.map(paymentSearch, PaymentDtoWithProduct.class);
        }

        return null;
    }

    @Override
    public PaymentDto CadastrarPagamento(PaymentDto Pagamento) {
        
        Payment receberPagamento = mapper.map(Pagamento, Payment.class);
        repository.save(receberPagamento);

        return mapper.map(receberPagamento, PaymentDto.class);
    }


    @Override
    public PaymentDto ProdutoComprado(String produtoComprado) {
        
        return null;
    }

    @Override
    public List<PaymentDto> obterTodosPagamentos() {
        
        List<Payment> pagamento = repository.findAll();

        return pagamento.stream()
        .map(p-> mapper.map(p, PaymentDto.class))
        .collect(Collectors.toList());

    }


    
}
