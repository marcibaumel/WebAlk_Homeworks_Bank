package com.homework.webalk1.bank.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

public class BankDTO {

    @NotNull
    @Range(min=1, max=30)
    private Long Id;
    @NotBlank
    private String BankName;
    private Double Balance;
    @NotBlank(message = "Name is mandatory")
    private String Customer;
    private Date CreatedDate;
    private UUID CardNumber;

    public UUID getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(UUID cardNumber) {
        CardNumber = cardNumber;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
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
}
