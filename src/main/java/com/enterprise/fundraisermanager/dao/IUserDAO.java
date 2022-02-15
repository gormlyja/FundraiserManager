package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.Fundraiser;
import com.enterprise.fundraisermanager.dto.User;

import java.util.List;

public interface IUserDAO {
    void addUser(User user);

    void removeUser(User user);

    List<Fundraiser> findUserFundraisers(int userId);

    void findFundraiserUser(int userId);
}
