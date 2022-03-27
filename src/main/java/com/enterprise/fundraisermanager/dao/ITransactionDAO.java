package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Transaction;

import java.util.List;

public interface ITransactionDAO {
    Transaction save(Transaction tier) throws Exception;

    List<Transaction> fetchAll();

    Transaction fetch(int tierId);

    void delete(int tierId);
}
