package com.homework.webalk1.bank.Services;

import com.homework.webalk1.bank.Repositories.BankModel;

import java.util.List;
import java.util.UUID;

public interface BankServices {
    Iterable<Bank> getAllBank();
    Bank createNewBank(Bank toBankModel);
    void deleteById(UUID id);
    Bank getBankById(UUID id);
    void saveBank(Bank bank);
}
