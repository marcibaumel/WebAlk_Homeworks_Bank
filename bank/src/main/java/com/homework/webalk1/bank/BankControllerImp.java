package com.homework.webalk1.bank;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class BankControllerImp implements BankController{
    private final List<BankDTO> bankUsers = new ArrayList<>();

    @Override
    public List<BankDTO> getEveryAccount() {
        return bankUsers;
    }

    @Override
    public void newAccount(BankDTO bankDTO) {
        bankUsers.add(bankDTO);
    }

    @Override
    public void updateAccountById(UUID id, BankDTO bankDTO) {

    }

    @Override
    public void getAccountByName(String name) {

    }

    @Override
    public void deleteAccountById(UUID id) {

    }
}
