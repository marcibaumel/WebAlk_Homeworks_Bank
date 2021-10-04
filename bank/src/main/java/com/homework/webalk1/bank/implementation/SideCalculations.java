package com.homework.webalk1.bank.implementation;
import com.homework.webalk1.bank.ISideCalculations;
import com.homework.webalk1.bank.model.BankDTO;

import java.util.List;


public class SideCalculations implements ISideCalculations {

    @Override
    public int getTheUserElementNumberById(String givenId, List<BankDTO> bankUsers){
        int found = -1;
        int searchedId = Integer.parseInt(givenId);
        for (int i = 0; i<bankUsers.size(); i++){
            if(bankUsers.get(i).getId() == searchedId){
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public int getTheUserElementNumberByName(String givenName, List<BankDTO> bankUsers){
        int found = -1;
        //int searchedId = Integer.parseInt(givenId);
        for (int i = 0; i<bankUsers.size(); i++){
            if(bankUsers.get(i).getCustomer().equals(givenName)){
                found = i;
                break;
            }
        }
        return found;
    }

}
