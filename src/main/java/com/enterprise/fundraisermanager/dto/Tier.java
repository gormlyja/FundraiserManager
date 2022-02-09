package com.enterprise.fundraisermanager.dto;

import lombok.Data;

public @Data
class Tier {
    private Integer tierId;
    private Integer level;
    private String name;
    private String description;
    private Double requiredAmount;
    private Boolean earnedStatus;
}
