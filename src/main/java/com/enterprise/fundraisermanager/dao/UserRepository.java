package com.enterprise.fundraisermanager.dao;

import com.enterprise.fundraisermanager.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
