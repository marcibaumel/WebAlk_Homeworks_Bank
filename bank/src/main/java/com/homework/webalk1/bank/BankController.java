package com.homework.webalk1.bank;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface BankController {

    @GetMapping(path="/bank", produces = MediaType.APPLICATION_JSON_VALUE)
    List<BankDTO> getEveryAccount();

    @PostMapping(path="bank/")
    void newAccount(@RequestBody @Valid BankDTO bankDTO);

    void updateAccountById(@PathVariable("Id") UUID id, @RequestBody @Valid BankDTO bankDTO);

    void getAccountByName(@PathVariable("Customer") String name);

    void deleteAccountById(@PathVariable("Id") UUID id);
}
