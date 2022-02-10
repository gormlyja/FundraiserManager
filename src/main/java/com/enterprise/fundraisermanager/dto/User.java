package com.enterprise.fundraisermanager.dto;

import lombok.Data;

public @Data
class User {
    private Integer Id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String username;
    private String password;
}
