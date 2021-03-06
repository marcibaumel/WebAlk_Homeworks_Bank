package com.homework.webalk1.bank.Services.ServiceDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private UUID transactionId;

    private Long spentMoney;

    private String spentType;

    private String account;

    public Transaction(Optional<com.homework.webalk1.bank.Entity.Transaction> transaction) {
        this.transactionId = transaction.get().getTransactionId();
        this.spentMoney = transaction.get().getSpentMoney();
        this.spentType = transaction.get().getSpentType();
        this.account = transaction.get().getAccount();
    }

    public com.homework.webalk1.bank.Entity.Transaction toTransactionEntity(){
        return new com.homework.webalk1.bank.Entity.Transaction(transactionId, spentMoney, spentType, account);
    }

    public Transaction(com.homework.webalk1.bank.Entity.Transaction transaction){
        this.transactionId = transaction.getTransactionId();
        this.spentMoney = transaction.getSpentMoney();
        this.spentType = transaction.getSpentType();
        this.account = transaction.getAccount();
    }

}