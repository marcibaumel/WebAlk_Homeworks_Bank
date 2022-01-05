package com.homework.webalk1.bank.Exceptions;

import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ToString
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such entity")
public class NoEntityFoundedException extends RuntimeException{
}
