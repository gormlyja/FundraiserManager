package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

@Entity
public @Data
class Fundraiser {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO )
    private Integer id;
    private Boolean activeStatus;
    private String name;
    private String description;
    @Transient
    private Image homeImage;
    @Transient
    private Goal goal;
    @Transient
    private ArrayList<Tier> tierList;
    private Calendar startDate;
    private Calendar endDate;
    private Double totalFundraised;
    @Transient
    private HashMap<Integer, FundraiserUser> userMap;
}
