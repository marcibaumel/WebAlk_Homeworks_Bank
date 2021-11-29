package com.homework.webalk1.bank.Repositories;

import com.homework.webalk1.bank.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, UUID> {
    Optional<Transaction> findTopByOrderBySpentMoneyDesc();
}
