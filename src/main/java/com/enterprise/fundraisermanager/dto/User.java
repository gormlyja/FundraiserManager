package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;

@Entity
@Table (name = "Users")
public @Data
class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String emailAddress;
}
