package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

//@Entity
//@Table(name= "fundraiser")
public @Data
class Fundraiser {
    //@Id
    //@GeneratedValue
    private Integer id;
    private Boolean activeStatus;
    private String name;
    private String description;
    //private Image homeImage;
    private int goalId;
    //@OneToMany
    private ArrayList<Tier> tierList;
    private Calendar startDate;
    private Calendar endDate;
    private Double totalFundraised;
    //@OneToMany
    private ArrayList<User> userList;
}
