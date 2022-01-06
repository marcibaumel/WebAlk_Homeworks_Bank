package com.homework.webalk1.bank.Controllers;

import com.homework.webalk1.bank.Controllers.DTO.CreateTransaction;
import com.homework.webalk1.bank.Controllers.DTO.Transaction;
import com.homework.webalk1.bank.Services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @DeleteMapping("/delete")
    public void deleteTransaction(@RequestParam UUID id){
        transactionService.deleteById(id);
    }

    @PutMapping("/update")
    public void updateTransaction(@RequestBody @Valid Transaction transaction){
        transactionService.updateTransaction(transaction.toServiceDTO());
    }

    @GetMapping("/getAllTransaction")
    public List<Transaction> getAllTransaction(){
        List<Transaction> transactionList = new ArrayList<>();
        for(com.homework.webalk1.bank.Services.ServiceDTO.Transaction transaction : transactionService.getAllTransactions()){
            transactionList.add(new Transaction(transaction));
        }
        return transactionList;
    }
}
