package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
/**
 * This is the Model Layer for User. Data that can be stored to a database is represented by this class. Each instance is associated with an entry in a database table.
 * @author
 */
@Entity
@Table(name="user")
public @Data
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "emailAddress")
    private String emailAddress;
}
