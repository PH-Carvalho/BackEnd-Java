package com.payment.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.payment.payment.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment,String>{
    
    
}
