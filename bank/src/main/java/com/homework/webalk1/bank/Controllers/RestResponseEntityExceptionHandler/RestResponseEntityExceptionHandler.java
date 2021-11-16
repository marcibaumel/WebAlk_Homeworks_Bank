package com.homework.webalk1.bank.Controllers.RestResponseEntityExceptionHandler;


import com.homework.webalk1.bank.Services.exception.NoSuchEntityFromTheDb;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {
    /*
    @ExceptionHandler(value = {NoSuchEntityFromTheDb.class})
    protected ResponseEntity<Object> handlerNoSuchElement(RuntimeException ex, WebRequest request){
       return handlerNoSuchElement(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }


     */

}
