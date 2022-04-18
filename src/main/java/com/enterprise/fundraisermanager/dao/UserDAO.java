package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements IUserDAO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user){
        userRepository.save(user);
    }
}
