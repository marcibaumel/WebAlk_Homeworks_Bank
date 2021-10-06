package com.homework.webalk1.bank.Repositories;

import com.homework.webalk1.bank.model.BankDTO;

import java.util.List;

public interface BankRepository {
    List<BankDTO> getAllAccount();
    BankDTO getAnAccountById(Long id);
    Long saveAccount(BankDTO bank);
    void deleteUserById(Long id);
}
