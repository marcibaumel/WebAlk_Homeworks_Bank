package com.homework.webalk1.bank.Implementation;

import com.homework.webalk1.bank.model.BankDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SideCalculationsTest {

    SideCalculations sideCalculations;
    List<BankDTO> bankDTOList;
    BankDTO bankO1, bankO2;

    @BeforeEach
    void setUp() {
        sideCalculations = new SideCalculations();
        bankDTOList = new ArrayList<>();
        bankO1 = new BankDTO();
        bankO2 = new BankDTO();

        bankO1.setId(23L);
        bankO1.setBankName("OTP");
        bankO1.setCustomer("Béla");
        bankO1.setBalance(120.0);

        bankO2.setId(123L);
        bankO2.setBankName("Erste");
        bankO2.setCustomer("Pista");
        bankO2.setBalance(2230.0);

        bankDTOList.add(bankO1);
        bankDTOList.add(bankO2);
    }

    @Test
    void getTheUserElementNumberById_WithCorrectId() {
        Long goodId = 23L;
        int expected = 0;

        int actualResult= sideCalculations.getTheUserElementNumberById(goodId, bankDTOList);

        assertEquals(expected, actualResult);
    }

    @Test
    void getTheUserElementNumberById_WithIncorrectId() {
        Long goodId = 230L;
        int expected = -1;

        int actualResult= sideCalculations.getTheUserElementNumberById(goodId, bankDTOList);

        assertEquals(expected, actualResult);
    }

    @Test
    void getTheUserElementNumberById_WithCorrectSecondId() {
        Long goodId = 123L;
        int expected = 1;

        int actualResult= sideCalculations.getTheUserElementNumberById(goodId, bankDTOList);

        assertEquals(expected, actualResult);
    }

    @Test
    void setBanDTOTest_CorrectSetting(){
        //GIVEN
        SideCalculations sideCalculationsMock = new SideCalculations();
        List<BankDTO> bankDTOListMock = new ArrayList<>();
        BankDTO bankDTOMock = new BankDTO();

        bankDTOMock.setId(233L);
        bankDTOMock.setBankName("OTP2");
        bankDTOMock.setCustomer("Géza");
        bankDTOMock.setBalance(1200000.0);
        bankDTOListMock.add(bankDTOMock);

        sideCalculationsMock.setBankDTO(bankDTOListMock);

        //THEN
        List<BankDTO> resultList = sideCalculationsMock.getBankDTO();

        //WHEN
        assertEquals(bankDTOListMock, resultList);
    }
}