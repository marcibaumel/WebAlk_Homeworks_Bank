package com.homework.webalk1.bank.Controllers;

import com.homework.webalk1.bank.Repositories.enums.SpendingType;
import com.homework.webalk1.bank.Services.Bank;

import java.util.Date;
import java.util.UUID;

public class BankCreateDto {

    private String shopName;
    private Double value;
    private Date createdDate;
    private SpendingType spendingType;

    public BankCreateDto() {
    }

    public BankCreateDto(Bank bank) {
        this.shopName = bank.getShopName();
        this.value = bank.getValue();
        this.createdDate = bank.getCreatedDate();
        this.spendingType = bank.getSpendingType();
    }

    public Bank bankCreateDtoToBank(){
        return new Bank(null, shopName, value, createdDate, spendingType);
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
