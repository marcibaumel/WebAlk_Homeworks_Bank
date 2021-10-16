package com.homework.webalk1.bank.Implementation;
import com.homework.webalk1.bank.model.BankDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SideCalculations implements ISideCalculations {



    private List<BankDTO> bankDTO;

    public void setBankDTO(List<BankDTO> bankDTO) {
        this.bankDTO = bankDTO;
    }

    public List<BankDTO> getBankDTO() {return bankDTO;}

    @Override
    public int getTheUserElementNumberById(Long givenId, List<BankDTO> bankUsers){
        int found = -1;
        int searchedId = givenId.intValue();
        for (int i = 0; i<bankUsers.size(); i++){
            if(bankUsers.get(i).getId() == searchedId){
                found = i;
                break;
            }
        }
        return found;
    }

}
