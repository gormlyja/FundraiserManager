package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;

public @Data
class Fundraiser {
    private Integer id;
    private String name;
    private String description;
    private Image homeImage;
    private Goal goal;
    private ArrayList<Tier> tiers;
    private Calendar startDate;
    private Calendar endDate;
    private Double totalFundraised;
}
