package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Transaction;

import java.util.List;

public interface ITransactionDAO {
    Transaction save(Transaction transaction) throws Exception;

    List<Transaction> fetchAll();

    Transaction fetch(int transactionId);

    void delete(int transactionId);
}
