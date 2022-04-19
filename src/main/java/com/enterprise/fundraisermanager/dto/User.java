package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table (name = "user")
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

    @ManyToOne
    @JoinColumn(name="tierID")
    private Tier tier;
}
