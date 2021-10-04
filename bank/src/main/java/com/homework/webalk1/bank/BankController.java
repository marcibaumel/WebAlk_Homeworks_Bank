package com.homework.webalk1.bank;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class BankController {

    private final List<BankDTO> bankUsers = new ArrayList<>();
    private SideCalculations sideCalculations = new SideCalculations();

    @GetMapping(path="/bank", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BankDTO> getEveryAccount(){
        return bankUsers;
    }

    @PostMapping(path="bank/")
    public void newAccount(@RequestBody @Valid BankDTO bankNewUser){
        bankUsers.add(bankNewUser);
    }

    @PutMapping (path="bank/{id}")
    public void changeUserBankName(@PathVariable("id") String id, String newBankName){
        int validId= sideCalculations.getTheUserElementNumberById(id, bankUsers);
        if(validId != -1){
            bankUsers.get(validId).setBankName(newBankName);
        }
    }

    @DeleteMapping(path="bank/{id}")
    public void deleteUser(@PathVariable("id") String id){
        int validId= sideCalculations.getTheUserElementNumberById(id, bankUsers);
        if(validId != -1){
            bankUsers.remove(validId);
        }
    }

    @GetMapping(path="bank/{Customer}")
    public BankDTO getUserByCustomer(@PathVariable("Customer") String customer){
        int validId= sideCalculations.getTheUserElementNumberByName(customer, bankUsers);
        BankDTO validBankDTO = new BankDTO();
        if(validId != -1){
            validBankDTO = bankUsers.get(validId);
        }
        return validBankDTO;
    }

}
