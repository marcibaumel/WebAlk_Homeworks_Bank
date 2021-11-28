package com.homework.webalk1.bank.Services;

import com.homework.webalk1.bank.Services.ServiceDTO.Transaction;

public interface TransactionService {
    Transaction saveNewTransaction(Transaction transaction);
}
