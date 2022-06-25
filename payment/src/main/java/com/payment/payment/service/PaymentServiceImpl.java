package com.payment.payment.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.payment.client.Produto;
import com.payment.payment.client.ProdutoFeignClient;
import com.payment.payment.dto.PaymentDto;
import com.payment.payment.dto.PaymentDtoWithProduct;
import com.payment.payment.model.Payment;
import com.payment.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository ;

    @Autowired

    private ProdutoFeignClient feignClient;
    
    private ModelMapper mapper = new ModelMapper();

    @Override
    public PaymentDtoWithProduct obterPagamentoPorId(String id) {
        Optional<Payment> paymentSearch = repository.findById(id);
        
        if(paymentSearch.isPresent()){

           /* primeira forma: PaymentDtoWithProduct paymentWithDetails = mapper.map(paymentSearch, PaymentDtoWithProduct.class);
            paymentWithDetails.setProdutoDetalhes(feignClient.obterProdutoPorId(paymentSearch.get().getIdProduto()));
            return paymentWithDetails;*/

            //Segunda Forma:

            PaymentDtoWithProduct paymentWithDetails = mapper.map(paymentSearch.get(), PaymentDtoWithProduct.class);

            //incluindo a chamada ao produto.

            Produto produto = feignClient.obterProdutoPorId(paymentSearch.get().getIdProduto());
            
            paymentWithDetails.setProdutoDetalhes(produto);

            return paymentWithDetails;
        }

        return null;
    }

    @Override
    public PaymentDto cadastrarPagamento(PaymentDto Pagamento) {
        
        Payment receberPagamento = mapper.map(Pagamento, Payment.class);
        repository.save(receberPagamento);

        return mapper.map(receberPagamento, PaymentDto.class);
    }


    @Override
    public PaymentDto produtoComprado(String produtoComprado) {
        
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
