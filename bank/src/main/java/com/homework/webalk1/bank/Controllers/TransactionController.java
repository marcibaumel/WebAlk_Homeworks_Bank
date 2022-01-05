package com.homework.webalk1.bank.Controllers;

import com.homework.webalk1.bank.Controllers.DTO.CreateTransaction;
import com.homework.webalk1.bank.Controllers.DTO.Transaction;
import com.homework.webalk1.bank.Services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/transaction")
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping(path = ("/saveNewTransaction"),produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction saveNewTransaction(@RequestBody @Valid CreateTransaction createTransaction){
        return new Transaction(transactionService.saveNewTransaction(createTransaction.toServiceDto()));
    }

    @GetMapping(path = ("/findHighestTransaction"),produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction findHighestTransaction(){
        return new Transaction(transactionService.findHighestTransaction());
    }

}
