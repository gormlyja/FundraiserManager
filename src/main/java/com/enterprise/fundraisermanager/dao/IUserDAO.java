package com.enterprise.fundraisermanager.dao;

/**
 * @author Jacob Gormly, Rahul Shakya, Binod Dahal, Amin Vedant, Juan Lopez Rosado
 * @date 2/27/2022
 * @version 1.0
 *
 */

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.User;

import java.util.List;

public interface IUserDAO {
    void addUser(User user);

    void removeUser(User user);

    List<Fundraiser> findUserFundraisers(int userId);

    void findFundraiserUser(int userId);
}
