package com.homework.webalk1.bank;

import com.homework.webalk1.bank.model.BankDTO;

import java.util.List;

public interface ISideCalculations {

    void setBankDTO(List<BankDTO> bankDTO);
    int getTheUserElementNumberById(String id, List<BankDTO> bankElements);
    int getTheUserElementNumberByName(String name, List<BankDTO> bankElements);

}
