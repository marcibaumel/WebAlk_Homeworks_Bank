package com.homework.webalk1.bank;

import com.homework.webalk1.bank.implementation.SideCalculations;
import com.homework.webalk1.bank.model.BankDTO;
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
    public List<BankDTO> getAllAccount(){
        return bankServices.getAllAccount();
    }

    @PostMapping(path="")
    public void newBankUser(@RequestBody @Valid BankDTO bankDTO){
        bankServices.saveAccount(bankDTO);
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public BankDTO getAccountById(@PathVariable("id") Long id){
        return bankServices.getAnAccountById(id);
    }



}
