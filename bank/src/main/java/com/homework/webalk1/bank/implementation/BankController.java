package com.homework.webalk1.bank.implementation;

import com.homework.webalk1.bank.IBankController;
import com.homework.webalk1.bank.model.BankDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BankController implements IBankController {

    private final List<BankDTO> bankUsers = new ArrayList<>();

    private SideCalculations sideCalculations = new SideCalculations();

    @Override
    public List<BankDTO> getEveryAccount(){
        return bankUsers;
    }

    @Override
    public void newAccount(BankDTO bankNewUser){
        bankUsers.add(bankNewUser);
    }

    @Override
    public void changeUserBankName(String id, String newBankName){
        int validId= sideCalculations.getTheUserElementNumberById(id, bankUsers);
        if(validId != -1){
            bankUsers.get(validId).setBankName(newBankName);
        }
    }

    @Override
    public void deleteUser(String id){
        int validId= sideCalculations.getTheUserElementNumberById(id, bankUsers);
        if(validId != -1){
            bankUsers.remove(validId);
        }
    }

    @Override
    public BankDTO getUserByCustomer(String customer){
        int validId= sideCalculations.getTheUserElementNumberByName(customer, bankUsers);
        BankDTO validBankDTO = new BankDTO();
        if(validId != -1){
            validBankDTO = bankUsers.get(validId);
        }
        return validBankDTO;
    }

    //TODO: make an UUID generator which can generate a random UUID for the BankDTO cardNumber
}
