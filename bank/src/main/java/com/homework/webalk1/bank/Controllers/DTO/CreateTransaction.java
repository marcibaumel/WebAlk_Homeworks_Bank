package com.homework.webalk1.bank.Controllers.DTO;

import com.homework.webalk1.bank.Services.ServiceDTO.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransaction {

    @NotNull @Min(10)
    private Long spentMoney;

    @NotEmpty
    private String spentType;

    @NotEmpty
    private String account;

    public Transaction toServiceDto(){
        return new Transaction(null, spentMoney, spentType, account);
    }
}
