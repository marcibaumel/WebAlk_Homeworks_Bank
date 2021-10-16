package com.homework.webalk1.bank.Repositories;

import com.homework.webalk1.bank.Implementation.ISideCalculations;
import com.homework.webalk1.bank.Implementation.SideCalculations;
import com.homework.webalk1.bank.model.BankDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BankMockRepositoryTest {

    @Mock
    ISideCalculations sideCalculations;

    @InjectMocks BankMockRepository bankMockRepository;
    BankDTO bankDTOObject;

    @BeforeEach
    void setUp() {
        bankMockRepository = new BankMockRepository(sideCalculations);
    }

    @Test
    void getAllAccount() {
        sideCalculations = new SideCalculations();
        bankMockRepository = new BankMockRepository(sideCalculations);

        bankDTOObject = new BankDTO();
        bankDTOObject.setId(233L);
        bankDTOObject.setBankName("OTP2");
        bankDTOObject.setCustomer("Géza");
        bankDTOObject.setBalance(1200000.0);

        bankMockRepository.saveAccount(bankDTOObject);

        int expected = 1;
        int actualResult = bankMockRepository.getAllAccount().size();
        assertEquals(expected,actualResult);
    }

    @Test
    void getAnAccountById() {
    }

    @Test
    void saveAccount() {
    }

    @Test
    void deleteUserById() {
    }
}