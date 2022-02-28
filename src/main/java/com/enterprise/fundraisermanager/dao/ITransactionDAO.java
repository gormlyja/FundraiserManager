package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Transaction;
import com.enterprise.fundraisermanager.dto.User;

/**
 * @author Jacob Gormly, Rahul Shakya, Binod Dahal, Amin Vedant, Juan Lopez Rosado
 * @date 2/27/2022
 * @version 1.0
 *
 */

public interface ITransactionDAO {

    void addTransaction(Transaction transaction);

    void editTransaction(Transaction transaction);

    void processTransaction(Transaction transaction);
}
