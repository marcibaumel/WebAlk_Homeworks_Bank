package com.homework.webalk1.bank.Repositories;



import com.homework.webalk1.bank.Repositories.enums.SpendingType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class BankModel {

    @Id
    @GeneratedValue
    private UUID id;
    private String shopName;
    private Double value;
    private Date createdDate;
    private SpendingType spendingType;



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

    public BankModel(UUID id, String shopName, Double value, Date createdDate, SpendingType spendingType) {
        this.id = id;
        this.shopName = shopName;
        this.value = value;
        this.createdDate = createdDate;
        this.spendingType = spendingType;
    }
}
