package com.homework.webalk1.bank;

import java.util.Date;
import java.util.UUID;

public class BankDTO {
    private UUID Id;
    private String BankName;
    private Double Balance;
    private String Customer;
    private Date CreatedDate;
    private GenerateUUID generateUUID = new GenerateUUID();

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    @Override
    public String toString() {
        return "BankDTO{" +
                "Id=" + Id +
                ", BankName='" + BankName + '\'' +
                ", Balance=" + Balance +
                ", Customer='" + Customer + '\'' +
                ", CreatedDate=" + CreatedDate +
                '}';
    }
}
