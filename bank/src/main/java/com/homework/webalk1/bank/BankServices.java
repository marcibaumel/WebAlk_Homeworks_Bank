package com.homework.webalk1.bank;

import com.homework.webalk1.bank.model.BankDTO;

import java.util.List;

public interface BankServices {
    List<BankDTO> getAllAccount();
    BankDTO getAnAccountById(Long id);
    Long saveAccount(BankDTO bank);
    void deleteById(Long id);
}
