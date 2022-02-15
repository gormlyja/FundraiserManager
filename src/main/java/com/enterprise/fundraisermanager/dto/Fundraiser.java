package com.enterprise.fundraisermanager.dto;

import lombok.Data;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

public @Data
class Fundraiser {
    private Integer id;
    private Boolean activeStatus;
    private String name;
    private String description;
    private Image homeImage;
    private Goal goal;
    private Integer tierId;
    private Calendar startDate;
    private Calendar endDate;
    private Double totalFundraised;
    private HashMap<Integer, User> userMap;
}
