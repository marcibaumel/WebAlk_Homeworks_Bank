package com.homework.webalk1.bank.Services;

import com.homework.webalk1.bank.Services.ServiceDTO.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionService {
    Transaction saveNewTransaction(Transaction transaction);
    Transaction findHighestTransaction();
    List<Transaction> getAllTransactions();
    void deleteById(UUID id);
    void updateTransaction(Transaction transaction);
}
