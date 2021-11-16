package com.homework.webalk1.bank.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.UUID;

public interface BankRepository extends PagingAndSortingRepository<BankModel, UUID> {

}
