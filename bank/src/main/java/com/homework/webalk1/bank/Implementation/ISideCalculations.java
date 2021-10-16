package com.homework.webalk1.bank.Implementation;

import com.homework.webalk1.bank.model.BankDTO;

import java.util.List;

public interface ISideCalculations {

    void setBankDTO(List<BankDTO> bankDTO);
    int getTheUserElementNumberById(Long id, List<BankDTO> bankElements);

}
