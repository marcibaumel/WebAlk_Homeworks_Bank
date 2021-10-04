package com.homework.webalk1.bank;

import com.homework.webalk1.bank.model.BankDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public interface IBankController {

    @GetMapping(path="/bank", produces = MediaType.APPLICATION_JSON_VALUE)
    List<BankDTO> getEveryAccount();

    @PostMapping(path="bank/")
    void newAccount(@RequestBody @Valid BankDTO bankNewUser);

    @PutMapping (path="bank/{id}")
    void changeUserBankName(@PathVariable("id") String id, String newBankName);

    @DeleteMapping(path="bank/{id}")
    void deleteUser(@PathVariable("id") String id);

    @GetMapping(path="bank/{Customer}")
    BankDTO getUserByCustomer(@PathVariable("Customer") String customer);

}
