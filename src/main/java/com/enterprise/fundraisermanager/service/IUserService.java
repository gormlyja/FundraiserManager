package com.enterprise.fundraisermanager.service;

import com.enterprise.fundraisermanager.dto.User;

import java.util.List;

public interface IUserService {
        User fetchById(int id);

        void delete(int id) throws Exception;

        User save(User user) throws Exception;

        List<User> fetchAll();
    }

