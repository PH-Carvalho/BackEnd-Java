package com.payment.payment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.payment.dto.PaymentDto;
import com.payment.payment.dto.PaymentDtoWithProduct;
import com.payment.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired

   private PaymentService payment;


   @GetMapping

   public List<PaymentDto> obterTodosOsPagamentos(){
    return payment.obterTodosPagamentos();
   }

   @GetMapping("/{id}")
   public PaymentDtoWithProduct obterPorId(@PathVariable String id){
    
    return payment.obterPagamentoPorId(id);
    
   }

   @PostMapping
   public ResponseEntity<PaymentDto> cadastrarPagamento(@RequestBody @Valid PaymentDto paymentDto){
       return new ResponseEntity<>(payment.cadastrarPagamento(paymentDto), HttpStatus.CREATED);

   } 
    
   }


  

    

