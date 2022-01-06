package com.homework.webalk1.bank.Controllers.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @NotNull
    private UUID transactionId;

    @NotNull
    @Min(10)
    private Long spentMoney;

    @NotEmpty
    private String spentType;

    @NotEmpty
    private String account;

    public Transaction(com.homework.webalk1.bank.Services.ServiceDTO.Transaction transaction){
        this.transactionId = transaction.getTransactionId();
        this.spentMoney = transaction.getSpentMoney();
        this.spentType = transaction.getSpentType();
        this.account = transaction.getAccount();
    }

    public com.homework.webalk1.bank.Services.ServiceDTO.Transaction toServiceDTO(){return  new com.homework.webalk1.bank.Services.ServiceDTO.Transaction(transactionId, spentMoney, spentType, account);}


}
