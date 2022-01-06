package com.homework.webalk1.bank.Services;


import com.homework.webalk1.bank.Exceptions.NoEntityFoundedException;
import com.homework.webalk1.bank.Repositories.TransactionRepository;
import com.homework.webalk1.bank.Services.ServiceDTO.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    public Transaction saveNewTransaction(Transaction transaction){
        return new Transaction(transactionRepository.save(transaction.toTransactionEntity()));
    }

    @Override
    public Transaction findHighestTransaction() {

        if(transactionRepository.findTopByOrderBySpentMoneyDesc().isEmpty()){
            throw new NoEntityFoundedException();
        }
        return new Transaction(transactionRepository.findTopByOrderBySpentMoneyDesc());
    }

    @Override
    public List<Transaction> getAllTransactions() {
        List<Transaction> transactionList = new ArrayList<>();
        for(com.homework.webalk1.bank.Entity.Transaction transaction : transactionRepository.findAll()){
            transactionList.add(new Transaction(transaction));
        }
        return transactionList;
    }

    @Override
    public void deleteById(UUID id) {
        try{
            transactionRepository.deleteById(id);
        }catch(EmptyResultDataAccessException ex){
            throw new NoEntityFoundedException();
        }
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        Optional<com.homework.webalk1.bank.Entity.Transaction> transactionOptionalById = transactionRepository.findById(transaction.getTransactionId());
        if(transactionOptionalById.isEmpty()){
            throw new NoEntityFoundedException();
        }
        transactionRepository.save(transaction.toTransactionEntity());
    }

}
