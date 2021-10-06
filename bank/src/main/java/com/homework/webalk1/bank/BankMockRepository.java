package com.homework.webalk1.bank;

import com.homework.webalk1.bank.implementation.SideCalculations;
import com.homework.webalk1.bank.model.BankDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankMockRepository implements BankRepository{

    private final List<BankDTO> bankUsers = new ArrayList<>();
    private final ISideCalculations sideCalculations;

    public BankMockRepository(ISideCalculations sideCalculations){
        this.sideCalculations = sideCalculations;
        sideCalculations.setBankDTO(bankUsers);
    }

    @Override
    public List<BankDTO> getAllAccount() {
        return bankUsers;
    }

    @Override
    public BankDTO getAnAccountById(Long id) {
        int found = sideCalculations.getTheUserElementNumberById(id, bankUsers);
        return bankUsers.get(found);
    }

    @Override
    public Long saveAccount(BankDTO bank) {
        int found = sideCalculations.getTheUserElementNumberById(bank.getId(), bankUsers);
        if (found != -1) {
            BankDTO foundBank = bankUsers.get(found);
            foundBank.setCustomer(bank.getCustomer());
            foundBank.setBankName(bank.getBankName());
        } else {
            bankUsers.add(bank);
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
