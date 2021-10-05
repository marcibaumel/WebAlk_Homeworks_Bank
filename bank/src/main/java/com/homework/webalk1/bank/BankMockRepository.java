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
        return null;
    }

    @Override
    public BankDTO getAnAccountById(Long id) {
        return null;
    }

    @Override
    public Long saveAccount(BankDTO bank) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
