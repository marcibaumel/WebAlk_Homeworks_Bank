package com.homework.webalk1.bank.Services;

import com.homework.webalk1.bank.Repositories.BankRepository;
import com.homework.webalk1.bank.model.BankDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankServiceImp implements BankServices{
    private final int MAXIMUM_USER_NUMBER = 10;
    private final BankRepository bankRepository;

    public BankServiceImp(BankRepository bankRepository){
        this.bankRepository = bankRepository;
    }

    @Override
    public List<BankDTO> getAllAccount() {
        return bankRepository.getAllAccount();
    }

    @Override
    public BankDTO getAnAccountById(Long id) {
        return bankRepository.getAnAccountById(id);
    }

    @Override
    public Long saveAccount(BankDTO bank) {
        /*
        if(bankRepository.getAllAccount().size() >= MAXIMUM_USER_NUMBER){
            throw new TooMuchUserException();
        }
        */

        return bankRepository.saveAccount(bank);
    }

    @Override
    public void deleteUserById(Long id) {
        bankRepository.deleteUserById(id);
    }

}
