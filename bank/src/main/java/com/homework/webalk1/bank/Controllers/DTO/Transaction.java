package com.homework.webalk1.bank.Controllers.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private UUID transactionId;

    private Long spentMoney;

    private String spentType;

    private String account;

    public Transaction(com.homework.webalk1.bank.Services.ServiceDTO.Transaction transaction){
        this.transactionId = transaction.getTransactionId();
        this.spentMoney = transaction.getSpentMoney();
        this.spentMoney = transaction.getSpentMoney();
        this.account = transaction.getAccount();
    }


}
