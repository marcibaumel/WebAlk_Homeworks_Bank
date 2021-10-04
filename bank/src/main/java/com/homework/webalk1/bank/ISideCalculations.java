package com.homework.webalk1.bank;

import java.util.List;
import java.util.UUID;

public interface ISideCalculations {

    int getTheUserElementNumberById(String id, List<BankDTO> bankElements);
    int getTheUserElementNumberByName(String name, List<BankDTO> bankElements);

}
