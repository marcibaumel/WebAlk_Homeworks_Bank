package com.homework.webalk1.bank;

import com.homework.webalk1.bank.model.BankDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface IBankController {


    List<BankDTO> getEveryAccount();

    void newAccount( BankDTO bankNewUser);

    void changeUserBankName(String id, String newBankName);

    void deleteUser(@PathVariable("id") String id);


    BankDTO getUserByCustomer(@PathVariable("Customer") String customer);

}
