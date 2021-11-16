package com.homework.webalk1.bank.Controllers;

import com.homework.webalk1.bank.Repositories.enums.SpendingType;
import com.homework.webalk1.bank.Services.Bank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

public class BankDto {
    private UUID id;
    private String shopName;
    private Double value;
    private Date createdDate;
    private SpendingType spendingType;

    public BankDto(UUID id, String shopName, Double value, Date createdDate, SpendingType spendingType) {
        this.id = id;
        this.shopName = shopName;
        this.value = value;
        this.createdDate = createdDate;
        this.spendingType = spendingType;
    }

    public BankDto() {
    }

    public BankDto(Bank bank){
        this.id=bank.getId();
        this.shopName = bank.getShopName();
        this.value = bank.getValue();
        this.createdDate = bank.getCreatedDate();
        this.spendingType = bank.getSpendingType();
    }
    public Bank toBankEntity(){return new Bank(id, shopName, value, createdDate, spendingType);}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public SpendingType getSpendingType() {
        return spendingType;
    }

    public void setSpendingType(SpendingType spendingType) {
        this.spendingType = spendingType;
    }
}
