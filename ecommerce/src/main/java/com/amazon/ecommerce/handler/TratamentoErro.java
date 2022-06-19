package com.amazon.ecommerce.handler;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TratamentoErro extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
      
                List<String> menssagemErro = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(m -> m.getDefaultMessage())
                .collect(Collectors.toList());


        return new ResponseEntity<>(menssagemErro, HttpStatus.NOT_ACCEPTABLE);
    }
    
    
}

