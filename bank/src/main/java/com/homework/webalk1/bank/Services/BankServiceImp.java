package com.homework.webalk1.bank.Services;

import com.homework.webalk1.bank.Repositories.BankModel;
import com.homework.webalk1.bank.Repositories.BankRepository;
import com.homework.webalk1.bank.Services.exception.NoSuchEntityFromTheDb;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BankServiceImp implements BankServices{

    private final BankRepository bankRepository;

    public BankServiceImp(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public Iterable<Bank> getAllBank() {
        List<Bank> bankList = new ArrayList<>();
        for(BankModel bankModel : bankRepository.findAll()){
            bankList.add(new Bank(bankModel));
        }
        return bankList;
    }

    @Override
    public Bank createNewBank(Bank toBankModel) {
        return new Bank(bankRepository.save(toBankModel.toBankModelFromBank()));
    }

    @Override
    public void deleteById(UUID id) {
        try{
            bankRepository.deleteById(id);
        }catch (EmptyResultDataAccessException ex){
            throw new NoSuchEntityFromTheDb(id);
        }
    }

    @Override
    public Bank getBankById(UUID id) {
        Optional<BankModel> bankModel = bankRepository.findById(id);
        if(bankModel.isEmpty()){
            throw new NoSuchEntityFromTheDb(id);
        }
        return new Bank(bankModel.get());
    }

    @Override
    public void saveBank(Bank bank) {
        Optional<BankModel> bankModel = bankRepository.findById(bank.getId());
        if(bankModel.isEmpty()){
            throw new NoSuchEntityFromTheDb(bank.getId());
        }
        bankRepository.save(bank.toBankModelFromBank());
    }
}
