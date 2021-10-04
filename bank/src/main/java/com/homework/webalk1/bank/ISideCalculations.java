package com.homework.webalk1.bank;

import com.homework.webalk1.bank.model.BankDTO;

import java.util.List;

public interface ISideCalculations {

    int getTheUserElementNumberById(String id, List<BankDTO> bankElements);
    int getTheUserElementNumberByName(String name, List<BankDTO> bankElements);

}
