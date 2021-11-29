package com.homework.webalk1.bank.Services;


import com.homework.webalk1.bank.Exceptions.NoEntityFoundedException;
import com.homework.webalk1.bank.Repositories.TransactionRepository;
import com.homework.webalk1.bank.Services.ServiceDTO.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    public Transaction saveNewTransaction(Transaction transaction){
        return new Transaction(transactionRepository.save(transaction.toTransactionEntity()));
    }

    @Override
    public Transaction findHighestTransaction() {
        try{
            return new Transaction(transactionRepository.findTopByOrderBySpentMoneyDesc());
        }catch (EmptyResultDataAccessException ex){
            throw new NoEntityFoundedException();
        }
    }

}
