package com.homework.webalk1.bank.Controllers;

import com.homework.webalk1.bank.Services.Bank;
import com.homework.webalk1.bank.Services.BankServices;
import com.homework.webalk1.bank.Repositories.BankModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/bank")
public class BankController {

    private final BankServices bankServices;

    public BankController(BankServices bankServices){
        this.bankServices = bankServices;
    }

    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<BankDto> getAllAccount(){
        List<BankDto> bankDtoList = new ArrayList<>();
        for(Bank bank: bankServices.getAllBank()){
            bankDtoList.add(new BankDto(bank));
        }
        return bankDtoList;
    }

    @PostMapping
    public void newBankUser(@RequestBody @Valid BankModel bankModel){
        bankServices.saveBank();
    }

    /*
    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public BankModel getAccountById(@PathVariable("id") Long id){
        return bankServices.getAnAccountById(id);
    }

    @DeleteMapping(path="/{id}")
    public void deleteAccountById(@PathVariable("id") Long id){
        bankServices.deleteUserById(id);
    }
    */
}
