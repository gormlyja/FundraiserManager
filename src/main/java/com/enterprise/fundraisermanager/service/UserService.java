package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dao.IUserDAO;
import com.enterprise.fundraisermanager.dto.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService{
    @Autowired
    private IUserDAO userDAO;

    @Override
    public User fetchById(int id) {
        return null;
    }

    @Override
    public void delete(int id) throws Exception {

    }

    public void save(User user) throws Exception{
        userDAO.save(user);
    }

    @Override
    public List<User> fetchAll() {
        return null;
    }
}
