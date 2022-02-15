package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import java.util.HashMap;

public @Data
class User {
    private Integer Id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private HashMap<Integer, Fundraiser> userFundraiserMap;
}
