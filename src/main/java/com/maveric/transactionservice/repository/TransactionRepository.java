package com.maveric.transactionservice.repository;

import com.maveric.transactionservice.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findTransactionByAccountId(String accountId);
}
